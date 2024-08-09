package io.github.solid.resourcepack.generator

import com.squareup.kotlinpoet.*
import io.github.solid.resourcepack.material.SolidMaterial
import io.github.solid.resourcepack.material.SolidMaterialParent
import io.github.solid.resourcepack.material.SolidMaterialTexture
import net.kyori.adventure.key.Key
import org.bukkit.Material
import team.unnamed.creative.model.Model
import team.unnamed.creative.serialize.minecraft.MinecraftResourcePackReader
import java.io.File

/**
 * IMPORTANT: For this to generate you have to specify default resourcepack contents in the /src/main/resources/pack folder
 */
fun main() {
    val input = File("pack")
    if (!input.exists()) throw NullPointerException("pack was not found")
    input.walk(FileWalkDirection.BOTTOM_UP).forEach {
        if (it.isDirectory && it.listFiles()?.isEmpty() != false) {
            println("${it.name} is an empty directory")
            it.delete()
            return@forEach
        }
        if (!it.name.endsWith(".json")) {
            println("${it.name} is not a valid json file")
            it.delete()
            return@forEach
        }
        val name = it.nameWithoutExtension
        try {
            Material.valueOf(name.uppercase())
        } catch (e: Exception) {
            println("$name is not a valid material")
            it.delete()
            return@forEach
        }
    }
    val pack = MinecraftResourcePackReader.builder().lenient(true).build().readFromDirectory(input)
    println(pack.models().size.toString() + " models found")

    val materialBuilders = mutableMapOf<String, TypeSpec.Builder>()
    val parentBuilders = mutableMapOf<String, TypeSpec.Builder>()
    val textureBuilders = mutableMapOf<String, TypeSpec.Builder>()

    pack.models().forEach {
        createSolidMaterialEnum(it, materialBuilders)
        val textures = mutableListOf<String>()
        it.textures().variables().map { it.key }.forEach { key ->
            if (key != null) textures.add(key)
        }

        it.textures().particle()?.let {
            textures.add("particle")
        }
        it.textures().layers().forEachIndexed { index, modelTexture ->
            textures.add("layer$index")
        }
        createSolidKeyCollection(it.parent(), parentBuilders, ::createParentBuilder,
            Pair(", lazy { listOf(${
                textures.joinToString { "\"$it\"" }
            }) }", arrayOf()))

    }

    pack.textures().forEach {
        println(it.key())
        createSolidKeyCollection(
            Key.key(it.key().key(), it.key().value().replace(".png", "")),
            textureBuilders,
            ::createTextureBuilder
        )
    }

    parentBuilders.forEach {
        FileSpec.builder("io.github.solid.resourcepack.material", "Solid${it.key}MaterialParent").addType(
            it.value.build()
        ).build().writeTo(File("solid-material-api/src/main/kotlin"))
    }


    materialBuilders.forEach {
        val file = FileSpec.builder("io.github.solid.resourcepack.material", "Solid${it.key}Material").addType(
            it.value.build()
        )
        file.build().writeTo(File("solid-material-api/src/main/kotlin"))
    }

    textureBuilders.forEach {
        FileSpec.builder("io.github.solid.resourcepack.material", "Solid${it.key}MaterialTexture").addType(
            it.value.build()
        ).build().writeTo(File("solid-material-api/src/main/kotlin"))

    }
}

private fun createSolidKeyCollection(
    nullableKey: Key?,
    builders: MutableMap<String, TypeSpec.Builder>,
    builderFun: (String) -> TypeSpec.Builder,
    vararg args: Pair<String, Array<out Any>>
) {
    nullableKey?.let { key ->

        val block = CodeBlock.builder()
        block.add("lazy { %T.key(%S) }", Key::class, key.key())
        args.forEach { block.add(it.first, it.second) }
        val split = key.value().split("/")
        val type = split.first().replaceFirstChar { it.uppercase() }
        val prefix = split.last().uppercase()
        val builder = builders.getOrPut(type) { builderFun(type) }
        builder.addEnumConstant(
            prefix, TypeSpec.anonymousClassBuilder()
                .addSuperclassConstructorParameter(block.build()).build()
        )
    }
}


