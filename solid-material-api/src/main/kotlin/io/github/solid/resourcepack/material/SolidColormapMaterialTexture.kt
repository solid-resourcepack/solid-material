package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidColormapMaterialTexture(
  public val key: Lazy<Key>,
) {
  FOLIAGE(lazy { Key.key("minecraft:colormap/foliage") }),
  GRASS(lazy { Key.key("minecraft:colormap/grass") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
