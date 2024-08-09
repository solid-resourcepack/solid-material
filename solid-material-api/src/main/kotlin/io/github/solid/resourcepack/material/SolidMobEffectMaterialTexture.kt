package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidMobEffectMaterialTexture(
  public val key: Lazy<Key>,
) {
  ABSORPTION(lazy { Key.key("minecraft:mob_effect/absorption") }),
  BAD_OMEN(lazy { Key.key("minecraft:mob_effect/bad_omen") }),
  BLINDNESS(lazy { Key.key("minecraft:mob_effect/blindness") }),
  CONDUIT_POWER(lazy { Key.key("minecraft:mob_effect/conduit_power") }),
  DARKNESS(lazy { Key.key("minecraft:mob_effect/darkness") }),
  DOLPHINS_GRACE(lazy { Key.key("minecraft:mob_effect/dolphins_grace") }),
  FIRE_RESISTANCE(lazy { Key.key("minecraft:mob_effect/fire_resistance") }),
  GLOWING(lazy { Key.key("minecraft:mob_effect/glowing") }),
  HASTE(lazy { Key.key("minecraft:mob_effect/haste") }),
  HEALTH_BOOST(lazy { Key.key("minecraft:mob_effect/health_boost") }),
  HERO_OF_THE_VILLAGE(lazy { Key.key("minecraft:mob_effect/hero_of_the_village") }),
  HUNGER(lazy { Key.key("minecraft:mob_effect/hunger") }),
  INFESTED(lazy { Key.key("minecraft:mob_effect/infested") }),
  INSTANT_DAMAGE(lazy { Key.key("minecraft:mob_effect/instant_damage") }),
  INSTANT_HEALTH(lazy { Key.key("minecraft:mob_effect/instant_health") }),
  INVISIBILITY(lazy { Key.key("minecraft:mob_effect/invisibility") }),
  JUMP_BOOST(lazy { Key.key("minecraft:mob_effect/jump_boost") }),
  LEVITATION(lazy { Key.key("minecraft:mob_effect/levitation") }),
  LUCK(lazy { Key.key("minecraft:mob_effect/luck") }),
  MINING_FATIGUE(lazy { Key.key("minecraft:mob_effect/mining_fatigue") }),
  NAUSEA(lazy { Key.key("minecraft:mob_effect/nausea") }),
  NIGHT_VISION(lazy { Key.key("minecraft:mob_effect/night_vision") }),
  OOZING(lazy { Key.key("minecraft:mob_effect/oozing") }),
  POISON(lazy { Key.key("minecraft:mob_effect/poison") }),
  RAID_OMEN(lazy { Key.key("minecraft:mob_effect/raid_omen") }),
  REGENERATION(lazy { Key.key("minecraft:mob_effect/regeneration") }),
  RESISTANCE(lazy { Key.key("minecraft:mob_effect/resistance") }),
  SATURATION(lazy { Key.key("minecraft:mob_effect/saturation") }),
  SLOWNESS(lazy { Key.key("minecraft:mob_effect/slowness") }),
  SLOW_FALLING(lazy { Key.key("minecraft:mob_effect/slow_falling") }),
  SPEED(lazy { Key.key("minecraft:mob_effect/speed") }),
  STRENGTH(lazy { Key.key("minecraft:mob_effect/strength") }),
  TRIAL_OMEN(lazy { Key.key("minecraft:mob_effect/trial_omen") }),
  UNLUCK(lazy { Key.key("minecraft:mob_effect/unluck") }),
  WATER_BREATHING(lazy { Key.key("minecraft:mob_effect/water_breathing") }),
  WEAKNESS(lazy { Key.key("minecraft:mob_effect/weakness") }),
  WEAVING(lazy { Key.key("minecraft:mob_effect/weaving") }),
  WIND_CHARGED(lazy { Key.key("minecraft:mob_effect/wind_charged") }),
  WITHER(lazy { Key.key("minecraft:mob_effect/wither") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
