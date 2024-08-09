package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidEnvironmentMaterialTexture(
  public val key: Lazy<Key>,
) {
  CLOUDS(lazy { Key.key("minecraft:environment/clouds") }),
  END_SKY(lazy { Key.key("minecraft:environment/end_sky") }),
  MOON_PHASES(lazy { Key.key("minecraft:environment/moon_phases") }),
  RAIN(lazy { Key.key("minecraft:environment/rain") }),
  SNOW(lazy { Key.key("minecraft:environment/snow") }),
  SUN(lazy { Key.key("minecraft:environment/sun") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
