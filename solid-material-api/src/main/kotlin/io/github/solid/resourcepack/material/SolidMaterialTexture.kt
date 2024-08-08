package io.github.solid.resourcepack.material

import net.kyori.adventure.key.Key

data class SolidMaterialTexture(
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
                    SolidBlockMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "ITEM" -> try {
                    SolidItemMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "MODELS" -> try {
                    SolidModelsMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "GUI" -> try {
                    SolidGuiMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "ENTITY" -> try {
                    SolidEntityMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "PARTICLE" -> try {
                    SolidParticleMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "ENVIRONMENT" -> try {
                    SolidEnvironmentMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "MISC" -> try {
                    SolidMiscMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "PAINTING" -> try {
                    SolidPaintingMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "FONT" -> try {
                    SolidFontMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "MAP" -> try {
                    SolidMapMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "COLORMAP" -> try {
                    SolidColormapMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "EFFECT" -> try {
                    SolidEffectMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "TRIMS" -> try {
                    SolidTrimsMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                "MOB_EFFECT" -> try {
                    SolidMobEffectMaterialTexture.valueOf(value); true
                } catch (ignored: Exception) {
                    false
                }

                else -> false
            }
        }
    }
}
