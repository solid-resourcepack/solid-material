package io.github.solid.resourcepack.generator

import com.squareup.kotlinpoet.*
import io.github.solid.resourcepack.material.SolidMaterial
import net.kyori.adventure.key.Key
import org.bukkit.Material
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
    val builders = mutableMapOf<String, TypeSpec.Builder>()

    pack.models().forEach {

        val parent = it.parent()
        val textures = it.textures().variables().map { it.key to it.value.key() }.toMap().toMutableMap()
        it.textures().particle()?.let { particle ->
            textures["particle"] = particle.key()
        }
        it.textures().layers().forEachIndexed { index, modelTexture ->
            textures["layer$index"] = modelTexture.key()
        }
        try {
            val block = CodeBlock.builder()
            block.add("lazy { %T.key(%S) }, ", Key::class, it.key())
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
            val type = it.key().value().split("/").first().replaceFirstChar { it.uppercase() }
            val prefix = it.key().value().split("/").last().uppercase()
            val builder = builders.getOrPut(type) { createBuilder(type) }
            builder.addEnumConstant(prefix, TypeSpec.anonymousClassBuilder()
                .addSuperclassConstructorParameter(block.build()).build())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    builders.forEach {
        val file = FileSpec.builder("io.github.solid.resourcepack.material", "Solid${it.key}Material").addType(
            it.value.build()
        )
        file.build().writeTo(File("material-api/src/main/kotlin"))
    }
}

private fun createBuilder(type: String) : TypeSpec.Builder {
    return TypeSpec.enumBuilder("Solid${type}Material").primaryConstructor(
        FunSpec.constructorBuilder()
            .addParameter("key", typeNameOf<Lazy<Key>>())
            .addParameter("parent", typeNameOf<Lazy<Key?>>())
            .addParameter("textures", typeNameOf<Lazy<Map<String, Key>>>())
            .build()
    ).addFunction(FunSpec.builder("toGeneric").returns(typeNameOf<SolidMaterial>()).addCode("return %T(key.value, parent.value, textures.value)", typeNameOf<SolidMaterial>()).build()).addProperty(PropertySpec.builder("key", typeNameOf<Lazy<Key>>()).initializer("key").build())
        .addProperty(PropertySpec.builder("parent", typeNameOf<Lazy<Key?>>()).initializer("parent").build())
        .addProperty(PropertySpec.builder("textures", typeNameOf<Lazy<Map<String, Key>>>()).initializer("textures").build())
}