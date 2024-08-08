package io.github.solid.resourcepack.material

import net.kyori.adventure.key.Key
import org.bukkit.Material
import org.jetbrains.annotations.ApiStatus

data class SolidMaterial(
    val key: Key,
    val parent: Key?,
    val textures: Map<String, Key>
) {
    companion object {
        /**
         * Gets a [SolidMaterial] by a [Material]
         * IMPORTANT: Only works in a server context
         */
        @ApiStatus.Experimental
        fun from(material: Material): SolidMaterial {
            if (material.isItem) {
                return SolidItemMaterial.valueOf(material.name).toGeneric()
            }
            if (material.isBlock) {
                return SolidBlockMaterial.valueOf(material.name).toGeneric()
            }
            throw IllegalArgumentException("Material $material is not supported")
        }

        /**
         * Gets a [SolidMaterial] by a [Key] (if this key represents a material in a resource pack context)
         */
        fun from(key: Key): SolidMaterial {
            //For fastness, we use the key to determine the type, and then call from(Material, MaterialType)
            val split = key.value().split("/")
            val type = split.first().uppercase()
            val material = split.last().uppercase()
            return from(material, MaterialType.valueOf(type))
        }

        /**
         * Gets a [SolidMaterial] by a [Material] and a [MaterialType]
         * IMPORTANT: Only works with bukkit bytecode present
         */
        @ApiStatus.Experimental
        fun from(material: Material, type: MaterialType): SolidMaterial {
            return from(material.name, type)
        }

        /**
         * Gets a [SolidMaterial] by a [String] and a [MaterialType]
         */
        fun from(ordinal: String, type: MaterialType): SolidMaterial {
            val returned = mutableListOf<SolidMaterial>()
            if (type == MaterialType.ITEM || type == MaterialType.BOTH) {
                try {
                    returned.add(SolidItemMaterial.valueOf(ordinal).toGeneric())
                } catch (ignored: Exception) {
                }
            }

            if (type == MaterialType.BLOCK || type == MaterialType.BOTH) {
                try {
                    returned.add(SolidBlockMaterial.valueOf(ordinal).toGeneric())
                } catch (ignored: Exception) {
                }
            }

            if (returned.size != 1) throw IllegalArgumentException("Material $ordinal is not supported")
            return returned.first()
        }
    }
}

enum class MaterialType {
    ITEM,
    BLOCK,
    BOTH;
}
