package io.github.solid.resourcepack.material

import net.kyori.adventure.key.Key

data class SolidMaterialTexture(
    val key: Key
) {
    companion object {

        fun exists(key: Key): Boolean {
            return get(key) != null
        }
        fun get(key: Key): SolidMaterialTexture? {
            if (key.namespace() != Key.MINECRAFT_NAMESPACE) return null
            val split = key.value().split("/")
            val type = split.first().uppercase()
            val value = split.last().uppercase()
            return when (type) {
                "BLOCK" -> try {
                    SolidBlockMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "ITEM" -> try {
                    SolidItemMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "MODELS" -> try {
                    SolidModelsMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "GUI" -> try {
                    SolidGuiMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "ENTITY" -> try {
                    SolidEntityMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "PARTICLE" -> try {
                    SolidParticleMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "ENVIRONMENT" -> try {
                    SolidEnvironmentMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "MISC" -> try {
                    SolidMiscMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "PAINTING" -> try {
                    SolidPaintingMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "FONT" -> try {
                    SolidFontMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "MAP" -> try {
                    SolidMapMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "COLORMAP" -> try {
                    SolidColormapMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "EFFECT" -> try {
                    SolidEffectMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "TRIMS" -> try {
                    SolidTrimsMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                "MOB_EFFECT" -> try {
                    SolidMobEffectMaterialTexture.valueOf(value).toGeneric()
                } catch (ignored: Exception) {
                    null
                }

                else -> null
            }
        }
    }
}
