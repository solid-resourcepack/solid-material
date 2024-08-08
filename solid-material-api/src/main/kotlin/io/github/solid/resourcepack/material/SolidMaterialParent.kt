package io.github.solid.resourcepack.material

import net.kyori.adventure.key.Key

data class SolidMaterialParent(
    val key: Key
) {
    companion object {
        fun exists(key: Key): Boolean {
            if (key.namespace() != Key.MINECRAFT_NAMESPACE) return false
            val split = key.value().split("/")
            val type = split.first().uppercase()
            val value = split.last().uppercase()
            return when (type) {
                "BLOCK" -> try {
                    SolidBlockMaterialParent.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "ITEM" -> try {
                    SolidItemMaterialParent.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "BUILTIN" -> try {
                    SolidBuiltinMaterialParent.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                else -> false
            }
        }
    }
}
