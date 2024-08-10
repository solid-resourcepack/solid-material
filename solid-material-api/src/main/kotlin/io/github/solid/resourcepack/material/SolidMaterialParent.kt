package io.github.solid.resourcepack.material

import net.kyori.adventure.key.Key

data class SolidMaterialParent(
    val key: Key,
    val textureIds: List<String>
) {
    companion object {
        fun exists(key: Key): Boolean {
            return get(key) != null
        }
        fun get(key: Key): SolidMaterialParent? {
            if (key.namespace() != Key.MINECRAFT_NAMESPACE) return null
            val split = key.value().split("/")
            val type = split.first().uppercase()
            val value = split.last().uppercase()
            return when (type) {
                "BLOCK" -> try {
                    SolidBlockMaterialParent.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "ITEM" -> try {
                    SolidItemMaterialParent.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "BUILTIN" -> try {
                    SolidBuiltinMaterialParent.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                else -> null
            }
        }
    }
}