private fun createSolidMaterialEnum(model: Model, builders: MutableMap<String, TypeSpec.Builder>) {
    val parent = model.parent()
    val textures = model.textures().variables().map { it.key to it.value.key() }.toMap().toMutableMap()
    model.textures().particle()?.let { particle ->
        textures["particle"] = particle.key()
    }
    model.textures().layers().forEachIndexed { index, modelTexture ->
        textures["layer$index"] = modelTexture.key()
    }
    try {
        val block = CodeBlock.builder()
        block.add("lazy { %T.key(%S) }, ", Key::class, model.key())
        if (parent != null) block.add("lazy { %T.key(%S) }, ", Key::class, parent.key())
        else block.add("lazy { null }, ")
        block.add(
            "lazy { mapOf(${
                textures.toList().joinToString {
                    if (it.second == null) return@joinToString ""
                    return@joinToString "\"${it.first}\" to Key.key(\"${it.second}\")"
                }
            }) }"
        )
        val type = model.key().value().split("/").first().replaceFirstChar { it.uppercase() }
        val prefix = model.key().value().split("/").last().uppercase()
        val builder = builders.getOrPut(type) { createMaterialBuilder(type) }
        builder.addEnumConstant(
            prefix, TypeSpec.anonymousClassBuilder()
                .addSuperclassConstructorParameter(block.build()).build()
        )
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

private fun createMaterialBuilder(type: String): TypeSpec.Builder {
    return TypeSpec.enumBuilder("Solid${type}Material").primaryConstructor(
        FunSpec.constructorBuilder()
            .addParameter("key", typeNameOf<Lazy<Key>>())
            .addParameter("parent", typeNameOf<Lazy<Key?>>())
            .addParameter("textures", typeNameOf<Lazy<Map<String, Key>>>())
            .build()
    ).addFunction(
        FunSpec.builder("toGeneric").returns(typeNameOf<SolidMaterial>())
            .addCode("return %T(key.value, parent.value, textures.value)", typeNameOf<SolidMaterial>()).build()
    ).addProperty(PropertySpec.builder("key", typeNameOf<Lazy<Key>>()).initializer("key").build())
        .addProperty(PropertySpec.builder("parent", typeNameOf<Lazy<Key?>>()).initializer("parent").build())
        .addProperty(
            PropertySpec.builder("textures", typeNameOf<Lazy<Map<String, Key>>>()).initializer("textures").build()
        )
}

private fun createParentBuilder(type: String): TypeSpec.Builder {
    return TypeSpec.enumBuilder("Solid${type}MaterialParent").primaryConstructor(
        FunSpec.constructorBuilder()
            .addParameter("key", typeNameOf<Lazy<Key>>())
            .addParameter("textureIds", typeNameOf<Lazy<List<String>>>())
            .build()
    ).addFunction(
        FunSpec.builder("toGeneric").returns(typeNameOf<SolidMaterialParent>())
            .addCode("return %T(key.value, textureIds.value)", typeNameOf<SolidMaterialParent>()).build()
    ).addProperty(PropertySpec.builder("key", typeNameOf<Lazy<Key>>()).initializer("key").build())
        .addProperty(
            PropertySpec.builder("textureIds", typeNameOf<Lazy<List<String>>>()).initializer("textureIds").build()
        )
}

private fun createTextureBuilder(type: String): TypeSpec.Builder {
    return TypeSpec.enumBuilder("Solid${type}MaterialTexture").primaryConstructor(
        FunSpec.constructorBuilder()
            .addParameter("key", typeNameOf<Lazy<Key>>())
            .build()
    ).addFunction(
        FunSpec.builder("toGeneric").returns(typeNameOf<SolidMaterialTexture>())
            .addCode("return %T(key.value)", typeNameOf<SolidMaterialTexture>()).build()
    ).addProperty(PropertySpec.builder("key", typeNameOf<Lazy<Key>>()).initializer("key").build())
}