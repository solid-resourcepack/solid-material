package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidEffectMaterialTexture(
  public val key: Lazy<Key>,
) {
  DITHER(lazy { Key.key("minecraft:effect/dither") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
