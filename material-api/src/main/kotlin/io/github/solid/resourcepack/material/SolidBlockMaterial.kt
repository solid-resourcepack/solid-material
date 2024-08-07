package io.github.solid.resourcepack.material

import kotlin.Lazy
import kotlin.String
import kotlin.collections.Map
import net.kyori.adventure.key.Key

public enum class SolidBlockMaterial(
  public val key: Lazy<Key>,
  public val parent: Lazy<Key?>,
  public val textures: Lazy<Map<String, Key>>,
) {
  ACACIA_BUTTON(lazy { Key.key("minecraft:block/acacia_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/acacia_planks")) }),
  ACACIA_FENCE_GATE(lazy { Key.key("minecraft:block/acacia_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/acacia_planks")) }),
  ACACIA_HANGING_SIGN(lazy { Key.key("minecraft:block/acacia_hanging_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/stripped_acacia_log")) }),
  ACACIA_LEAVES(lazy { Key.key("minecraft:block/acacia_leaves") }, lazy {
      Key.key("minecraft:block/leaves") }, lazy { mapOf("all" to
      Key.key("minecraft:block/acacia_leaves")) }),
  ACACIA_LOG(lazy { Key.key("minecraft:block/acacia_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/acacia_log_top"), "side" to Key.key("minecraft:block/acacia_log"))
      }),
  ACACIA_PLANKS(lazy { Key.key("minecraft:block/acacia_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/acacia_planks")) }),
  ACACIA_PRESSURE_PLATE(lazy { Key.key("minecraft:block/acacia_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/acacia_planks")) }),
  ACACIA_SAPLING(lazy { Key.key("minecraft:block/acacia_sapling") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/acacia_sapling")) }),
  ACACIA_SIGN(lazy { Key.key("minecraft:block/acacia_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/acacia_planks")) }),
  ACACIA_SLAB(lazy { Key.key("minecraft:block/acacia_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/acacia_planks"), "side" to Key.key("minecraft:block/acacia_planks"),
      "top" to Key.key("minecraft:block/acacia_planks")) }),
  ACACIA_STAIRS(lazy { Key.key("minecraft:block/acacia_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/acacia_planks"), "side" to Key.key("minecraft:block/acacia_planks"),
      "top" to Key.key("minecraft:block/acacia_planks")) }),
  ACACIA_WOOD(lazy { Key.key("minecraft:block/acacia_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/acacia_log"), "side" to Key.key("minecraft:block/acacia_log")) }),
  ACTIVATOR_RAIL(lazy { Key.key("minecraft:block/activator_rail") }, lazy {
      Key.key("minecraft:block/rail_flat") }, lazy { mapOf("rail" to
      Key.key("minecraft:block/activator_rail")) }),
  AIR(lazy { Key.key("minecraft:block/air") }, lazy { null }, lazy { mapOf() }),
  ALLIUM(lazy { Key.key("minecraft:block/allium") }, lazy { Key.key("minecraft:block/cross") }, lazy
      { mapOf("cross" to Key.key("minecraft:block/allium")) }),
  AMETHYST_BLOCK(lazy { Key.key("minecraft:block/amethyst_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/amethyst_block")) }),
  AMETHYST_CLUSTER(lazy { Key.key("minecraft:block/amethyst_cluster") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/amethyst_cluster")) }),
  ANCIENT_DEBRIS(lazy { Key.key("minecraft:block/ancient_debris") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/ancient_debris_top"), "side" to
      Key.key("minecraft:block/ancient_debris_side")) }),
  ANDESITE(lazy { Key.key("minecraft:block/andesite") }, lazy { Key.key("minecraft:block/cube_all")
      }, lazy { mapOf("all" to Key.key("minecraft:block/andesite")) }),
  ANDESITE_SLAB(lazy { Key.key("minecraft:block/andesite_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/andesite"), "side" to Key.key("minecraft:block/andesite"), "top" to
      Key.key("minecraft:block/andesite")) }),
  ANDESITE_STAIRS(lazy { Key.key("minecraft:block/andesite_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/andesite"), "side" to Key.key("minecraft:block/andesite"), "top" to
      Key.key("minecraft:block/andesite")) }),
  ANVIL(lazy { Key.key("minecraft:block/anvil") }, lazy { Key.key("minecraft:block/template_anvil")
      }, lazy { mapOf("top" to Key.key("minecraft:block/anvil_top")) }),
  ATTACHED_MELON_STEM(lazy { Key.key("minecraft:block/attached_melon_stem") }, lazy {
      Key.key("minecraft:block/stem_fruit") }, lazy { mapOf("stem" to
      Key.key("minecraft:block/melon_stem"), "upperstem" to
      Key.key("minecraft:block/attached_melon_stem")) }),
  ATTACHED_PUMPKIN_STEM(lazy { Key.key("minecraft:block/attached_pumpkin_stem") }, lazy {
      Key.key("minecraft:block/stem_fruit") }, lazy { mapOf("stem" to
      Key.key("minecraft:block/pumpkin_stem"), "upperstem" to
      Key.key("minecraft:block/attached_pumpkin_stem")) }),
  AZALEA(lazy { Key.key("minecraft:block/azalea") }, lazy {
      Key.key("minecraft:block/template_azalea") }, lazy { mapOf("side" to
      Key.key("minecraft:block/azalea_side"), "top" to Key.key("minecraft:block/azalea_top")) }),
  AZALEA_LEAVES(lazy { Key.key("minecraft:block/azalea_leaves") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/azalea_leaves")) }),
  AZURE_BLUET(lazy { Key.key("minecraft:block/azure_bluet") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/azure_bluet")) }),
  BAMBOO_BLOCK(lazy { Key.key("minecraft:block/bamboo_block") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/bamboo_block_top"), "side" to
      Key.key("minecraft:block/bamboo_block")) }),
  BAMBOO_BUTTON(lazy { Key.key("minecraft:block/bamboo_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/bamboo_planks")) }),
  BAMBOO_FENCE_GATE(lazy { Key.key("minecraft:block/bamboo_fence_gate") }, lazy {
      Key.key("minecraft:block/template_custom_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/bamboo_fence_gate"), "particle" to
      Key.key("minecraft:block/bamboo_fence_gate_particle")) }),
  BAMBOO_HANGING_SIGN(lazy { Key.key("minecraft:block/bamboo_hanging_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/bamboo_planks")) }),
  BAMBOO_MOSAIC(lazy { Key.key("minecraft:block/bamboo_mosaic") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/bamboo_mosaic")) }),
  BAMBOO_MOSAIC_SLAB(lazy { Key.key("minecraft:block/bamboo_mosaic_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/bamboo_mosaic"), "side" to Key.key("minecraft:block/bamboo_mosaic"),
      "top" to Key.key("minecraft:block/bamboo_mosaic")) }),
  BAMBOO_MOSAIC_STAIRS(lazy { Key.key("minecraft:block/bamboo_mosaic_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/bamboo_mosaic"), "side" to Key.key("minecraft:block/bamboo_mosaic"),
      "top" to Key.key("minecraft:block/bamboo_mosaic")) }),
  BAMBOO_PLANKS(lazy { Key.key("minecraft:block/bamboo_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/bamboo_planks")) }),
  BAMBOO_PRESSURE_PLATE(lazy { Key.key("minecraft:block/bamboo_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/bamboo_planks")) }),
  BAMBOO_SAPLING(lazy { Key.key("minecraft:block/bamboo_sapling") }, lazy {
      Key.key("minecraft:block/tinted_cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/bamboo_stage0")) }),
  BAMBOO_SIGN(lazy { Key.key("minecraft:block/bamboo_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/bamboo_planks")) }),
  BAMBOO_SLAB(lazy { Key.key("minecraft:block/bamboo_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/bamboo_planks"), "side" to Key.key("minecraft:block/bamboo_planks"),
      "top" to Key.key("minecraft:block/bamboo_planks")) }),
  BAMBOO_STAIRS(lazy { Key.key("minecraft:block/bamboo_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/bamboo_planks"), "side" to Key.key("minecraft:block/bamboo_planks"),
      "top" to Key.key("minecraft:block/bamboo_planks")) }),
  BARREL(lazy { Key.key("minecraft:block/barrel") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/barrel_bottom"), "side" to Key.key("minecraft:block/barrel_side"),
      "top" to Key.key("minecraft:block/barrel_top")) }),
  BARRIER(lazy { Key.key("minecraft:block/barrier") }, lazy { null }, lazy { mapOf("particle" to
      Key.key("minecraft:item/barrier")) }),
  BASALT(lazy { Key.key("minecraft:block/basalt") }, lazy { Key.key("minecraft:block/cube_column")
      }, lazy { mapOf("end" to Key.key("minecraft:block/basalt_top"), "side" to
      Key.key("minecraft:block/basalt_side")) }),
  BEACON(lazy { Key.key("minecraft:block/beacon") }, lazy { Key.key("minecraft:block/block") }, lazy
      { mapOf("glass" to Key.key("minecraft:block/glass"), "obsidian" to
      Key.key("minecraft:block/obsidian"), "beacon" to Key.key("minecraft:block/beacon"), "particle"
      to Key.key("minecraft:block/glass")) }),
  BEDROCK(lazy { Key.key("minecraft:block/bedrock") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/bedrock")) }),
  BEEHIVE(lazy { Key.key("minecraft:block/beehive") }, lazy {
      Key.key("minecraft:block/orientable_with_bottom") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/beehive_end"), "front" to Key.key("minecraft:block/beehive_front"),
      "side" to Key.key("minecraft:block/beehive_side"), "top" to
      Key.key("minecraft:block/beehive_end"), "particle" to Key.key("minecraft:block/beehive_side"))
      }),
  BEE_NEST(lazy { Key.key("minecraft:block/bee_nest") }, lazy {
      Key.key("minecraft:block/orientable_with_bottom") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/bee_nest_bottom"), "front" to
      Key.key("minecraft:block/bee_nest_front"), "side" to Key.key("minecraft:block/bee_nest_side"),
      "top" to Key.key("minecraft:block/bee_nest_top"), "particle" to
      Key.key("minecraft:block/bee_nest_side")) }),
  BIG_DRIPLEAF(lazy { Key.key("minecraft:block/big_dripleaf") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("top" to
      Key.key("minecraft:block/big_dripleaf_top"), "stem" to
      Key.key("minecraft:block/big_dripleaf_stem"), "side" to
      Key.key("minecraft:block/big_dripleaf_side"), "tip" to
      Key.key("minecraft:block/big_dripleaf_tip"), "particle" to
      Key.key("minecraft:block/big_dripleaf_top")) }),
  BIG_DRIPLEAF_STEM(lazy { Key.key("minecraft:block/big_dripleaf_stem") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("stem" to
      Key.key("minecraft:block/big_dripleaf_stem"), "particle" to
      Key.key("minecraft:block/big_dripleaf_stem")) }),
  BIRCH_BUTTON(lazy { Key.key("minecraft:block/birch_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/birch_planks")) }),
  BIRCH_FENCE_GATE(lazy { Key.key("minecraft:block/birch_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/birch_planks")) }),
  BIRCH_HANGING_SIGN(lazy { Key.key("minecraft:block/birch_hanging_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/stripped_birch_log")) }),
  BIRCH_LEAVES(lazy { Key.key("minecraft:block/birch_leaves") }, lazy {
      Key.key("minecraft:block/leaves") }, lazy { mapOf("all" to
      Key.key("minecraft:block/birch_leaves")) }),
  BIRCH_LOG(lazy { Key.key("minecraft:block/birch_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/birch_log_top"), "side" to Key.key("minecraft:block/birch_log")) }),
  BIRCH_PLANKS(lazy { Key.key("minecraft:block/birch_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/birch_planks")) }),
  BIRCH_PRESSURE_PLATE(lazy { Key.key("minecraft:block/birch_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/birch_planks")) }),
  BIRCH_SAPLING(lazy { Key.key("minecraft:block/birch_sapling") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/birch_sapling")) }),
  BIRCH_SIGN(lazy { Key.key("minecraft:block/birch_sign") }, lazy { null }, lazy { mapOf("particle"
      to Key.key("minecraft:block/birch_planks")) }),
  BIRCH_SLAB(lazy { Key.key("minecraft:block/birch_slab") }, lazy { Key.key("minecraft:block/slab")
      }, lazy { mapOf("bottom" to Key.key("minecraft:block/birch_planks"), "side" to
      Key.key("minecraft:block/birch_planks"), "top" to Key.key("minecraft:block/birch_planks")) }),
  BIRCH_STAIRS(lazy { Key.key("minecraft:block/birch_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/birch_planks"), "side" to Key.key("minecraft:block/birch_planks"),
      "top" to Key.key("minecraft:block/birch_planks")) }),
  BIRCH_WOOD(lazy { Key.key("minecraft:block/birch_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/birch_log"), "side" to Key.key("minecraft:block/birch_log")) }),
  BLACKSTONE(lazy { Key.key("minecraft:block/blackstone") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/blackstone_top"), "side" to Key.key("minecraft:block/blackstone"))
      }),
  BLACKSTONE_SLAB(lazy { Key.key("minecraft:block/blackstone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/blackstone_top"), "side" to Key.key("minecraft:block/blackstone"),
      "top" to Key.key("minecraft:block/blackstone_top")) }),
  BLACKSTONE_STAIRS(lazy { Key.key("minecraft:block/blackstone_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/blackstone_top"), "side" to Key.key("minecraft:block/blackstone"),
      "top" to Key.key("minecraft:block/blackstone_top")) }),
  BLACK_CANDLE_CAKE(lazy { Key.key("minecraft:block/black_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/black_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  BLACK_CARPET(lazy { Key.key("minecraft:block/black_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/black_wool")) }),
  BLACK_CONCRETE(lazy { Key.key("minecraft:block/black_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/black_concrete")) }),
  BLACK_CONCRETE_POWDER(lazy { Key.key("minecraft:block/black_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/black_concrete_powder")) }),
  BLACK_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/black_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/black_glazed_terracotta")) }),
  BLACK_SHULKER_BOX(lazy { Key.key("minecraft:block/black_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/black_shulker_box")) }),
  BLACK_STAINED_GLASS(lazy { Key.key("minecraft:block/black_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/black_stained_glass")) }),
  BLACK_TERRACOTTA(lazy { Key.key("minecraft:block/black_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/black_terracotta")) }),
  BLACK_WOOL(lazy { Key.key("minecraft:block/black_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/black_wool")) }),
  BLAST_FURNACE(lazy { Key.key("minecraft:block/blast_furnace") }, lazy {
      Key.key("minecraft:block/orientable") }, lazy { mapOf("front" to
      Key.key("minecraft:block/blast_furnace_front"), "side" to
      Key.key("minecraft:block/blast_furnace_side"), "top" to
      Key.key("minecraft:block/blast_furnace_top")) }),
  BLUE_CANDLE_CAKE(lazy { Key.key("minecraft:block/blue_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/blue_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  BLUE_CARPET(lazy { Key.key("minecraft:block/blue_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/blue_wool")) }),
  BLUE_CONCRETE(lazy { Key.key("minecraft:block/blue_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/blue_concrete")) }),
  BLUE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/blue_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/blue_concrete_powder")) }),
  BLUE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/blue_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/blue_glazed_terracotta")) }),
  BLUE_ICE(lazy { Key.key("minecraft:block/blue_ice") }, lazy { Key.key("minecraft:block/cube_all")
      }, lazy { mapOf("all" to Key.key("minecraft:block/blue_ice")) }),
  BLUE_ORCHID(lazy { Key.key("minecraft:block/blue_orchid") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/blue_orchid")) }),
  BLUE_SHULKER_BOX(lazy { Key.key("minecraft:block/blue_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/blue_shulker_box")) }),
  BLUE_STAINED_GLASS(lazy { Key.key("minecraft:block/blue_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/blue_stained_glass")) }),
  BLUE_TERRACOTTA(lazy { Key.key("minecraft:block/blue_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/blue_terracotta")) }),
  BLUE_WOOL(lazy { Key.key("minecraft:block/blue_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/blue_wool")) }),
  BONE_BLOCK(lazy { Key.key("minecraft:block/bone_block") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/bone_block_top"), "side" to
      Key.key("minecraft:block/bone_block_side")) }),
  BOOKSHELF(lazy { Key.key("minecraft:block/bookshelf") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/oak_planks"), "side" to Key.key("minecraft:block/bookshelf")) }),
  BRAIN_CORAL(lazy { Key.key("minecraft:block/brain_coral") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/brain_coral")) }),
  BRAIN_CORAL_BLOCK(lazy { Key.key("minecraft:block/brain_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/brain_coral_block")) }),
  BRAIN_CORAL_FAN(lazy { Key.key("minecraft:block/brain_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/brain_coral_fan")) }),
  BRAIN_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/brain_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/brain_coral_fan")) }),
  BREWING_STAND(lazy { Key.key("minecraft:block/brewing_stand") }, lazy { null }, lazy {
      mapOf("base" to Key.key("minecraft:block/brewing_stand_base"), "stand" to
      Key.key("minecraft:block/brewing_stand"), "particle" to
      Key.key("minecraft:block/brewing_stand")) }),
  BRICKS(lazy { Key.key("minecraft:block/bricks") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/bricks")) }),
  BRICK_SLAB(lazy { Key.key("minecraft:block/brick_slab") }, lazy { Key.key("minecraft:block/slab")
      }, lazy { mapOf("bottom" to Key.key("minecraft:block/bricks"), "side" to
      Key.key("minecraft:block/bricks"), "top" to Key.key("minecraft:block/bricks")) }),
  BRICK_STAIRS(lazy { Key.key("minecraft:block/brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/bricks"), "side" to Key.key("minecraft:block/bricks"), "top" to
      Key.key("minecraft:block/bricks")) }),
  BROWN_CANDLE_CAKE(lazy { Key.key("minecraft:block/brown_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/brown_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  BROWN_CARPET(lazy { Key.key("minecraft:block/brown_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/brown_wool")) }),
  BROWN_CONCRETE(lazy { Key.key("minecraft:block/brown_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/brown_concrete")) }),
  BROWN_CONCRETE_POWDER(lazy { Key.key("minecraft:block/brown_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/brown_concrete_powder")) }),
  BROWN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/brown_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/brown_glazed_terracotta")) }),
  BROWN_MUSHROOM(lazy { Key.key("minecraft:block/brown_mushroom") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/brown_mushroom")) }),
  BROWN_MUSHROOM_BLOCK(lazy { Key.key("minecraft:block/brown_mushroom_block") }, lazy {
      Key.key("minecraft:block/template_single_face") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/brown_mushroom_block")) }),
  BROWN_SHULKER_BOX(lazy { Key.key("minecraft:block/brown_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/brown_shulker_box")) }),
  BROWN_STAINED_GLASS(lazy { Key.key("minecraft:block/brown_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/brown_stained_glass")) }),
  BROWN_TERRACOTTA(lazy { Key.key("minecraft:block/brown_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/brown_terracotta")) }),
  BROWN_WOOL(lazy { Key.key("minecraft:block/brown_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/brown_wool")) }),
  BUBBLE_CORAL(lazy { Key.key("minecraft:block/bubble_coral") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/bubble_coral")) }),
  BUBBLE_CORAL_BLOCK(lazy { Key.key("minecraft:block/bubble_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/bubble_coral_block")) }),
  BUBBLE_CORAL_FAN(lazy { Key.key("minecraft:block/bubble_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/bubble_coral_fan")) }),
  BUBBLE_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/bubble_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/bubble_coral_fan")) }),
  BUDDING_AMETHYST(lazy { Key.key("minecraft:block/budding_amethyst") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/budding_amethyst")) }),
  CACTUS(lazy { Key.key("minecraft:block/cactus") }, lazy { Key.key("minecraft:block/block") }, lazy
      { mapOf("bottom" to Key.key("minecraft:block/cactus_bottom"), "top" to
      Key.key("minecraft:block/cactus_top"), "side" to Key.key("minecraft:block/cactus_side"),
      "particle" to Key.key("minecraft:block/cactus_side")) }),
  CAKE(lazy { Key.key("minecraft:block/cake") }, lazy { null }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "top" to Key.key("minecraft:block/cake_top"), "side"
      to Key.key("minecraft:block/cake_side"), "particle" to Key.key("minecraft:block/cake_side"))
      }),
  CALCITE(lazy { Key.key("minecraft:block/calcite") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/calcite")) }),
  CALIBRATED_SCULK_SENSOR(lazy { Key.key("minecraft:block/calibrated_sculk_sensor") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("amethyst" to
      Key.key("minecraft:block/calibrated_sculk_sensor_amethyst"), "bottom" to
      Key.key("minecraft:block/sculk_sensor_bottom"), "side" to
      Key.key("minecraft:block/sculk_sensor_side"), "calibrated_side" to
      Key.key("minecraft:block/calibrated_sculk_sensor_input_side"), "tendrils" to
      Key.key("minecraft:block/sculk_sensor_tendril_inactive"), "top" to
      Key.key("minecraft:block/calibrated_sculk_sensor_top"), "particle" to
      Key.key("minecraft:block/sculk_sensor_bottom")) }),
  CAMPFIRE(lazy { Key.key("minecraft:block/campfire") }, lazy {
      Key.key("minecraft:block/template_campfire") }, lazy { mapOf("fire" to
      Key.key("minecraft:block/campfire_fire"), "lit_log" to
      Key.key("minecraft:block/campfire_log_lit")) }),
  CANDLE_CAKE(lazy { Key.key("minecraft:block/candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/candle"), "side"
      to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  CARTOGRAPHY_TABLE(lazy { Key.key("minecraft:block/cartography_table") }, lazy {
      Key.key("minecraft:block/cube") }, lazy { mapOf("down" to
      Key.key("minecraft:block/dark_oak_planks"), "east" to
      Key.key("minecraft:block/cartography_table_side3"), "north" to
      Key.key("minecraft:block/cartography_table_side3"), "south" to
      Key.key("minecraft:block/cartography_table_side1"), "up" to
      Key.key("minecraft:block/cartography_table_top"), "west" to
      Key.key("minecraft:block/cartography_table_side2"), "particle" to
      Key.key("minecraft:block/cartography_table_side3")) }),
  CARVED_PUMPKIN(lazy { Key.key("minecraft:block/carved_pumpkin") }, lazy {
      Key.key("minecraft:block/orientable") }, lazy { mapOf("front" to
      Key.key("minecraft:block/carved_pumpkin"), "side" to Key.key("minecraft:block/pumpkin_side"),
      "top" to Key.key("minecraft:block/pumpkin_top")) }),
  CAULDRON(lazy { Key.key("minecraft:block/cauldron") }, lazy { null }, lazy { mapOf("top" to
      Key.key("minecraft:block/cauldron_top"), "bottom" to
      Key.key("minecraft:block/cauldron_bottom"), "side" to
      Key.key("minecraft:block/cauldron_side"), "inside" to
      Key.key("minecraft:block/cauldron_inner"), "particle" to
      Key.key("minecraft:block/cauldron_side")) }),
  CAVE_VINES(lazy { Key.key("minecraft:block/cave_vines") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/cave_vines")) }),
  CAVE_VINES_PLANT(lazy { Key.key("minecraft:block/cave_vines_plant") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/cave_vines_plant")) }),
  CHAIN(lazy { Key.key("minecraft:block/chain") }, lazy { Key.key("minecraft:block/block") }, lazy {
      mapOf("all" to Key.key("minecraft:block/chain"), "particle" to
      Key.key("minecraft:block/chain")) }),
  CHAIN_COMMAND_BLOCK(lazy { Key.key("minecraft:block/chain_command_block") }, lazy {
      Key.key("minecraft:block/template_command_block") }, lazy { mapOf("back" to
      Key.key("minecraft:block/chain_command_block_back"), "front" to
      Key.key("minecraft:block/chain_command_block_front"), "side" to
      Key.key("minecraft:block/chain_command_block_side")) }),
  CHERRY_BUTTON(lazy { Key.key("minecraft:block/cherry_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/cherry_planks")) }),
  CHERRY_FENCE_GATE(lazy { Key.key("minecraft:block/cherry_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/cherry_planks")) }),
  CHERRY_HANGING_SIGN(lazy { Key.key("minecraft:block/cherry_hanging_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/stripped_cherry_log")) }),
  CHERRY_LEAVES(lazy { Key.key("minecraft:block/cherry_leaves") }, lazy {
      Key.key("minecraft:block/leaves") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cherry_leaves")) }),
  CHERRY_LOG(lazy { Key.key("minecraft:block/cherry_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/cherry_log_top"), "side" to Key.key("minecraft:block/cherry_log"))
      }),
  CHERRY_PLANKS(lazy { Key.key("minecraft:block/cherry_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cherry_planks")) }),
  CHERRY_PRESSURE_PLATE(lazy { Key.key("minecraft:block/cherry_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/cherry_planks")) }),
  CHERRY_SAPLING(lazy { Key.key("minecraft:block/cherry_sapling") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/cherry_sapling")) }),
  CHERRY_SIGN(lazy { Key.key("minecraft:block/cherry_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/cherry_planks")) }),
  CHERRY_SLAB(lazy { Key.key("minecraft:block/cherry_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cherry_planks"), "side" to Key.key("minecraft:block/cherry_planks"),
      "top" to Key.key("minecraft:block/cherry_planks")) }),
  CHERRY_STAIRS(lazy { Key.key("minecraft:block/cherry_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cherry_planks"), "side" to Key.key("minecraft:block/cherry_planks"),
      "top" to Key.key("minecraft:block/cherry_planks")) }),
  CHERRY_WOOD(lazy { Key.key("minecraft:block/cherry_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/cherry_log"), "side" to Key.key("minecraft:block/cherry_log")) }),
  CHEST(lazy { Key.key("minecraft:block/chest") }, lazy { null }, lazy { mapOf("particle" to
      Key.key("minecraft:block/oak_planks")) }),
  CHIPPED_ANVIL(lazy { Key.key("minecraft:block/chipped_anvil") }, lazy {
      Key.key("minecraft:block/template_anvil") }, lazy { mapOf("top" to
      Key.key("minecraft:block/chipped_anvil_top")) }),
  CHISELED_BOOKSHELF(lazy { Key.key("minecraft:block/chiseled_bookshelf") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("top" to
      Key.key("minecraft:block/chiseled_bookshelf_top"), "side" to
      Key.key("minecraft:block/chiseled_bookshelf_side"), ) }),
  CHISELED_COPPER(lazy { Key.key("minecraft:block/chiseled_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/chiseled_copper")) }),
  CHISELED_DEEPSLATE(lazy { Key.key("minecraft:block/chiseled_deepslate") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/chiseled_deepslate")) }),
  CHISELED_NETHER_BRICKS(lazy { Key.key("minecraft:block/chiseled_nether_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/chiseled_nether_bricks")) }),
  CHISELED_POLISHED_BLACKSTONE(lazy { Key.key("minecraft:block/chiseled_polished_blackstone") },
      lazy { Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/chiseled_polished_blackstone")) }),
  CHISELED_QUARTZ_BLOCK(lazy { Key.key("minecraft:block/chiseled_quartz_block") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/chiseled_quartz_block_top"), "side" to
      Key.key("minecraft:block/chiseled_quartz_block")) }),
  CHISELED_RED_SANDSTONE(lazy { Key.key("minecraft:block/chiseled_red_sandstone") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/red_sandstone_top"), "side" to
      Key.key("minecraft:block/chiseled_red_sandstone")) }),
  CHISELED_SANDSTONE(lazy { Key.key("minecraft:block/chiseled_sandstone") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/sandstone_top"), "side" to
      Key.key("minecraft:block/chiseled_sandstone")) }),
  CHISELED_STONE_BRICKS(lazy { Key.key("minecraft:block/chiseled_stone_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/chiseled_stone_bricks")) }),
  CHISELED_TUFF(lazy { Key.key("minecraft:block/chiseled_tuff") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/chiseled_tuff_top"), "side" to
      Key.key("minecraft:block/chiseled_tuff")) }),
  CHISELED_TUFF_BRICKS(lazy { Key.key("minecraft:block/chiseled_tuff_bricks") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/chiseled_tuff_bricks_top"), "side" to
      Key.key("minecraft:block/chiseled_tuff_bricks")) }),
  CHORUS_FLOWER(lazy { Key.key("minecraft:block/chorus_flower") }, lazy {
      Key.key("minecraft:block/template_chorus_flower") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/chorus_flower")) }),
  CHORUS_PLANT(lazy { Key.key("minecraft:block/chorus_plant") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/chorus_plant"), "inside" to Key.key("minecraft:block/chorus_plant"),
      "particle" to Key.key("minecraft:block/chorus_plant")) }),
  CLAY(lazy { Key.key("minecraft:block/clay") }, lazy { Key.key("minecraft:block/cube_all") }, lazy
      { mapOf("all" to Key.key("minecraft:block/clay")) }),
  COAL_BLOCK(lazy { Key.key("minecraft:block/coal_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/coal_block")) }),
  COAL_ORE(lazy { Key.key("minecraft:block/coal_ore") }, lazy { Key.key("minecraft:block/cube_all")
      }, lazy { mapOf("all" to Key.key("minecraft:block/coal_ore")) }),
  COARSE_DIRT(lazy { Key.key("minecraft:block/coarse_dirt") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/coarse_dirt")) }),
  COBBLED_DEEPSLATE(lazy { Key.key("minecraft:block/cobbled_deepslate") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cobbled_deepslate")) }),
  COBBLED_DEEPSLATE_SLAB(lazy { Key.key("minecraft:block/cobbled_deepslate_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cobbled_deepslate"), "side" to
      Key.key("minecraft:block/cobbled_deepslate"), "top" to
      Key.key("minecraft:block/cobbled_deepslate")) }),
  COBBLED_DEEPSLATE_STAIRS(lazy { Key.key("minecraft:block/cobbled_deepslate_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cobbled_deepslate"), "side" to
      Key.key("minecraft:block/cobbled_deepslate"), "top" to
      Key.key("minecraft:block/cobbled_deepslate")) }),
  COBBLESTONE(lazy { Key.key("minecraft:block/cobblestone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cobblestone")) }),
  COBBLESTONE_SLAB(lazy { Key.key("minecraft:block/cobblestone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cobblestone"), "side" to Key.key("minecraft:block/cobblestone"),
      "top" to Key.key("minecraft:block/cobblestone")) }),
  COBBLESTONE_STAIRS(lazy { Key.key("minecraft:block/cobblestone_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cobblestone"), "side" to Key.key("minecraft:block/cobblestone"),
      "top" to Key.key("minecraft:block/cobblestone")) }),
  COBWEB(lazy { Key.key("minecraft:block/cobweb") }, lazy { Key.key("minecraft:block/cross") }, lazy
      { mapOf("cross" to Key.key("minecraft:block/cobweb")) }),
  COMMAND_BLOCK(lazy { Key.key("minecraft:block/command_block") }, lazy {
      Key.key("minecraft:block/template_command_block") }, lazy { mapOf("back" to
      Key.key("minecraft:block/command_block_back"), "front" to
      Key.key("minecraft:block/command_block_front"), "side" to
      Key.key("minecraft:block/command_block_side")) }),
  COMPARATOR(lazy { Key.key("minecraft:block/comparator") }, lazy { null }, lazy { mapOf("slab" to
      Key.key("minecraft:block/smooth_stone"), "top" to Key.key("minecraft:block/comparator"),
      "unlit" to Key.key("minecraft:block/redstone_torch_off"), "lit" to
      Key.key("minecraft:block/redstone_torch"), "particle" to
      Key.key("minecraft:block/comparator")) }),
  COMPOSTER(lazy { Key.key("minecraft:block/composter") }, lazy { Key.key("minecraft:block/block")
      }, lazy { mapOf("top" to Key.key("minecraft:block/composter_top"), "bottom" to
      Key.key("minecraft:block/composter_bottom"), "side" to
      Key.key("minecraft:block/composter_side"), "inside" to
      Key.key("minecraft:block/composter_bottom"), "particle" to
      Key.key("minecraft:block/composter_side")) }),
  CONDUIT(lazy { Key.key("minecraft:block/conduit") }, lazy { null }, lazy { mapOf("particle" to
      Key.key("minecraft:block/conduit")) }),
  COPPER_BLOCK(lazy { Key.key("minecraft:block/copper_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/copper_block")) }),
  COPPER_BULB(lazy { Key.key("minecraft:block/copper_bulb") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/copper_bulb")) }),
  COPPER_GRATE(lazy { Key.key("minecraft:block/copper_grate") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/copper_grate")) }),
  COPPER_ORE(lazy { Key.key("minecraft:block/copper_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/copper_ore")) }),
  CORNFLOWER(lazy { Key.key("minecraft:block/cornflower") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/cornflower")) }),
  CRACKED_DEEPSLATE_BRICKS(lazy { Key.key("minecraft:block/cracked_deepslate_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cracked_deepslate_bricks")) }),
  CRACKED_DEEPSLATE_TILES(lazy { Key.key("minecraft:block/cracked_deepslate_tiles") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cracked_deepslate_tiles")) }),
  CRACKED_NETHER_BRICKS(lazy { Key.key("minecraft:block/cracked_nether_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cracked_nether_bricks")) }),
  CRACKED_POLISHED_BLACKSTONE_BRICKS(lazy {
      Key.key("minecraft:block/cracked_polished_blackstone_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cracked_polished_blackstone_bricks")) }),
  CRACKED_STONE_BRICKS(lazy { Key.key("minecraft:block/cracked_stone_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cracked_stone_bricks")) }),
  CRAFTER(lazy { Key.key("minecraft:block/crafter") }, lazy { Key.key("minecraft:block/block") },
      lazy { mapOf("bottom" to Key.key("minecraft:block/crafter_bottom"), "top" to
      Key.key("minecraft:block/crafter_top"), "north" to Key.key("minecraft:block/crafter_north"),
      "south" to Key.key("minecraft:block/crafter_south"), "west" to
      Key.key("minecraft:block/crafter_west"), "east" to Key.key("minecraft:block/crafter_east"), )
      }),
  CRAFTING_TABLE(lazy { Key.key("minecraft:block/crafting_table") }, lazy {
      Key.key("minecraft:block/cube") }, lazy { mapOf("down" to
      Key.key("minecraft:block/oak_planks"), "east" to
      Key.key("minecraft:block/crafting_table_side"), "north" to
      Key.key("minecraft:block/crafting_table_front"), "south" to
      Key.key("minecraft:block/crafting_table_side"), "up" to
      Key.key("minecraft:block/crafting_table_top"), "west" to
      Key.key("minecraft:block/crafting_table_front"), "particle" to
      Key.key("minecraft:block/crafting_table_front")) }),
  CRIMSON_BUTTON(lazy { Key.key("minecraft:block/crimson_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/crimson_planks")) }),
  CRIMSON_FENCE_GATE(lazy { Key.key("minecraft:block/crimson_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/crimson_planks")) }),
  CRIMSON_FUNGUS(lazy { Key.key("minecraft:block/crimson_fungus") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/crimson_fungus")) }),
  CRIMSON_HANGING_SIGN(lazy { Key.key("minecraft:block/crimson_hanging_sign") }, lazy { null }, lazy
      { mapOf("particle" to Key.key("minecraft:block/stripped_crimson_stem")) }),
  CRIMSON_HYPHAE(lazy { Key.key("minecraft:block/crimson_hyphae") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/crimson_stem"), "side" to Key.key("minecraft:block/crimson_stem"))
      }),
  CRIMSON_NYLIUM(lazy { Key.key("minecraft:block/crimson_nylium") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/netherrack"), "side" to
      Key.key("minecraft:block/crimson_nylium_side"), "top" to
      Key.key("minecraft:block/crimson_nylium")) }),
  CRIMSON_PLANKS(lazy { Key.key("minecraft:block/crimson_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/crimson_planks")) }),
  CRIMSON_PRESSURE_PLATE(lazy { Key.key("minecraft:block/crimson_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/crimson_planks")) }),
  CRIMSON_ROOTS(lazy { Key.key("minecraft:block/crimson_roots") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/crimson_roots")) }),
  CRIMSON_SIGN(lazy { Key.key("minecraft:block/crimson_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/crimson_planks")) }),
  CRIMSON_SLAB(lazy { Key.key("minecraft:block/crimson_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/crimson_planks"), "side" to
      Key.key("minecraft:block/crimson_planks"), "top" to Key.key("minecraft:block/crimson_planks"))
      }),
  CRIMSON_STAIRS(lazy { Key.key("minecraft:block/crimson_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/crimson_planks"), "side" to
      Key.key("minecraft:block/crimson_planks"), "top" to Key.key("minecraft:block/crimson_planks"))
      }),
  CRIMSON_STEM(lazy { Key.key("minecraft:block/crimson_stem") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/crimson_stem_top"), "side" to
      Key.key("minecraft:block/crimson_stem")) }),
  CRYING_OBSIDIAN(lazy { Key.key("minecraft:block/crying_obsidian") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/crying_obsidian")) }),
  CUT_COPPER(lazy { Key.key("minecraft:block/cut_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cut_copper")) }),
  CUT_COPPER_SLAB(lazy { Key.key("minecraft:block/cut_copper_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cut_copper"), "side" to Key.key("minecraft:block/cut_copper"), "top"
      to Key.key("minecraft:block/cut_copper")) }),
  CUT_COPPER_STAIRS(lazy { Key.key("minecraft:block/cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cut_copper"), "side" to Key.key("minecraft:block/cut_copper"), "top"
      to Key.key("minecraft:block/cut_copper")) }),
  CUT_RED_SANDSTONE(lazy { Key.key("minecraft:block/cut_red_sandstone") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/red_sandstone_top"), "side" to
      Key.key("minecraft:block/cut_red_sandstone")) }),
  CUT_RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/cut_red_sandstone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/red_sandstone_top"), "side" to
      Key.key("minecraft:block/cut_red_sandstone"), "top" to
      Key.key("minecraft:block/red_sandstone_top")) }),
  CUT_SANDSTONE(lazy { Key.key("minecraft:block/cut_sandstone") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/sandstone_top"), "side" to Key.key("minecraft:block/cut_sandstone"))
      }),
  CUT_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/cut_sandstone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sandstone_top"), "side" to Key.key("minecraft:block/cut_sandstone"),
      "top" to Key.key("minecraft:block/sandstone_top")) }),
  CYAN_CANDLE_CAKE(lazy { Key.key("minecraft:block/cyan_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/cyan_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  CYAN_CARPET(lazy { Key.key("minecraft:block/cyan_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/cyan_wool")) }),
  CYAN_CONCRETE(lazy { Key.key("minecraft:block/cyan_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cyan_concrete")) }),
  CYAN_CONCRETE_POWDER(lazy { Key.key("minecraft:block/cyan_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cyan_concrete_powder")) }),
  CYAN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/cyan_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/cyan_glazed_terracotta")) }),
  CYAN_SHULKER_BOX(lazy { Key.key("minecraft:block/cyan_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/cyan_shulker_box")) }),
  CYAN_STAINED_GLASS(lazy { Key.key("minecraft:block/cyan_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cyan_stained_glass")) }),
  CYAN_TERRACOTTA(lazy { Key.key("minecraft:block/cyan_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cyan_terracotta")) }),
  CYAN_WOOL(lazy { Key.key("minecraft:block/cyan_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/cyan_wool")) }),
  DAMAGED_ANVIL(lazy { Key.key("minecraft:block/damaged_anvil") }, lazy {
      Key.key("minecraft:block/template_anvil") }, lazy { mapOf("top" to
      Key.key("minecraft:block/damaged_anvil_top")) }),
  DANDELION(lazy { Key.key("minecraft:block/dandelion") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/dandelion")) }),
  DARK_OAK_BUTTON(lazy { Key.key("minecraft:block/dark_oak_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/dark_oak_planks")) }),
  DARK_OAK_FENCE_GATE(lazy { Key.key("minecraft:block/dark_oak_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/dark_oak_planks")) }),
  DARK_OAK_HANGING_SIGN(lazy { Key.key("minecraft:block/dark_oak_hanging_sign") }, lazy { null },
      lazy { mapOf("particle" to Key.key("minecraft:block/stripped_dark_oak_log")) }),
  DARK_OAK_LEAVES(lazy { Key.key("minecraft:block/dark_oak_leaves") }, lazy {
      Key.key("minecraft:block/leaves") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dark_oak_leaves")) }),
  DARK_OAK_LOG(lazy { Key.key("minecraft:block/dark_oak_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/dark_oak_log_top"), "side" to
      Key.key("minecraft:block/dark_oak_log")) }),
  DARK_OAK_PLANKS(lazy { Key.key("minecraft:block/dark_oak_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dark_oak_planks")) }),
  DARK_OAK_PRESSURE_PLATE(lazy { Key.key("minecraft:block/dark_oak_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/dark_oak_planks")) }),
  DARK_OAK_SAPLING(lazy { Key.key("minecraft:block/dark_oak_sapling") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/dark_oak_sapling")) }),
  DARK_OAK_SIGN(lazy { Key.key("minecraft:block/dark_oak_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/dark_oak_planks")) }),
  DARK_OAK_SLAB(lazy { Key.key("minecraft:block/dark_oak_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/dark_oak_planks"), "side" to
      Key.key("minecraft:block/dark_oak_planks"), "top" to
      Key.key("minecraft:block/dark_oak_planks")) }),
  DARK_OAK_STAIRS(lazy { Key.key("minecraft:block/dark_oak_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/dark_oak_planks"), "side" to
      Key.key("minecraft:block/dark_oak_planks"), "top" to
      Key.key("minecraft:block/dark_oak_planks")) }),
  DARK_OAK_WOOD(lazy { Key.key("minecraft:block/dark_oak_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/dark_oak_log"), "side" to Key.key("minecraft:block/dark_oak_log"))
      }),
  DARK_PRISMARINE(lazy { Key.key("minecraft:block/dark_prismarine") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dark_prismarine")) }),
  DARK_PRISMARINE_SLAB(lazy { Key.key("minecraft:block/dark_prismarine_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/dark_prismarine"), "side" to
      Key.key("minecraft:block/dark_prismarine"), "top" to
      Key.key("minecraft:block/dark_prismarine")) }),
  DARK_PRISMARINE_STAIRS(lazy { Key.key("minecraft:block/dark_prismarine_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/dark_prismarine"), "side" to
      Key.key("minecraft:block/dark_prismarine"), "top" to
      Key.key("minecraft:block/dark_prismarine")) }),
  DAYLIGHT_DETECTOR(lazy { Key.key("minecraft:block/daylight_detector") }, lazy {
      Key.key("minecraft:block/template_daylight_detector") }, lazy { mapOf("side" to
      Key.key("minecraft:block/daylight_detector_side"), "top" to
      Key.key("minecraft:block/daylight_detector_top")) }),
  DEAD_BRAIN_CORAL(lazy { Key.key("minecraft:block/dead_brain_coral") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/dead_brain_coral")) }),
  DEAD_BRAIN_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_brain_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dead_brain_coral_block")) }),
  DEAD_BRAIN_CORAL_FAN(lazy { Key.key("minecraft:block/dead_brain_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_brain_coral_fan")) }),
  DEAD_BRAIN_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/dead_brain_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_brain_coral_fan")) }),
  DEAD_BUBBLE_CORAL(lazy { Key.key("minecraft:block/dead_bubble_coral") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/dead_bubble_coral")) }),
  DEAD_BUBBLE_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_bubble_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dead_bubble_coral_block")) }),
  DEAD_BUBBLE_CORAL_FAN(lazy { Key.key("minecraft:block/dead_bubble_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_bubble_coral_fan")) }),
  DEAD_BUBBLE_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/dead_bubble_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_bubble_coral_fan")) }),
  DEAD_BUSH(lazy { Key.key("minecraft:block/dead_bush") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/dead_bush")) }),
  DEAD_FIRE_CORAL(lazy { Key.key("minecraft:block/dead_fire_coral") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/dead_fire_coral")) }),
  DEAD_FIRE_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_fire_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dead_fire_coral_block")) }),
  DEAD_FIRE_CORAL_FAN(lazy { Key.key("minecraft:block/dead_fire_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_fire_coral_fan")) }),
  DEAD_FIRE_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/dead_fire_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_fire_coral_fan")) }),
  DEAD_HORN_CORAL(lazy { Key.key("minecraft:block/dead_horn_coral") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/dead_horn_coral")) }),
  DEAD_HORN_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_horn_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dead_horn_coral_block")) }),
  DEAD_HORN_CORAL_FAN(lazy { Key.key("minecraft:block/dead_horn_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_horn_coral_fan")) }),
  DEAD_HORN_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/dead_horn_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_horn_coral_fan")) }),
  DEAD_TUBE_CORAL(lazy { Key.key("minecraft:block/dead_tube_coral") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/dead_tube_coral")) }),
  DEAD_TUBE_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_tube_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dead_tube_coral_block")) }),
  DEAD_TUBE_CORAL_FAN(lazy { Key.key("minecraft:block/dead_tube_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_tube_coral_fan")) }),
  DEAD_TUBE_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/dead_tube_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/dead_tube_coral_fan")) }),
  DECORATED_POT(lazy { Key.key("minecraft:block/decorated_pot") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/terracotta")) }),
  DEEPSLATE(lazy { Key.key("minecraft:block/deepslate") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/deepslate_top"), "side" to Key.key("minecraft:block/deepslate")) }),
  DEEPSLATE_BRICKS(lazy { Key.key("minecraft:block/deepslate_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_bricks")) }),
  DEEPSLATE_BRICK_SLAB(lazy { Key.key("minecraft:block/deepslate_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/deepslate_bricks"), "side" to
      Key.key("minecraft:block/deepslate_bricks"), "top" to
      Key.key("minecraft:block/deepslate_bricks")) }),
  DEEPSLATE_BRICK_STAIRS(lazy { Key.key("minecraft:block/deepslate_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/deepslate_bricks"), "side" to
      Key.key("minecraft:block/deepslate_bricks"), "top" to
      Key.key("minecraft:block/deepslate_bricks")) }),
  DEEPSLATE_COAL_ORE(lazy { Key.key("minecraft:block/deepslate_coal_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_coal_ore")) }),
  DEEPSLATE_COPPER_ORE(lazy { Key.key("minecraft:block/deepslate_copper_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_copper_ore")) }),
  DEEPSLATE_DIAMOND_ORE(lazy { Key.key("minecraft:block/deepslate_diamond_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_diamond_ore")) }),
  DEEPSLATE_EMERALD_ORE(lazy { Key.key("minecraft:block/deepslate_emerald_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_emerald_ore")) }),
  DEEPSLATE_GOLD_ORE(lazy { Key.key("minecraft:block/deepslate_gold_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_gold_ore")) }),
  DEEPSLATE_IRON_ORE(lazy { Key.key("minecraft:block/deepslate_iron_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_iron_ore")) }),
  DEEPSLATE_LAPIS_ORE(lazy { Key.key("minecraft:block/deepslate_lapis_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_lapis_ore")) }),
  DEEPSLATE_REDSTONE_ORE(lazy { Key.key("minecraft:block/deepslate_redstone_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_redstone_ore")) }),
  DEEPSLATE_TILES(lazy { Key.key("minecraft:block/deepslate_tiles") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/deepslate_tiles")) }),
  DEEPSLATE_TILE_SLAB(lazy { Key.key("minecraft:block/deepslate_tile_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/deepslate_tiles"), "side" to
      Key.key("minecraft:block/deepslate_tiles"), "top" to
      Key.key("minecraft:block/deepslate_tiles")) }),
  DEEPSLATE_TILE_STAIRS(lazy { Key.key("minecraft:block/deepslate_tile_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/deepslate_tiles"), "side" to
      Key.key("minecraft:block/deepslate_tiles"), "top" to
      Key.key("minecraft:block/deepslate_tiles")) }),
  DETECTOR_RAIL(lazy { Key.key("minecraft:block/detector_rail") }, lazy {
      Key.key("minecraft:block/rail_flat") }, lazy { mapOf("rail" to
      Key.key("minecraft:block/detector_rail")) }),
  DIAMOND_BLOCK(lazy { Key.key("minecraft:block/diamond_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/diamond_block")) }),
  DIAMOND_ORE(lazy { Key.key("minecraft:block/diamond_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/diamond_ore")) }),
  DIORITE(lazy { Key.key("minecraft:block/diorite") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/diorite")) }),
  DIORITE_SLAB(lazy { Key.key("minecraft:block/diorite_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/diorite"), "side" to Key.key("minecraft:block/diorite"), "top" to
      Key.key("minecraft:block/diorite")) }),
  DIORITE_STAIRS(lazy { Key.key("minecraft:block/diorite_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/diorite"), "side" to Key.key("minecraft:block/diorite"), "top" to
      Key.key("minecraft:block/diorite")) }),
  DIRT(lazy { Key.key("minecraft:block/dirt") }, lazy { Key.key("minecraft:block/cube_all") }, lazy
      { mapOf("all" to Key.key("minecraft:block/dirt")) }),
  DIRT_PATH(lazy { Key.key("minecraft:block/dirt_path") }, lazy { Key.key("minecraft:block/block")
      }, lazy { mapOf("top" to Key.key("minecraft:block/dirt_path_top"), "side" to
      Key.key("minecraft:block/dirt_path_side"), "bottom" to Key.key("minecraft:block/dirt"),
      "particle" to Key.key("minecraft:block/dirt")) }),
  DISPENSER(lazy { Key.key("minecraft:block/dispenser") }, lazy {
      Key.key("minecraft:block/orientable") }, lazy { mapOf("front" to
      Key.key("minecraft:block/dispenser_front"), "side" to Key.key("minecraft:block/furnace_side"),
      "top" to Key.key("minecraft:block/furnace_top")) }),
  DRAGON_EGG(lazy { Key.key("minecraft:block/dragon_egg") }, lazy { Key.key("minecraft:block/block")
      }, lazy { mapOf("all" to Key.key("minecraft:block/dragon_egg"), "particle" to
      Key.key("minecraft:block/dragon_egg")) }),
  DRIED_KELP_BLOCK(lazy { Key.key("minecraft:block/dried_kelp_block") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("down" to
      Key.key("minecraft:block/dried_kelp_bottom"), "up" to
      Key.key("minecraft:block/dried_kelp_top"), "north" to
      Key.key("minecraft:block/dried_kelp_side"), "east" to
      Key.key("minecraft:block/dried_kelp_side"), "south" to
      Key.key("minecraft:block/dried_kelp_side"), "west" to
      Key.key("minecraft:block/dried_kelp_side"), "particle" to
      Key.key("minecraft:block/dried_kelp_side")) }),
  DRIPSTONE_BLOCK(lazy { Key.key("minecraft:block/dripstone_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/dripstone_block")) }),
  DROPPER(lazy { Key.key("minecraft:block/dropper") }, lazy { Key.key("minecraft:block/orientable")
      }, lazy { mapOf("front" to Key.key("minecraft:block/dropper_front"), "side" to
      Key.key("minecraft:block/furnace_side"), "top" to Key.key("minecraft:block/furnace_top")) }),
  EMERALD_BLOCK(lazy { Key.key("minecraft:block/emerald_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/emerald_block")) }),
  EMERALD_ORE(lazy { Key.key("minecraft:block/emerald_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/emerald_ore")) }),
  ENCHANTING_TABLE(lazy { Key.key("minecraft:block/enchanting_table") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/enchanting_table_bottom"), "top" to
      Key.key("minecraft:block/enchanting_table_top"), "side" to
      Key.key("minecraft:block/enchanting_table_side"), "particle" to
      Key.key("minecraft:block/enchanting_table_bottom")) }),
  ENDER_CHEST(lazy { Key.key("minecraft:block/ender_chest") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/obsidian")) }),
  END_PORTAL(lazy { Key.key("minecraft:block/end_portal") }, lazy { null }, lazy { mapOf("particle"
      to Key.key("minecraft:block/obsidian")) }),
  END_PORTAL_FRAME(lazy { Key.key("minecraft:block/end_portal_frame") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/end_stone"), "top" to
      Key.key("minecraft:block/end_portal_frame_top"), "side" to
      Key.key("minecraft:block/end_portal_frame_side"), "particle" to
      Key.key("minecraft:block/end_portal_frame_side")) }),
  END_ROD(lazy { Key.key("minecraft:block/end_rod") }, lazy { Key.key("minecraft:block/block") },
      lazy { mapOf("end_rod" to Key.key("minecraft:block/end_rod"), "particle" to
      Key.key("minecraft:block/end_rod")) }),
  END_STONE(lazy { Key.key("minecraft:block/end_stone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/end_stone")) }),
  END_STONE_BRICKS(lazy { Key.key("minecraft:block/end_stone_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/end_stone_bricks")) }),
  END_STONE_BRICK_SLAB(lazy { Key.key("minecraft:block/end_stone_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/end_stone_bricks"), "side" to
      Key.key("minecraft:block/end_stone_bricks"), "top" to
      Key.key("minecraft:block/end_stone_bricks")) }),
  END_STONE_BRICK_STAIRS(lazy { Key.key("minecraft:block/end_stone_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/end_stone_bricks"), "side" to
      Key.key("minecraft:block/end_stone_bricks"), "top" to
      Key.key("minecraft:block/end_stone_bricks")) }),
  EXPOSED_CHISELED_COPPER(lazy { Key.key("minecraft:block/exposed_chiseled_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/exposed_chiseled_copper")) }),
  EXPOSED_COPPER(lazy { Key.key("minecraft:block/exposed_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/exposed_copper")) }),
  EXPOSED_COPPER_BULB(lazy { Key.key("minecraft:block/exposed_copper_bulb") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/exposed_copper_bulb")) }),
  EXPOSED_COPPER_GRATE(lazy { Key.key("minecraft:block/exposed_copper_grate") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/exposed_copper_grate")) }),
  EXPOSED_CUT_COPPER(lazy { Key.key("minecraft:block/exposed_cut_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/exposed_cut_copper")) }),
  EXPOSED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:block/exposed_cut_copper_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/exposed_cut_copper"), "side" to
      Key.key("minecraft:block/exposed_cut_copper"), "top" to
      Key.key("minecraft:block/exposed_cut_copper")) }),
  EXPOSED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:block/exposed_cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/exposed_cut_copper"), "side" to
      Key.key("minecraft:block/exposed_cut_copper"), "top" to
      Key.key("minecraft:block/exposed_cut_copper")) }),
  FARMLAND(lazy { Key.key("minecraft:block/farmland") }, lazy {
      Key.key("minecraft:block/template_farmland") }, lazy { mapOf("dirt" to
      Key.key("minecraft:block/dirt"), "top" to Key.key("minecraft:block/farmland")) }),
  FERN(lazy { Key.key("minecraft:block/fern") }, lazy { Key.key("minecraft:block/tinted_cross") },
      lazy { mapOf("cross" to Key.key("minecraft:block/fern")) }),
  FIRE_CORAL(lazy { Key.key("minecraft:block/fire_coral") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/fire_coral")) }),
  FIRE_CORAL_BLOCK(lazy { Key.key("minecraft:block/fire_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/fire_coral_block")) }),
  FIRE_CORAL_FAN(lazy { Key.key("minecraft:block/fire_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/fire_coral_fan")) }),
  FIRE_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/fire_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/fire_coral_fan")) }),
  FLETCHING_TABLE(lazy { Key.key("minecraft:block/fletching_table") }, lazy {
      Key.key("minecraft:block/cube") }, lazy { mapOf("down" to
      Key.key("minecraft:block/birch_planks"), "east" to
      Key.key("minecraft:block/fletching_table_side"), "north" to
      Key.key("minecraft:block/fletching_table_front"), "south" to
      Key.key("minecraft:block/fletching_table_front"), "up" to
      Key.key("minecraft:block/fletching_table_top"), "west" to
      Key.key("minecraft:block/fletching_table_side"), "particle" to
      Key.key("minecraft:block/fletching_table_front")) }),
  FLOWERING_AZALEA(lazy { Key.key("minecraft:block/flowering_azalea") }, lazy {
      Key.key("minecraft:block/template_azalea") }, lazy { mapOf("side" to
      Key.key("minecraft:block/flowering_azalea_side"), "top" to
      Key.key("minecraft:block/flowering_azalea_top")) }),
  FLOWERING_AZALEA_LEAVES(lazy { Key.key("minecraft:block/flowering_azalea_leaves") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/flowering_azalea_leaves")) }),
  FLOWER_POT(lazy { Key.key("minecraft:block/flower_pot") }, lazy { null }, lazy { mapOf("flowerpot"
      to Key.key("minecraft:block/flower_pot"), "dirt" to Key.key("minecraft:block/dirt"),
      "particle" to Key.key("minecraft:block/flower_pot")) }),
  FROGSPAWN(lazy { Key.key("minecraft:block/frogspawn") }, lazy { null }, lazy { mapOf("texture" to
      Key.key("minecraft:block/frogspawn"), "particle" to Key.key("minecraft:block/frogspawn")) }),
  FURNACE(lazy { Key.key("minecraft:block/furnace") }, lazy { Key.key("minecraft:block/orientable")
      }, lazy { mapOf("front" to Key.key("minecraft:block/furnace_front"), "side" to
      Key.key("minecraft:block/furnace_side"), "top" to Key.key("minecraft:block/furnace_top")) }),
  GILDED_BLACKSTONE(lazy { Key.key("minecraft:block/gilded_blackstone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/gilded_blackstone")) }),
  GLASS(lazy { Key.key("minecraft:block/glass") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/glass")) }),
  GLOWSTONE(lazy { Key.key("minecraft:block/glowstone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/glowstone")) }),
  GLOW_ITEM_FRAME(lazy { Key.key("minecraft:block/glow_item_frame") }, lazy {
      Key.key("minecraft:block/template_item_frame") }, lazy { mapOf("wood" to
      Key.key("minecraft:block/birch_planks"), "back" to Key.key("minecraft:block/glow_item_frame"),
      "particle" to Key.key("minecraft:block/birch_planks")) }),
  GLOW_LICHEN(lazy { Key.key("minecraft:block/glow_lichen") }, lazy { null }, lazy {
      mapOf("glow_lichen" to Key.key("minecraft:block/glow_lichen"), "particle" to
      Key.key("minecraft:block/glow_lichen")) }),
  GOLD_BLOCK(lazy { Key.key("minecraft:block/gold_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/gold_block")) }),
  GOLD_ORE(lazy { Key.key("minecraft:block/gold_ore") }, lazy { Key.key("minecraft:block/cube_all")
      }, lazy { mapOf("all" to Key.key("minecraft:block/gold_ore")) }),
  GRANITE(lazy { Key.key("minecraft:block/granite") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/granite")) }),
  GRANITE_SLAB(lazy { Key.key("minecraft:block/granite_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/granite"), "side" to Key.key("minecraft:block/granite"), "top" to
      Key.key("minecraft:block/granite")) }),
  GRANITE_STAIRS(lazy { Key.key("minecraft:block/granite_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/granite"), "side" to Key.key("minecraft:block/granite"), "top" to
      Key.key("minecraft:block/granite")) }),
  GRASS_BLOCK(lazy { Key.key("minecraft:block/grass_block") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("bottom" to Key.key("minecraft:block/dirt"),
      "top" to Key.key("minecraft:block/grass_block_top"), "side" to
      Key.key("minecraft:block/grass_block_side"), "overlay" to
      Key.key("minecraft:block/grass_block_side_overlay"), "particle" to
      Key.key("minecraft:block/dirt")) }),
  GRAVEL(lazy { Key.key("minecraft:block/gravel") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/gravel")) }),
  GRAY_CANDLE_CAKE(lazy { Key.key("minecraft:block/gray_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/gray_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  GRAY_CARPET(lazy { Key.key("minecraft:block/gray_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/gray_wool")) }),
  GRAY_CONCRETE(lazy { Key.key("minecraft:block/gray_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/gray_concrete")) }),
  GRAY_CONCRETE_POWDER(lazy { Key.key("minecraft:block/gray_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/gray_concrete_powder")) }),
  GRAY_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/gray_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/gray_glazed_terracotta")) }),
  GRAY_SHULKER_BOX(lazy { Key.key("minecraft:block/gray_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/gray_shulker_box")) }),
  GRAY_STAINED_GLASS(lazy { Key.key("minecraft:block/gray_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/gray_stained_glass")) }),
  GRAY_TERRACOTTA(lazy { Key.key("minecraft:block/gray_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/gray_terracotta")) }),
  GRAY_WOOL(lazy { Key.key("minecraft:block/gray_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/gray_wool")) }),
  GREEN_CANDLE_CAKE(lazy { Key.key("minecraft:block/green_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/green_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  GREEN_CARPET(lazy { Key.key("minecraft:block/green_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/green_wool")) }),
  GREEN_CONCRETE(lazy { Key.key("minecraft:block/green_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/green_concrete")) }),
  GREEN_CONCRETE_POWDER(lazy { Key.key("minecraft:block/green_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/green_concrete_powder")) }),
  GREEN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/green_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/green_glazed_terracotta")) }),
  GREEN_SHULKER_BOX(lazy { Key.key("minecraft:block/green_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/green_shulker_box")) }),
  GREEN_STAINED_GLASS(lazy { Key.key("minecraft:block/green_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/green_stained_glass")) }),
  GREEN_TERRACOTTA(lazy { Key.key("minecraft:block/green_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/green_terracotta")) }),
  GREEN_WOOL(lazy { Key.key("minecraft:block/green_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/green_wool")) }),
  GRINDSTONE(lazy { Key.key("minecraft:block/grindstone") }, lazy { Key.key("minecraft:block/block")
      }, lazy { mapOf("pivot" to Key.key("minecraft:block/grindstone_pivot"), "round" to
      Key.key("minecraft:block/grindstone_round"), "side" to
      Key.key("minecraft:block/grindstone_side"), "leg" to Key.key("minecraft:block/dark_oak_log"),
      "particle" to Key.key("minecraft:block/grindstone_side")) }),
  HANGING_ROOTS(lazy { Key.key("minecraft:block/hanging_roots") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/hanging_roots")) }),
  HAY_BLOCK(lazy { Key.key("minecraft:block/hay_block") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/hay_block_top"), "side" to Key.key("minecraft:block/hay_block_side"))
      }),
  HEAVY_CORE(lazy { Key.key("minecraft:block/heavy_core") }, lazy { null }, lazy { mapOf("all" to
      Key.key("minecraft:block/heavy_core"), "particle" to Key.key("minecraft:block/heavy_core"))
      }),
  HEAVY_WEIGHTED_PRESSURE_PLATE(lazy { Key.key("minecraft:block/heavy_weighted_pressure_plate") },
      lazy { Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/iron_block")) }),
  HONEYCOMB_BLOCK(lazy { Key.key("minecraft:block/honeycomb_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/honeycomb_block")) }),
  HONEY_BLOCK(lazy { Key.key("minecraft:block/honey_block") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("down" to
      Key.key("minecraft:block/honey_block_bottom"), "up" to
      Key.key("minecraft:block/honey_block_top"), "side" to
      Key.key("minecraft:block/honey_block_side"), "particle" to
      Key.key("minecraft:block/honey_block_top")) }),
  HOPPER(lazy { Key.key("minecraft:block/hopper") }, lazy { null }, lazy { mapOf("top" to
      Key.key("minecraft:block/hopper_top"), "side" to Key.key("minecraft:block/hopper_outside"),
      "inside" to Key.key("minecraft:block/hopper_inside"), "particle" to
      Key.key("minecraft:block/hopper_outside")) }),
  HORN_CORAL(lazy { Key.key("minecraft:block/horn_coral") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/horn_coral")) }),
  HORN_CORAL_BLOCK(lazy { Key.key("minecraft:block/horn_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/horn_coral_block")) }),
  HORN_CORAL_FAN(lazy { Key.key("minecraft:block/horn_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/horn_coral_fan")) }),
  HORN_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/horn_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/horn_coral_fan")) }),
  ICE(lazy { Key.key("minecraft:block/ice") }, lazy { Key.key("minecraft:block/cube_all") }, lazy {
      mapOf("all" to Key.key("minecraft:block/ice")) }),
  IRON_BLOCK(lazy { Key.key("minecraft:block/iron_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/iron_block")) }),
  IRON_ORE(lazy { Key.key("minecraft:block/iron_ore") }, lazy { Key.key("minecraft:block/cube_all")
      }, lazy { mapOf("all" to Key.key("minecraft:block/iron_ore")) }),
  ITEM_FRAME(lazy { Key.key("minecraft:block/item_frame") }, lazy {
      Key.key("minecraft:block/template_item_frame") }, lazy { mapOf("wood" to
      Key.key("minecraft:block/birch_planks"), "back" to Key.key("minecraft:block/item_frame"),
      "particle" to Key.key("minecraft:block/birch_planks")) }),
  JACK_O_LANTERN(lazy { Key.key("minecraft:block/jack_o_lantern") }, lazy {
      Key.key("minecraft:block/orientable") }, lazy { mapOf("front" to
      Key.key("minecraft:block/jack_o_lantern"), "side" to Key.key("minecraft:block/pumpkin_side"),
      "top" to Key.key("minecraft:block/pumpkin_top")) }),
  JIGSAW(lazy { Key.key("minecraft:block/jigsaw") }, lazy {
      Key.key("minecraft:block/cube_directional") }, lazy { mapOf("down" to
      Key.key("minecraft:block/jigsaw_side"), "east" to Key.key("minecraft:block/jigsaw_side"),
      "north" to Key.key("minecraft:block/jigsaw_top"), "south" to
      Key.key("minecraft:block/jigsaw_bottom"), "up" to Key.key("minecraft:block/jigsaw_lock"),
      "west" to Key.key("minecraft:block/jigsaw_side"), "particle" to
      Key.key("minecraft:block/jigsaw_top")) }),
  JUKEBOX(lazy { Key.key("minecraft:block/jukebox") }, lazy { Key.key("minecraft:block/cube_top") },
      lazy { mapOf("side" to Key.key("minecraft:block/jukebox_side"), "top" to
      Key.key("minecraft:block/jukebox_top")) }),
  JUNGLE_BUTTON(lazy { Key.key("minecraft:block/jungle_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/jungle_planks")) }),
  JUNGLE_FENCE_GATE(lazy { Key.key("minecraft:block/jungle_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/jungle_planks")) }),
  JUNGLE_HANGING_SIGN(lazy { Key.key("minecraft:block/jungle_hanging_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/stripped_jungle_log")) }),
  JUNGLE_LEAVES(lazy { Key.key("minecraft:block/jungle_leaves") }, lazy {
      Key.key("minecraft:block/leaves") }, lazy { mapOf("all" to
      Key.key("minecraft:block/jungle_leaves")) }),
  JUNGLE_LOG(lazy { Key.key("minecraft:block/jungle_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/jungle_log_top"), "side" to Key.key("minecraft:block/jungle_log"))
      }),
  JUNGLE_PLANKS(lazy { Key.key("minecraft:block/jungle_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/jungle_planks")) }),
  JUNGLE_PRESSURE_PLATE(lazy { Key.key("minecraft:block/jungle_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/jungle_planks")) }),
  JUNGLE_SAPLING(lazy { Key.key("minecraft:block/jungle_sapling") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/jungle_sapling")) }),
  JUNGLE_SIGN(lazy { Key.key("minecraft:block/jungle_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/jungle_planks")) }),
  JUNGLE_SLAB(lazy { Key.key("minecraft:block/jungle_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/jungle_planks"), "side" to Key.key("minecraft:block/jungle_planks"),
      "top" to Key.key("minecraft:block/jungle_planks")) }),
  JUNGLE_STAIRS(lazy { Key.key("minecraft:block/jungle_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/jungle_planks"), "side" to Key.key("minecraft:block/jungle_planks"),
      "top" to Key.key("minecraft:block/jungle_planks")) }),
  JUNGLE_WOOD(lazy { Key.key("minecraft:block/jungle_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/jungle_log"), "side" to Key.key("minecraft:block/jungle_log")) }),
  KELP(lazy { Key.key("minecraft:block/kelp") }, lazy { Key.key("minecraft:block/cross") }, lazy {
      mapOf("cross" to Key.key("minecraft:block/kelp")) }),
  KELP_PLANT(lazy { Key.key("minecraft:block/kelp_plant") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/kelp_plant")) }),
  LADDER(lazy { Key.key("minecraft:block/ladder") }, lazy { null }, lazy { mapOf("texture" to
      Key.key("minecraft:block/ladder"), "particle" to Key.key("minecraft:block/ladder")) }),
  LANTERN(lazy { Key.key("minecraft:block/lantern") }, lazy {
      Key.key("minecraft:block/template_lantern") }, lazy { mapOf("lantern" to
      Key.key("minecraft:block/lantern")) }),
  LAPIS_BLOCK(lazy { Key.key("minecraft:block/lapis_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/lapis_block")) }),
  LAPIS_ORE(lazy { Key.key("minecraft:block/lapis_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/lapis_ore")) }),
  LARGE_AMETHYST_BUD(lazy { Key.key("minecraft:block/large_amethyst_bud") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/large_amethyst_bud")) }),
  LAVA(lazy { Key.key("minecraft:block/lava") }, lazy { null }, lazy { mapOf("particle" to
      Key.key("minecraft:block/lava_still")) }),
  LAVA_CAULDRON(lazy { Key.key("minecraft:block/lava_cauldron") }, lazy {
      Key.key("minecraft:block/template_cauldron_full") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cauldron_bottom"), "content" to
      Key.key("minecraft:block/lava_still"), "inside" to Key.key("minecraft:block/cauldron_inner"),
      "side" to Key.key("minecraft:block/cauldron_side"), "top" to
      Key.key("minecraft:block/cauldron_top"), "particle" to
      Key.key("minecraft:block/cauldron_side")) }),
  LECTERN(lazy { Key.key("minecraft:block/lectern") }, lazy { Key.key("minecraft:block/block") },
      lazy { mapOf("bottom" to Key.key("minecraft:block/oak_planks"), "base" to
      Key.key("minecraft:block/lectern_base"), "front" to Key.key("minecraft:block/lectern_front"),
      "sides" to Key.key("minecraft:block/lectern_sides"), "top" to
      Key.key("minecraft:block/lectern_top"), "particle" to
      Key.key("minecraft:block/lectern_sides")) }),
  LEVER(lazy { Key.key("minecraft:block/lever") }, lazy { null }, lazy { mapOf("base" to
      Key.key("minecraft:block/cobblestone"), "lever" to Key.key("minecraft:block/lever"),
      "particle" to Key.key("minecraft:block/cobblestone")) }),
  LIGHTNING_ROD(lazy { Key.key("minecraft:block/lightning_rod") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/lightning_rod"), "particle" to
      Key.key("minecraft:block/lightning_rod")) }),
  LIGHT_BLUE_CANDLE_CAKE(lazy { Key.key("minecraft:block/light_blue_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to
      Key.key("minecraft:block/light_blue_candle"), "side" to Key.key("minecraft:block/cake_side"),
      "top" to Key.key("minecraft:block/cake_top"), "particle" to
      Key.key("minecraft:block/cake_side")) }),
  LIGHT_BLUE_CARPET(lazy { Key.key("minecraft:block/light_blue_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/light_blue_wool")) }),
  LIGHT_BLUE_CONCRETE(lazy { Key.key("minecraft:block/light_blue_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_blue_concrete")) }),
  LIGHT_BLUE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/light_blue_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_blue_concrete_powder")) }),
  LIGHT_BLUE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/light_blue_glazed_terracotta") },
      lazy { Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/light_blue_glazed_terracotta")) }),
  LIGHT_BLUE_SHULKER_BOX(lazy { Key.key("minecraft:block/light_blue_shulker_box") }, lazy { null },
      lazy { mapOf("particle" to Key.key("minecraft:block/light_blue_shulker_box")) }),
  LIGHT_BLUE_STAINED_GLASS(lazy { Key.key("minecraft:block/light_blue_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_blue_stained_glass")) }),
  LIGHT_BLUE_TERRACOTTA(lazy { Key.key("minecraft:block/light_blue_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_blue_terracotta")) }),
  LIGHT_BLUE_WOOL(lazy { Key.key("minecraft:block/light_blue_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_blue_wool")) }),
  LIGHT_GRAY_CANDLE_CAKE(lazy { Key.key("minecraft:block/light_gray_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to
      Key.key("minecraft:block/light_gray_candle"), "side" to Key.key("minecraft:block/cake_side"),
      "top" to Key.key("minecraft:block/cake_top"), "particle" to
      Key.key("minecraft:block/cake_side")) }),
  LIGHT_GRAY_CARPET(lazy { Key.key("minecraft:block/light_gray_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/light_gray_wool")) }),
  LIGHT_GRAY_CONCRETE(lazy { Key.key("minecraft:block/light_gray_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_gray_concrete")) }),
  LIGHT_GRAY_CONCRETE_POWDER(lazy { Key.key("minecraft:block/light_gray_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_gray_concrete_powder")) }),
  LIGHT_GRAY_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/light_gray_glazed_terracotta") },
      lazy { Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/light_gray_glazed_terracotta")) }),
  LIGHT_GRAY_SHULKER_BOX(lazy { Key.key("minecraft:block/light_gray_shulker_box") }, lazy { null },
      lazy { mapOf("particle" to Key.key("minecraft:block/light_gray_shulker_box")) }),
  LIGHT_GRAY_STAINED_GLASS(lazy { Key.key("minecraft:block/light_gray_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_gray_stained_glass")) }),
  LIGHT_GRAY_TERRACOTTA(lazy { Key.key("minecraft:block/light_gray_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_gray_terracotta")) }),
  LIGHT_GRAY_WOOL(lazy { Key.key("minecraft:block/light_gray_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/light_gray_wool")) }),
  LIGHT_WEIGHTED_PRESSURE_PLATE(lazy { Key.key("minecraft:block/light_weighted_pressure_plate") },
      lazy { Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/gold_block")) }),
  LILY_OF_THE_VALLEY(lazy { Key.key("minecraft:block/lily_of_the_valley") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/lily_of_the_valley")) }),
  LILY_PAD(lazy { Key.key("minecraft:block/lily_pad") }, lazy { null }, lazy { mapOf("texture" to
      Key.key("minecraft:block/lily_pad"), "particle" to Key.key("minecraft:block/lily_pad")) }),
  LIME_CANDLE_CAKE(lazy { Key.key("minecraft:block/lime_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/lime_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  LIME_CARPET(lazy { Key.key("minecraft:block/lime_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/lime_wool")) }),
  LIME_CONCRETE(lazy { Key.key("minecraft:block/lime_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/lime_concrete")) }),
  LIME_CONCRETE_POWDER(lazy { Key.key("minecraft:block/lime_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/lime_concrete_powder")) }),
  LIME_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/lime_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/lime_glazed_terracotta")) }),
  LIME_SHULKER_BOX(lazy { Key.key("minecraft:block/lime_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/lime_shulker_box")) }),
  LIME_STAINED_GLASS(lazy { Key.key("minecraft:block/lime_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/lime_stained_glass")) }),
  LIME_TERRACOTTA(lazy { Key.key("minecraft:block/lime_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/lime_terracotta")) }),
  LIME_WOOL(lazy { Key.key("minecraft:block/lime_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/lime_wool")) }),
  LODESTONE(lazy { Key.key("minecraft:block/lodestone") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/lodestone_top"), "side" to Key.key("minecraft:block/lodestone_side"))
      }),
  LOOM(lazy { Key.key("minecraft:block/loom") }, lazy {
      Key.key("minecraft:block/orientable_with_bottom") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/loom_bottom"), "front" to Key.key("minecraft:block/loom_front"),
      "side" to Key.key("minecraft:block/loom_side"), "top" to Key.key("minecraft:block/loom_top"))
      }),
  MAGENTA_CANDLE_CAKE(lazy { Key.key("minecraft:block/magenta_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/magenta_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  MAGENTA_CARPET(lazy { Key.key("minecraft:block/magenta_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/magenta_wool")) }),
  MAGENTA_CONCRETE(lazy { Key.key("minecraft:block/magenta_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/magenta_concrete")) }),
  MAGENTA_CONCRETE_POWDER(lazy { Key.key("minecraft:block/magenta_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/magenta_concrete_powder")) }),
  MAGENTA_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/magenta_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/magenta_glazed_terracotta")) }),
  MAGENTA_SHULKER_BOX(lazy { Key.key("minecraft:block/magenta_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/magenta_shulker_box")) }),
  MAGENTA_STAINED_GLASS(lazy { Key.key("minecraft:block/magenta_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/magenta_stained_glass")) }),
  MAGENTA_TERRACOTTA(lazy { Key.key("minecraft:block/magenta_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/magenta_terracotta")) }),
  MAGENTA_WOOL(lazy { Key.key("minecraft:block/magenta_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/magenta_wool")) }),
  MAGMA_BLOCK(lazy { Key.key("minecraft:block/magma_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to Key.key("minecraft:block/magma"))
      }),
  MANGROVE_BUTTON(lazy { Key.key("minecraft:block/mangrove_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/mangrove_planks")) }),
  MANGROVE_FENCE_GATE(lazy { Key.key("minecraft:block/mangrove_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/mangrove_planks")) }),
  MANGROVE_HANGING_SIGN(lazy { Key.key("minecraft:block/mangrove_hanging_sign") }, lazy { null },
      lazy { mapOf("particle" to Key.key("minecraft:block/stripped_mangrove_log")) }),
  MANGROVE_LEAVES(lazy { Key.key("minecraft:block/mangrove_leaves") }, lazy {
      Key.key("minecraft:block/leaves") }, lazy { mapOf("all" to
      Key.key("minecraft:block/mangrove_leaves")) }),
  MANGROVE_LOG(lazy { Key.key("minecraft:block/mangrove_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/mangrove_log_top"), "side" to
      Key.key("minecraft:block/mangrove_log")) }),
  MANGROVE_PLANKS(lazy { Key.key("minecraft:block/mangrove_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/mangrove_planks")) }),
  MANGROVE_PRESSURE_PLATE(lazy { Key.key("minecraft:block/mangrove_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/mangrove_planks")) }),
  MANGROVE_PROPAGULE(lazy { Key.key("minecraft:block/mangrove_propagule") }, lazy { null }, lazy {
      mapOf("sapling" to Key.key("minecraft:block/mangrove_propagule"), "particle" to
      Key.key("minecraft:block/mangrove_propagule")) }),
  MANGROVE_ROOTS(lazy { Key.key("minecraft:block/mangrove_roots") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("side" to
      Key.key("minecraft:block/mangrove_roots_side"), "top" to
      Key.key("minecraft:block/mangrove_roots_top"), ) }),
  MANGROVE_SIGN(lazy { Key.key("minecraft:block/mangrove_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/mangrove_planks")) }),
  MANGROVE_SLAB(lazy { Key.key("minecraft:block/mangrove_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/mangrove_planks"), "side" to
      Key.key("minecraft:block/mangrove_planks"), "top" to
      Key.key("minecraft:block/mangrove_planks")) }),
  MANGROVE_STAIRS(lazy { Key.key("minecraft:block/mangrove_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/mangrove_planks"), "side" to
      Key.key("minecraft:block/mangrove_planks"), "top" to
      Key.key("minecraft:block/mangrove_planks")) }),
  MANGROVE_WOOD(lazy { Key.key("minecraft:block/mangrove_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/mangrove_log"), "side" to Key.key("minecraft:block/mangrove_log"))
      }),
  MEDIUM_AMETHYST_BUD(lazy { Key.key("minecraft:block/medium_amethyst_bud") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/medium_amethyst_bud")) }),
  MELON(lazy { Key.key("minecraft:block/melon") }, lazy { Key.key("minecraft:block/cube_column") },
      lazy { mapOf("end" to Key.key("minecraft:block/melon_top"), "side" to
      Key.key("minecraft:block/melon_side")) }),
  MOSSY_COBBLESTONE(lazy { Key.key("minecraft:block/mossy_cobblestone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/mossy_cobblestone")) }),
  MOSSY_COBBLESTONE_SLAB(lazy { Key.key("minecraft:block/mossy_cobblestone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/mossy_cobblestone"), "side" to
      Key.key("minecraft:block/mossy_cobblestone"), "top" to
      Key.key("minecraft:block/mossy_cobblestone")) }),
  MOSSY_COBBLESTONE_STAIRS(lazy { Key.key("minecraft:block/mossy_cobblestone_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/mossy_cobblestone"), "side" to
      Key.key("minecraft:block/mossy_cobblestone"), "top" to
      Key.key("minecraft:block/mossy_cobblestone")) }),
  MOSSY_STONE_BRICKS(lazy { Key.key("minecraft:block/mossy_stone_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/mossy_stone_bricks")) }),
  MOSSY_STONE_BRICK_SLAB(lazy { Key.key("minecraft:block/mossy_stone_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/mossy_stone_bricks"), "side" to
      Key.key("minecraft:block/mossy_stone_bricks"), "top" to
      Key.key("minecraft:block/mossy_stone_bricks")) }),
  MOSSY_STONE_BRICK_STAIRS(lazy { Key.key("minecraft:block/mossy_stone_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/mossy_stone_bricks"), "side" to
      Key.key("minecraft:block/mossy_stone_bricks"), "top" to
      Key.key("minecraft:block/mossy_stone_bricks")) }),
  MOSS_BLOCK(lazy { Key.key("minecraft:block/moss_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/moss_block")) }),
  MOSS_CARPET(lazy { Key.key("minecraft:block/moss_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/moss_block")) }),
  MOVING_PISTON(lazy { Key.key("minecraft:block/moving_piston") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/piston_side")) }),
  MUD(lazy { Key.key("minecraft:block/mud") }, lazy { Key.key("minecraft:block/cube_all") }, lazy {
      mapOf("all" to Key.key("minecraft:block/mud")) }),
  MUDDY_MANGROVE_ROOTS(lazy { Key.key("minecraft:block/muddy_mangrove_roots") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/muddy_mangrove_roots_top"), "side" to
      Key.key("minecraft:block/muddy_mangrove_roots_side")) }),
  MUD_BRICKS(lazy { Key.key("minecraft:block/mud_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/mud_bricks")) }),
  MUD_BRICK_SLAB(lazy { Key.key("minecraft:block/mud_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/mud_bricks"), "side" to Key.key("minecraft:block/mud_bricks"), "top"
      to Key.key("minecraft:block/mud_bricks")) }),
  MUD_BRICK_STAIRS(lazy { Key.key("minecraft:block/mud_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/mud_bricks"), "side" to Key.key("minecraft:block/mud_bricks"), "top"
      to Key.key("minecraft:block/mud_bricks")) }),
  MUSHROOM_STEM(lazy { Key.key("minecraft:block/mushroom_stem") }, lazy {
      Key.key("minecraft:block/template_single_face") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/mushroom_stem")) }),
  MYCELIUM(lazy { Key.key("minecraft:block/mycelium") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/dirt"), "side" to Key.key("minecraft:block/mycelium_side"), "top" to
      Key.key("minecraft:block/mycelium_top")) }),
  NETHERITE_BLOCK(lazy { Key.key("minecraft:block/netherite_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/netherite_block")) }),
  NETHERRACK(lazy { Key.key("minecraft:block/netherrack") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/netherrack")) }),
  NETHER_BRICKS(lazy { Key.key("minecraft:block/nether_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/nether_bricks")) }),
  NETHER_BRICK_SLAB(lazy { Key.key("minecraft:block/nether_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/nether_bricks"), "side" to Key.key("minecraft:block/nether_bricks"),
      "top" to Key.key("minecraft:block/nether_bricks")) }),
  NETHER_BRICK_STAIRS(lazy { Key.key("minecraft:block/nether_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/nether_bricks"), "side" to Key.key("minecraft:block/nether_bricks"),
      "top" to Key.key("minecraft:block/nether_bricks")) }),
  NETHER_GOLD_ORE(lazy { Key.key("minecraft:block/nether_gold_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/nether_gold_ore")) }),
  NETHER_QUARTZ_ORE(lazy { Key.key("minecraft:block/nether_quartz_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/nether_quartz_ore")) }),
  NETHER_SPROUTS(lazy { Key.key("minecraft:block/nether_sprouts") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/nether_sprouts")) }),
  NETHER_WART_BLOCK(lazy { Key.key("minecraft:block/nether_wart_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/nether_wart_block")) }),
  NOTE_BLOCK(lazy { Key.key("minecraft:block/note_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/note_block")) }),
  OAK_BUTTON(lazy { Key.key("minecraft:block/oak_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/oak_planks")) }),
  OAK_FENCE_GATE(lazy { Key.key("minecraft:block/oak_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/oak_planks")) }),
  OAK_HANGING_SIGN(lazy { Key.key("minecraft:block/oak_hanging_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/stripped_oak_log")) }),
  OAK_LEAVES(lazy { Key.key("minecraft:block/oak_leaves") }, lazy {
      Key.key("minecraft:block/leaves") }, lazy { mapOf("all" to
      Key.key("minecraft:block/oak_leaves")) }),
  OAK_LOG(lazy { Key.key("minecraft:block/oak_log") }, lazy { Key.key("minecraft:block/cube_column")
      }, lazy { mapOf("end" to Key.key("minecraft:block/oak_log_top"), "side" to
      Key.key("minecraft:block/oak_log")) }),
  OAK_PLANKS(lazy { Key.key("minecraft:block/oak_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/oak_planks")) }),
  OAK_PRESSURE_PLATE(lazy { Key.key("minecraft:block/oak_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/oak_planks")) }),
  OAK_SAPLING(lazy { Key.key("minecraft:block/oak_sapling") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/oak_sapling")) }),
  OAK_SIGN(lazy { Key.key("minecraft:block/oak_sign") }, lazy { null }, lazy { mapOf("particle" to
      Key.key("minecraft:block/oak_planks")) }),
  OAK_SLAB(lazy { Key.key("minecraft:block/oak_slab") }, lazy { Key.key("minecraft:block/slab") },
      lazy { mapOf("bottom" to Key.key("minecraft:block/oak_planks"), "side" to
      Key.key("minecraft:block/oak_planks"), "top" to Key.key("minecraft:block/oak_planks")) }),
  OAK_STAIRS(lazy { Key.key("minecraft:block/oak_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/oak_planks"), "side" to Key.key("minecraft:block/oak_planks"), "top"
      to Key.key("minecraft:block/oak_planks")) }),
  OAK_WOOD(lazy { Key.key("minecraft:block/oak_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/oak_log"), "side" to Key.key("minecraft:block/oak_log")) }),
  OBSERVER(lazy { Key.key("minecraft:block/observer") }, lazy { Key.key("minecraft:block/block") },
      lazy { mapOf("bottom" to Key.key("minecraft:block/observer_back"), "side" to
      Key.key("minecraft:block/observer_side"), "top" to Key.key("minecraft:block/observer_top"),
      "front" to Key.key("minecraft:block/observer_front"), "particle" to
      Key.key("minecraft:block/observer_front")) }),
  OBSIDIAN(lazy { Key.key("minecraft:block/obsidian") }, lazy { Key.key("minecraft:block/cube_all")
      }, lazy { mapOf("all" to Key.key("minecraft:block/obsidian")) }),
  OCHRE_FROGLIGHT(lazy { Key.key("minecraft:block/ochre_froglight") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/ochre_froglight_top"), "side" to
      Key.key("minecraft:block/ochre_froglight_side")) }),
  ORANGE_CANDLE_CAKE(lazy { Key.key("minecraft:block/orange_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/orange_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  ORANGE_CARPET(lazy { Key.key("minecraft:block/orange_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/orange_wool")) }),
  ORANGE_CONCRETE(lazy { Key.key("minecraft:block/orange_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/orange_concrete")) }),
  ORANGE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/orange_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/orange_concrete_powder")) }),
  ORANGE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/orange_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/orange_glazed_terracotta")) }),
  ORANGE_SHULKER_BOX(lazy { Key.key("minecraft:block/orange_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/orange_shulker_box")) }),
  ORANGE_STAINED_GLASS(lazy { Key.key("minecraft:block/orange_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/orange_stained_glass")) }),
  ORANGE_TERRACOTTA(lazy { Key.key("minecraft:block/orange_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/orange_terracotta")) }),
  ORANGE_TULIP(lazy { Key.key("minecraft:block/orange_tulip") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/orange_tulip")) }),
  ORANGE_WOOL(lazy { Key.key("minecraft:block/orange_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/orange_wool")) }),
  OXEYE_DAISY(lazy { Key.key("minecraft:block/oxeye_daisy") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/oxeye_daisy")) }),
  OXIDIZED_CHISELED_COPPER(lazy { Key.key("minecraft:block/oxidized_chiseled_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/oxidized_chiseled_copper")) }),
  OXIDIZED_COPPER(lazy { Key.key("minecraft:block/oxidized_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/oxidized_copper")) }),
  OXIDIZED_COPPER_BULB(lazy { Key.key("minecraft:block/oxidized_copper_bulb") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/oxidized_copper_bulb")) }),
  OXIDIZED_COPPER_GRATE(lazy { Key.key("minecraft:block/oxidized_copper_grate") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/oxidized_copper_grate")) }),
  OXIDIZED_CUT_COPPER(lazy { Key.key("minecraft:block/oxidized_cut_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/oxidized_cut_copper")) }),
  OXIDIZED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:block/oxidized_cut_copper_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/oxidized_cut_copper"), "side" to
      Key.key("minecraft:block/oxidized_cut_copper"), "top" to
      Key.key("minecraft:block/oxidized_cut_copper")) }),
  OXIDIZED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:block/oxidized_cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/oxidized_cut_copper"), "side" to
      Key.key("minecraft:block/oxidized_cut_copper"), "top" to
      Key.key("minecraft:block/oxidized_cut_copper")) }),
  PACKED_ICE(lazy { Key.key("minecraft:block/packed_ice") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/packed_ice")) }),
  PACKED_MUD(lazy { Key.key("minecraft:block/packed_mud") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/packed_mud")) }),
  PEARLESCENT_FROGLIGHT(lazy { Key.key("minecraft:block/pearlescent_froglight") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/pearlescent_froglight_top"), "side" to
      Key.key("minecraft:block/pearlescent_froglight_side")) }),
  PETRIFIED_OAK_SLAB(lazy { Key.key("minecraft:block/petrified_oak_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/oak_planks"), "side" to Key.key("minecraft:block/oak_planks"), "top"
      to Key.key("minecraft:block/oak_planks")) }),
  PINK_CANDLE_CAKE(lazy { Key.key("minecraft:block/pink_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/pink_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  PINK_CARPET(lazy { Key.key("minecraft:block/pink_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/pink_wool")) }),
  PINK_CONCRETE(lazy { Key.key("minecraft:block/pink_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/pink_concrete")) }),
  PINK_CONCRETE_POWDER(lazy { Key.key("minecraft:block/pink_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/pink_concrete_powder")) }),
  PINK_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/pink_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/pink_glazed_terracotta")) }),
  PINK_SHULKER_BOX(lazy { Key.key("minecraft:block/pink_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/pink_shulker_box")) }),
  PINK_STAINED_GLASS(lazy { Key.key("minecraft:block/pink_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/pink_stained_glass")) }),
  PINK_TERRACOTTA(lazy { Key.key("minecraft:block/pink_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/pink_terracotta")) }),
  PINK_TULIP(lazy { Key.key("minecraft:block/pink_tulip") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/pink_tulip")) }),
  PINK_WOOL(lazy { Key.key("minecraft:block/pink_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/pink_wool")) }),
  PISTON(lazy { Key.key("minecraft:block/piston") }, lazy {
      Key.key("minecraft:block/template_piston") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/piston_bottom"), "platform" to Key.key("minecraft:block/piston_top"),
      "side" to Key.key("minecraft:block/piston_side")) }),
  PISTON_HEAD(lazy { Key.key("minecraft:block/piston_head") }, lazy {
      Key.key("minecraft:block/template_piston_head") }, lazy { mapOf("platform" to
      Key.key("minecraft:block/piston_top"), "side" to Key.key("minecraft:block/piston_side"),
      "unsticky" to Key.key("minecraft:block/piston_top")) }),
  PODZOL(lazy { Key.key("minecraft:block/podzol") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/dirt"), "side" to Key.key("minecraft:block/podzol_side"), "top" to
      Key.key("minecraft:block/podzol_top")) }),
  POINTED_DRIPSTONE(lazy { Key.key("minecraft:block/pointed_dripstone") }, lazy { null }, lazy {
      mapOf() }),
  POLISHED_ANDESITE(lazy { Key.key("minecraft:block/polished_andesite") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/polished_andesite")) }),
  POLISHED_ANDESITE_SLAB(lazy { Key.key("minecraft:block/polished_andesite_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_andesite"), "side" to
      Key.key("minecraft:block/polished_andesite"), "top" to
      Key.key("minecraft:block/polished_andesite")) }),
  POLISHED_ANDESITE_STAIRS(lazy { Key.key("minecraft:block/polished_andesite_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_andesite"), "side" to
      Key.key("minecraft:block/polished_andesite"), "top" to
      Key.key("minecraft:block/polished_andesite")) }),
  POLISHED_BASALT(lazy { Key.key("minecraft:block/polished_basalt") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/polished_basalt_top"), "side" to
      Key.key("minecraft:block/polished_basalt_side")) }),
  POLISHED_BLACKSTONE(lazy { Key.key("minecraft:block/polished_blackstone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/polished_blackstone")) }),
  POLISHED_BLACKSTONE_BRICKS(lazy { Key.key("minecraft:block/polished_blackstone_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/polished_blackstone_bricks")) }),
  POLISHED_BLACKSTONE_BRICK_SLAB(lazy { Key.key("minecraft:block/polished_blackstone_brick_slab") },
      lazy { Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_blackstone_bricks"), "side" to
      Key.key("minecraft:block/polished_blackstone_bricks"), "top" to
      Key.key("minecraft:block/polished_blackstone_bricks")) }),
  POLISHED_BLACKSTONE_BRICK_STAIRS(lazy {
      Key.key("minecraft:block/polished_blackstone_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_blackstone_bricks"), "side" to
      Key.key("minecraft:block/polished_blackstone_bricks"), "top" to
      Key.key("minecraft:block/polished_blackstone_bricks")) }),
  POLISHED_BLACKSTONE_BUTTON(lazy { Key.key("minecraft:block/polished_blackstone_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/polished_blackstone")) }),
  POLISHED_BLACKSTONE_PRESSURE_PLATE(lazy {
      Key.key("minecraft:block/polished_blackstone_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/polished_blackstone")) }),
  POLISHED_BLACKSTONE_SLAB(lazy { Key.key("minecraft:block/polished_blackstone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_blackstone"), "side" to
      Key.key("minecraft:block/polished_blackstone"), "top" to
      Key.key("minecraft:block/polished_blackstone")) }),
  POLISHED_BLACKSTONE_STAIRS(lazy { Key.key("minecraft:block/polished_blackstone_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_blackstone"), "side" to
      Key.key("minecraft:block/polished_blackstone"), "top" to
      Key.key("minecraft:block/polished_blackstone")) }),
  POLISHED_DEEPSLATE(lazy { Key.key("minecraft:block/polished_deepslate") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/polished_deepslate")) }),
  POLISHED_DEEPSLATE_SLAB(lazy { Key.key("minecraft:block/polished_deepslate_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_deepslate"), "side" to
      Key.key("minecraft:block/polished_deepslate"), "top" to
      Key.key("minecraft:block/polished_deepslate")) }),
  POLISHED_DEEPSLATE_STAIRS(lazy { Key.key("minecraft:block/polished_deepslate_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_deepslate"), "side" to
      Key.key("minecraft:block/polished_deepslate"), "top" to
      Key.key("minecraft:block/polished_deepslate")) }),
  POLISHED_DIORITE(lazy { Key.key("minecraft:block/polished_diorite") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/polished_diorite")) }),
  POLISHED_DIORITE_SLAB(lazy { Key.key("minecraft:block/polished_diorite_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_diorite"), "side" to
      Key.key("minecraft:block/polished_diorite"), "top" to
      Key.key("minecraft:block/polished_diorite")) }),
  POLISHED_DIORITE_STAIRS(lazy { Key.key("minecraft:block/polished_diorite_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_diorite"), "side" to
      Key.key("minecraft:block/polished_diorite"), "top" to
      Key.key("minecraft:block/polished_diorite")) }),
  POLISHED_GRANITE(lazy { Key.key("minecraft:block/polished_granite") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/polished_granite")) }),
  POLISHED_GRANITE_SLAB(lazy { Key.key("minecraft:block/polished_granite_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_granite"), "side" to
      Key.key("minecraft:block/polished_granite"), "top" to
      Key.key("minecraft:block/polished_granite")) }),
  POLISHED_GRANITE_STAIRS(lazy { Key.key("minecraft:block/polished_granite_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_granite"), "side" to
      Key.key("minecraft:block/polished_granite"), "top" to
      Key.key("minecraft:block/polished_granite")) }),
  POLISHED_TUFF(lazy { Key.key("minecraft:block/polished_tuff") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/polished_tuff")) }),
  POLISHED_TUFF_SLAB(lazy { Key.key("minecraft:block/polished_tuff_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_tuff"), "side" to Key.key("minecraft:block/polished_tuff"),
      "top" to Key.key("minecraft:block/polished_tuff")) }),
  POLISHED_TUFF_STAIRS(lazy { Key.key("minecraft:block/polished_tuff_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/polished_tuff"), "side" to Key.key("minecraft:block/polished_tuff"),
      "top" to Key.key("minecraft:block/polished_tuff")) }),
  POPPY(lazy { Key.key("minecraft:block/poppy") }, lazy { Key.key("minecraft:block/cross") }, lazy {
      mapOf("cross" to Key.key("minecraft:block/poppy")) }),
  POTTED_ACACIA_SAPLING(lazy { Key.key("minecraft:block/potted_acacia_sapling") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/acacia_sapling")) }),
  POTTED_ALLIUM(lazy { Key.key("minecraft:block/potted_allium") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/allium")) }),
  POTTED_AZALEA_BUSH(lazy { Key.key("minecraft:block/potted_azalea_bush") }, lazy {
      Key.key("minecraft:block/template_potted_azalea_bush") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/potted_azalea_bush_plant"), "side" to
      Key.key("minecraft:block/potted_azalea_bush_side"), "top" to
      Key.key("minecraft:block/potted_azalea_bush_top")) }),
  POTTED_AZURE_BLUET(lazy { Key.key("minecraft:block/potted_azure_bluet") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/azure_bluet")) }),
  POTTED_BAMBOO(lazy { Key.key("minecraft:block/potted_bamboo") }, lazy { null }, lazy {
      mapOf("flowerpot" to Key.key("minecraft:block/flower_pot"), "dirt" to
      Key.key("minecraft:block/dirt"), "bamboo" to Key.key("minecraft:block/bamboo_stalk"), "leaf"
      to Key.key("minecraft:block/bamboo_singleleaf"), "particle" to
      Key.key("minecraft:block/flower_pot")) }),
  POTTED_BIRCH_SAPLING(lazy { Key.key("minecraft:block/potted_birch_sapling") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/birch_sapling")) }),
  POTTED_BLUE_ORCHID(lazy { Key.key("minecraft:block/potted_blue_orchid") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/blue_orchid")) }),
  POTTED_BROWN_MUSHROOM(lazy { Key.key("minecraft:block/potted_brown_mushroom") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/brown_mushroom")) }),
  POTTED_CACTUS(lazy { Key.key("minecraft:block/potted_cactus") }, lazy { null }, lazy {
      mapOf("flowerpot" to Key.key("minecraft:block/flower_pot"), "cactus_top" to
      Key.key("minecraft:block/cactus_top"), "cactus" to Key.key("minecraft:block/cactus_side"),
      "particle" to Key.key("minecraft:block/flower_pot")) }),
  POTTED_CHERRY_SAPLING(lazy { Key.key("minecraft:block/potted_cherry_sapling") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/cherry_sapling")) }),
  POTTED_CORNFLOWER(lazy { Key.key("minecraft:block/potted_cornflower") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/cornflower")) }),
  POTTED_CRIMSON_FUNGUS(lazy { Key.key("minecraft:block/potted_crimson_fungus") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/crimson_fungus")) }),
  POTTED_CRIMSON_ROOTS(lazy { Key.key("minecraft:block/potted_crimson_roots") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/crimson_roots_pot")) }),
  POTTED_DANDELION(lazy { Key.key("minecraft:block/potted_dandelion") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/dandelion")) }),
  POTTED_DARK_OAK_SAPLING(lazy { Key.key("minecraft:block/potted_dark_oak_sapling") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/dark_oak_sapling")) }),
  POTTED_DEAD_BUSH(lazy { Key.key("minecraft:block/potted_dead_bush") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/dead_bush")) }),
  POTTED_FERN(lazy { Key.key("minecraft:block/potted_fern") }, lazy {
      Key.key("minecraft:block/tinted_flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/fern")) }),
  POTTED_FLOWERING_AZALEA_BUSH(lazy { Key.key("minecraft:block/potted_flowering_azalea_bush") },
      lazy { Key.key("minecraft:block/template_potted_azalea_bush") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/potted_flowering_azalea_bush_plant"), "side" to
      Key.key("minecraft:block/potted_flowering_azalea_bush_side"), "top" to
      Key.key("minecraft:block/potted_flowering_azalea_bush_top")) }),
  POTTED_JUNGLE_SAPLING(lazy { Key.key("minecraft:block/potted_jungle_sapling") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/jungle_sapling")) }),
  POTTED_LILY_OF_THE_VALLEY(lazy { Key.key("minecraft:block/potted_lily_of_the_valley") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/lily_of_the_valley")) }),
  POTTED_MANGROVE_PROPAGULE(lazy { Key.key("minecraft:block/potted_mangrove_propagule") }, lazy {
      null }, lazy { mapOf("sapling" to Key.key("minecraft:block/mangrove_propagule"), "flowerpot"
      to Key.key("minecraft:block/flower_pot"), "dirt" to Key.key("minecraft:block/dirt"),
      "particle" to Key.key("minecraft:block/flower_pot")) }),
  POTTED_OAK_SAPLING(lazy { Key.key("minecraft:block/potted_oak_sapling") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/oak_sapling")) }),
  POTTED_ORANGE_TULIP(lazy { Key.key("minecraft:block/potted_orange_tulip") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/orange_tulip")) }),
  POTTED_OXEYE_DAISY(lazy { Key.key("minecraft:block/potted_oxeye_daisy") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/oxeye_daisy")) }),
  POTTED_PINK_TULIP(lazy { Key.key("minecraft:block/potted_pink_tulip") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/pink_tulip")) }),
  POTTED_POPPY(lazy { Key.key("minecraft:block/potted_poppy") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/poppy")) }),
  POTTED_RED_MUSHROOM(lazy { Key.key("minecraft:block/potted_red_mushroom") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/red_mushroom")) }),
  POTTED_RED_TULIP(lazy { Key.key("minecraft:block/potted_red_tulip") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/red_tulip")) }),
  POTTED_SPRUCE_SAPLING(lazy { Key.key("minecraft:block/potted_spruce_sapling") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/spruce_sapling")) }),
  POTTED_TORCHFLOWER(lazy { Key.key("minecraft:block/potted_torchflower") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/torchflower")) }),
  POTTED_WARPED_FUNGUS(lazy { Key.key("minecraft:block/potted_warped_fungus") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/warped_fungus")) }),
  POTTED_WARPED_ROOTS(lazy { Key.key("minecraft:block/potted_warped_roots") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/warped_roots_pot")) }),
  POTTED_WHITE_TULIP(lazy { Key.key("minecraft:block/potted_white_tulip") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/white_tulip")) }),
  POTTED_WITHER_ROSE(lazy { Key.key("minecraft:block/potted_wither_rose") }, lazy {
      Key.key("minecraft:block/flower_pot_cross") }, lazy { mapOf("plant" to
      Key.key("minecraft:block/wither_rose")) }),
  POWDER_SNOW(lazy { Key.key("minecraft:block/powder_snow") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/powder_snow"), ) }),
  POWERED_RAIL(lazy { Key.key("minecraft:block/powered_rail") }, lazy {
      Key.key("minecraft:block/rail_flat") }, lazy { mapOf("rail" to
      Key.key("minecraft:block/powered_rail")) }),
  PRISMARINE(lazy { Key.key("minecraft:block/prismarine") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/prismarine")) }),
  PRISMARINE_BRICKS(lazy { Key.key("minecraft:block/prismarine_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/prismarine_bricks")) }),
  PRISMARINE_BRICK_SLAB(lazy { Key.key("minecraft:block/prismarine_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/prismarine_bricks"), "side" to
      Key.key("minecraft:block/prismarine_bricks"), "top" to
      Key.key("minecraft:block/prismarine_bricks")) }),
  PRISMARINE_BRICK_STAIRS(lazy { Key.key("minecraft:block/prismarine_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/prismarine_bricks"), "side" to
      Key.key("minecraft:block/prismarine_bricks"), "top" to
      Key.key("minecraft:block/prismarine_bricks")) }),
  PRISMARINE_SLAB(lazy { Key.key("minecraft:block/prismarine_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/prismarine"), "side" to Key.key("minecraft:block/prismarine"), "top"
      to Key.key("minecraft:block/prismarine")) }),
  PRISMARINE_STAIRS(lazy { Key.key("minecraft:block/prismarine_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/prismarine"), "side" to Key.key("minecraft:block/prismarine"), "top"
      to Key.key("minecraft:block/prismarine")) }),
  PUMPKIN(lazy { Key.key("minecraft:block/pumpkin") }, lazy { Key.key("minecraft:block/cube_column")
      }, lazy { mapOf("end" to Key.key("minecraft:block/pumpkin_top"), "side" to
      Key.key("minecraft:block/pumpkin_side")) }),
  PURPLE_CANDLE_CAKE(lazy { Key.key("minecraft:block/purple_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/purple_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  PURPLE_CARPET(lazy { Key.key("minecraft:block/purple_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/purple_wool")) }),
  PURPLE_CONCRETE(lazy { Key.key("minecraft:block/purple_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/purple_concrete")) }),
  PURPLE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/purple_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/purple_concrete_powder")) }),
  PURPLE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/purple_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/purple_glazed_terracotta")) }),
  PURPLE_SHULKER_BOX(lazy { Key.key("minecraft:block/purple_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/purple_shulker_box")) }),
  PURPLE_STAINED_GLASS(lazy { Key.key("minecraft:block/purple_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/purple_stained_glass")) }),
  PURPLE_TERRACOTTA(lazy { Key.key("minecraft:block/purple_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/purple_terracotta")) }),
  PURPLE_WOOL(lazy { Key.key("minecraft:block/purple_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/purple_wool")) }),
  PURPUR_BLOCK(lazy { Key.key("minecraft:block/purpur_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/purpur_block")) }),
  PURPUR_PILLAR(lazy { Key.key("minecraft:block/purpur_pillar") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/purpur_pillar_top"), "side" to
      Key.key("minecraft:block/purpur_pillar")) }),
  PURPUR_SLAB(lazy { Key.key("minecraft:block/purpur_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/purpur_block"), "side" to Key.key("minecraft:block/purpur_block"),
      "top" to Key.key("minecraft:block/purpur_block")) }),
  PURPUR_STAIRS(lazy { Key.key("minecraft:block/purpur_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/purpur_block"), "side" to Key.key("minecraft:block/purpur_block"),
      "top" to Key.key("minecraft:block/purpur_block")) }),
  QUARTZ_BLOCK(lazy { Key.key("minecraft:block/quartz_block") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/quartz_block_top"), "side" to
      Key.key("minecraft:block/quartz_block_side")) }),
  QUARTZ_BRICKS(lazy { Key.key("minecraft:block/quartz_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/quartz_bricks")) }),
  QUARTZ_PILLAR(lazy { Key.key("minecraft:block/quartz_pillar") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/quartz_pillar_top"), "side" to
      Key.key("minecraft:block/quartz_pillar")) }),
  QUARTZ_SLAB(lazy { Key.key("minecraft:block/quartz_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/quartz_block_top"), "side" to
      Key.key("minecraft:block/quartz_block_side"), "top" to
      Key.key("minecraft:block/quartz_block_top")) }),
  QUARTZ_STAIRS(lazy { Key.key("minecraft:block/quartz_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/quartz_block_top"), "side" to
      Key.key("minecraft:block/quartz_block_side"), "top" to
      Key.key("minecraft:block/quartz_block_top")) }),
  RAIL(lazy { Key.key("minecraft:block/rail") }, lazy { Key.key("minecraft:block/rail_flat") }, lazy
      { mapOf("rail" to Key.key("minecraft:block/rail")) }),
  RAW_COPPER_BLOCK(lazy { Key.key("minecraft:block/raw_copper_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/raw_copper_block")) }),
  RAW_GOLD_BLOCK(lazy { Key.key("minecraft:block/raw_gold_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/raw_gold_block")) }),
  RAW_IRON_BLOCK(lazy { Key.key("minecraft:block/raw_iron_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/raw_iron_block")) }),
  REDSTONE_BLOCK(lazy { Key.key("minecraft:block/redstone_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/redstone_block")) }),
  REDSTONE_LAMP(lazy { Key.key("minecraft:block/redstone_lamp") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/redstone_lamp")) }),
  REDSTONE_ORE(lazy { Key.key("minecraft:block/redstone_ore") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/redstone_ore")) }),
  REDSTONE_TORCH(lazy { Key.key("minecraft:block/redstone_torch") }, lazy {
      Key.key("minecraft:block/template_torch") }, lazy { mapOf("torch" to
      Key.key("minecraft:block/redstone_torch")) }),
  REDSTONE_WALL_TORCH(lazy { Key.key("minecraft:block/redstone_wall_torch") }, lazy {
      Key.key("minecraft:block/template_torch_wall") }, lazy { mapOf("torch" to
      Key.key("minecraft:block/redstone_torch")) }),
  RED_CANDLE_CAKE(lazy { Key.key("minecraft:block/red_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/red_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  RED_CARPET(lazy { Key.key("minecraft:block/red_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/red_wool")) }),
  RED_CONCRETE(lazy { Key.key("minecraft:block/red_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/red_concrete")) }),
  RED_CONCRETE_POWDER(lazy { Key.key("minecraft:block/red_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/red_concrete_powder")) }),
  RED_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/red_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/red_glazed_terracotta")) }),
  RED_MUSHROOM(lazy { Key.key("minecraft:block/red_mushroom") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/red_mushroom")) }),
  RED_MUSHROOM_BLOCK(lazy { Key.key("minecraft:block/red_mushroom_block") }, lazy {
      Key.key("minecraft:block/template_single_face") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/red_mushroom_block")) }),
  RED_NETHER_BRICKS(lazy { Key.key("minecraft:block/red_nether_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/red_nether_bricks")) }),
  RED_NETHER_BRICK_SLAB(lazy { Key.key("minecraft:block/red_nether_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/red_nether_bricks"), "side" to
      Key.key("minecraft:block/red_nether_bricks"), "top" to
      Key.key("minecraft:block/red_nether_bricks")) }),
  RED_NETHER_BRICK_STAIRS(lazy { Key.key("minecraft:block/red_nether_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/red_nether_bricks"), "side" to
      Key.key("minecraft:block/red_nether_bricks"), "top" to
      Key.key("minecraft:block/red_nether_bricks")) }),
  RED_SAND(lazy { Key.key("minecraft:block/red_sand") }, lazy { Key.key("minecraft:block/cube_all")
      }, lazy { mapOf("all" to Key.key("minecraft:block/red_sand")) }),
  RED_SANDSTONE(lazy { Key.key("minecraft:block/red_sandstone") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/red_sandstone_bottom"), "side" to
      Key.key("minecraft:block/red_sandstone"), "top" to
      Key.key("minecraft:block/red_sandstone_top")) }),
  RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/red_sandstone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/red_sandstone_bottom"), "side" to
      Key.key("minecraft:block/red_sandstone"), "top" to
      Key.key("minecraft:block/red_sandstone_top")) }),
  RED_SANDSTONE_STAIRS(lazy { Key.key("minecraft:block/red_sandstone_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/red_sandstone_bottom"), "side" to
      Key.key("minecraft:block/red_sandstone"), "top" to
      Key.key("minecraft:block/red_sandstone_top")) }),
  RED_SHULKER_BOX(lazy { Key.key("minecraft:block/red_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/red_shulker_box")) }),
  RED_STAINED_GLASS(lazy { Key.key("minecraft:block/red_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/red_stained_glass")) }),
  RED_TERRACOTTA(lazy { Key.key("minecraft:block/red_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/red_terracotta")) }),
  RED_TULIP(lazy { Key.key("minecraft:block/red_tulip") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/red_tulip")) }),
  RED_WOOL(lazy { Key.key("minecraft:block/red_wool") }, lazy { Key.key("minecraft:block/cube_all")
      }, lazy { mapOf("all" to Key.key("minecraft:block/red_wool")) }),
  REINFORCED_DEEPSLATE(lazy { Key.key("minecraft:block/reinforced_deepslate") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/reinforced_deepslate_bottom"), "side" to
      Key.key("minecraft:block/reinforced_deepslate_side"), "top" to
      Key.key("minecraft:block/reinforced_deepslate_top")) }),
  REPEATING_COMMAND_BLOCK(lazy { Key.key("minecraft:block/repeating_command_block") }, lazy {
      Key.key("minecraft:block/template_command_block") }, lazy { mapOf("back" to
      Key.key("minecraft:block/repeating_command_block_back"), "front" to
      Key.key("minecraft:block/repeating_command_block_front"), "side" to
      Key.key("minecraft:block/repeating_command_block_side")) }),
  ROOTED_DIRT(lazy { Key.key("minecraft:block/rooted_dirt") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/rooted_dirt")) }),
  SAND(lazy { Key.key("minecraft:block/sand") }, lazy { Key.key("minecraft:block/cube_all") }, lazy
      { mapOf("all" to Key.key("minecraft:block/sand")) }),
  SANDSTONE(lazy { Key.key("minecraft:block/sandstone") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sandstone_bottom"), "side" to Key.key("minecraft:block/sandstone"),
      "top" to Key.key("minecraft:block/sandstone_top")) }),
  SANDSTONE_SLAB(lazy { Key.key("minecraft:block/sandstone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sandstone_bottom"), "side" to Key.key("minecraft:block/sandstone"),
      "top" to Key.key("minecraft:block/sandstone_top")) }),
  SANDSTONE_STAIRS(lazy { Key.key("minecraft:block/sandstone_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sandstone_bottom"), "side" to Key.key("minecraft:block/sandstone"),
      "top" to Key.key("minecraft:block/sandstone_top")) }),
  SCULK(lazy { Key.key("minecraft:block/sculk") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/sculk")) }),
  SCULK_CATALYST(lazy { Key.key("minecraft:block/sculk_catalyst") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sculk_catalyst_bottom"), "side" to
      Key.key("minecraft:block/sculk_catalyst_side"), "top" to
      Key.key("minecraft:block/sculk_catalyst_top")) }),
  SCULK_SENSOR(lazy { Key.key("minecraft:block/sculk_sensor") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sculk_sensor_bottom"), "side" to
      Key.key("minecraft:block/sculk_sensor_side"), "tendrils" to
      Key.key("minecraft:block/sculk_sensor_tendril_inactive"), "top" to
      Key.key("minecraft:block/sculk_sensor_top"), "particle" to
      Key.key("minecraft:block/sculk_sensor_bottom")) }),
  SCULK_SHRIEKER(lazy { Key.key("minecraft:block/sculk_shrieker") }, lazy {
      Key.key("minecraft:block/template_sculk_shrieker") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sculk_shrieker_bottom"), "inner_top" to
      Key.key("minecraft:block/sculk_shrieker_inner_top"), "side" to
      Key.key("minecraft:block/sculk_shrieker_side"), "top" to
      Key.key("minecraft:block/sculk_shrieker_top"), "particle" to
      Key.key("minecraft:block/sculk_shrieker_bottom")) }),
  SCULK_VEIN(lazy { Key.key("minecraft:block/sculk_vein") }, lazy { null }, lazy {
      mapOf("sculk_vein" to Key.key("minecraft:block/sculk_vein"), "particle" to
      Key.key("minecraft:block/sculk_vein")) }),
  SEAGRASS(lazy { Key.key("minecraft:block/seagrass") }, lazy {
      Key.key("minecraft:block/template_seagrass") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/seagrass")) }),
  SEA_LANTERN(lazy { Key.key("minecraft:block/sea_lantern") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/sea_lantern")) }),
  SEA_PICKLE(lazy { Key.key("minecraft:block/sea_pickle") }, lazy { Key.key("minecraft:block/block")
      }, lazy { mapOf("all" to Key.key("minecraft:block/sea_pickle"), "particle" to
      Key.key("minecraft:block/sea_pickle")) }),
  SHORT_GRASS(lazy { Key.key("minecraft:block/short_grass") }, lazy {
      Key.key("minecraft:block/tinted_cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/short_grass")) }),
  SHROOMLIGHT(lazy { Key.key("minecraft:block/shroomlight") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/shroomlight")) }),
  SHULKER_BOX(lazy { Key.key("minecraft:block/shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/shulker_box")) }),
  SLIME_BLOCK(lazy { Key.key("minecraft:block/slime_block") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/slime_block"), "particle" to Key.key("minecraft:block/slime_block"))
      }),
  SMALL_AMETHYST_BUD(lazy { Key.key("minecraft:block/small_amethyst_bud") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/small_amethyst_bud")) }),
  SMITHING_TABLE(lazy { Key.key("minecraft:block/smithing_table") }, lazy {
      Key.key("minecraft:block/cube") }, lazy { mapOf("down" to
      Key.key("minecraft:block/smithing_table_bottom"), "east" to
      Key.key("minecraft:block/smithing_table_side"), "north" to
      Key.key("minecraft:block/smithing_table_front"), "south" to
      Key.key("minecraft:block/smithing_table_front"), "up" to
      Key.key("minecraft:block/smithing_table_top"), "west" to
      Key.key("minecraft:block/smithing_table_side"), "particle" to
      Key.key("minecraft:block/smithing_table_front")) }),
  SMOKER(lazy { Key.key("minecraft:block/smoker") }, lazy {
      Key.key("minecraft:block/orientable_with_bottom") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/smoker_bottom"), "front" to Key.key("minecraft:block/smoker_front"),
      "side" to Key.key("minecraft:block/smoker_side"), "top" to
      Key.key("minecraft:block/smoker_top")) }),
  SMOOTH_BASALT(lazy { Key.key("minecraft:block/smooth_basalt") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/smooth_basalt")) }),
  SMOOTH_QUARTZ(lazy { Key.key("minecraft:block/smooth_quartz") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/quartz_block_bottom")) }),
  SMOOTH_QUARTZ_SLAB(lazy { Key.key("minecraft:block/smooth_quartz_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/quartz_block_bottom"), "side" to
      Key.key("minecraft:block/quartz_block_bottom"), "top" to
      Key.key("minecraft:block/quartz_block_bottom")) }),
  SMOOTH_QUARTZ_STAIRS(lazy { Key.key("minecraft:block/smooth_quartz_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/quartz_block_bottom"), "side" to
      Key.key("minecraft:block/quartz_block_bottom"), "top" to
      Key.key("minecraft:block/quartz_block_bottom")) }),
  SMOOTH_RED_SANDSTONE(lazy { Key.key("minecraft:block/smooth_red_sandstone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/red_sandstone_top")) }),
  SMOOTH_RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/smooth_red_sandstone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/red_sandstone_top"), "side" to
      Key.key("minecraft:block/red_sandstone_top"), "top" to
      Key.key("minecraft:block/red_sandstone_top")) }),
  SMOOTH_RED_SANDSTONE_STAIRS(lazy { Key.key("minecraft:block/smooth_red_sandstone_stairs") }, lazy
      { Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/red_sandstone_top"), "side" to
      Key.key("minecraft:block/red_sandstone_top"), "top" to
      Key.key("minecraft:block/red_sandstone_top")) }),
  SMOOTH_SANDSTONE(lazy { Key.key("minecraft:block/smooth_sandstone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/sandstone_top")) }),
  SMOOTH_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/smooth_sandstone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sandstone_top"), "side" to Key.key("minecraft:block/sandstone_top"),
      "top" to Key.key("minecraft:block/sandstone_top")) }),
  SMOOTH_SANDSTONE_STAIRS(lazy { Key.key("minecraft:block/smooth_sandstone_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/sandstone_top"), "side" to Key.key("minecraft:block/sandstone_top"),
      "top" to Key.key("minecraft:block/sandstone_top")) }),
  SMOOTH_STONE(lazy { Key.key("minecraft:block/smooth_stone") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/smooth_stone")) }),
  SMOOTH_STONE_SLAB(lazy { Key.key("minecraft:block/smooth_stone_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/smooth_stone"), "side" to
      Key.key("minecraft:block/smooth_stone_slab_side"), "top" to
      Key.key("minecraft:block/smooth_stone")) }),
  SNIFFER_EGG(lazy { Key.key("minecraft:block/sniffer_egg") }, lazy { null }, lazy { mapOf() }),
  SNOW_BLOCK(lazy { Key.key("minecraft:block/snow_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to Key.key("minecraft:block/snow"))
      }),
  SOUL_CAMPFIRE(lazy { Key.key("minecraft:block/soul_campfire") }, lazy {
      Key.key("minecraft:block/template_campfire") }, lazy { mapOf("fire" to
      Key.key("minecraft:block/soul_campfire_fire"), "lit_log" to
      Key.key("minecraft:block/soul_campfire_log_lit")) }),
  SOUL_LANTERN(lazy { Key.key("minecraft:block/soul_lantern") }, lazy {
      Key.key("minecraft:block/template_lantern") }, lazy { mapOf("lantern" to
      Key.key("minecraft:block/soul_lantern")) }),
  SOUL_SAND(lazy { Key.key("minecraft:block/soul_sand") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/soul_sand")) }),
  SOUL_SOIL(lazy { Key.key("minecraft:block/soul_soil") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/soul_soil")) }),
  SOUL_TORCH(lazy { Key.key("minecraft:block/soul_torch") }, lazy {
      Key.key("minecraft:block/template_torch") }, lazy { mapOf("torch" to
      Key.key("minecraft:block/soul_torch")) }),
  SOUL_WALL_TORCH(lazy { Key.key("minecraft:block/soul_wall_torch") }, lazy {
      Key.key("minecraft:block/template_torch_wall") }, lazy { mapOf("torch" to
      Key.key("minecraft:block/soul_torch")) }),
  SPAWNER(lazy { Key.key("minecraft:block/spawner") }, lazy {
      Key.key("minecraft:block/cube_all_inner_faces") }, lazy { mapOf("all" to
      Key.key("minecraft:block/spawner")) }),
  SPONGE(lazy { Key.key("minecraft:block/sponge") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/sponge")) }),
  SPORE_BLOSSOM(lazy { Key.key("minecraft:block/spore_blossom") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("flower" to
      Key.key("minecraft:block/spore_blossom"), "base" to
      Key.key("minecraft:block/spore_blossom_base"), "particle" to
      Key.key("minecraft:block/spore_blossom")) }),
  SPRUCE_BUTTON(lazy { Key.key("minecraft:block/spruce_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/spruce_planks")) }),
  SPRUCE_FENCE_GATE(lazy { Key.key("minecraft:block/spruce_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/spruce_planks")) }),
  SPRUCE_HANGING_SIGN(lazy { Key.key("minecraft:block/spruce_hanging_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/stripped_spruce_log")) }),
  SPRUCE_LEAVES(lazy { Key.key("minecraft:block/spruce_leaves") }, lazy {
      Key.key("minecraft:block/leaves") }, lazy { mapOf("all" to
      Key.key("minecraft:block/spruce_leaves")) }),
  SPRUCE_LOG(lazy { Key.key("minecraft:block/spruce_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/spruce_log_top"), "side" to Key.key("minecraft:block/spruce_log"))
      }),
  SPRUCE_PLANKS(lazy { Key.key("minecraft:block/spruce_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/spruce_planks")) }),
  SPRUCE_PRESSURE_PLATE(lazy { Key.key("minecraft:block/spruce_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/spruce_planks")) }),
  SPRUCE_SAPLING(lazy { Key.key("minecraft:block/spruce_sapling") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/spruce_sapling")) }),
  SPRUCE_SIGN(lazy { Key.key("minecraft:block/spruce_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/spruce_planks")) }),
  SPRUCE_SLAB(lazy { Key.key("minecraft:block/spruce_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/spruce_planks"), "side" to Key.key("minecraft:block/spruce_planks"),
      "top" to Key.key("minecraft:block/spruce_planks")) }),
  SPRUCE_STAIRS(lazy { Key.key("minecraft:block/spruce_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/spruce_planks"), "side" to Key.key("minecraft:block/spruce_planks"),
      "top" to Key.key("minecraft:block/spruce_planks")) }),
  SPRUCE_WOOD(lazy { Key.key("minecraft:block/spruce_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/spruce_log"), "side" to Key.key("minecraft:block/spruce_log")) }),
  STICKY_PISTON(lazy { Key.key("minecraft:block/sticky_piston") }, lazy {
      Key.key("minecraft:block/template_piston") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/piston_bottom"), "platform" to
      Key.key("minecraft:block/piston_top_sticky"), "side" to
      Key.key("minecraft:block/piston_side")) }),
  STONE(lazy { Key.key("minecraft:block/stone") }, lazy { Key.key("minecraft:block/cube_all") },
      lazy { mapOf("all" to Key.key("minecraft:block/stone")) }),
  STONECUTTER(lazy { Key.key("minecraft:block/stonecutter") }, lazy {
      Key.key("minecraft:block/block") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/stonecutter_bottom"), "top" to
      Key.key("minecraft:block/stonecutter_top"), "side" to
      Key.key("minecraft:block/stonecutter_side"), "saw" to
      Key.key("minecraft:block/stonecutter_saw"), "particle" to
      Key.key("minecraft:block/stonecutter_bottom")) }),
  STONE_BRICKS(lazy { Key.key("minecraft:block/stone_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/stone_bricks")) }),
  STONE_BRICK_SLAB(lazy { Key.key("minecraft:block/stone_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/stone_bricks"), "side" to Key.key("minecraft:block/stone_bricks"),
      "top" to Key.key("minecraft:block/stone_bricks")) }),
  STONE_BRICK_STAIRS(lazy { Key.key("minecraft:block/stone_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/stone_bricks"), "side" to Key.key("minecraft:block/stone_bricks"),
      "top" to Key.key("minecraft:block/stone_bricks")) }),
  STONE_BUTTON(lazy { Key.key("minecraft:block/stone_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/stone")) }),
  STONE_PRESSURE_PLATE(lazy { Key.key("minecraft:block/stone_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/stone")) }),
  STONE_SLAB(lazy { Key.key("minecraft:block/stone_slab") }, lazy { Key.key("minecraft:block/slab")
      }, lazy { mapOf("bottom" to Key.key("minecraft:block/stone"), "side" to
      Key.key("minecraft:block/stone"), "top" to Key.key("minecraft:block/stone")) }),
  STONE_STAIRS(lazy { Key.key("minecraft:block/stone_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/stone"), "side" to Key.key("minecraft:block/stone"), "top" to
      Key.key("minecraft:block/stone")) }),
  STRIPPED_ACACIA_LOG(lazy { Key.key("minecraft:block/stripped_acacia_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_acacia_log_top"), "side" to
      Key.key("minecraft:block/stripped_acacia_log")) }),
  STRIPPED_ACACIA_WOOD(lazy { Key.key("minecraft:block/stripped_acacia_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_acacia_log"), "side" to
      Key.key("minecraft:block/stripped_acacia_log")) }),
  STRIPPED_BAMBOO_BLOCK(lazy { Key.key("minecraft:block/stripped_bamboo_block") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_bamboo_block_top"), "side" to
      Key.key("minecraft:block/stripped_bamboo_block")) }),
  STRIPPED_BIRCH_LOG(lazy { Key.key("minecraft:block/stripped_birch_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_birch_log_top"), "side" to
      Key.key("minecraft:block/stripped_birch_log")) }),
  STRIPPED_BIRCH_WOOD(lazy { Key.key("minecraft:block/stripped_birch_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_birch_log"), "side" to
      Key.key("minecraft:block/stripped_birch_log")) }),
  STRIPPED_CHERRY_LOG(lazy { Key.key("minecraft:block/stripped_cherry_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_cherry_log_top"), "side" to
      Key.key("minecraft:block/stripped_cherry_log")) }),
  STRIPPED_CHERRY_WOOD(lazy { Key.key("minecraft:block/stripped_cherry_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_cherry_log"), "side" to
      Key.key("minecraft:block/stripped_cherry_log")) }),
  STRIPPED_CRIMSON_HYPHAE(lazy { Key.key("minecraft:block/stripped_crimson_hyphae") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_crimson_stem"), "side" to
      Key.key("minecraft:block/stripped_crimson_stem")) }),
  STRIPPED_CRIMSON_STEM(lazy { Key.key("minecraft:block/stripped_crimson_stem") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_crimson_stem_top"), "side" to
      Key.key("minecraft:block/stripped_crimson_stem")) }),
  STRIPPED_DARK_OAK_LOG(lazy { Key.key("minecraft:block/stripped_dark_oak_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_dark_oak_log_top"), "side" to
      Key.key("minecraft:block/stripped_dark_oak_log")) }),
  STRIPPED_DARK_OAK_WOOD(lazy { Key.key("minecraft:block/stripped_dark_oak_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_dark_oak_log"), "side" to
      Key.key("minecraft:block/stripped_dark_oak_log")) }),
  STRIPPED_JUNGLE_LOG(lazy { Key.key("minecraft:block/stripped_jungle_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_jungle_log_top"), "side" to
      Key.key("minecraft:block/stripped_jungle_log")) }),
  STRIPPED_JUNGLE_WOOD(lazy { Key.key("minecraft:block/stripped_jungle_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_jungle_log"), "side" to
      Key.key("minecraft:block/stripped_jungle_log")) }),
  STRIPPED_MANGROVE_LOG(lazy { Key.key("minecraft:block/stripped_mangrove_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_mangrove_log_top"), "side" to
      Key.key("minecraft:block/stripped_mangrove_log")) }),
  STRIPPED_MANGROVE_WOOD(lazy { Key.key("minecraft:block/stripped_mangrove_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_mangrove_log"), "side" to
      Key.key("minecraft:block/stripped_mangrove_log")) }),
  STRIPPED_OAK_LOG(lazy { Key.key("minecraft:block/stripped_oak_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_oak_log_top"), "side" to
      Key.key("minecraft:block/stripped_oak_log")) }),
  STRIPPED_OAK_WOOD(lazy { Key.key("minecraft:block/stripped_oak_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_oak_log"), "side" to
      Key.key("minecraft:block/stripped_oak_log")) }),
  STRIPPED_SPRUCE_LOG(lazy { Key.key("minecraft:block/stripped_spruce_log") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_spruce_log_top"), "side" to
      Key.key("minecraft:block/stripped_spruce_log")) }),
  STRIPPED_SPRUCE_WOOD(lazy { Key.key("minecraft:block/stripped_spruce_wood") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_spruce_log"), "side" to
      Key.key("minecraft:block/stripped_spruce_log")) }),
  STRIPPED_WARPED_HYPHAE(lazy { Key.key("minecraft:block/stripped_warped_hyphae") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_warped_stem"), "side" to
      Key.key("minecraft:block/stripped_warped_stem")) }),
  STRIPPED_WARPED_STEM(lazy { Key.key("minecraft:block/stripped_warped_stem") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/stripped_warped_stem_top"), "side" to
      Key.key("minecraft:block/stripped_warped_stem")) }),
  STRUCTURE_BLOCK(lazy { Key.key("minecraft:block/structure_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/structure_block")) }),
  STRUCTURE_VOID(lazy { Key.key("minecraft:block/structure_void") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:item/structure_void")) }),
  SUGAR_CANE(lazy { Key.key("minecraft:block/sugar_cane") }, lazy {
      Key.key("minecraft:block/tinted_cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/sugar_cane")) }),
  TARGET(lazy { Key.key("minecraft:block/target") }, lazy { Key.key("minecraft:block/cube_column")
      }, lazy { mapOf("end" to Key.key("minecraft:block/target_top"), "side" to
      Key.key("minecraft:block/target_side")) }),
  TERRACOTTA(lazy { Key.key("minecraft:block/terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/terracotta")) }),
  TINTED_GLASS(lazy { Key.key("minecraft:block/tinted_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/tinted_glass")) }),
  TNT(lazy { Key.key("minecraft:block/tnt") }, lazy { Key.key("minecraft:block/cube_bottom_top") },
      lazy { mapOf("bottom" to Key.key("minecraft:block/tnt_bottom"), "side" to
      Key.key("minecraft:block/tnt_side"), "top" to Key.key("minecraft:block/tnt_top")) }),
  TORCH(lazy { Key.key("minecraft:block/torch") }, lazy { Key.key("minecraft:block/template_torch")
      }, lazy { mapOf("torch" to Key.key("minecraft:block/torch")) }),
  TORCHFLOWER(lazy { Key.key("minecraft:block/torchflower") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/torchflower")) }),
  TRIAL_SPAWNER(lazy { Key.key("minecraft:block/trial_spawner") }, lazy {
      Key.key("minecraft:block/cube_bottom_top_inner_faces") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/trial_spawner_bottom"), "side" to
      Key.key("minecraft:block/trial_spawner_side_inactive"), "top" to
      Key.key("minecraft:block/trial_spawner_top_inactive")) }),
  TRIPWIRE_HOOK(lazy { Key.key("minecraft:block/tripwire_hook") }, lazy { null }, lazy {
      mapOf("hook" to Key.key("minecraft:block/tripwire_hook"), "wood" to
      Key.key("minecraft:block/oak_planks"), "particle" to Key.key("minecraft:block/oak_planks"))
      }),
  TUBE_CORAL(lazy { Key.key("minecraft:block/tube_coral") }, lazy { Key.key("minecraft:block/cross")
      }, lazy { mapOf("cross" to Key.key("minecraft:block/tube_coral")) }),
  TUBE_CORAL_BLOCK(lazy { Key.key("minecraft:block/tube_coral_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/tube_coral_block")) }),
  TUBE_CORAL_FAN(lazy { Key.key("minecraft:block/tube_coral_fan") }, lazy {
      Key.key("minecraft:block/coral_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/tube_coral_fan")) }),
  TUBE_CORAL_WALL_FAN(lazy { Key.key("minecraft:block/tube_coral_wall_fan") }, lazy {
      Key.key("minecraft:block/coral_wall_fan") }, lazy { mapOf("fan" to
      Key.key("minecraft:block/tube_coral_fan")) }),
  TUFF(lazy { Key.key("minecraft:block/tuff") }, lazy { Key.key("minecraft:block/cube_all") }, lazy
      { mapOf("all" to Key.key("minecraft:block/tuff")) }),
  TUFF_BRICKS(lazy { Key.key("minecraft:block/tuff_bricks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/tuff_bricks")) }),
  TUFF_BRICK_SLAB(lazy { Key.key("minecraft:block/tuff_brick_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/tuff_bricks"), "side" to Key.key("minecraft:block/tuff_bricks"),
      "top" to Key.key("minecraft:block/tuff_bricks")) }),
  TUFF_BRICK_STAIRS(lazy { Key.key("minecraft:block/tuff_brick_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/tuff_bricks"), "side" to Key.key("minecraft:block/tuff_bricks"),
      "top" to Key.key("minecraft:block/tuff_bricks")) }),
  TUFF_SLAB(lazy { Key.key("minecraft:block/tuff_slab") }, lazy { Key.key("minecraft:block/slab") },
      lazy { mapOf("bottom" to Key.key("minecraft:block/tuff"), "side" to
      Key.key("minecraft:block/tuff"), "top" to Key.key("minecraft:block/tuff")) }),
  TUFF_STAIRS(lazy { Key.key("minecraft:block/tuff_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to Key.key("minecraft:block/tuff"),
      "side" to Key.key("minecraft:block/tuff"), "top" to Key.key("minecraft:block/tuff")) }),
  TURTLE_EGG(lazy { Key.key("minecraft:block/turtle_egg") }, lazy {
      Key.key("minecraft:block/template_turtle_egg") }, lazy { mapOf("all" to
      Key.key("minecraft:block/turtle_egg")) }),
  TWISTING_VINES(lazy { Key.key("minecraft:block/twisting_vines") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/twisting_vines")) }),
  TWISTING_VINES_PLANT(lazy { Key.key("minecraft:block/twisting_vines_plant") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/twisting_vines_plant")) }),
  VAULT(lazy { Key.key("minecraft:block/vault") }, lazy { Key.key("minecraft:block/template_vault")
      }, lazy { mapOf("bottom" to Key.key("minecraft:block/vault_bottom"), "front" to
      Key.key("minecraft:block/vault_front_off"), "side" to
      Key.key("minecraft:block/vault_side_off"), "top" to Key.key("minecraft:block/vault_top")) }),
  VERDANT_FROGLIGHT(lazy { Key.key("minecraft:block/verdant_froglight") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/verdant_froglight_top"), "side" to
      Key.key("minecraft:block/verdant_froglight_side")) }),
  VINE(lazy { Key.key("minecraft:block/vine") }, lazy { null }, lazy { mapOf("vine" to
      Key.key("minecraft:block/vine"), "particle" to Key.key("minecraft:block/vine")) }),
  WALL_TORCH(lazy { Key.key("minecraft:block/wall_torch") }, lazy {
      Key.key("minecraft:block/template_torch_wall") }, lazy { mapOf("torch" to
      Key.key("minecraft:block/torch")) }),
  WARPED_BUTTON(lazy { Key.key("minecraft:block/warped_button") }, lazy {
      Key.key("minecraft:block/button") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/warped_planks")) }),
  WARPED_FENCE_GATE(lazy { Key.key("minecraft:block/warped_fence_gate") }, lazy {
      Key.key("minecraft:block/template_fence_gate") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/warped_planks")) }),
  WARPED_FUNGUS(lazy { Key.key("minecraft:block/warped_fungus") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/warped_fungus")) }),
  WARPED_HANGING_SIGN(lazy { Key.key("minecraft:block/warped_hanging_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/stripped_warped_stem")) }),
  WARPED_HYPHAE(lazy { Key.key("minecraft:block/warped_hyphae") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/warped_stem"), "side" to Key.key("minecraft:block/warped_stem")) }),
  WARPED_NYLIUM(lazy { Key.key("minecraft:block/warped_nylium") }, lazy {
      Key.key("minecraft:block/cube_bottom_top") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/netherrack"), "side" to
      Key.key("minecraft:block/warped_nylium_side"), "top" to
      Key.key("minecraft:block/warped_nylium")) }),
  WARPED_PLANKS(lazy { Key.key("minecraft:block/warped_planks") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/warped_planks")) }),
  WARPED_PRESSURE_PLATE(lazy { Key.key("minecraft:block/warped_pressure_plate") }, lazy {
      Key.key("minecraft:block/pressure_plate_up") }, lazy { mapOf("texture" to
      Key.key("minecraft:block/warped_planks")) }),
  WARPED_ROOTS(lazy { Key.key("minecraft:block/warped_roots") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/warped_roots")) }),
  WARPED_SIGN(lazy { Key.key("minecraft:block/warped_sign") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/warped_planks")) }),
  WARPED_SLAB(lazy { Key.key("minecraft:block/warped_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/warped_planks"), "side" to Key.key("minecraft:block/warped_planks"),
      "top" to Key.key("minecraft:block/warped_planks")) }),
  WARPED_STAIRS(lazy { Key.key("minecraft:block/warped_stairs") }, lazy {
      Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/warped_planks"), "side" to Key.key("minecraft:block/warped_planks"),
      "top" to Key.key("minecraft:block/warped_planks")) }),
  WARPED_STEM(lazy { Key.key("minecraft:block/warped_stem") }, lazy {
      Key.key("minecraft:block/cube_column") }, lazy { mapOf("end" to
      Key.key("minecraft:block/warped_stem_top"), "side" to Key.key("minecraft:block/warped_stem"))
      }),
  WARPED_WART_BLOCK(lazy { Key.key("minecraft:block/warped_wart_block") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/warped_wart_block")) }),
  WATER(lazy { Key.key("minecraft:block/water") }, lazy { null }, lazy { mapOf("particle" to
      Key.key("minecraft:block/water_still")) }),
  WEATHERED_CHISELED_COPPER(lazy { Key.key("minecraft:block/weathered_chiseled_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/weathered_chiseled_copper")) }),
  WEATHERED_COPPER(lazy { Key.key("minecraft:block/weathered_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/weathered_copper")) }),
  WEATHERED_COPPER_BULB(lazy { Key.key("minecraft:block/weathered_copper_bulb") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/weathered_copper_bulb")) }),
  WEATHERED_COPPER_GRATE(lazy { Key.key("minecraft:block/weathered_copper_grate") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/weathered_copper_grate")) }),
  WEATHERED_CUT_COPPER(lazy { Key.key("minecraft:block/weathered_cut_copper") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/weathered_cut_copper")) }),
  WEATHERED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:block/weathered_cut_copper_slab") }, lazy {
      Key.key("minecraft:block/slab") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/weathered_cut_copper"), "side" to
      Key.key("minecraft:block/weathered_cut_copper"), "top" to
      Key.key("minecraft:block/weathered_cut_copper")) }),
  WEATHERED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:block/weathered_cut_copper_stairs") }, lazy
      { Key.key("minecraft:block/stairs") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/weathered_cut_copper"), "side" to
      Key.key("minecraft:block/weathered_cut_copper"), "top" to
      Key.key("minecraft:block/weathered_cut_copper")) }),
  WEEPING_VINES(lazy { Key.key("minecraft:block/weeping_vines") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/weeping_vines")) }),
  WEEPING_VINES_PLANT(lazy { Key.key("minecraft:block/weeping_vines_plant") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/weeping_vines_plant")) }),
  WET_SPONGE(lazy { Key.key("minecraft:block/wet_sponge") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/wet_sponge")) }),
  WHITE_CANDLE_CAKE(lazy { Key.key("minecraft:block/white_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/white_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  WHITE_CARPET(lazy { Key.key("minecraft:block/white_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/white_wool")) }),
  WHITE_CONCRETE(lazy { Key.key("minecraft:block/white_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/white_concrete")) }),
  WHITE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/white_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/white_concrete_powder")) }),
  WHITE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/white_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/white_glazed_terracotta")) }),
  WHITE_SHULKER_BOX(lazy { Key.key("minecraft:block/white_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/white_shulker_box")) }),
  WHITE_STAINED_GLASS(lazy { Key.key("minecraft:block/white_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/white_stained_glass")) }),
  WHITE_TERRACOTTA(lazy { Key.key("minecraft:block/white_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/white_terracotta")) }),
  WHITE_TULIP(lazy { Key.key("minecraft:block/white_tulip") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/white_tulip")) }),
  WHITE_WOOL(lazy { Key.key("minecraft:block/white_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/white_wool")) }),
  WITHER_ROSE(lazy { Key.key("minecraft:block/wither_rose") }, lazy {
      Key.key("minecraft:block/cross") }, lazy { mapOf("cross" to
      Key.key("minecraft:block/wither_rose")) }),
  YELLOW_CANDLE_CAKE(lazy { Key.key("minecraft:block/yellow_candle_cake") }, lazy {
      Key.key("minecraft:block/template_cake_with_candle") }, lazy { mapOf("bottom" to
      Key.key("minecraft:block/cake_bottom"), "candle" to Key.key("minecraft:block/yellow_candle"),
      "side" to Key.key("minecraft:block/cake_side"), "top" to Key.key("minecraft:block/cake_top"),
      "particle" to Key.key("minecraft:block/cake_side")) }),
  YELLOW_CARPET(lazy { Key.key("minecraft:block/yellow_carpet") }, lazy {
      Key.key("minecraft:block/carpet") }, lazy { mapOf("wool" to
      Key.key("minecraft:block/yellow_wool")) }),
  YELLOW_CONCRETE(lazy { Key.key("minecraft:block/yellow_concrete") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/yellow_concrete")) }),
  YELLOW_CONCRETE_POWDER(lazy { Key.key("minecraft:block/yellow_concrete_powder") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/yellow_concrete_powder")) }),
  YELLOW_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/yellow_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/template_glazed_terracotta") }, lazy { mapOf("pattern" to
      Key.key("minecraft:block/yellow_glazed_terracotta")) }),
  YELLOW_SHULKER_BOX(lazy { Key.key("minecraft:block/yellow_shulker_box") }, lazy { null }, lazy {
      mapOf("particle" to Key.key("minecraft:block/yellow_shulker_box")) }),
  YELLOW_STAINED_GLASS(lazy { Key.key("minecraft:block/yellow_stained_glass") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/yellow_stained_glass")) }),
  YELLOW_TERRACOTTA(lazy { Key.key("minecraft:block/yellow_terracotta") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/yellow_terracotta")) }),
  YELLOW_WOOL(lazy { Key.key("minecraft:block/yellow_wool") }, lazy {
      Key.key("minecraft:block/cube_all") }, lazy { mapOf("all" to
      Key.key("minecraft:block/yellow_wool")) }),
  ;

  public fun toGeneric(): SolidMaterial = SolidMaterial(key.value, parent.value, textures.value)
}
