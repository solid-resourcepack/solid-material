package io.github.solid.resourcepack.material

import kotlin.Lazy
import kotlin.String
import kotlin.collections.Map
import net.kyori.adventure.key.Key

public enum class SolidItemMaterial(
  public val key: Lazy<Key>,
  public val parent: Lazy<Key?>,
  public val textures: Lazy<Map<String, Key>>,
) {
  ACACIA_BOAT(lazy { Key.key("minecraft:item/acacia_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/acacia_boat")) }),
  ACACIA_BUTTON(lazy { Key.key("minecraft:item/acacia_button") }, lazy {
      Key.key("minecraft:block/acacia_button_inventory") }, lazy { mapOf() }),
  ACACIA_CHEST_BOAT(lazy { Key.key("minecraft:item/acacia_chest_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/acacia_chest_boat")) }),
  ACACIA_DOOR(lazy { Key.key("minecraft:item/acacia_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/acacia_door")) }),
  ACACIA_FENCE(lazy { Key.key("minecraft:item/acacia_fence") }, lazy {
      Key.key("minecraft:block/acacia_fence_inventory") }, lazy { mapOf() }),
  ACACIA_FENCE_GATE(lazy { Key.key("minecraft:item/acacia_fence_gate") }, lazy {
      Key.key("minecraft:block/acacia_fence_gate") }, lazy { mapOf() }),
  ACACIA_HANGING_SIGN(lazy { Key.key("minecraft:item/acacia_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/acacia_hanging_sign")) }),
  ACACIA_LEAVES(lazy { Key.key("minecraft:item/acacia_leaves") }, lazy {
      Key.key("minecraft:block/acacia_leaves") }, lazy { mapOf() }),
  ACACIA_LOG(lazy { Key.key("minecraft:item/acacia_log") }, lazy {
      Key.key("minecraft:block/acacia_log") }, lazy { mapOf() }),
  ACACIA_PLANKS(lazy { Key.key("minecraft:item/acacia_planks") }, lazy {
      Key.key("minecraft:block/acacia_planks") }, lazy { mapOf() }),
  ACACIA_PRESSURE_PLATE(lazy { Key.key("minecraft:item/acacia_pressure_plate") }, lazy {
      Key.key("minecraft:block/acacia_pressure_plate") }, lazy { mapOf() }),
  ACACIA_SAPLING(lazy { Key.key("minecraft:item/acacia_sapling") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/acacia_sapling")) }),
  ACACIA_SIGN(lazy { Key.key("minecraft:item/acacia_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/acacia_sign")) }),
  ACACIA_SLAB(lazy { Key.key("minecraft:item/acacia_slab") }, lazy {
      Key.key("minecraft:block/acacia_slab") }, lazy { mapOf() }),
  ACACIA_STAIRS(lazy { Key.key("minecraft:item/acacia_stairs") }, lazy {
      Key.key("minecraft:block/acacia_stairs") }, lazy { mapOf() }),
  ACACIA_TRAPDOOR(lazy { Key.key("minecraft:item/acacia_trapdoor") }, lazy {
      Key.key("minecraft:block/acacia_trapdoor_bottom") }, lazy { mapOf() }),
  ACACIA_WOOD(lazy { Key.key("minecraft:item/acacia_wood") }, lazy {
      Key.key("minecraft:block/acacia_wood") }, lazy { mapOf() }),
  ACTIVATOR_RAIL(lazy { Key.key("minecraft:item/activator_rail") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/activator_rail")) }),
  AIR(lazy { Key.key("minecraft:item/air") }, lazy { null }, lazy { mapOf() }),
  ALLAY_SPAWN_EGG(lazy { Key.key("minecraft:item/allay_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ALLIUM(lazy { Key.key("minecraft:item/allium") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:block/allium")) }),
  AMETHYST_BLOCK(lazy { Key.key("minecraft:item/amethyst_block") }, lazy {
      Key.key("minecraft:block/amethyst_block") }, lazy { mapOf() }),
  AMETHYST_CLUSTER(lazy { Key.key("minecraft:item/amethyst_cluster") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/amethyst_cluster")) }),
  AMETHYST_SHARD(lazy { Key.key("minecraft:item/amethyst_shard") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/amethyst_shard")) }),
  ANCIENT_DEBRIS(lazy { Key.key("minecraft:item/ancient_debris") }, lazy {
      Key.key("minecraft:block/ancient_debris") }, lazy { mapOf() }),
  ANDESITE(lazy { Key.key("minecraft:item/andesite") }, lazy { Key.key("minecraft:block/andesite")
      }, lazy { mapOf() }),
  ANDESITE_SLAB(lazy { Key.key("minecraft:item/andesite_slab") }, lazy {
      Key.key("minecraft:block/andesite_slab") }, lazy { mapOf() }),
  ANDESITE_STAIRS(lazy { Key.key("minecraft:item/andesite_stairs") }, lazy {
      Key.key("minecraft:block/andesite_stairs") }, lazy { mapOf() }),
  ANDESITE_WALL(lazy { Key.key("minecraft:item/andesite_wall") }, lazy {
      Key.key("minecraft:block/andesite_wall_inventory") }, lazy { mapOf() }),
  ANGLER_POTTERY_SHERD(lazy { Key.key("minecraft:item/angler_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/angler_pottery_sherd")) }),
  ANVIL(lazy { Key.key("minecraft:item/anvil") }, lazy { Key.key("minecraft:block/anvil") }, lazy {
      mapOf() }),
  APPLE(lazy { Key.key("minecraft:item/apple") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/apple")) }),
  ARCHER_POTTERY_SHERD(lazy { Key.key("minecraft:item/archer_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/archer_pottery_sherd")) }),
  ARMADILLO_SCUTE(lazy { Key.key("minecraft:item/armadillo_scute") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/armadillo_scute")) }),
  ARMADILLO_SPAWN_EGG(lazy { Key.key("minecraft:item/armadillo_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ARMOR_STAND(lazy { Key.key("minecraft:item/armor_stand") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/armor_stand")) }),
  ARMS_UP_POTTERY_SHERD(lazy { Key.key("minecraft:item/arms_up_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/arms_up_pottery_sherd")) }),
  ARROW(lazy { Key.key("minecraft:item/arrow") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/arrow")) }),
  AXOLOTL_BUCKET(lazy { Key.key("minecraft:item/axolotl_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/axolotl_bucket")) }),
  AXOLOTL_SPAWN_EGG(lazy { Key.key("minecraft:item/axolotl_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  AZALEA(lazy { Key.key("minecraft:item/azalea") }, lazy { Key.key("minecraft:block/azalea") }, lazy
      { mapOf() }),
  AZALEA_LEAVES(lazy { Key.key("minecraft:item/azalea_leaves") }, lazy {
      Key.key("minecraft:block/azalea_leaves") }, lazy { mapOf() }),
  AZURE_BLUET(lazy { Key.key("minecraft:item/azure_bluet") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/azure_bluet")) }),
  BAKED_POTATO(lazy { Key.key("minecraft:item/baked_potato") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/baked_potato")) }),
  BAMBOO(lazy { Key.key("minecraft:item/bamboo") }, lazy { Key.key("minecraft:item/handheld") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/bamboo")) }),
  BAMBOO_BLOCK(lazy { Key.key("minecraft:item/bamboo_block") }, lazy {
      Key.key("minecraft:block/bamboo_block") }, lazy { mapOf() }),
  BAMBOO_BUTTON(lazy { Key.key("minecraft:item/bamboo_button") }, lazy {
      Key.key("minecraft:block/bamboo_button_inventory") }, lazy { mapOf() }),
  BAMBOO_CHEST_RAFT(lazy { Key.key("minecraft:item/bamboo_chest_raft") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/bamboo_chest_raft")) }),
  BAMBOO_DOOR(lazy { Key.key("minecraft:item/bamboo_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/bamboo_door")) }),
  BAMBOO_FENCE(lazy { Key.key("minecraft:item/bamboo_fence") }, lazy {
      Key.key("minecraft:block/bamboo_fence_inventory") }, lazy { mapOf() }),
  BAMBOO_FENCE_GATE(lazy { Key.key("minecraft:item/bamboo_fence_gate") }, lazy {
      Key.key("minecraft:block/bamboo_fence_gate") }, lazy { mapOf() }),
  BAMBOO_HANGING_SIGN(lazy { Key.key("minecraft:item/bamboo_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/bamboo_hanging_sign")) }),
  BAMBOO_MOSAIC(lazy { Key.key("minecraft:item/bamboo_mosaic") }, lazy {
      Key.key("minecraft:block/bamboo_mosaic") }, lazy { mapOf() }),
  BAMBOO_MOSAIC_SLAB(lazy { Key.key("minecraft:item/bamboo_mosaic_slab") }, lazy {
      Key.key("minecraft:block/bamboo_mosaic_slab") }, lazy { mapOf() }),
  BAMBOO_MOSAIC_STAIRS(lazy { Key.key("minecraft:item/bamboo_mosaic_stairs") }, lazy {
      Key.key("minecraft:block/bamboo_mosaic_stairs") }, lazy { mapOf() }),
  BAMBOO_PLANKS(lazy { Key.key("minecraft:item/bamboo_planks") }, lazy {
      Key.key("minecraft:block/bamboo_planks") }, lazy { mapOf() }),
  BAMBOO_PRESSURE_PLATE(lazy { Key.key("minecraft:item/bamboo_pressure_plate") }, lazy {
      Key.key("minecraft:block/bamboo_pressure_plate") }, lazy { mapOf() }),
  BAMBOO_RAFT(lazy { Key.key("minecraft:item/bamboo_raft") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/bamboo_raft")) }),
  BAMBOO_SIGN(lazy { Key.key("minecraft:item/bamboo_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/bamboo_sign")) }),
  BAMBOO_SLAB(lazy { Key.key("minecraft:item/bamboo_slab") }, lazy {
      Key.key("minecraft:block/bamboo_slab") }, lazy { mapOf() }),
  BAMBOO_STAIRS(lazy { Key.key("minecraft:item/bamboo_stairs") }, lazy {
      Key.key("minecraft:block/bamboo_stairs") }, lazy { mapOf() }),
  BAMBOO_TRAPDOOR(lazy { Key.key("minecraft:item/bamboo_trapdoor") }, lazy {
      Key.key("minecraft:block/bamboo_trapdoor_bottom") }, lazy { mapOf() }),
  BARREL(lazy { Key.key("minecraft:item/barrel") }, lazy { Key.key("minecraft:block/barrel") }, lazy
      { mapOf() }),
  BARRIER(lazy { Key.key("minecraft:item/barrier") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/barrier")) }),
  BASALT(lazy { Key.key("minecraft:item/basalt") }, lazy { Key.key("minecraft:block/basalt") }, lazy
      { mapOf() }),
  BAT_SPAWN_EGG(lazy { Key.key("minecraft:item/bat_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  BEACON(lazy { Key.key("minecraft:item/beacon") }, lazy { Key.key("minecraft:block/beacon") }, lazy
      { mapOf() }),
  BEDROCK(lazy { Key.key("minecraft:item/bedrock") }, lazy { Key.key("minecraft:block/bedrock") },
      lazy { mapOf() }),
  BEEF(lazy { Key.key("minecraft:item/beef") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/beef")) }),
  BEEHIVE(lazy { Key.key("minecraft:item/beehive") }, lazy { Key.key("minecraft:block/beehive") },
      lazy { mapOf() }),
  BEETROOT(lazy { Key.key("minecraft:item/beetroot") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/beetroot")) }),
  BEETROOT_SEEDS(lazy { Key.key("minecraft:item/beetroot_seeds") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/beetroot_seeds")) }),
  BEETROOT_SOUP(lazy { Key.key("minecraft:item/beetroot_soup") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/beetroot_soup")) }),
  BEE_NEST(lazy { Key.key("minecraft:item/bee_nest") }, lazy { Key.key("minecraft:block/bee_nest")
      }, lazy { mapOf() }),
  BEE_SPAWN_EGG(lazy { Key.key("minecraft:item/bee_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  BELL(lazy { Key.key("minecraft:item/bell") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/bell")) }),
  BIG_DRIPLEAF(lazy { Key.key("minecraft:item/big_dripleaf") }, lazy {
      Key.key("minecraft:block/big_dripleaf") }, lazy { mapOf() }),
  BIRCH_BOAT(lazy { Key.key("minecraft:item/birch_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/birch_boat")) }),
  BIRCH_BUTTON(lazy { Key.key("minecraft:item/birch_button") }, lazy {
      Key.key("minecraft:block/birch_button_inventory") }, lazy { mapOf() }),
  BIRCH_CHEST_BOAT(lazy { Key.key("minecraft:item/birch_chest_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/birch_chest_boat")) }),
  BIRCH_DOOR(lazy { Key.key("minecraft:item/birch_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/birch_door")) }),
  BIRCH_FENCE(lazy { Key.key("minecraft:item/birch_fence") }, lazy {
      Key.key("minecraft:block/birch_fence_inventory") }, lazy { mapOf() }),
  BIRCH_FENCE_GATE(lazy { Key.key("minecraft:item/birch_fence_gate") }, lazy {
      Key.key("minecraft:block/birch_fence_gate") }, lazy { mapOf() }),
  BIRCH_HANGING_SIGN(lazy { Key.key("minecraft:item/birch_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/birch_hanging_sign")) }),
  BIRCH_LEAVES(lazy { Key.key("minecraft:item/birch_leaves") }, lazy {
      Key.key("minecraft:block/birch_leaves") }, lazy { mapOf() }),
  BIRCH_LOG(lazy { Key.key("minecraft:item/birch_log") }, lazy {
      Key.key("minecraft:block/birch_log") }, lazy { mapOf() }),
  BIRCH_PLANKS(lazy { Key.key("minecraft:item/birch_planks") }, lazy {
      Key.key("minecraft:block/birch_planks") }, lazy { mapOf() }),
  BIRCH_PRESSURE_PLATE(lazy { Key.key("minecraft:item/birch_pressure_plate") }, lazy {
      Key.key("minecraft:block/birch_pressure_plate") }, lazy { mapOf() }),
  BIRCH_SAPLING(lazy { Key.key("minecraft:item/birch_sapling") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/birch_sapling")) }),
  BIRCH_SIGN(lazy { Key.key("minecraft:item/birch_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/birch_sign")) }),
  BIRCH_SLAB(lazy { Key.key("minecraft:item/birch_slab") }, lazy {
      Key.key("minecraft:block/birch_slab") }, lazy { mapOf() }),
  BIRCH_STAIRS(lazy { Key.key("minecraft:item/birch_stairs") }, lazy {
      Key.key("minecraft:block/birch_stairs") }, lazy { mapOf() }),
  BIRCH_TRAPDOOR(lazy { Key.key("minecraft:item/birch_trapdoor") }, lazy {
      Key.key("minecraft:block/birch_trapdoor_bottom") }, lazy { mapOf() }),
  BIRCH_WOOD(lazy { Key.key("minecraft:item/birch_wood") }, lazy {
      Key.key("minecraft:block/birch_wood") }, lazy { mapOf() }),
  BLACKSTONE(lazy { Key.key("minecraft:item/blackstone") }, lazy {
      Key.key("minecraft:block/blackstone") }, lazy { mapOf() }),
  BLACKSTONE_SLAB(lazy { Key.key("minecraft:item/blackstone_slab") }, lazy {
      Key.key("minecraft:block/blackstone_slab") }, lazy { mapOf() }),
  BLACKSTONE_STAIRS(lazy { Key.key("minecraft:item/blackstone_stairs") }, lazy {
      Key.key("minecraft:block/blackstone_stairs") }, lazy { mapOf() }),
  BLACKSTONE_WALL(lazy { Key.key("minecraft:item/blackstone_wall") }, lazy {
      Key.key("minecraft:block/blackstone_wall_inventory") }, lazy { mapOf() }),
  BLACK_BANNER(lazy { Key.key("minecraft:item/black_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  BLACK_BED(lazy { Key.key("minecraft:item/black_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/black_wool")) }),
  BLACK_CANDLE(lazy { Key.key("minecraft:item/black_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/black_candle")) }),
  BLACK_CARPET(lazy { Key.key("minecraft:item/black_carpet") }, lazy {
      Key.key("minecraft:block/black_carpet") }, lazy { mapOf() }),
  BLACK_CONCRETE(lazy { Key.key("minecraft:item/black_concrete") }, lazy {
      Key.key("minecraft:block/black_concrete") }, lazy { mapOf() }),
  BLACK_CONCRETE_POWDER(lazy { Key.key("minecraft:item/black_concrete_powder") }, lazy {
      Key.key("minecraft:block/black_concrete_powder") }, lazy { mapOf() }),
  BLACK_DYE(lazy { Key.key("minecraft:item/black_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/black_dye")) }),
  BLACK_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/black_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/black_glazed_terracotta") }, lazy { mapOf() }),
  BLACK_SHULKER_BOX(lazy { Key.key("minecraft:item/black_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/black_shulker_box")) }),
  BLACK_STAINED_GLASS(lazy { Key.key("minecraft:item/black_stained_glass") }, lazy {
      Key.key("minecraft:block/black_stained_glass") }, lazy { mapOf() }),
  BLACK_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/black_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/black_stained_glass")) }),
  BLACK_TERRACOTTA(lazy { Key.key("minecraft:item/black_terracotta") }, lazy {
      Key.key("minecraft:block/black_terracotta") }, lazy { mapOf() }),
  BLACK_WOOL(lazy { Key.key("minecraft:item/black_wool") }, lazy {
      Key.key("minecraft:block/black_wool") }, lazy { mapOf() }),
  BLADE_POTTERY_SHERD(lazy { Key.key("minecraft:item/blade_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/blade_pottery_sherd")) }),
  BLAST_FURNACE(lazy { Key.key("minecraft:item/blast_furnace") }, lazy {
      Key.key("minecraft:block/blast_furnace") }, lazy { mapOf() }),
  BLAZE_POWDER(lazy { Key.key("minecraft:item/blaze_powder") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/blaze_powder")) }),
  BLAZE_ROD(lazy { Key.key("minecraft:item/blaze_rod") }, lazy { Key.key("minecraft:item/handheld")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/blaze_rod")) }),
  BLAZE_SPAWN_EGG(lazy { Key.key("minecraft:item/blaze_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  BLUE_BANNER(lazy { Key.key("minecraft:item/blue_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  BLUE_BED(lazy { Key.key("minecraft:item/blue_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/blue_wool")) }),
  BLUE_CANDLE(lazy { Key.key("minecraft:item/blue_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/blue_candle")) }),
  BLUE_CARPET(lazy { Key.key("minecraft:item/blue_carpet") }, lazy {
      Key.key("minecraft:block/blue_carpet") }, lazy { mapOf() }),
  BLUE_CONCRETE(lazy { Key.key("minecraft:item/blue_concrete") }, lazy {
      Key.key("minecraft:block/blue_concrete") }, lazy { mapOf() }),
  BLUE_CONCRETE_POWDER(lazy { Key.key("minecraft:item/blue_concrete_powder") }, lazy {
      Key.key("minecraft:block/blue_concrete_powder") }, lazy { mapOf() }),
  BLUE_DYE(lazy { Key.key("minecraft:item/blue_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/blue_dye")) }),
  BLUE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/blue_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/blue_glazed_terracotta") }, lazy { mapOf() }),
  BLUE_ICE(lazy { Key.key("minecraft:item/blue_ice") }, lazy { Key.key("minecraft:block/blue_ice")
      }, lazy { mapOf() }),
  BLUE_ORCHID(lazy { Key.key("minecraft:item/blue_orchid") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/blue_orchid")) }),
  BLUE_SHULKER_BOX(lazy { Key.key("minecraft:item/blue_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/blue_shulker_box")) }),
  BLUE_STAINED_GLASS(lazy { Key.key("minecraft:item/blue_stained_glass") }, lazy {
      Key.key("minecraft:block/blue_stained_glass") }, lazy { mapOf() }),
  BLUE_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/blue_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/blue_stained_glass")) }),
  BLUE_TERRACOTTA(lazy { Key.key("minecraft:item/blue_terracotta") }, lazy {
      Key.key("minecraft:block/blue_terracotta") }, lazy { mapOf() }),
  BLUE_WOOL(lazy { Key.key("minecraft:item/blue_wool") }, lazy {
      Key.key("minecraft:block/blue_wool") }, lazy { mapOf() }),
  BOGGED_SPAWN_EGG(lazy { Key.key("minecraft:item/bogged_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  BOLT_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/bolt_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/bolt_armor_trim_smithing_template")) }),
  BONE(lazy { Key.key("minecraft:item/bone") }, lazy { Key.key("minecraft:item/handheld") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/bone")) }),
  BONE_BLOCK(lazy { Key.key("minecraft:item/bone_block") }, lazy {
      Key.key("minecraft:block/bone_block") }, lazy { mapOf() }),
  BONE_MEAL(lazy { Key.key("minecraft:item/bone_meal") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/bone_meal")) }),
  BOOK(lazy { Key.key("minecraft:item/book") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/book")) }),
  BOOKSHELF(lazy { Key.key("minecraft:item/bookshelf") }, lazy {
      Key.key("minecraft:block/bookshelf") }, lazy { mapOf() }),
  BOW(lazy { Key.key("minecraft:item/bow") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/bow")) }),
  BOWL(lazy { Key.key("minecraft:item/bowl") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/bowl")) }),
  BRAIN_CORAL(lazy { Key.key("minecraft:item/brain_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/brain_coral")) }),
  BRAIN_CORAL_BLOCK(lazy { Key.key("minecraft:item/brain_coral_block") }, lazy {
      Key.key("minecraft:block/brain_coral_block") }, lazy { mapOf() }),
  BRAIN_CORAL_FAN(lazy { Key.key("minecraft:item/brain_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/brain_coral_fan")) }),
  BREAD(lazy { Key.key("minecraft:item/bread") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/bread")) }),
  BREEZE_ROD(lazy { Key.key("minecraft:item/breeze_rod") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/breeze_rod")) }),
  BREEZE_SPAWN_EGG(lazy { Key.key("minecraft:item/breeze_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  BREWER_POTTERY_SHERD(lazy { Key.key("minecraft:item/brewer_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/brewer_pottery_sherd")) }),
  BREWING_STAND(lazy { Key.key("minecraft:item/brewing_stand") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/brewing_stand")) }),
  BRICK(lazy { Key.key("minecraft:item/brick") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/brick")) }),
  BRICKS(lazy { Key.key("minecraft:item/bricks") }, lazy { Key.key("minecraft:block/bricks") }, lazy
      { mapOf() }),
  BRICK_SLAB(lazy { Key.key("minecraft:item/brick_slab") }, lazy {
      Key.key("minecraft:block/brick_slab") }, lazy { mapOf() }),
  BRICK_STAIRS(lazy { Key.key("minecraft:item/brick_stairs") }, lazy {
      Key.key("minecraft:block/brick_stairs") }, lazy { mapOf() }),
  BRICK_WALL(lazy { Key.key("minecraft:item/brick_wall") }, lazy {
      Key.key("minecraft:block/brick_wall_inventory") }, lazy { mapOf() }),
  BROWN_BANNER(lazy { Key.key("minecraft:item/brown_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  BROWN_BED(lazy { Key.key("minecraft:item/brown_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/brown_wool")) }),
  BROWN_CANDLE(lazy { Key.key("minecraft:item/brown_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/brown_candle")) }),
  BROWN_CARPET(lazy { Key.key("minecraft:item/brown_carpet") }, lazy {
      Key.key("minecraft:block/brown_carpet") }, lazy { mapOf() }),
  BROWN_CONCRETE(lazy { Key.key("minecraft:item/brown_concrete") }, lazy {
      Key.key("minecraft:block/brown_concrete") }, lazy { mapOf() }),
  BROWN_CONCRETE_POWDER(lazy { Key.key("minecraft:item/brown_concrete_powder") }, lazy {
      Key.key("minecraft:block/brown_concrete_powder") }, lazy { mapOf() }),
  BROWN_DYE(lazy { Key.key("minecraft:item/brown_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/brown_dye")) }),
  BROWN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/brown_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/brown_glazed_terracotta") }, lazy { mapOf() }),
  BROWN_MUSHROOM(lazy { Key.key("minecraft:item/brown_mushroom") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/brown_mushroom")) }),
  BROWN_MUSHROOM_BLOCK(lazy { Key.key("minecraft:item/brown_mushroom_block") }, lazy {
      Key.key("minecraft:block/brown_mushroom_block_inventory") }, lazy { mapOf() }),
  BROWN_SHULKER_BOX(lazy { Key.key("minecraft:item/brown_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/brown_shulker_box")) }),
  BROWN_STAINED_GLASS(lazy { Key.key("minecraft:item/brown_stained_glass") }, lazy {
      Key.key("minecraft:block/brown_stained_glass") }, lazy { mapOf() }),
  BROWN_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/brown_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/brown_stained_glass")) }),
  BROWN_TERRACOTTA(lazy { Key.key("minecraft:item/brown_terracotta") }, lazy {
      Key.key("minecraft:block/brown_terracotta") }, lazy { mapOf() }),
  BROWN_WOOL(lazy { Key.key("minecraft:item/brown_wool") }, lazy {
      Key.key("minecraft:block/brown_wool") }, lazy { mapOf() }),
  BRUSH(lazy { Key.key("minecraft:item/brush") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/brush")) }),
  BUBBLE_CORAL(lazy { Key.key("minecraft:item/bubble_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/bubble_coral")) }),
  BUBBLE_CORAL_BLOCK(lazy { Key.key("minecraft:item/bubble_coral_block") }, lazy {
      Key.key("minecraft:block/bubble_coral_block") }, lazy { mapOf() }),
  BUBBLE_CORAL_FAN(lazy { Key.key("minecraft:item/bubble_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/bubble_coral_fan")) }),
  BUCKET(lazy { Key.key("minecraft:item/bucket") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/bucket")) }),
  BUDDING_AMETHYST(lazy { Key.key("minecraft:item/budding_amethyst") }, lazy {
      Key.key("minecraft:block/budding_amethyst") }, lazy { mapOf() }),
  BUNDLE(lazy { Key.key("minecraft:item/bundle") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/bundle")) }),
  BURN_POTTERY_SHERD(lazy { Key.key("minecraft:item/burn_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/burn_pottery_sherd")) }),
  CACTUS(lazy { Key.key("minecraft:item/cactus") }, lazy { Key.key("minecraft:block/cactus") }, lazy
      { mapOf() }),
  CAKE(lazy { Key.key("minecraft:item/cake") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/cake")) }),
  CALCITE(lazy { Key.key("minecraft:item/calcite") }, lazy { Key.key("minecraft:block/calcite") },
      lazy { mapOf() }),
  CALIBRATED_SCULK_SENSOR(lazy { Key.key("minecraft:item/calibrated_sculk_sensor") }, lazy {
      Key.key("minecraft:block/calibrated_sculk_sensor_inactive") }, lazy { mapOf() }),
  CAMEL_SPAWN_EGG(lazy { Key.key("minecraft:item/camel_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  CAMPFIRE(lazy { Key.key("minecraft:item/campfire") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/campfire")) }),
  CANDLE(lazy { Key.key("minecraft:item/candle") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/candle")) }),
  CARROT(lazy { Key.key("minecraft:item/carrot") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/carrot")) }),
  CARROT_ON_A_STICK(lazy { Key.key("minecraft:item/carrot_on_a_stick") }, lazy {
      Key.key("minecraft:item/handheld_rod") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/carrot_on_a_stick")) }),
  CARTOGRAPHY_TABLE(lazy { Key.key("minecraft:item/cartography_table") }, lazy {
      Key.key("minecraft:block/cartography_table") }, lazy { mapOf() }),
  CARVED_PUMPKIN(lazy { Key.key("minecraft:item/carved_pumpkin") }, lazy {
      Key.key("minecraft:block/carved_pumpkin") }, lazy { mapOf() }),
  CAT_SPAWN_EGG(lazy { Key.key("minecraft:item/cat_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  CAULDRON(lazy { Key.key("minecraft:item/cauldron") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/cauldron")) }),
  CAVE_SPIDER_SPAWN_EGG(lazy { Key.key("minecraft:item/cave_spider_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  CHAIN(lazy { Key.key("minecraft:item/chain") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/chain")) }),
  CHAINMAIL_BOOTS(lazy { Key.key("minecraft:item/chainmail_boots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/chainmail_boots")) }),
  CHAINMAIL_CHESTPLATE(lazy { Key.key("minecraft:item/chainmail_chestplate") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/chainmail_chestplate")) }),
  CHAINMAIL_HELMET(lazy { Key.key("minecraft:item/chainmail_helmet") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/chainmail_helmet")) }),
  CHAINMAIL_LEGGINGS(lazy { Key.key("minecraft:item/chainmail_leggings") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/chainmail_leggings")) }),
  CHAIN_COMMAND_BLOCK(lazy { Key.key("minecraft:item/chain_command_block") }, lazy {
      Key.key("minecraft:block/chain_command_block") }, lazy { mapOf() }),
  CHARCOAL(lazy { Key.key("minecraft:item/charcoal") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/charcoal")) }),
  CHERRY_BOAT(lazy { Key.key("minecraft:item/cherry_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cherry_boat")) }),
  CHERRY_BUTTON(lazy { Key.key("minecraft:item/cherry_button") }, lazy {
      Key.key("minecraft:block/cherry_button_inventory") }, lazy { mapOf() }),
  CHERRY_CHEST_BOAT(lazy { Key.key("minecraft:item/cherry_chest_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cherry_chest_boat")) }),
  CHERRY_DOOR(lazy { Key.key("minecraft:item/cherry_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cherry_door")) }),
  CHERRY_FENCE(lazy { Key.key("minecraft:item/cherry_fence") }, lazy {
      Key.key("minecraft:block/cherry_fence_inventory") }, lazy { mapOf() }),
  CHERRY_FENCE_GATE(lazy { Key.key("minecraft:item/cherry_fence_gate") }, lazy {
      Key.key("minecraft:block/cherry_fence_gate") }, lazy { mapOf() }),
  CHERRY_HANGING_SIGN(lazy { Key.key("minecraft:item/cherry_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cherry_hanging_sign")) }),
  CHERRY_LEAVES(lazy { Key.key("minecraft:item/cherry_leaves") }, lazy {
      Key.key("minecraft:block/cherry_leaves") }, lazy { mapOf() }),
  CHERRY_LOG(lazy { Key.key("minecraft:item/cherry_log") }, lazy {
      Key.key("minecraft:block/cherry_log") }, lazy { mapOf() }),
  CHERRY_PLANKS(lazy { Key.key("minecraft:item/cherry_planks") }, lazy {
      Key.key("minecraft:block/cherry_planks") }, lazy { mapOf() }),
  CHERRY_PRESSURE_PLATE(lazy { Key.key("minecraft:item/cherry_pressure_plate") }, lazy {
      Key.key("minecraft:block/cherry_pressure_plate") }, lazy { mapOf() }),
  CHERRY_SAPLING(lazy { Key.key("minecraft:item/cherry_sapling") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/cherry_sapling")) }),
  CHERRY_SIGN(lazy { Key.key("minecraft:item/cherry_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cherry_sign")) }),
  CHERRY_SLAB(lazy { Key.key("minecraft:item/cherry_slab") }, lazy {
      Key.key("minecraft:block/cherry_slab") }, lazy { mapOf() }),
  CHERRY_STAIRS(lazy { Key.key("minecraft:item/cherry_stairs") }, lazy {
      Key.key("minecraft:block/cherry_stairs") }, lazy { mapOf() }),
  CHERRY_TRAPDOOR(lazy { Key.key("minecraft:item/cherry_trapdoor") }, lazy {
      Key.key("minecraft:block/cherry_trapdoor_bottom") }, lazy { mapOf() }),
  CHERRY_WOOD(lazy { Key.key("minecraft:item/cherry_wood") }, lazy {
      Key.key("minecraft:block/cherry_wood") }, lazy { mapOf() }),
  CHEST(lazy { Key.key("minecraft:item/chest") }, lazy { Key.key("minecraft:builtin/entity") }, lazy
      { mapOf("particle" to Key.key("minecraft:block/oak_planks")) }),
  CHEST_MINECART(lazy { Key.key("minecraft:item/chest_minecart") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/chest_minecart")) }),
  CHICKEN(lazy { Key.key("minecraft:item/chicken") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/chicken")) }),
  CHICKEN_SPAWN_EGG(lazy { Key.key("minecraft:item/chicken_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  CHIPPED_ANVIL(lazy { Key.key("minecraft:item/chipped_anvil") }, lazy {
      Key.key("minecraft:block/chipped_anvil") }, lazy { mapOf() }),
  CHISELED_BOOKSHELF(lazy { Key.key("minecraft:item/chiseled_bookshelf") }, lazy {
      Key.key("minecraft:block/chiseled_bookshelf_inventory") }, lazy { mapOf() }),
  CHISELED_COPPER(lazy { Key.key("minecraft:item/chiseled_copper") }, lazy {
      Key.key("minecraft:block/chiseled_copper") }, lazy { mapOf() }),
  CHISELED_DEEPSLATE(lazy { Key.key("minecraft:item/chiseled_deepslate") }, lazy {
      Key.key("minecraft:block/chiseled_deepslate") }, lazy { mapOf() }),
  CHISELED_NETHER_BRICKS(lazy { Key.key("minecraft:item/chiseled_nether_bricks") }, lazy {
      Key.key("minecraft:block/chiseled_nether_bricks") }, lazy { mapOf() }),
  CHISELED_POLISHED_BLACKSTONE(lazy { Key.key("minecraft:item/chiseled_polished_blackstone") }, lazy
      { Key.key("minecraft:block/chiseled_polished_blackstone") }, lazy { mapOf() }),
  CHISELED_QUARTZ_BLOCK(lazy { Key.key("minecraft:item/chiseled_quartz_block") }, lazy {
      Key.key("minecraft:block/chiseled_quartz_block") }, lazy { mapOf() }),
  CHISELED_RED_SANDSTONE(lazy { Key.key("minecraft:item/chiseled_red_sandstone") }, lazy {
      Key.key("minecraft:block/chiseled_red_sandstone") }, lazy { mapOf() }),
  CHISELED_SANDSTONE(lazy { Key.key("minecraft:item/chiseled_sandstone") }, lazy {
      Key.key("minecraft:block/chiseled_sandstone") }, lazy { mapOf() }),
  CHISELED_STONE_BRICKS(lazy { Key.key("minecraft:item/chiseled_stone_bricks") }, lazy {
      Key.key("minecraft:block/chiseled_stone_bricks") }, lazy { mapOf() }),
  CHISELED_TUFF(lazy { Key.key("minecraft:item/chiseled_tuff") }, lazy {
      Key.key("minecraft:block/chiseled_tuff") }, lazy { mapOf() }),
  CHISELED_TUFF_BRICKS(lazy { Key.key("minecraft:item/chiseled_tuff_bricks") }, lazy {
      Key.key("minecraft:block/chiseled_tuff_bricks") }, lazy { mapOf() }),
  CHORUS_FLOWER(lazy { Key.key("minecraft:item/chorus_flower") }, lazy {
      Key.key("minecraft:block/chorus_flower") }, lazy { mapOf() }),
  CHORUS_FRUIT(lazy { Key.key("minecraft:item/chorus_fruit") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/chorus_fruit")) }),
  CHORUS_PLANT(lazy { Key.key("minecraft:item/chorus_plant") }, lazy {
      Key.key("minecraft:block/chorus_plant") }, lazy { mapOf() }),
  CLAY(lazy { Key.key("minecraft:item/clay") }, lazy { Key.key("minecraft:block/clay") }, lazy {
      mapOf() }),
  CLAY_BALL(lazy { Key.key("minecraft:item/clay_ball") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/clay_ball")) }),
  CLOCK(lazy { Key.key("minecraft:item/clock") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/clock_00")) }),
  COAL(lazy { Key.key("minecraft:item/coal") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/coal")) }),
  COAL_BLOCK(lazy { Key.key("minecraft:item/coal_block") }, lazy {
      Key.key("minecraft:block/coal_block") }, lazy { mapOf() }),
  COAL_ORE(lazy { Key.key("minecraft:item/coal_ore") }, lazy { Key.key("minecraft:block/coal_ore")
      }, lazy { mapOf() }),
  COARSE_DIRT(lazy { Key.key("minecraft:item/coarse_dirt") }, lazy {
      Key.key("minecraft:block/coarse_dirt") }, lazy { mapOf() }),
  COAST_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/coast_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/coast_armor_trim_smithing_template")) }),
  COBBLED_DEEPSLATE(lazy { Key.key("minecraft:item/cobbled_deepslate") }, lazy {
      Key.key("minecraft:block/cobbled_deepslate") }, lazy { mapOf() }),
  COBBLED_DEEPSLATE_SLAB(lazy { Key.key("minecraft:item/cobbled_deepslate_slab") }, lazy {
      Key.key("minecraft:block/cobbled_deepslate_slab") }, lazy { mapOf() }),
  COBBLED_DEEPSLATE_STAIRS(lazy { Key.key("minecraft:item/cobbled_deepslate_stairs") }, lazy {
      Key.key("minecraft:block/cobbled_deepslate_stairs") }, lazy { mapOf() }),
  COBBLED_DEEPSLATE_WALL(lazy { Key.key("minecraft:item/cobbled_deepslate_wall") }, lazy {
      Key.key("minecraft:block/cobbled_deepslate_wall_inventory") }, lazy { mapOf() }),
  COBBLESTONE(lazy { Key.key("minecraft:item/cobblestone") }, lazy {
      Key.key("minecraft:block/cobblestone") }, lazy { mapOf() }),
  COBBLESTONE_SLAB(lazy { Key.key("minecraft:item/cobblestone_slab") }, lazy {
      Key.key("minecraft:block/cobblestone_slab") }, lazy { mapOf() }),
  COBBLESTONE_STAIRS(lazy { Key.key("minecraft:item/cobblestone_stairs") }, lazy {
      Key.key("minecraft:block/cobblestone_stairs") }, lazy { mapOf() }),
  COBBLESTONE_WALL(lazy { Key.key("minecraft:item/cobblestone_wall") }, lazy {
      Key.key("minecraft:block/cobblestone_wall_inventory") }, lazy { mapOf() }),
  COBWEB(lazy { Key.key("minecraft:item/cobweb") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:block/cobweb")) }),
  COCOA_BEANS(lazy { Key.key("minecraft:item/cocoa_beans") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cocoa_beans")) }),
  COD(lazy { Key.key("minecraft:item/cod") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/cod")) }),
  COD_BUCKET(lazy { Key.key("minecraft:item/cod_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cod_bucket")) }),
  COD_SPAWN_EGG(lazy { Key.key("minecraft:item/cod_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  COMMAND_BLOCK(lazy { Key.key("minecraft:item/command_block") }, lazy {
      Key.key("minecraft:block/command_block") }, lazy { mapOf() }),
  COMMAND_BLOCK_MINECART(lazy { Key.key("minecraft:item/command_block_minecart") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/command_block_minecart")) }),
  COMPARATOR(lazy { Key.key("minecraft:item/comparator") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/comparator")) }),
  COMPASS(lazy { Key.key("minecraft:item/compass") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/compass_16")) }),
  COMPOSTER(lazy { Key.key("minecraft:item/composter") }, lazy {
      Key.key("minecraft:block/composter") }, lazy { mapOf() }),
  CONDUIT(lazy { Key.key("minecraft:item/conduit") }, lazy { Key.key("minecraft:builtin/entity") },
      lazy { mapOf("particle" to Key.key("minecraft:block/conduit")) }),
  COOKED_BEEF(lazy { Key.key("minecraft:item/cooked_beef") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cooked_beef")) }),
  COOKED_CHICKEN(lazy { Key.key("minecraft:item/cooked_chicken") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cooked_chicken")) }),
  COOKED_COD(lazy { Key.key("minecraft:item/cooked_cod") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cooked_cod")) }),
  COOKED_MUTTON(lazy { Key.key("minecraft:item/cooked_mutton") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cooked_mutton")) }),
  COOKED_PORKCHOP(lazy { Key.key("minecraft:item/cooked_porkchop") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cooked_porkchop")) }),
  COOKED_RABBIT(lazy { Key.key("minecraft:item/cooked_rabbit") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cooked_rabbit")) }),
  COOKED_SALMON(lazy { Key.key("minecraft:item/cooked_salmon") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cooked_salmon")) }),
  COOKIE(lazy { Key.key("minecraft:item/cookie") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/cookie")) }),
  COPPER_BLOCK(lazy { Key.key("minecraft:item/copper_block") }, lazy {
      Key.key("minecraft:block/copper_block") }, lazy { mapOf() }),
  COPPER_BULB(lazy { Key.key("minecraft:item/copper_bulb") }, lazy {
      Key.key("minecraft:block/copper_bulb") }, lazy { mapOf() }),
  COPPER_DOOR(lazy { Key.key("minecraft:item/copper_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/copper_door")) }),
  COPPER_GRATE(lazy { Key.key("minecraft:item/copper_grate") }, lazy {
      Key.key("minecraft:block/copper_grate") }, lazy { mapOf() }),
  COPPER_INGOT(lazy { Key.key("minecraft:item/copper_ingot") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/copper_ingot")) }),
  COPPER_ORE(lazy { Key.key("minecraft:item/copper_ore") }, lazy {
      Key.key("minecraft:block/copper_ore") }, lazy { mapOf() }),
  COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/copper_trapdoor") }, lazy {
      Key.key("minecraft:block/copper_trapdoor_bottom") }, lazy { mapOf() }),
  CORNFLOWER(lazy { Key.key("minecraft:item/cornflower") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/cornflower")) }),
  COW_SPAWN_EGG(lazy { Key.key("minecraft:item/cow_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  CRACKED_DEEPSLATE_BRICKS(lazy { Key.key("minecraft:item/cracked_deepslate_bricks") }, lazy {
      Key.key("minecraft:block/cracked_deepslate_bricks") }, lazy { mapOf() }),
  CRACKED_DEEPSLATE_TILES(lazy { Key.key("minecraft:item/cracked_deepslate_tiles") }, lazy {
      Key.key("minecraft:block/cracked_deepslate_tiles") }, lazy { mapOf() }),
  CRACKED_NETHER_BRICKS(lazy { Key.key("minecraft:item/cracked_nether_bricks") }, lazy {
      Key.key("minecraft:block/cracked_nether_bricks") }, lazy { mapOf() }),
  CRACKED_POLISHED_BLACKSTONE_BRICKS(lazy {
      Key.key("minecraft:item/cracked_polished_blackstone_bricks") }, lazy {
      Key.key("minecraft:block/cracked_polished_blackstone_bricks") }, lazy { mapOf() }),
  CRACKED_STONE_BRICKS(lazy { Key.key("minecraft:item/cracked_stone_bricks") }, lazy {
      Key.key("minecraft:block/cracked_stone_bricks") }, lazy { mapOf() }),
  CRAFTER(lazy { Key.key("minecraft:item/crafter") }, lazy { Key.key("minecraft:block/crafter") },
      lazy { mapOf() }),
  CRAFTING_TABLE(lazy { Key.key("minecraft:item/crafting_table") }, lazy {
      Key.key("minecraft:block/crafting_table") }, lazy { mapOf() }),
  CREEPER_BANNER_PATTERN(lazy { Key.key("minecraft:item/creeper_banner_pattern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/creeper_banner_pattern")) }),
  CREEPER_HEAD(lazy { Key.key("minecraft:item/creeper_head") }, lazy {
      Key.key("minecraft:item/template_skull") }, lazy { mapOf() }),
  CREEPER_SPAWN_EGG(lazy { Key.key("minecraft:item/creeper_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  CRIMSON_BUTTON(lazy { Key.key("minecraft:item/crimson_button") }, lazy {
      Key.key("minecraft:block/crimson_button_inventory") }, lazy { mapOf() }),
  CRIMSON_DOOR(lazy { Key.key("minecraft:item/crimson_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/crimson_door")) }),
  CRIMSON_FENCE(lazy { Key.key("minecraft:item/crimson_fence") }, lazy {
      Key.key("minecraft:block/crimson_fence_inventory") }, lazy { mapOf() }),
  CRIMSON_FENCE_GATE(lazy { Key.key("minecraft:item/crimson_fence_gate") }, lazy {
      Key.key("minecraft:block/crimson_fence_gate") }, lazy { mapOf() }),
  CRIMSON_FUNGUS(lazy { Key.key("minecraft:item/crimson_fungus") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/crimson_fungus")) }),
  CRIMSON_HANGING_SIGN(lazy { Key.key("minecraft:item/crimson_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/crimson_hanging_sign")) }),
  CRIMSON_HYPHAE(lazy { Key.key("minecraft:item/crimson_hyphae") }, lazy {
      Key.key("minecraft:block/crimson_hyphae") }, lazy { mapOf() }),
  CRIMSON_NYLIUM(lazy { Key.key("minecraft:item/crimson_nylium") }, lazy {
      Key.key("minecraft:block/crimson_nylium") }, lazy { mapOf() }),
  CRIMSON_PLANKS(lazy { Key.key("minecraft:item/crimson_planks") }, lazy {
      Key.key("minecraft:block/crimson_planks") }, lazy { mapOf() }),
  CRIMSON_PRESSURE_PLATE(lazy { Key.key("minecraft:item/crimson_pressure_plate") }, lazy {
      Key.key("minecraft:block/crimson_pressure_plate") }, lazy { mapOf() }),
  CRIMSON_ROOTS(lazy { Key.key("minecraft:item/crimson_roots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/crimson_roots")) }),
  CRIMSON_SIGN(lazy { Key.key("minecraft:item/crimson_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/crimson_sign")) }),
  CRIMSON_SLAB(lazy { Key.key("minecraft:item/crimson_slab") }, lazy {
      Key.key("minecraft:block/crimson_slab") }, lazy { mapOf() }),
  CRIMSON_STAIRS(lazy { Key.key("minecraft:item/crimson_stairs") }, lazy {
      Key.key("minecraft:block/crimson_stairs") }, lazy { mapOf() }),
  CRIMSON_STEM(lazy { Key.key("minecraft:item/crimson_stem") }, lazy {
      Key.key("minecraft:block/crimson_stem") }, lazy { mapOf() }),
  CRIMSON_TRAPDOOR(lazy { Key.key("minecraft:item/crimson_trapdoor") }, lazy {
      Key.key("minecraft:block/crimson_trapdoor_bottom") }, lazy { mapOf() }),
  CROSSBOW(lazy { Key.key("minecraft:item/crossbow") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/crossbow_standby")) }),
  CRYING_OBSIDIAN(lazy { Key.key("minecraft:item/crying_obsidian") }, lazy {
      Key.key("minecraft:block/crying_obsidian") }, lazy { mapOf() }),
  CUT_COPPER(lazy { Key.key("minecraft:item/cut_copper") }, lazy {
      Key.key("minecraft:block/cut_copper") }, lazy { mapOf() }),
  CUT_COPPER_SLAB(lazy { Key.key("minecraft:item/cut_copper_slab") }, lazy {
      Key.key("minecraft:block/cut_copper_slab") }, lazy { mapOf() }),
  CUT_COPPER_STAIRS(lazy { Key.key("minecraft:item/cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/cut_copper_stairs") }, lazy { mapOf() }),
  CUT_RED_SANDSTONE(lazy { Key.key("minecraft:item/cut_red_sandstone") }, lazy {
      Key.key("minecraft:block/cut_red_sandstone") }, lazy { mapOf() }),
  CUT_RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:item/cut_red_sandstone_slab") }, lazy {
      Key.key("minecraft:block/cut_red_sandstone_slab") }, lazy { mapOf() }),
  CUT_SANDSTONE(lazy { Key.key("minecraft:item/cut_sandstone") }, lazy {
      Key.key("minecraft:block/cut_sandstone") }, lazy { mapOf() }),
  CUT_SANDSTONE_SLAB(lazy { Key.key("minecraft:item/cut_sandstone_slab") }, lazy {
      Key.key("minecraft:block/cut_sandstone_slab") }, lazy { mapOf() }),
  CYAN_BANNER(lazy { Key.key("minecraft:item/cyan_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  CYAN_BED(lazy { Key.key("minecraft:item/cyan_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/cyan_wool")) }),
  CYAN_CANDLE(lazy { Key.key("minecraft:item/cyan_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/cyan_candle")) }),
  CYAN_CARPET(lazy { Key.key("minecraft:item/cyan_carpet") }, lazy {
      Key.key("minecraft:block/cyan_carpet") }, lazy { mapOf() }),
  CYAN_CONCRETE(lazy { Key.key("minecraft:item/cyan_concrete") }, lazy {
      Key.key("minecraft:block/cyan_concrete") }, lazy { mapOf() }),
  CYAN_CONCRETE_POWDER(lazy { Key.key("minecraft:item/cyan_concrete_powder") }, lazy {
      Key.key("minecraft:block/cyan_concrete_powder") }, lazy { mapOf() }),
  CYAN_DYE(lazy { Key.key("minecraft:item/cyan_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/cyan_dye")) }),
  CYAN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/cyan_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/cyan_glazed_terracotta") }, lazy { mapOf() }),
  CYAN_SHULKER_BOX(lazy { Key.key("minecraft:item/cyan_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/cyan_shulker_box")) }),
  CYAN_STAINED_GLASS(lazy { Key.key("minecraft:item/cyan_stained_glass") }, lazy {
      Key.key("minecraft:block/cyan_stained_glass") }, lazy { mapOf() }),
  CYAN_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/cyan_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/cyan_stained_glass")) }),
  CYAN_TERRACOTTA(lazy { Key.key("minecraft:item/cyan_terracotta") }, lazy {
      Key.key("minecraft:block/cyan_terracotta") }, lazy { mapOf() }),
  CYAN_WOOL(lazy { Key.key("minecraft:item/cyan_wool") }, lazy {
      Key.key("minecraft:block/cyan_wool") }, lazy { mapOf() }),
  DAMAGED_ANVIL(lazy { Key.key("minecraft:item/damaged_anvil") }, lazy {
      Key.key("minecraft:block/damaged_anvil") }, lazy { mapOf() }),
  DANDELION(lazy { Key.key("minecraft:item/dandelion") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:block/dandelion")) }),
  DANGER_POTTERY_SHERD(lazy { Key.key("minecraft:item/danger_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/danger_pottery_sherd")) }),
  DARK_OAK_BOAT(lazy { Key.key("minecraft:item/dark_oak_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/dark_oak_boat")) }),
  DARK_OAK_BUTTON(lazy { Key.key("minecraft:item/dark_oak_button") }, lazy {
      Key.key("minecraft:block/dark_oak_button_inventory") }, lazy { mapOf() }),
  DARK_OAK_CHEST_BOAT(lazy { Key.key("minecraft:item/dark_oak_chest_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/dark_oak_chest_boat")) }),
  DARK_OAK_DOOR(lazy { Key.key("minecraft:item/dark_oak_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/dark_oak_door")) }),
  DARK_OAK_FENCE(lazy { Key.key("minecraft:item/dark_oak_fence") }, lazy {
      Key.key("minecraft:block/dark_oak_fence_inventory") }, lazy { mapOf() }),
  DARK_OAK_FENCE_GATE(lazy { Key.key("minecraft:item/dark_oak_fence_gate") }, lazy {
      Key.key("minecraft:block/dark_oak_fence_gate") }, lazy { mapOf() }),
  DARK_OAK_HANGING_SIGN(lazy { Key.key("minecraft:item/dark_oak_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/dark_oak_hanging_sign")) }),
  DARK_OAK_LEAVES(lazy { Key.key("minecraft:item/dark_oak_leaves") }, lazy {
      Key.key("minecraft:block/dark_oak_leaves") }, lazy { mapOf() }),
  DARK_OAK_LOG(lazy { Key.key("minecraft:item/dark_oak_log") }, lazy {
      Key.key("minecraft:block/dark_oak_log") }, lazy { mapOf() }),
  DARK_OAK_PLANKS(lazy { Key.key("minecraft:item/dark_oak_planks") }, lazy {
      Key.key("minecraft:block/dark_oak_planks") }, lazy { mapOf() }),
  DARK_OAK_PRESSURE_PLATE(lazy { Key.key("minecraft:item/dark_oak_pressure_plate") }, lazy {
      Key.key("minecraft:block/dark_oak_pressure_plate") }, lazy { mapOf() }),
  DARK_OAK_SAPLING(lazy { Key.key("minecraft:item/dark_oak_sapling") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dark_oak_sapling")) }),
  DARK_OAK_SIGN(lazy { Key.key("minecraft:item/dark_oak_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/dark_oak_sign")) }),
  DARK_OAK_SLAB(lazy { Key.key("minecraft:item/dark_oak_slab") }, lazy {
      Key.key("minecraft:block/dark_oak_slab") }, lazy { mapOf() }),
  DARK_OAK_STAIRS(lazy { Key.key("minecraft:item/dark_oak_stairs") }, lazy {
      Key.key("minecraft:block/dark_oak_stairs") }, lazy { mapOf() }),
  DARK_OAK_TRAPDOOR(lazy { Key.key("minecraft:item/dark_oak_trapdoor") }, lazy {
      Key.key("minecraft:block/dark_oak_trapdoor_bottom") }, lazy { mapOf() }),
  DARK_OAK_WOOD(lazy { Key.key("minecraft:item/dark_oak_wood") }, lazy {
      Key.key("minecraft:block/dark_oak_wood") }, lazy { mapOf() }),
  DARK_PRISMARINE(lazy { Key.key("minecraft:item/dark_prismarine") }, lazy {
      Key.key("minecraft:block/dark_prismarine") }, lazy { mapOf() }),
  DARK_PRISMARINE_SLAB(lazy { Key.key("minecraft:item/dark_prismarine_slab") }, lazy {
      Key.key("minecraft:block/dark_prismarine_slab") }, lazy { mapOf() }),
  DARK_PRISMARINE_STAIRS(lazy { Key.key("minecraft:item/dark_prismarine_stairs") }, lazy {
      Key.key("minecraft:block/dark_prismarine_stairs") }, lazy { mapOf() }),
  DAYLIGHT_DETECTOR(lazy { Key.key("minecraft:item/daylight_detector") }, lazy {
      Key.key("minecraft:block/daylight_detector") }, lazy { mapOf() }),
  DEAD_BRAIN_CORAL(lazy { Key.key("minecraft:item/dead_brain_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_brain_coral")) }),
  DEAD_BRAIN_CORAL_BLOCK(lazy { Key.key("minecraft:item/dead_brain_coral_block") }, lazy {
      Key.key("minecraft:block/dead_brain_coral_block") }, lazy { mapOf() }),
  DEAD_BRAIN_CORAL_FAN(lazy { Key.key("minecraft:item/dead_brain_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_brain_coral_fan")) }),
  DEAD_BUBBLE_CORAL(lazy { Key.key("minecraft:item/dead_bubble_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_bubble_coral")) }),
  DEAD_BUBBLE_CORAL_BLOCK(lazy { Key.key("minecraft:item/dead_bubble_coral_block") }, lazy {
      Key.key("minecraft:block/dead_bubble_coral_block") }, lazy { mapOf() }),
  DEAD_BUBBLE_CORAL_FAN(lazy { Key.key("minecraft:item/dead_bubble_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_bubble_coral_fan")) }),
  DEAD_BUSH(lazy { Key.key("minecraft:item/dead_bush") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:block/dead_bush")) }),
  DEAD_FIRE_CORAL(lazy { Key.key("minecraft:item/dead_fire_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_fire_coral")) }),
  DEAD_FIRE_CORAL_BLOCK(lazy { Key.key("minecraft:item/dead_fire_coral_block") }, lazy {
      Key.key("minecraft:block/dead_fire_coral_block") }, lazy { mapOf() }),
  DEAD_FIRE_CORAL_FAN(lazy { Key.key("minecraft:item/dead_fire_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_fire_coral_fan")) }),
  DEAD_HORN_CORAL(lazy { Key.key("minecraft:item/dead_horn_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_horn_coral")) }),
  DEAD_HORN_CORAL_BLOCK(lazy { Key.key("minecraft:item/dead_horn_coral_block") }, lazy {
      Key.key("minecraft:block/dead_horn_coral_block") }, lazy { mapOf() }),
  DEAD_HORN_CORAL_FAN(lazy { Key.key("minecraft:item/dead_horn_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_horn_coral_fan")) }),
  DEAD_TUBE_CORAL(lazy { Key.key("minecraft:item/dead_tube_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_tube_coral")) }),
  DEAD_TUBE_CORAL_BLOCK(lazy { Key.key("minecraft:item/dead_tube_coral_block") }, lazy {
      Key.key("minecraft:block/dead_tube_coral_block") }, lazy { mapOf() }),
  DEAD_TUBE_CORAL_FAN(lazy { Key.key("minecraft:item/dead_tube_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/dead_tube_coral_fan")) }),
  DEBUG_STICK(lazy { Key.key("minecraft:item/debug_stick") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/stick")) }),
  DECORATED_POT(lazy { Key.key("minecraft:item/decorated_pot") }, lazy {
      Key.key("minecraft:builtin/entity") }, lazy { mapOf("particle" to
      Key.key("minecraft:entity/decorated_pot/decorated_pot_side")) }),
  DEEPSLATE(lazy { Key.key("minecraft:item/deepslate") }, lazy {
      Key.key("minecraft:block/deepslate") }, lazy { mapOf() }),
  DEEPSLATE_BRICKS(lazy { Key.key("minecraft:item/deepslate_bricks") }, lazy {
      Key.key("minecraft:block/deepslate_bricks") }, lazy { mapOf() }),
  DEEPSLATE_BRICK_SLAB(lazy { Key.key("minecraft:item/deepslate_brick_slab") }, lazy {
      Key.key("minecraft:block/deepslate_brick_slab") }, lazy { mapOf() }),
  DEEPSLATE_BRICK_STAIRS(lazy { Key.key("minecraft:item/deepslate_brick_stairs") }, lazy {
      Key.key("minecraft:block/deepslate_brick_stairs") }, lazy { mapOf() }),
  DEEPSLATE_BRICK_WALL(lazy { Key.key("minecraft:item/deepslate_brick_wall") }, lazy {
      Key.key("minecraft:block/deepslate_brick_wall_inventory") }, lazy { mapOf() }),
  DEEPSLATE_COAL_ORE(lazy { Key.key("minecraft:item/deepslate_coal_ore") }, lazy {
      Key.key("minecraft:block/deepslate_coal_ore") }, lazy { mapOf() }),
  DEEPSLATE_COPPER_ORE(lazy { Key.key("minecraft:item/deepslate_copper_ore") }, lazy {
      Key.key("minecraft:block/deepslate_copper_ore") }, lazy { mapOf() }),
  DEEPSLATE_DIAMOND_ORE(lazy { Key.key("minecraft:item/deepslate_diamond_ore") }, lazy {
      Key.key("minecraft:block/deepslate_diamond_ore") }, lazy { mapOf() }),
  DEEPSLATE_EMERALD_ORE(lazy { Key.key("minecraft:item/deepslate_emerald_ore") }, lazy {
      Key.key("minecraft:block/deepslate_emerald_ore") }, lazy { mapOf() }),
  DEEPSLATE_GOLD_ORE(lazy { Key.key("minecraft:item/deepslate_gold_ore") }, lazy {
      Key.key("minecraft:block/deepslate_gold_ore") }, lazy { mapOf() }),
  DEEPSLATE_IRON_ORE(lazy { Key.key("minecraft:item/deepslate_iron_ore") }, lazy {
      Key.key("minecraft:block/deepslate_iron_ore") }, lazy { mapOf() }),
  DEEPSLATE_LAPIS_ORE(lazy { Key.key("minecraft:item/deepslate_lapis_ore") }, lazy {
      Key.key("minecraft:block/deepslate_lapis_ore") }, lazy { mapOf() }),
  DEEPSLATE_REDSTONE_ORE(lazy { Key.key("minecraft:item/deepslate_redstone_ore") }, lazy {
      Key.key("minecraft:block/deepslate_redstone_ore") }, lazy { mapOf() }),
  DEEPSLATE_TILES(lazy { Key.key("minecraft:item/deepslate_tiles") }, lazy {
      Key.key("minecraft:block/deepslate_tiles") }, lazy { mapOf() }),
  DEEPSLATE_TILE_SLAB(lazy { Key.key("minecraft:item/deepslate_tile_slab") }, lazy {
      Key.key("minecraft:block/deepslate_tile_slab") }, lazy { mapOf() }),
  DEEPSLATE_TILE_STAIRS(lazy { Key.key("minecraft:item/deepslate_tile_stairs") }, lazy {
      Key.key("minecraft:block/deepslate_tile_stairs") }, lazy { mapOf() }),
  DEEPSLATE_TILE_WALL(lazy { Key.key("minecraft:item/deepslate_tile_wall") }, lazy {
      Key.key("minecraft:block/deepslate_tile_wall_inventory") }, lazy { mapOf() }),
  DETECTOR_RAIL(lazy { Key.key("minecraft:item/detector_rail") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/detector_rail")) }),
  DIAMOND(lazy { Key.key("minecraft:item/diamond") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/diamond")) }),
  DIAMOND_AXE(lazy { Key.key("minecraft:item/diamond_axe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_axe")) }),
  DIAMOND_BLOCK(lazy { Key.key("minecraft:item/diamond_block") }, lazy {
      Key.key("minecraft:block/diamond_block") }, lazy { mapOf() }),
  DIAMOND_BOOTS(lazy { Key.key("minecraft:item/diamond_boots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_boots")) }),
  DIAMOND_CHESTPLATE(lazy { Key.key("minecraft:item/diamond_chestplate") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_chestplate")) }),
  DIAMOND_HELMET(lazy { Key.key("minecraft:item/diamond_helmet") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_helmet")) }),
  DIAMOND_HOE(lazy { Key.key("minecraft:item/diamond_hoe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_hoe")) }),
  DIAMOND_HORSE_ARMOR(lazy { Key.key("minecraft:item/diamond_horse_armor") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_horse_armor")) }),
  DIAMOND_LEGGINGS(lazy { Key.key("minecraft:item/diamond_leggings") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_leggings")) }),
  DIAMOND_ORE(lazy { Key.key("minecraft:item/diamond_ore") }, lazy {
      Key.key("minecraft:block/diamond_ore") }, lazy { mapOf() }),
  DIAMOND_PICKAXE(lazy { Key.key("minecraft:item/diamond_pickaxe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_pickaxe")) }),
  DIAMOND_SHOVEL(lazy { Key.key("minecraft:item/diamond_shovel") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_shovel")) }),
  DIAMOND_SWORD(lazy { Key.key("minecraft:item/diamond_sword") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/diamond_sword")) }),
  DIORITE(lazy { Key.key("minecraft:item/diorite") }, lazy { Key.key("minecraft:block/diorite") },
      lazy { mapOf() }),
  DIORITE_SLAB(lazy { Key.key("minecraft:item/diorite_slab") }, lazy {
      Key.key("minecraft:block/diorite_slab") }, lazy { mapOf() }),
  DIORITE_STAIRS(lazy { Key.key("minecraft:item/diorite_stairs") }, lazy {
      Key.key("minecraft:block/diorite_stairs") }, lazy { mapOf() }),
  DIORITE_WALL(lazy { Key.key("minecraft:item/diorite_wall") }, lazy {
      Key.key("minecraft:block/diorite_wall_inventory") }, lazy { mapOf() }),
  DIRT(lazy { Key.key("minecraft:item/dirt") }, lazy { Key.key("minecraft:block/dirt") }, lazy {
      mapOf() }),
  DIRT_PATH(lazy { Key.key("minecraft:item/dirt_path") }, lazy {
      Key.key("minecraft:block/dirt_path") }, lazy { mapOf() }),
  DISC_FRAGMENT_5(lazy { Key.key("minecraft:item/disc_fragment_5") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/disc_fragment_5")) }),
  DISPENSER(lazy { Key.key("minecraft:item/dispenser") }, lazy {
      Key.key("minecraft:block/dispenser") }, lazy { mapOf() }),
  DOLPHIN_SPAWN_EGG(lazy { Key.key("minecraft:item/dolphin_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  DONKEY_SPAWN_EGG(lazy { Key.key("minecraft:item/donkey_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  DRAGON_BREATH(lazy { Key.key("minecraft:item/dragon_breath") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/dragon_breath")) }),
  DRAGON_EGG(lazy { Key.key("minecraft:item/dragon_egg") }, lazy {
      Key.key("minecraft:block/dragon_egg") }, lazy { mapOf() }),
  DRAGON_HEAD(lazy { Key.key("minecraft:item/dragon_head") }, lazy {
      Key.key("minecraft:item/template_skull") }, lazy { mapOf() }),
  DRIED_KELP(lazy { Key.key("minecraft:item/dried_kelp") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/dried_kelp")) }),
  DRIED_KELP_BLOCK(lazy { Key.key("minecraft:item/dried_kelp_block") }, lazy {
      Key.key("minecraft:block/dried_kelp_block") }, lazy { mapOf() }),
  DRIPSTONE_BLOCK(lazy { Key.key("minecraft:item/dripstone_block") }, lazy {
      Key.key("minecraft:block/dripstone_block") }, lazy { mapOf() }),
  DROPPER(lazy { Key.key("minecraft:item/dropper") }, lazy { Key.key("minecraft:block/dropper") },
      lazy { mapOf() }),
  DROWNED_SPAWN_EGG(lazy { Key.key("minecraft:item/drowned_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  DUNE_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/dune_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/dune_armor_trim_smithing_template")) }),
  ECHO_SHARD(lazy { Key.key("minecraft:item/echo_shard") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/echo_shard")) }),
  EGG(lazy { Key.key("minecraft:item/egg") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/egg")) }),
  ELDER_GUARDIAN_SPAWN_EGG(lazy { Key.key("minecraft:item/elder_guardian_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ELYTRA(lazy { Key.key("minecraft:item/elytra") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/elytra")) }),
  EMERALD(lazy { Key.key("minecraft:item/emerald") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/emerald")) }),
  EMERALD_BLOCK(lazy { Key.key("minecraft:item/emerald_block") }, lazy {
      Key.key("minecraft:block/emerald_block") }, lazy { mapOf() }),
  EMERALD_ORE(lazy { Key.key("minecraft:item/emerald_ore") }, lazy {
      Key.key("minecraft:block/emerald_ore") }, lazy { mapOf() }),
  ENCHANTED_BOOK(lazy { Key.key("minecraft:item/enchanted_book") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/enchanted_book")) }),
  ENCHANTED_GOLDEN_APPLE(lazy { Key.key("minecraft:item/enchanted_golden_apple") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_apple")) }),
  ENCHANTING_TABLE(lazy { Key.key("minecraft:item/enchanting_table") }, lazy {
      Key.key("minecraft:block/enchanting_table") }, lazy { mapOf() }),
  ENDERMAN_SPAWN_EGG(lazy { Key.key("minecraft:item/enderman_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ENDERMITE_SPAWN_EGG(lazy { Key.key("minecraft:item/endermite_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ENDER_CHEST(lazy { Key.key("minecraft:item/ender_chest") }, lazy { Key.key("minecraft:item/chest")
      }, lazy { mapOf("particle" to Key.key("minecraft:block/obsidian")) }),
  ENDER_DRAGON_SPAWN_EGG(lazy { Key.key("minecraft:item/ender_dragon_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ENDER_EYE(lazy { Key.key("minecraft:item/ender_eye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/ender_eye")) }),
  ENDER_PEARL(lazy { Key.key("minecraft:item/ender_pearl") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/ender_pearl")) }),
  END_CRYSTAL(lazy { Key.key("minecraft:item/end_crystal") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/end_crystal")) }),
  END_PORTAL_FRAME(lazy { Key.key("minecraft:item/end_portal_frame") }, lazy {
      Key.key("minecraft:block/end_portal_frame") }, lazy { mapOf() }),
  END_ROD(lazy { Key.key("minecraft:item/end_rod") }, lazy { Key.key("minecraft:block/end_rod") },
      lazy { mapOf() }),
  END_STONE(lazy { Key.key("minecraft:item/end_stone") }, lazy {
      Key.key("minecraft:block/end_stone") }, lazy { mapOf() }),
  END_STONE_BRICKS(lazy { Key.key("minecraft:item/end_stone_bricks") }, lazy {
      Key.key("minecraft:block/end_stone_bricks") }, lazy { mapOf() }),
  END_STONE_BRICK_SLAB(lazy { Key.key("minecraft:item/end_stone_brick_slab") }, lazy {
      Key.key("minecraft:block/end_stone_brick_slab") }, lazy { mapOf() }),
  END_STONE_BRICK_STAIRS(lazy { Key.key("minecraft:item/end_stone_brick_stairs") }, lazy {
      Key.key("minecraft:block/end_stone_brick_stairs") }, lazy { mapOf() }),
  END_STONE_BRICK_WALL(lazy { Key.key("minecraft:item/end_stone_brick_wall") }, lazy {
      Key.key("minecraft:block/end_stone_brick_wall_inventory") }, lazy { mapOf() }),
  EVOKER_SPAWN_EGG(lazy { Key.key("minecraft:item/evoker_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  EXPERIENCE_BOTTLE(lazy { Key.key("minecraft:item/experience_bottle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/experience_bottle")) }),
  EXPLORER_POTTERY_SHERD(lazy { Key.key("minecraft:item/explorer_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/explorer_pottery_sherd")) }),
  EXPOSED_CHISELED_COPPER(lazy { Key.key("minecraft:item/exposed_chiseled_copper") }, lazy {
      Key.key("minecraft:block/exposed_chiseled_copper") }, lazy { mapOf() }),
  EXPOSED_COPPER(lazy { Key.key("minecraft:item/exposed_copper") }, lazy {
      Key.key("minecraft:block/exposed_copper") }, lazy { mapOf() }),
  EXPOSED_COPPER_BULB(lazy { Key.key("minecraft:item/exposed_copper_bulb") }, lazy {
      Key.key("minecraft:block/exposed_copper_bulb") }, lazy { mapOf() }),
  EXPOSED_COPPER_DOOR(lazy { Key.key("minecraft:item/exposed_copper_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/exposed_copper_door")) }),
  EXPOSED_COPPER_GRATE(lazy { Key.key("minecraft:item/exposed_copper_grate") }, lazy {
      Key.key("minecraft:block/exposed_copper_grate") }, lazy { mapOf() }),
  EXPOSED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/exposed_copper_trapdoor") }, lazy {
      Key.key("minecraft:block/exposed_copper_trapdoor_bottom") }, lazy { mapOf() }),
  EXPOSED_CUT_COPPER(lazy { Key.key("minecraft:item/exposed_cut_copper") }, lazy {
      Key.key("minecraft:block/exposed_cut_copper") }, lazy { mapOf() }),
  EXPOSED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:item/exposed_cut_copper_slab") }, lazy {
      Key.key("minecraft:block/exposed_cut_copper_slab") }, lazy { mapOf() }),
  EXPOSED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:item/exposed_cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/exposed_cut_copper_stairs") }, lazy { mapOf() }),
  EYE_ARMOR_TRIM_SMITHING_TEMPLATE(lazy { Key.key("minecraft:item/eye_armor_trim_smithing_template")
      }, lazy { Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/eye_armor_trim_smithing_template")) }),
  FARMLAND(lazy { Key.key("minecraft:item/farmland") }, lazy { Key.key("minecraft:block/farmland")
      }, lazy { mapOf() }),
  FEATHER(lazy { Key.key("minecraft:item/feather") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/feather")) }),
  FERMENTED_SPIDER_EYE(lazy { Key.key("minecraft:item/fermented_spider_eye") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/fermented_spider_eye")) }),
  FERN(lazy { Key.key("minecraft:item/fern") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:block/fern")) }),
  FILLED_MAP(lazy { Key.key("minecraft:item/filled_map") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/filled_map"), "layer1" to
      Key.key("minecraft:item/filled_map_markings")) }),
  FIREWORK_ROCKET(lazy { Key.key("minecraft:item/firework_rocket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/firework_rocket")) }),
  FIREWORK_STAR(lazy { Key.key("minecraft:item/firework_star") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/firework_star"), "layer1" to
      Key.key("minecraft:item/firework_star_overlay")) }),
  FIRE_CHARGE(lazy { Key.key("minecraft:item/fire_charge") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/fire_charge")) }),
  FIRE_CORAL(lazy { Key.key("minecraft:item/fire_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/fire_coral")) }),
  FIRE_CORAL_BLOCK(lazy { Key.key("minecraft:item/fire_coral_block") }, lazy {
      Key.key("minecraft:block/fire_coral_block") }, lazy { mapOf() }),
  FIRE_CORAL_FAN(lazy { Key.key("minecraft:item/fire_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/fire_coral_fan")) }),
  FISHING_ROD(lazy { Key.key("minecraft:item/fishing_rod") }, lazy {
      Key.key("minecraft:item/handheld_rod") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/fishing_rod")) }),
  FLETCHING_TABLE(lazy { Key.key("minecraft:item/fletching_table") }, lazy {
      Key.key("minecraft:block/fletching_table") }, lazy { mapOf() }),
  FLINT(lazy { Key.key("minecraft:item/flint") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/flint")) }),
  FLINT_AND_STEEL(lazy { Key.key("minecraft:item/flint_and_steel") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/flint_and_steel")) }),
  FLOWERING_AZALEA(lazy { Key.key("minecraft:item/flowering_azalea") }, lazy {
      Key.key("minecraft:block/flowering_azalea") }, lazy { mapOf() }),
  FLOWERING_AZALEA_LEAVES(lazy { Key.key("minecraft:item/flowering_azalea_leaves") }, lazy {
      Key.key("minecraft:block/flowering_azalea_leaves") }, lazy { mapOf() }),
  FLOWER_BANNER_PATTERN(lazy { Key.key("minecraft:item/flower_banner_pattern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/flower_banner_pattern")) }),
  FLOWER_POT(lazy { Key.key("minecraft:item/flower_pot") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/flower_pot")) }),
  FLOW_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/flow_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/flow_armor_trim_smithing_template")) }),
  FLOW_BANNER_PATTERN(lazy { Key.key("minecraft:item/flow_banner_pattern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/flow_banner_pattern")) }),
  FLOW_POTTERY_SHERD(lazy { Key.key("minecraft:item/flow_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/flow_pottery_sherd")) }),
  FOX_SPAWN_EGG(lazy { Key.key("minecraft:item/fox_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  FRIEND_POTTERY_SHERD(lazy { Key.key("minecraft:item/friend_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/friend_pottery_sherd")) }),
  FROGSPAWN(lazy { Key.key("minecraft:item/frogspawn") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:block/frogspawn")) }),
  FROG_SPAWN_EGG(lazy { Key.key("minecraft:item/frog_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  FURNACE(lazy { Key.key("minecraft:item/furnace") }, lazy { Key.key("minecraft:block/furnace") },
      lazy { mapOf() }),
  FURNACE_MINECART(lazy { Key.key("minecraft:item/furnace_minecart") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/furnace_minecart")) }),
  GHAST_SPAWN_EGG(lazy { Key.key("minecraft:item/ghast_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  GHAST_TEAR(lazy { Key.key("minecraft:item/ghast_tear") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/ghast_tear")) }),
  GILDED_BLACKSTONE(lazy { Key.key("minecraft:item/gilded_blackstone") }, lazy {
      Key.key("minecraft:block/gilded_blackstone") }, lazy { mapOf() }),
  GLASS(lazy { Key.key("minecraft:item/glass") }, lazy { Key.key("minecraft:block/glass") }, lazy {
      mapOf() }),
  GLASS_BOTTLE(lazy { Key.key("minecraft:item/glass_bottle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/glass_bottle")) }),
  GLASS_PANE(lazy { Key.key("minecraft:item/glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/glass")) }),
  GLISTERING_MELON_SLICE(lazy { Key.key("minecraft:item/glistering_melon_slice") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/glistering_melon_slice")) }),
  GLOBE_BANNER_PATTERN(lazy { Key.key("minecraft:item/globe_banner_pattern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/globe_banner_pattern")) }),
  GLOWSTONE(lazy { Key.key("minecraft:item/glowstone") }, lazy {
      Key.key("minecraft:block/glowstone") }, lazy { mapOf() }),
  GLOWSTONE_DUST(lazy { Key.key("minecraft:item/glowstone_dust") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/glowstone_dust")) }),
  GLOW_BERRIES(lazy { Key.key("minecraft:item/glow_berries") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/glow_berries")) }),
  GLOW_INK_SAC(lazy { Key.key("minecraft:item/glow_ink_sac") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/glow_ink_sac")) }),
  GLOW_ITEM_FRAME(lazy { Key.key("minecraft:item/glow_item_frame") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/glow_item_frame")) }),
  GLOW_LICHEN(lazy { Key.key("minecraft:item/glow_lichen") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/glow_lichen")) }),
  GLOW_SQUID_SPAWN_EGG(lazy { Key.key("minecraft:item/glow_squid_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  GOAT_HORN(lazy { Key.key("minecraft:item/goat_horn") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/goat_horn")) }),
  GOAT_SPAWN_EGG(lazy { Key.key("minecraft:item/goat_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  GOLDEN_APPLE(lazy { Key.key("minecraft:item/golden_apple") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_apple")) }),
  GOLDEN_AXE(lazy { Key.key("minecraft:item/golden_axe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_axe")) }),
  GOLDEN_BOOTS(lazy { Key.key("minecraft:item/golden_boots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_boots")) }),
  GOLDEN_CARROT(lazy { Key.key("minecraft:item/golden_carrot") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_carrot")) }),
  GOLDEN_CHESTPLATE(lazy { Key.key("minecraft:item/golden_chestplate") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_chestplate")) }),
  GOLDEN_HELMET(lazy { Key.key("minecraft:item/golden_helmet") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_helmet")) }),
  GOLDEN_HOE(lazy { Key.key("minecraft:item/golden_hoe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_hoe")) }),
  GOLDEN_HORSE_ARMOR(lazy { Key.key("minecraft:item/golden_horse_armor") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_horse_armor")) }),
  GOLDEN_LEGGINGS(lazy { Key.key("minecraft:item/golden_leggings") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_leggings")) }),
  GOLDEN_PICKAXE(lazy { Key.key("minecraft:item/golden_pickaxe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_pickaxe")) }),
  GOLDEN_SHOVEL(lazy { Key.key("minecraft:item/golden_shovel") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_shovel")) }),
  GOLDEN_SWORD(lazy { Key.key("minecraft:item/golden_sword") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/golden_sword")) }),
  GOLD_BLOCK(lazy { Key.key("minecraft:item/gold_block") }, lazy {
      Key.key("minecraft:block/gold_block") }, lazy { mapOf() }),
  GOLD_INGOT(lazy { Key.key("minecraft:item/gold_ingot") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/gold_ingot")) }),
  GOLD_NUGGET(lazy { Key.key("minecraft:item/gold_nugget") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/gold_nugget")) }),
  GOLD_ORE(lazy { Key.key("minecraft:item/gold_ore") }, lazy { Key.key("minecraft:block/gold_ore")
      }, lazy { mapOf() }),
  GRANITE(lazy { Key.key("minecraft:item/granite") }, lazy { Key.key("minecraft:block/granite") },
      lazy { mapOf() }),
  GRANITE_SLAB(lazy { Key.key("minecraft:item/granite_slab") }, lazy {
      Key.key("minecraft:block/granite_slab") }, lazy { mapOf() }),
  GRANITE_STAIRS(lazy { Key.key("minecraft:item/granite_stairs") }, lazy {
      Key.key("minecraft:block/granite_stairs") }, lazy { mapOf() }),
  GRANITE_WALL(lazy { Key.key("minecraft:item/granite_wall") }, lazy {
      Key.key("minecraft:block/granite_wall_inventory") }, lazy { mapOf() }),
  GRASS_BLOCK(lazy { Key.key("minecraft:item/grass_block") }, lazy {
      Key.key("minecraft:block/grass_block") }, lazy { mapOf() }),
  GRAVEL(lazy { Key.key("minecraft:item/gravel") }, lazy { Key.key("minecraft:block/gravel") }, lazy
      { mapOf() }),
  GRAY_BANNER(lazy { Key.key("minecraft:item/gray_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  GRAY_BED(lazy { Key.key("minecraft:item/gray_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/gray_wool")) }),
  GRAY_CANDLE(lazy { Key.key("minecraft:item/gray_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/gray_candle")) }),
  GRAY_CARPET(lazy { Key.key("minecraft:item/gray_carpet") }, lazy {
      Key.key("minecraft:block/gray_carpet") }, lazy { mapOf() }),
  GRAY_CONCRETE(lazy { Key.key("minecraft:item/gray_concrete") }, lazy {
      Key.key("minecraft:block/gray_concrete") }, lazy { mapOf() }),
  GRAY_CONCRETE_POWDER(lazy { Key.key("minecraft:item/gray_concrete_powder") }, lazy {
      Key.key("minecraft:block/gray_concrete_powder") }, lazy { mapOf() }),
  GRAY_DYE(lazy { Key.key("minecraft:item/gray_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/gray_dye")) }),
  GRAY_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/gray_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/gray_glazed_terracotta") }, lazy { mapOf() }),
  GRAY_SHULKER_BOX(lazy { Key.key("minecraft:item/gray_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/gray_shulker_box")) }),
  GRAY_STAINED_GLASS(lazy { Key.key("minecraft:item/gray_stained_glass") }, lazy {
      Key.key("minecraft:block/gray_stained_glass") }, lazy { mapOf() }),
  GRAY_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/gray_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/gray_stained_glass")) }),
  GRAY_TERRACOTTA(lazy { Key.key("minecraft:item/gray_terracotta") }, lazy {
      Key.key("minecraft:block/gray_terracotta") }, lazy { mapOf() }),
  GRAY_WOOL(lazy { Key.key("minecraft:item/gray_wool") }, lazy {
      Key.key("minecraft:block/gray_wool") }, lazy { mapOf() }),
  GREEN_BANNER(lazy { Key.key("minecraft:item/green_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  GREEN_BED(lazy { Key.key("minecraft:item/green_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/green_wool")) }),
  GREEN_CANDLE(lazy { Key.key("minecraft:item/green_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/green_candle")) }),
  GREEN_CARPET(lazy { Key.key("minecraft:item/green_carpet") }, lazy {
      Key.key("minecraft:block/green_carpet") }, lazy { mapOf() }),
  GREEN_CONCRETE(lazy { Key.key("minecraft:item/green_concrete") }, lazy {
      Key.key("minecraft:block/green_concrete") }, lazy { mapOf() }),
  GREEN_CONCRETE_POWDER(lazy { Key.key("minecraft:item/green_concrete_powder") }, lazy {
      Key.key("minecraft:block/green_concrete_powder") }, lazy { mapOf() }),
  GREEN_DYE(lazy { Key.key("minecraft:item/green_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/green_dye")) }),
  GREEN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/green_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/green_glazed_terracotta") }, lazy { mapOf() }),
  GREEN_SHULKER_BOX(lazy { Key.key("minecraft:item/green_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/green_shulker_box")) }),
  GREEN_STAINED_GLASS(lazy { Key.key("minecraft:item/green_stained_glass") }, lazy {
      Key.key("minecraft:block/green_stained_glass") }, lazy { mapOf() }),
  GREEN_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/green_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/green_stained_glass")) }),
  GREEN_TERRACOTTA(lazy { Key.key("minecraft:item/green_terracotta") }, lazy {
      Key.key("minecraft:block/green_terracotta") }, lazy { mapOf() }),
  GREEN_WOOL(lazy { Key.key("minecraft:item/green_wool") }, lazy {
      Key.key("minecraft:block/green_wool") }, lazy { mapOf() }),
  GRINDSTONE(lazy { Key.key("minecraft:item/grindstone") }, lazy {
      Key.key("minecraft:block/grindstone") }, lazy { mapOf() }),
  GUARDIAN_SPAWN_EGG(lazy { Key.key("minecraft:item/guardian_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  GUNPOWDER(lazy { Key.key("minecraft:item/gunpowder") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/gunpowder")) }),
  GUSTER_BANNER_PATTERN(lazy { Key.key("minecraft:item/guster_banner_pattern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/guster_banner_pattern")) }),
  GUSTER_POTTERY_SHERD(lazy { Key.key("minecraft:item/guster_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/guster_pottery_sherd")) }),
  HANGING_ROOTS(lazy { Key.key("minecraft:item/hanging_roots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/hanging_roots")) }),
  HAY_BLOCK(lazy { Key.key("minecraft:item/hay_block") }, lazy {
      Key.key("minecraft:block/hay_block") }, lazy { mapOf() }),
  HEARTBREAK_POTTERY_SHERD(lazy { Key.key("minecraft:item/heartbreak_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/heartbreak_pottery_sherd")) }),
  HEART_OF_THE_SEA(lazy { Key.key("minecraft:item/heart_of_the_sea") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/heart_of_the_sea")) }),
  HEART_POTTERY_SHERD(lazy { Key.key("minecraft:item/heart_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/heart_pottery_sherd")) }),
  HEAVY_CORE(lazy { Key.key("minecraft:item/heavy_core") }, lazy {
      Key.key("minecraft:block/heavy_core") }, lazy { mapOf() }),
  HEAVY_WEIGHTED_PRESSURE_PLATE(lazy { Key.key("minecraft:item/heavy_weighted_pressure_plate") },
      lazy { Key.key("minecraft:block/heavy_weighted_pressure_plate") }, lazy { mapOf() }),
  HOGLIN_SPAWN_EGG(lazy { Key.key("minecraft:item/hoglin_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  HONEYCOMB(lazy { Key.key("minecraft:item/honeycomb") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/honeycomb")) }),
  HONEYCOMB_BLOCK(lazy { Key.key("minecraft:item/honeycomb_block") }, lazy {
      Key.key("minecraft:block/honeycomb_block") }, lazy { mapOf() }),
  HONEY_BLOCK(lazy { Key.key("minecraft:item/honey_block") }, lazy {
      Key.key("minecraft:block/honey_block") }, lazy { mapOf() }),
  HONEY_BOTTLE(lazy { Key.key("minecraft:item/honey_bottle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/honey_bottle")) }),
  HOPPER(lazy { Key.key("minecraft:item/hopper") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/hopper")) }),
  HOPPER_MINECART(lazy { Key.key("minecraft:item/hopper_minecart") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/hopper_minecart")) }),
  HORN_CORAL(lazy { Key.key("minecraft:item/horn_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/horn_coral")) }),
  HORN_CORAL_BLOCK(lazy { Key.key("minecraft:item/horn_coral_block") }, lazy {
      Key.key("minecraft:block/horn_coral_block") }, lazy { mapOf() }),
  HORN_CORAL_FAN(lazy { Key.key("minecraft:item/horn_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/horn_coral_fan")) }),
  HORSE_SPAWN_EGG(lazy { Key.key("minecraft:item/horse_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  HOST_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/host_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/host_armor_trim_smithing_template")) }),
  HOWL_POTTERY_SHERD(lazy { Key.key("minecraft:item/howl_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/howl_pottery_sherd")) }),
  HUSK_SPAWN_EGG(lazy { Key.key("minecraft:item/husk_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ICE(lazy { Key.key("minecraft:item/ice") }, lazy { Key.key("minecraft:block/ice") }, lazy {
      mapOf() }),
  INFESTED_CHISELED_STONE_BRICKS(lazy { Key.key("minecraft:item/infested_chiseled_stone_bricks") },
      lazy { Key.key("minecraft:block/chiseled_stone_bricks") }, lazy { mapOf() }),
  INFESTED_COBBLESTONE(lazy { Key.key("minecraft:item/infested_cobblestone") }, lazy {
      Key.key("minecraft:block/cobblestone") }, lazy { mapOf() }),
  INFESTED_CRACKED_STONE_BRICKS(lazy { Key.key("minecraft:item/infested_cracked_stone_bricks") },
      lazy { Key.key("minecraft:block/cracked_stone_bricks") }, lazy { mapOf() }),
  INFESTED_DEEPSLATE(lazy { Key.key("minecraft:item/infested_deepslate") }, lazy {
      Key.key("minecraft:block/deepslate") }, lazy { mapOf() }),
  INFESTED_MOSSY_STONE_BRICKS(lazy { Key.key("minecraft:item/infested_mossy_stone_bricks") }, lazy {
      Key.key("minecraft:block/mossy_stone_bricks") }, lazy { mapOf() }),
  INFESTED_STONE(lazy { Key.key("minecraft:item/infested_stone") }, lazy {
      Key.key("minecraft:block/stone") }, lazy { mapOf() }),
  INFESTED_STONE_BRICKS(lazy { Key.key("minecraft:item/infested_stone_bricks") }, lazy {
      Key.key("minecraft:block/stone_bricks") }, lazy { mapOf() }),
  INK_SAC(lazy { Key.key("minecraft:item/ink_sac") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/ink_sac")) }),
  IRON_AXE(lazy { Key.key("minecraft:item/iron_axe") }, lazy { Key.key("minecraft:item/handheld") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/iron_axe")) }),
  IRON_BARS(lazy { Key.key("minecraft:item/iron_bars") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:block/iron_bars")) }),
  IRON_BLOCK(lazy { Key.key("minecraft:item/iron_block") }, lazy {
      Key.key("minecraft:block/iron_block") }, lazy { mapOf() }),
  IRON_BOOTS(lazy { Key.key("minecraft:item/iron_boots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_boots")) }),
  IRON_CHESTPLATE(lazy { Key.key("minecraft:item/iron_chestplate") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_chestplate")) }),
  IRON_DOOR(lazy { Key.key("minecraft:item/iron_door") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/iron_door")) }),
  IRON_GOLEM_SPAWN_EGG(lazy { Key.key("minecraft:item/iron_golem_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  IRON_HELMET(lazy { Key.key("minecraft:item/iron_helmet") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_helmet")) }),
  IRON_HOE(lazy { Key.key("minecraft:item/iron_hoe") }, lazy { Key.key("minecraft:item/handheld") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/iron_hoe")) }),
  IRON_HORSE_ARMOR(lazy { Key.key("minecraft:item/iron_horse_armor") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_horse_armor")) }),
  IRON_INGOT(lazy { Key.key("minecraft:item/iron_ingot") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_ingot")) }),
  IRON_LEGGINGS(lazy { Key.key("minecraft:item/iron_leggings") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_leggings")) }),
  IRON_NUGGET(lazy { Key.key("minecraft:item/iron_nugget") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_nugget")) }),
  IRON_ORE(lazy { Key.key("minecraft:item/iron_ore") }, lazy { Key.key("minecraft:block/iron_ore")
      }, lazy { mapOf() }),
  IRON_PICKAXE(lazy { Key.key("minecraft:item/iron_pickaxe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_pickaxe")) }),
  IRON_SHOVEL(lazy { Key.key("minecraft:item/iron_shovel") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_shovel")) }),
  IRON_SWORD(lazy { Key.key("minecraft:item/iron_sword") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/iron_sword")) }),
  IRON_TRAPDOOR(lazy { Key.key("minecraft:item/iron_trapdoor") }, lazy {
      Key.key("minecraft:block/iron_trapdoor_bottom") }, lazy { mapOf() }),
  ITEM_FRAME(lazy { Key.key("minecraft:item/item_frame") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/item_frame")) }),
  JACK_O_LANTERN(lazy { Key.key("minecraft:item/jack_o_lantern") }, lazy {
      Key.key("minecraft:block/jack_o_lantern") }, lazy { mapOf() }),
  JIGSAW(lazy { Key.key("minecraft:item/jigsaw") }, lazy { Key.key("minecraft:block/jigsaw") }, lazy
      { mapOf() }),
  JUKEBOX(lazy { Key.key("minecraft:item/jukebox") }, lazy { Key.key("minecraft:block/jukebox") },
      lazy { mapOf() }),
  JUNGLE_BOAT(lazy { Key.key("minecraft:item/jungle_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/jungle_boat")) }),
  JUNGLE_BUTTON(lazy { Key.key("minecraft:item/jungle_button") }, lazy {
      Key.key("minecraft:block/jungle_button_inventory") }, lazy { mapOf() }),
  JUNGLE_CHEST_BOAT(lazy { Key.key("minecraft:item/jungle_chest_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/jungle_chest_boat")) }),
  JUNGLE_DOOR(lazy { Key.key("minecraft:item/jungle_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/jungle_door")) }),
  JUNGLE_FENCE(lazy { Key.key("minecraft:item/jungle_fence") }, lazy {
      Key.key("minecraft:block/jungle_fence_inventory") }, lazy { mapOf() }),
  JUNGLE_FENCE_GATE(lazy { Key.key("minecraft:item/jungle_fence_gate") }, lazy {
      Key.key("minecraft:block/jungle_fence_gate") }, lazy { mapOf() }),
  JUNGLE_HANGING_SIGN(lazy { Key.key("minecraft:item/jungle_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/jungle_hanging_sign")) }),
  JUNGLE_LEAVES(lazy { Key.key("minecraft:item/jungle_leaves") }, lazy {
      Key.key("minecraft:block/jungle_leaves") }, lazy { mapOf() }),
  JUNGLE_LOG(lazy { Key.key("minecraft:item/jungle_log") }, lazy {
      Key.key("minecraft:block/jungle_log") }, lazy { mapOf() }),
  JUNGLE_PLANKS(lazy { Key.key("minecraft:item/jungle_planks") }, lazy {
      Key.key("minecraft:block/jungle_planks") }, lazy { mapOf() }),
  JUNGLE_PRESSURE_PLATE(lazy { Key.key("minecraft:item/jungle_pressure_plate") }, lazy {
      Key.key("minecraft:block/jungle_pressure_plate") }, lazy { mapOf() }),
  JUNGLE_SAPLING(lazy { Key.key("minecraft:item/jungle_sapling") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/jungle_sapling")) }),
  JUNGLE_SIGN(lazy { Key.key("minecraft:item/jungle_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/jungle_sign")) }),
  JUNGLE_SLAB(lazy { Key.key("minecraft:item/jungle_slab") }, lazy {
      Key.key("minecraft:block/jungle_slab") }, lazy { mapOf() }),
  JUNGLE_STAIRS(lazy { Key.key("minecraft:item/jungle_stairs") }, lazy {
      Key.key("minecraft:block/jungle_stairs") }, lazy { mapOf() }),
  JUNGLE_TRAPDOOR(lazy { Key.key("minecraft:item/jungle_trapdoor") }, lazy {
      Key.key("minecraft:block/jungle_trapdoor_bottom") }, lazy { mapOf() }),
  JUNGLE_WOOD(lazy { Key.key("minecraft:item/jungle_wood") }, lazy {
      Key.key("minecraft:block/jungle_wood") }, lazy { mapOf() }),
  KELP(lazy { Key.key("minecraft:item/kelp") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/kelp")) }),
  KNOWLEDGE_BOOK(lazy { Key.key("minecraft:item/knowledge_book") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/knowledge_book")) }),
  LADDER(lazy { Key.key("minecraft:item/ladder") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:block/ladder")) }),
  LANTERN(lazy { Key.key("minecraft:item/lantern") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/lantern")) }),
  LAPIS_BLOCK(lazy { Key.key("minecraft:item/lapis_block") }, lazy {
      Key.key("minecraft:block/lapis_block") }, lazy { mapOf() }),
  LAPIS_LAZULI(lazy { Key.key("minecraft:item/lapis_lazuli") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/lapis_lazuli")) }),
  LAPIS_ORE(lazy { Key.key("minecraft:item/lapis_ore") }, lazy {
      Key.key("minecraft:block/lapis_ore") }, lazy { mapOf() }),
  LARGE_AMETHYST_BUD(lazy { Key.key("minecraft:item/large_amethyst_bud") }, lazy {
      Key.key("minecraft:item/amethyst_bud") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/large_amethyst_bud")) }),
  LARGE_FERN(lazy { Key.key("minecraft:item/large_fern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/large_fern_top")) }),
  LAVA_BUCKET(lazy { Key.key("minecraft:item/lava_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/lava_bucket")) }),
  LEAD(lazy { Key.key("minecraft:item/lead") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/lead")) }),
  LEATHER(lazy { Key.key("minecraft:item/leather") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/leather")) }),
  LEATHER_BOOTS(lazy { Key.key("minecraft:item/leather_boots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/leather_boots"), "layer1" to
      Key.key("minecraft:item/leather_boots_overlay")) }),
  LEATHER_CHESTPLATE(lazy { Key.key("minecraft:item/leather_chestplate") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/leather_chestplate"), "layer1" to
      Key.key("minecraft:item/leather_chestplate_overlay")) }),
  LEATHER_HELMET(lazy { Key.key("minecraft:item/leather_helmet") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/leather_helmet"), "layer1" to
      Key.key("minecraft:item/leather_helmet_overlay")) }),
  LEATHER_HORSE_ARMOR(lazy { Key.key("minecraft:item/leather_horse_armor") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/leather_horse_armor")) }),
  LEATHER_LEGGINGS(lazy { Key.key("minecraft:item/leather_leggings") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/leather_leggings"), "layer1" to
      Key.key("minecraft:item/leather_leggings_overlay")) }),
  LECTERN(lazy { Key.key("minecraft:item/lectern") }, lazy { Key.key("minecraft:block/lectern") },
      lazy { mapOf() }),
  LEVER(lazy { Key.key("minecraft:item/lever") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:block/lever")) }),
  LIGHT(lazy { Key.key("minecraft:item/light") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/light")) }),
  LIGHTNING_ROD(lazy { Key.key("minecraft:item/lightning_rod") }, lazy {
      Key.key("minecraft:block/lightning_rod") }, lazy { mapOf() }),
  LIGHT_BLUE_BANNER(lazy { Key.key("minecraft:item/light_blue_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  LIGHT_BLUE_BED(lazy { Key.key("minecraft:item/light_blue_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/light_blue_wool")) }),
  LIGHT_BLUE_CANDLE(lazy { Key.key("minecraft:item/light_blue_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/light_blue_candle")) }),
  LIGHT_BLUE_CARPET(lazy { Key.key("minecraft:item/light_blue_carpet") }, lazy {
      Key.key("minecraft:block/light_blue_carpet") }, lazy { mapOf() }),
  LIGHT_BLUE_CONCRETE(lazy { Key.key("minecraft:item/light_blue_concrete") }, lazy {
      Key.key("minecraft:block/light_blue_concrete") }, lazy { mapOf() }),
  LIGHT_BLUE_CONCRETE_POWDER(lazy { Key.key("minecraft:item/light_blue_concrete_powder") }, lazy {
      Key.key("minecraft:block/light_blue_concrete_powder") }, lazy { mapOf() }),
  LIGHT_BLUE_DYE(lazy { Key.key("minecraft:item/light_blue_dye") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/light_blue_dye")) }),
  LIGHT_BLUE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/light_blue_glazed_terracotta") }, lazy
      { Key.key("minecraft:block/light_blue_glazed_terracotta") }, lazy { mapOf() }),
  LIGHT_BLUE_SHULKER_BOX(lazy { Key.key("minecraft:item/light_blue_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/light_blue_shulker_box")) }),
  LIGHT_BLUE_STAINED_GLASS(lazy { Key.key("minecraft:item/light_blue_stained_glass") }, lazy {
      Key.key("minecraft:block/light_blue_stained_glass") }, lazy { mapOf() }),
  LIGHT_BLUE_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/light_blue_stained_glass_pane") },
      lazy { Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/light_blue_stained_glass")) }),
  LIGHT_BLUE_TERRACOTTA(lazy { Key.key("minecraft:item/light_blue_terracotta") }, lazy {
      Key.key("minecraft:block/light_blue_terracotta") }, lazy { mapOf() }),
  LIGHT_BLUE_WOOL(lazy { Key.key("minecraft:item/light_blue_wool") }, lazy {
      Key.key("minecraft:block/light_blue_wool") }, lazy { mapOf() }),
  LIGHT_GRAY_BANNER(lazy { Key.key("minecraft:item/light_gray_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  LIGHT_GRAY_BED(lazy { Key.key("minecraft:item/light_gray_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/light_gray_wool")) }),
  LIGHT_GRAY_CANDLE(lazy { Key.key("minecraft:item/light_gray_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/light_gray_candle")) }),
  LIGHT_GRAY_CARPET(lazy { Key.key("minecraft:item/light_gray_carpet") }, lazy {
      Key.key("minecraft:block/light_gray_carpet") }, lazy { mapOf() }),
  LIGHT_GRAY_CONCRETE(lazy { Key.key("minecraft:item/light_gray_concrete") }, lazy {
      Key.key("minecraft:block/light_gray_concrete") }, lazy { mapOf() }),
  LIGHT_GRAY_CONCRETE_POWDER(lazy { Key.key("minecraft:item/light_gray_concrete_powder") }, lazy {
      Key.key("minecraft:block/light_gray_concrete_powder") }, lazy { mapOf() }),
  LIGHT_GRAY_DYE(lazy { Key.key("minecraft:item/light_gray_dye") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/light_gray_dye")) }),
  LIGHT_GRAY_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/light_gray_glazed_terracotta") }, lazy
      { Key.key("minecraft:block/light_gray_glazed_terracotta") }, lazy { mapOf() }),
  LIGHT_GRAY_SHULKER_BOX(lazy { Key.key("minecraft:item/light_gray_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/light_gray_shulker_box")) }),
  LIGHT_GRAY_STAINED_GLASS(lazy { Key.key("minecraft:item/light_gray_stained_glass") }, lazy {
      Key.key("minecraft:block/light_gray_stained_glass") }, lazy { mapOf() }),
  LIGHT_GRAY_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/light_gray_stained_glass_pane") },
      lazy { Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/light_gray_stained_glass")) }),
  LIGHT_GRAY_TERRACOTTA(lazy { Key.key("minecraft:item/light_gray_terracotta") }, lazy {
      Key.key("minecraft:block/light_gray_terracotta") }, lazy { mapOf() }),
  LIGHT_GRAY_WOOL(lazy { Key.key("minecraft:item/light_gray_wool") }, lazy {
      Key.key("minecraft:block/light_gray_wool") }, lazy { mapOf() }),
  LIGHT_WEIGHTED_PRESSURE_PLATE(lazy { Key.key("minecraft:item/light_weighted_pressure_plate") },
      lazy { Key.key("minecraft:block/light_weighted_pressure_plate") }, lazy { mapOf() }),
  LILAC(lazy { Key.key("minecraft:item/lilac") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:block/lilac_top")) }),
  LILY_OF_THE_VALLEY(lazy { Key.key("minecraft:item/lily_of_the_valley") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/lily_of_the_valley")) }),
  LILY_PAD(lazy { Key.key("minecraft:item/lily_pad") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:block/lily_pad")) }),
  LIME_BANNER(lazy { Key.key("minecraft:item/lime_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  LIME_BED(lazy { Key.key("minecraft:item/lime_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/lime_wool")) }),
  LIME_CANDLE(lazy { Key.key("minecraft:item/lime_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/lime_candle")) }),
  LIME_CARPET(lazy { Key.key("minecraft:item/lime_carpet") }, lazy {
      Key.key("minecraft:block/lime_carpet") }, lazy { mapOf() }),
  LIME_CONCRETE(lazy { Key.key("minecraft:item/lime_concrete") }, lazy {
      Key.key("minecraft:block/lime_concrete") }, lazy { mapOf() }),
  LIME_CONCRETE_POWDER(lazy { Key.key("minecraft:item/lime_concrete_powder") }, lazy {
      Key.key("minecraft:block/lime_concrete_powder") }, lazy { mapOf() }),
  LIME_DYE(lazy { Key.key("minecraft:item/lime_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/lime_dye")) }),
  LIME_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/lime_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/lime_glazed_terracotta") }, lazy { mapOf() }),
  LIME_SHULKER_BOX(lazy { Key.key("minecraft:item/lime_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/lime_shulker_box")) }),
  LIME_STAINED_GLASS(lazy { Key.key("minecraft:item/lime_stained_glass") }, lazy {
      Key.key("minecraft:block/lime_stained_glass") }, lazy { mapOf() }),
  LIME_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/lime_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/lime_stained_glass")) }),
  LIME_TERRACOTTA(lazy { Key.key("minecraft:item/lime_terracotta") }, lazy {
      Key.key("minecraft:block/lime_terracotta") }, lazy { mapOf() }),
  LIME_WOOL(lazy { Key.key("minecraft:item/lime_wool") }, lazy {
      Key.key("minecraft:block/lime_wool") }, lazy { mapOf() }),
  LINGERING_POTION(lazy { Key.key("minecraft:item/lingering_potion") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/potion_overlay"), "layer1" to
      Key.key("minecraft:item/lingering_potion")) }),
  LLAMA_SPAWN_EGG(lazy { Key.key("minecraft:item/llama_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  LODESTONE(lazy { Key.key("minecraft:item/lodestone") }, lazy {
      Key.key("minecraft:block/lodestone") }, lazy { mapOf() }),
  LOOM(lazy { Key.key("minecraft:item/loom") }, lazy { Key.key("minecraft:block/loom") }, lazy {
      mapOf() }),
  MACE(lazy { Key.key("minecraft:item/mace") }, lazy { Key.key("minecraft:item/handheld_mace") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/mace")) }),
  MAGENTA_BANNER(lazy { Key.key("minecraft:item/magenta_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  MAGENTA_BED(lazy { Key.key("minecraft:item/magenta_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/magenta_wool")) }),
  MAGENTA_CANDLE(lazy { Key.key("minecraft:item/magenta_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/magenta_candle")) }),
  MAGENTA_CARPET(lazy { Key.key("minecraft:item/magenta_carpet") }, lazy {
      Key.key("minecraft:block/magenta_carpet") }, lazy { mapOf() }),
  MAGENTA_CONCRETE(lazy { Key.key("minecraft:item/magenta_concrete") }, lazy {
      Key.key("minecraft:block/magenta_concrete") }, lazy { mapOf() }),
  MAGENTA_CONCRETE_POWDER(lazy { Key.key("minecraft:item/magenta_concrete_powder") }, lazy {
      Key.key("minecraft:block/magenta_concrete_powder") }, lazy { mapOf() }),
  MAGENTA_DYE(lazy { Key.key("minecraft:item/magenta_dye") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/magenta_dye")) }),
  MAGENTA_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/magenta_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/magenta_glazed_terracotta") }, lazy { mapOf() }),
  MAGENTA_SHULKER_BOX(lazy { Key.key("minecraft:item/magenta_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/magenta_shulker_box")) }),
  MAGENTA_STAINED_GLASS(lazy { Key.key("minecraft:item/magenta_stained_glass") }, lazy {
      Key.key("minecraft:block/magenta_stained_glass") }, lazy { mapOf() }),
  MAGENTA_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/magenta_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/magenta_stained_glass")) }),
  MAGENTA_TERRACOTTA(lazy { Key.key("minecraft:item/magenta_terracotta") }, lazy {
      Key.key("minecraft:block/magenta_terracotta") }, lazy { mapOf() }),
  MAGENTA_WOOL(lazy { Key.key("minecraft:item/magenta_wool") }, lazy {
      Key.key("minecraft:block/magenta_wool") }, lazy { mapOf() }),
  MAGMA_BLOCK(lazy { Key.key("minecraft:item/magma_block") }, lazy {
      Key.key("minecraft:block/magma_block") }, lazy { mapOf() }),
  MAGMA_CREAM(lazy { Key.key("minecraft:item/magma_cream") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/magma_cream")) }),
  MAGMA_CUBE_SPAWN_EGG(lazy { Key.key("minecraft:item/magma_cube_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  MANGROVE_BOAT(lazy { Key.key("minecraft:item/mangrove_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mangrove_boat")) }),
  MANGROVE_BUTTON(lazy { Key.key("minecraft:item/mangrove_button") }, lazy {
      Key.key("minecraft:block/mangrove_button_inventory") }, lazy { mapOf() }),
  MANGROVE_CHEST_BOAT(lazy { Key.key("minecraft:item/mangrove_chest_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mangrove_chest_boat")) }),
  MANGROVE_DOOR(lazy { Key.key("minecraft:item/mangrove_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mangrove_door")) }),
  MANGROVE_FENCE(lazy { Key.key("minecraft:item/mangrove_fence") }, lazy {
      Key.key("minecraft:block/mangrove_fence_inventory") }, lazy { mapOf() }),
  MANGROVE_FENCE_GATE(lazy { Key.key("minecraft:item/mangrove_fence_gate") }, lazy {
      Key.key("minecraft:block/mangrove_fence_gate") }, lazy { mapOf() }),
  MANGROVE_HANGING_SIGN(lazy { Key.key("minecraft:item/mangrove_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mangrove_hanging_sign")) }),
  MANGROVE_LEAVES(lazy { Key.key("minecraft:item/mangrove_leaves") }, lazy {
      Key.key("minecraft:block/mangrove_leaves") }, lazy { mapOf() }),
  MANGROVE_LOG(lazy { Key.key("minecraft:item/mangrove_log") }, lazy {
      Key.key("minecraft:block/mangrove_log") }, lazy { mapOf() }),
  MANGROVE_PLANKS(lazy { Key.key("minecraft:item/mangrove_planks") }, lazy {
      Key.key("minecraft:block/mangrove_planks") }, lazy { mapOf() }),
  MANGROVE_PRESSURE_PLATE(lazy { Key.key("minecraft:item/mangrove_pressure_plate") }, lazy {
      Key.key("minecraft:block/mangrove_pressure_plate") }, lazy { mapOf() }),
  MANGROVE_PROPAGULE(lazy { Key.key("minecraft:item/mangrove_propagule") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mangrove_propagule")) }),
  MANGROVE_ROOTS(lazy { Key.key("minecraft:item/mangrove_roots") }, lazy {
      Key.key("minecraft:block/mangrove_roots") }, lazy { mapOf() }),
  MANGROVE_SIGN(lazy { Key.key("minecraft:item/mangrove_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mangrove_sign")) }),
  MANGROVE_SLAB(lazy { Key.key("minecraft:item/mangrove_slab") }, lazy {
      Key.key("minecraft:block/mangrove_slab") }, lazy { mapOf() }),
  MANGROVE_STAIRS(lazy { Key.key("minecraft:item/mangrove_stairs") }, lazy {
      Key.key("minecraft:block/mangrove_stairs") }, lazy { mapOf() }),
  MANGROVE_TRAPDOOR(lazy { Key.key("minecraft:item/mangrove_trapdoor") }, lazy {
      Key.key("minecraft:block/mangrove_trapdoor_bottom") }, lazy { mapOf() }),
  MANGROVE_WOOD(lazy { Key.key("minecraft:item/mangrove_wood") }, lazy {
      Key.key("minecraft:block/mangrove_wood") }, lazy { mapOf() }),
  MAP(lazy { Key.key("minecraft:item/map") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:item/map")) }),
  MEDIUM_AMETHYST_BUD(lazy { Key.key("minecraft:item/medium_amethyst_bud") }, lazy {
      Key.key("minecraft:item/amethyst_bud") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/medium_amethyst_bud")) }),
  MELON(lazy { Key.key("minecraft:item/melon") }, lazy { Key.key("minecraft:block/melon") }, lazy {
      mapOf() }),
  MELON_SEEDS(lazy { Key.key("minecraft:item/melon_seeds") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/melon_seeds")) }),
  MELON_SLICE(lazy { Key.key("minecraft:item/melon_slice") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/melon_slice")) }),
  MILK_BUCKET(lazy { Key.key("minecraft:item/milk_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/milk_bucket")) }),
  MINECART(lazy { Key.key("minecraft:item/minecart") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/minecart")) }),
  MINER_POTTERY_SHERD(lazy { Key.key("minecraft:item/miner_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/miner_pottery_sherd")) }),
  MOJANG_BANNER_PATTERN(lazy { Key.key("minecraft:item/mojang_banner_pattern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mojang_banner_pattern")) }),
  MOOSHROOM_SPAWN_EGG(lazy { Key.key("minecraft:item/mooshroom_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  MOSSY_COBBLESTONE(lazy { Key.key("minecraft:item/mossy_cobblestone") }, lazy {
      Key.key("minecraft:block/mossy_cobblestone") }, lazy { mapOf() }),
  MOSSY_COBBLESTONE_SLAB(lazy { Key.key("minecraft:item/mossy_cobblestone_slab") }, lazy {
      Key.key("minecraft:block/mossy_cobblestone_slab") }, lazy { mapOf() }),
  MOSSY_COBBLESTONE_STAIRS(lazy { Key.key("minecraft:item/mossy_cobblestone_stairs") }, lazy {
      Key.key("minecraft:block/mossy_cobblestone_stairs") }, lazy { mapOf() }),
  MOSSY_COBBLESTONE_WALL(lazy { Key.key("minecraft:item/mossy_cobblestone_wall") }, lazy {
      Key.key("minecraft:block/mossy_cobblestone_wall_inventory") }, lazy { mapOf() }),
  MOSSY_STONE_BRICKS(lazy { Key.key("minecraft:item/mossy_stone_bricks") }, lazy {
      Key.key("minecraft:block/mossy_stone_bricks") }, lazy { mapOf() }),
  MOSSY_STONE_BRICK_SLAB(lazy { Key.key("minecraft:item/mossy_stone_brick_slab") }, lazy {
      Key.key("minecraft:block/mossy_stone_brick_slab") }, lazy { mapOf() }),
  MOSSY_STONE_BRICK_STAIRS(lazy { Key.key("minecraft:item/mossy_stone_brick_stairs") }, lazy {
      Key.key("minecraft:block/mossy_stone_brick_stairs") }, lazy { mapOf() }),
  MOSSY_STONE_BRICK_WALL(lazy { Key.key("minecraft:item/mossy_stone_brick_wall") }, lazy {
      Key.key("minecraft:block/mossy_stone_brick_wall_inventory") }, lazy { mapOf() }),
  MOSS_BLOCK(lazy { Key.key("minecraft:item/moss_block") }, lazy {
      Key.key("minecraft:block/moss_block") }, lazy { mapOf() }),
  MOSS_CARPET(lazy { Key.key("minecraft:item/moss_carpet") }, lazy {
      Key.key("minecraft:block/moss_carpet") }, lazy { mapOf() }),
  MOURNER_POTTERY_SHERD(lazy { Key.key("minecraft:item/mourner_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mourner_pottery_sherd")) }),
  MUD(lazy { Key.key("minecraft:item/mud") }, lazy { Key.key("minecraft:block/mud") }, lazy {
      mapOf() }),
  MUDDY_MANGROVE_ROOTS(lazy { Key.key("minecraft:item/muddy_mangrove_roots") }, lazy {
      Key.key("minecraft:block/muddy_mangrove_roots") }, lazy { mapOf() }),
  MUD_BRICKS(lazy { Key.key("minecraft:item/mud_bricks") }, lazy {
      Key.key("minecraft:block/mud_bricks") }, lazy { mapOf() }),
  MUD_BRICK_SLAB(lazy { Key.key("minecraft:item/mud_brick_slab") }, lazy {
      Key.key("minecraft:block/mud_brick_slab") }, lazy { mapOf() }),
  MUD_BRICK_STAIRS(lazy { Key.key("minecraft:item/mud_brick_stairs") }, lazy {
      Key.key("minecraft:block/mud_brick_stairs") }, lazy { mapOf() }),
  MUD_BRICK_WALL(lazy { Key.key("minecraft:item/mud_brick_wall") }, lazy {
      Key.key("minecraft:block/mud_brick_wall_inventory") }, lazy { mapOf() }),
  MULE_SPAWN_EGG(lazy { Key.key("minecraft:item/mule_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  MUSHROOM_STEM(lazy { Key.key("minecraft:item/mushroom_stem") }, lazy {
      Key.key("minecraft:block/mushroom_stem_inventory") }, lazy { mapOf() }),
  MUSHROOM_STEW(lazy { Key.key("minecraft:item/mushroom_stew") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/mushroom_stew")) }),
  MUSIC_DISC_11(lazy { Key.key("minecraft:item/music_disc_11") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_11")) }),
  MUSIC_DISC_13(lazy { Key.key("minecraft:item/music_disc_13") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_13")) }),
  MUSIC_DISC_5(lazy { Key.key("minecraft:item/music_disc_5") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_5")) }),
  MUSIC_DISC_BLOCKS(lazy { Key.key("minecraft:item/music_disc_blocks") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_blocks")) }),
  MUSIC_DISC_CAT(lazy { Key.key("minecraft:item/music_disc_cat") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_cat")) }),
  MUSIC_DISC_CHIRP(lazy { Key.key("minecraft:item/music_disc_chirp") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_chirp")) }),
  MUSIC_DISC_CREATOR(lazy { Key.key("minecraft:item/music_disc_creator") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_creator")) }),
  MUSIC_DISC_CREATOR_MUSIC_BOX(lazy { Key.key("minecraft:item/music_disc_creator_music_box") }, lazy
      { Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_creator_music_box")) }),
  MUSIC_DISC_FAR(lazy { Key.key("minecraft:item/music_disc_far") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_far")) }),
  MUSIC_DISC_MALL(lazy { Key.key("minecraft:item/music_disc_mall") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_mall")) }),
  MUSIC_DISC_MELLOHI(lazy { Key.key("minecraft:item/music_disc_mellohi") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_mellohi")) }),
  MUSIC_DISC_OTHERSIDE(lazy { Key.key("minecraft:item/music_disc_otherside") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_otherside")) }),
  MUSIC_DISC_PIGSTEP(lazy { Key.key("minecraft:item/music_disc_pigstep") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_pigstep")) }),
  MUSIC_DISC_PRECIPICE(lazy { Key.key("minecraft:item/music_disc_precipice") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_precipice")) }),
  MUSIC_DISC_RELIC(lazy { Key.key("minecraft:item/music_disc_relic") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_relic")) }),
  MUSIC_DISC_STAL(lazy { Key.key("minecraft:item/music_disc_stal") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_stal")) }),
  MUSIC_DISC_STRAD(lazy { Key.key("minecraft:item/music_disc_strad") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_strad")) }),
  MUSIC_DISC_WAIT(lazy { Key.key("minecraft:item/music_disc_wait") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_wait")) }),
  MUSIC_DISC_WARD(lazy { Key.key("minecraft:item/music_disc_ward") }, lazy {
      Key.key("minecraft:item/template_music_disc") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/music_disc_ward")) }),
  MUTTON(lazy { Key.key("minecraft:item/mutton") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/mutton")) }),
  MYCELIUM(lazy { Key.key("minecraft:item/mycelium") }, lazy { Key.key("minecraft:block/mycelium")
      }, lazy { mapOf() }),
  NAME_TAG(lazy { Key.key("minecraft:item/name_tag") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/name_tag")) }),
  NAUTILUS_SHELL(lazy { Key.key("minecraft:item/nautilus_shell") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/nautilus_shell")) }),
  NETHERITE_AXE(lazy { Key.key("minecraft:item/netherite_axe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_axe")) }),
  NETHERITE_BLOCK(lazy { Key.key("minecraft:item/netherite_block") }, lazy {
      Key.key("minecraft:block/netherite_block") }, lazy { mapOf() }),
  NETHERITE_BOOTS(lazy { Key.key("minecraft:item/netherite_boots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_boots")) }),
  NETHERITE_CHESTPLATE(lazy { Key.key("minecraft:item/netherite_chestplate") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_chestplate")) }),
  NETHERITE_HELMET(lazy { Key.key("minecraft:item/netherite_helmet") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_helmet")) }),
  NETHERITE_HOE(lazy { Key.key("minecraft:item/netherite_hoe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_hoe")) }),
  NETHERITE_INGOT(lazy { Key.key("minecraft:item/netherite_ingot") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_ingot")) }),
  NETHERITE_LEGGINGS(lazy { Key.key("minecraft:item/netherite_leggings") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_leggings")) }),
  NETHERITE_PICKAXE(lazy { Key.key("minecraft:item/netherite_pickaxe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_pickaxe")) }),
  NETHERITE_SCRAP(lazy { Key.key("minecraft:item/netherite_scrap") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_scrap")) }),
  NETHERITE_SHOVEL(lazy { Key.key("minecraft:item/netherite_shovel") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_shovel")) }),
  NETHERITE_SWORD(lazy { Key.key("minecraft:item/netherite_sword") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_sword")) }),
  NETHERITE_UPGRADE_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/netherite_upgrade_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/netherite_upgrade_smithing_template")) }),
  NETHERRACK(lazy { Key.key("minecraft:item/netherrack") }, lazy {
      Key.key("minecraft:block/netherrack") }, lazy { mapOf() }),
  NETHER_BRICK(lazy { Key.key("minecraft:item/nether_brick") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/nether_brick")) }),
  NETHER_BRICKS(lazy { Key.key("minecraft:item/nether_bricks") }, lazy {
      Key.key("minecraft:block/nether_bricks") }, lazy { mapOf() }),
  NETHER_BRICK_FENCE(lazy { Key.key("minecraft:item/nether_brick_fence") }, lazy {
      Key.key("minecraft:block/nether_brick_fence_inventory") }, lazy { mapOf() }),
  NETHER_BRICK_SLAB(lazy { Key.key("minecraft:item/nether_brick_slab") }, lazy {
      Key.key("minecraft:block/nether_brick_slab") }, lazy { mapOf() }),
  NETHER_BRICK_STAIRS(lazy { Key.key("minecraft:item/nether_brick_stairs") }, lazy {
      Key.key("minecraft:block/nether_brick_stairs") }, lazy { mapOf() }),
  NETHER_BRICK_WALL(lazy { Key.key("minecraft:item/nether_brick_wall") }, lazy {
      Key.key("minecraft:block/nether_brick_wall_inventory") }, lazy { mapOf() }),
  NETHER_GOLD_ORE(lazy { Key.key("minecraft:item/nether_gold_ore") }, lazy {
      Key.key("minecraft:block/nether_gold_ore") }, lazy { mapOf() }),
  NETHER_QUARTZ_ORE(lazy { Key.key("minecraft:item/nether_quartz_ore") }, lazy {
      Key.key("minecraft:block/nether_quartz_ore") }, lazy { mapOf() }),
  NETHER_SPROUTS(lazy { Key.key("minecraft:item/nether_sprouts") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/nether_sprouts")) }),
  NETHER_STAR(lazy { Key.key("minecraft:item/nether_star") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/nether_star")) }),
  NETHER_WART(lazy { Key.key("minecraft:item/nether_wart") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/nether_wart")) }),
  NETHER_WART_BLOCK(lazy { Key.key("minecraft:item/nether_wart_block") }, lazy {
      Key.key("minecraft:block/nether_wart_block") }, lazy { mapOf() }),
  NOTE_BLOCK(lazy { Key.key("minecraft:item/note_block") }, lazy {
      Key.key("minecraft:block/note_block") }, lazy { mapOf() }),
  OAK_BOAT(lazy { Key.key("minecraft:item/oak_boat") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/oak_boat")) }),
  OAK_BUTTON(lazy { Key.key("minecraft:item/oak_button") }, lazy {
      Key.key("minecraft:block/oak_button_inventory") }, lazy { mapOf() }),
  OAK_CHEST_BOAT(lazy { Key.key("minecraft:item/oak_chest_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/oak_chest_boat")) }),
  OAK_DOOR(lazy { Key.key("minecraft:item/oak_door") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/oak_door")) }),
  OAK_FENCE(lazy { Key.key("minecraft:item/oak_fence") }, lazy {
      Key.key("minecraft:block/oak_fence_inventory") }, lazy { mapOf() }),
  OAK_FENCE_GATE(lazy { Key.key("minecraft:item/oak_fence_gate") }, lazy {
      Key.key("minecraft:block/oak_fence_gate") }, lazy { mapOf() }),
  OAK_HANGING_SIGN(lazy { Key.key("minecraft:item/oak_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/oak_hanging_sign")) }),
  OAK_LEAVES(lazy { Key.key("minecraft:item/oak_leaves") }, lazy {
      Key.key("minecraft:block/oak_leaves") }, lazy { mapOf() }),
  OAK_LOG(lazy { Key.key("minecraft:item/oak_log") }, lazy { Key.key("minecraft:block/oak_log") },
      lazy { mapOf() }),
  OAK_PLANKS(lazy { Key.key("minecraft:item/oak_planks") }, lazy {
      Key.key("minecraft:block/oak_planks") }, lazy { mapOf() }),
  OAK_PRESSURE_PLATE(lazy { Key.key("minecraft:item/oak_pressure_plate") }, lazy {
      Key.key("minecraft:block/oak_pressure_plate") }, lazy { mapOf() }),
  OAK_SAPLING(lazy { Key.key("minecraft:item/oak_sapling") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/oak_sapling")) }),
  OAK_SIGN(lazy { Key.key("minecraft:item/oak_sign") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/oak_sign")) }),
  OAK_SLAB(lazy { Key.key("minecraft:item/oak_slab") }, lazy { Key.key("minecraft:block/oak_slab")
      }, lazy { mapOf() }),
  OAK_STAIRS(lazy { Key.key("minecraft:item/oak_stairs") }, lazy {
      Key.key("minecraft:block/oak_stairs") }, lazy { mapOf() }),
  OAK_TRAPDOOR(lazy { Key.key("minecraft:item/oak_trapdoor") }, lazy {
      Key.key("minecraft:block/oak_trapdoor_bottom") }, lazy { mapOf() }),
  OAK_WOOD(lazy { Key.key("minecraft:item/oak_wood") }, lazy { Key.key("minecraft:block/oak_wood")
      }, lazy { mapOf() }),
  OBSERVER(lazy { Key.key("minecraft:item/observer") }, lazy { Key.key("minecraft:block/observer")
      }, lazy { mapOf() }),
  OBSIDIAN(lazy { Key.key("minecraft:item/obsidian") }, lazy { Key.key("minecraft:block/obsidian")
      }, lazy { mapOf() }),
  OCELOT_SPAWN_EGG(lazy { Key.key("minecraft:item/ocelot_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  OCHRE_FROGLIGHT(lazy { Key.key("minecraft:item/ochre_froglight") }, lazy {
      Key.key("minecraft:block/ochre_froglight") }, lazy { mapOf() }),
  OMINOUS_BOTTLE(lazy { Key.key("minecraft:item/ominous_bottle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/ominous_bottle")) }),
  OMINOUS_TRIAL_KEY(lazy { Key.key("minecraft:item/ominous_trial_key") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/ominous_trial_key")) }),
  ORANGE_BANNER(lazy { Key.key("minecraft:item/orange_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  ORANGE_BED(lazy { Key.key("minecraft:item/orange_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/orange_wool")) }),
  ORANGE_CANDLE(lazy { Key.key("minecraft:item/orange_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/orange_candle")) }),
  ORANGE_CARPET(lazy { Key.key("minecraft:item/orange_carpet") }, lazy {
      Key.key("minecraft:block/orange_carpet") }, lazy { mapOf() }),
  ORANGE_CONCRETE(lazy { Key.key("minecraft:item/orange_concrete") }, lazy {
      Key.key("minecraft:block/orange_concrete") }, lazy { mapOf() }),
  ORANGE_CONCRETE_POWDER(lazy { Key.key("minecraft:item/orange_concrete_powder") }, lazy {
      Key.key("minecraft:block/orange_concrete_powder") }, lazy { mapOf() }),
  ORANGE_DYE(lazy { Key.key("minecraft:item/orange_dye") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/orange_dye")) }),
  ORANGE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/orange_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/orange_glazed_terracotta") }, lazy { mapOf() }),
  ORANGE_SHULKER_BOX(lazy { Key.key("minecraft:item/orange_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/orange_shulker_box")) }),
  ORANGE_STAINED_GLASS(lazy { Key.key("minecraft:item/orange_stained_glass") }, lazy {
      Key.key("minecraft:block/orange_stained_glass") }, lazy { mapOf() }),
  ORANGE_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/orange_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/orange_stained_glass")) }),
  ORANGE_TERRACOTTA(lazy { Key.key("minecraft:item/orange_terracotta") }, lazy {
      Key.key("minecraft:block/orange_terracotta") }, lazy { mapOf() }),
  ORANGE_TULIP(lazy { Key.key("minecraft:item/orange_tulip") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/orange_tulip")) }),
  ORANGE_WOOL(lazy { Key.key("minecraft:item/orange_wool") }, lazy {
      Key.key("minecraft:block/orange_wool") }, lazy { mapOf() }),
  OXEYE_DAISY(lazy { Key.key("minecraft:item/oxeye_daisy") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/oxeye_daisy")) }),
  OXIDIZED_CHISELED_COPPER(lazy { Key.key("minecraft:item/oxidized_chiseled_copper") }, lazy {
      Key.key("minecraft:block/oxidized_chiseled_copper") }, lazy { mapOf() }),
  OXIDIZED_COPPER(lazy { Key.key("minecraft:item/oxidized_copper") }, lazy {
      Key.key("minecraft:block/oxidized_copper") }, lazy { mapOf() }),
  OXIDIZED_COPPER_BULB(lazy { Key.key("minecraft:item/oxidized_copper_bulb") }, lazy {
      Key.key("minecraft:block/oxidized_copper_bulb") }, lazy { mapOf() }),
  OXIDIZED_COPPER_DOOR(lazy { Key.key("minecraft:item/oxidized_copper_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/oxidized_copper_door")) }),
  OXIDIZED_COPPER_GRATE(lazy { Key.key("minecraft:item/oxidized_copper_grate") }, lazy {
      Key.key("minecraft:block/oxidized_copper_grate") }, lazy { mapOf() }),
  OXIDIZED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/oxidized_copper_trapdoor") }, lazy {
      Key.key("minecraft:block/oxidized_copper_trapdoor_bottom") }, lazy { mapOf() }),
  OXIDIZED_CUT_COPPER(lazy { Key.key("minecraft:item/oxidized_cut_copper") }, lazy {
      Key.key("minecraft:block/oxidized_cut_copper") }, lazy { mapOf() }),
  OXIDIZED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:item/oxidized_cut_copper_slab") }, lazy {
      Key.key("minecraft:block/oxidized_cut_copper_slab") }, lazy { mapOf() }),
  OXIDIZED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:item/oxidized_cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/oxidized_cut_copper_stairs") }, lazy { mapOf() }),
  PACKED_ICE(lazy { Key.key("minecraft:item/packed_ice") }, lazy {
      Key.key("minecraft:block/packed_ice") }, lazy { mapOf() }),
  PACKED_MUD(lazy { Key.key("minecraft:item/packed_mud") }, lazy {
      Key.key("minecraft:block/packed_mud") }, lazy { mapOf() }),
  PAINTING(lazy { Key.key("minecraft:item/painting") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/painting")) }),
  PANDA_SPAWN_EGG(lazy { Key.key("minecraft:item/panda_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  PAPER(lazy { Key.key("minecraft:item/paper") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/paper")) }),
  PARROT_SPAWN_EGG(lazy { Key.key("minecraft:item/parrot_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  PEARLESCENT_FROGLIGHT(lazy { Key.key("minecraft:item/pearlescent_froglight") }, lazy {
      Key.key("minecraft:block/pearlescent_froglight") }, lazy { mapOf() }),
  PEONY(lazy { Key.key("minecraft:item/peony") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:block/peony_top")) }),
  PETRIFIED_OAK_SLAB(lazy { Key.key("minecraft:item/petrified_oak_slab") }, lazy {
      Key.key("minecraft:block/petrified_oak_slab") }, lazy { mapOf() }),
  PHANTOM_MEMBRANE(lazy { Key.key("minecraft:item/phantom_membrane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/phantom_membrane")) }),
  PHANTOM_SPAWN_EGG(lazy { Key.key("minecraft:item/phantom_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  PIGLIN_BANNER_PATTERN(lazy { Key.key("minecraft:item/piglin_banner_pattern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/piglin_banner_pattern")) }),
  PIGLIN_BRUTE_SPAWN_EGG(lazy { Key.key("minecraft:item/piglin_brute_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  PIGLIN_HEAD(lazy { Key.key("minecraft:item/piglin_head") }, lazy {
      Key.key("minecraft:item/template_skull") }, lazy { mapOf() }),
  PIGLIN_SPAWN_EGG(lazy { Key.key("minecraft:item/piglin_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  PIG_SPAWN_EGG(lazy { Key.key("minecraft:item/pig_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  PILLAGER_SPAWN_EGG(lazy { Key.key("minecraft:item/pillager_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  PINK_BANNER(lazy { Key.key("minecraft:item/pink_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  PINK_BED(lazy { Key.key("minecraft:item/pink_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/pink_wool")) }),
  PINK_CANDLE(lazy { Key.key("minecraft:item/pink_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pink_candle")) }),
  PINK_CARPET(lazy { Key.key("minecraft:item/pink_carpet") }, lazy {
      Key.key("minecraft:block/pink_carpet") }, lazy { mapOf() }),
  PINK_CONCRETE(lazy { Key.key("minecraft:item/pink_concrete") }, lazy {
      Key.key("minecraft:block/pink_concrete") }, lazy { mapOf() }),
  PINK_CONCRETE_POWDER(lazy { Key.key("minecraft:item/pink_concrete_powder") }, lazy {
      Key.key("minecraft:block/pink_concrete_powder") }, lazy { mapOf() }),
  PINK_DYE(lazy { Key.key("minecraft:item/pink_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/pink_dye")) }),
  PINK_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/pink_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/pink_glazed_terracotta") }, lazy { mapOf() }),
  PINK_PETALS(lazy { Key.key("minecraft:item/pink_petals") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pink_petals")) }),
  PINK_SHULKER_BOX(lazy { Key.key("minecraft:item/pink_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/pink_shulker_box")) }),
  PINK_STAINED_GLASS(lazy { Key.key("minecraft:item/pink_stained_glass") }, lazy {
      Key.key("minecraft:block/pink_stained_glass") }, lazy { mapOf() }),
  PINK_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/pink_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/pink_stained_glass")) }),
  PINK_TERRACOTTA(lazy { Key.key("minecraft:item/pink_terracotta") }, lazy {
      Key.key("minecraft:block/pink_terracotta") }, lazy { mapOf() }),
  PINK_TULIP(lazy { Key.key("minecraft:item/pink_tulip") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/pink_tulip")) }),
  PINK_WOOL(lazy { Key.key("minecraft:item/pink_wool") }, lazy {
      Key.key("minecraft:block/pink_wool") }, lazy { mapOf() }),
  PISTON(lazy { Key.key("minecraft:item/piston") }, lazy {
      Key.key("minecraft:block/piston_inventory") }, lazy { mapOf() }),
  PITCHER_PLANT(lazy { Key.key("minecraft:item/pitcher_plant") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pitcher_plant")) }),
  PITCHER_POD(lazy { Key.key("minecraft:item/pitcher_pod") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pitcher_pod")) }),
  PLAYER_HEAD(lazy { Key.key("minecraft:item/player_head") }, lazy {
      Key.key("minecraft:item/template_skull") }, lazy { mapOf() }),
  PLENTY_POTTERY_SHERD(lazy { Key.key("minecraft:item/plenty_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/plenty_pottery_sherd")) }),
  PODZOL(lazy { Key.key("minecraft:item/podzol") }, lazy { Key.key("minecraft:block/podzol") }, lazy
      { mapOf() }),
  POINTED_DRIPSTONE(lazy { Key.key("minecraft:item/pointed_dripstone") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pointed_dripstone")) }),
  POISONOUS_POTATO(lazy { Key.key("minecraft:item/poisonous_potato") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/poisonous_potato")) }),
  POLAR_BEAR_SPAWN_EGG(lazy { Key.key("minecraft:item/polar_bear_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  POLISHED_ANDESITE(lazy { Key.key("minecraft:item/polished_andesite") }, lazy {
      Key.key("minecraft:block/polished_andesite") }, lazy { mapOf() }),
  POLISHED_ANDESITE_SLAB(lazy { Key.key("minecraft:item/polished_andesite_slab") }, lazy {
      Key.key("minecraft:block/polished_andesite_slab") }, lazy { mapOf() }),
  POLISHED_ANDESITE_STAIRS(lazy { Key.key("minecraft:item/polished_andesite_stairs") }, lazy {
      Key.key("minecraft:block/polished_andesite_stairs") }, lazy { mapOf() }),
  POLISHED_BASALT(lazy { Key.key("minecraft:item/polished_basalt") }, lazy {
      Key.key("minecraft:block/polished_basalt") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE(lazy { Key.key("minecraft:item/polished_blackstone") }, lazy {
      Key.key("minecraft:block/polished_blackstone") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE_BRICKS(lazy { Key.key("minecraft:item/polished_blackstone_bricks") }, lazy {
      Key.key("minecraft:block/polished_blackstone_bricks") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE_BRICK_SLAB(lazy { Key.key("minecraft:item/polished_blackstone_brick_slab") },
      lazy { Key.key("minecraft:block/polished_blackstone_brick_slab") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE_BRICK_STAIRS(lazy { Key.key("minecraft:item/polished_blackstone_brick_stairs")
      }, lazy { Key.key("minecraft:block/polished_blackstone_brick_stairs") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE_BRICK_WALL(lazy { Key.key("minecraft:item/polished_blackstone_brick_wall") },
      lazy { Key.key("minecraft:block/polished_blackstone_brick_wall_inventory") }, lazy { mapOf()
      }),
  POLISHED_BLACKSTONE_BUTTON(lazy { Key.key("minecraft:item/polished_blackstone_button") }, lazy {
      Key.key("minecraft:block/polished_blackstone_button_inventory") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE_PRESSURE_PLATE(lazy {
      Key.key("minecraft:item/polished_blackstone_pressure_plate") }, lazy {
      Key.key("minecraft:block/polished_blackstone_pressure_plate") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE_SLAB(lazy { Key.key("minecraft:item/polished_blackstone_slab") }, lazy {
      Key.key("minecraft:block/polished_blackstone_slab") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE_STAIRS(lazy { Key.key("minecraft:item/polished_blackstone_stairs") }, lazy {
      Key.key("minecraft:block/polished_blackstone_stairs") }, lazy { mapOf() }),
  POLISHED_BLACKSTONE_WALL(lazy { Key.key("minecraft:item/polished_blackstone_wall") }, lazy {
      Key.key("minecraft:block/polished_blackstone_wall_inventory") }, lazy { mapOf() }),
  POLISHED_DEEPSLATE(lazy { Key.key("minecraft:item/polished_deepslate") }, lazy {
      Key.key("minecraft:block/polished_deepslate") }, lazy { mapOf() }),
  POLISHED_DEEPSLATE_SLAB(lazy { Key.key("minecraft:item/polished_deepslate_slab") }, lazy {
      Key.key("minecraft:block/polished_deepslate_slab") }, lazy { mapOf() }),
  POLISHED_DEEPSLATE_STAIRS(lazy { Key.key("minecraft:item/polished_deepslate_stairs") }, lazy {
      Key.key("minecraft:block/polished_deepslate_stairs") }, lazy { mapOf() }),
  POLISHED_DEEPSLATE_WALL(lazy { Key.key("minecraft:item/polished_deepslate_wall") }, lazy {
      Key.key("minecraft:block/polished_deepslate_wall_inventory") }, lazy { mapOf() }),
  POLISHED_DIORITE(lazy { Key.key("minecraft:item/polished_diorite") }, lazy {
      Key.key("minecraft:block/polished_diorite") }, lazy { mapOf() }),
  POLISHED_DIORITE_SLAB(lazy { Key.key("minecraft:item/polished_diorite_slab") }, lazy {
      Key.key("minecraft:block/polished_diorite_slab") }, lazy { mapOf() }),
  POLISHED_DIORITE_STAIRS(lazy { Key.key("minecraft:item/polished_diorite_stairs") }, lazy {
      Key.key("minecraft:block/polished_diorite_stairs") }, lazy { mapOf() }),
  POLISHED_GRANITE(lazy { Key.key("minecraft:item/polished_granite") }, lazy {
      Key.key("minecraft:block/polished_granite") }, lazy { mapOf() }),
  POLISHED_GRANITE_SLAB(lazy { Key.key("minecraft:item/polished_granite_slab") }, lazy {
      Key.key("minecraft:block/polished_granite_slab") }, lazy { mapOf() }),
  POLISHED_GRANITE_STAIRS(lazy { Key.key("minecraft:item/polished_granite_stairs") }, lazy {
      Key.key("minecraft:block/polished_granite_stairs") }, lazy { mapOf() }),
  POLISHED_TUFF(lazy { Key.key("minecraft:item/polished_tuff") }, lazy {
      Key.key("minecraft:block/polished_tuff") }, lazy { mapOf() }),
  POLISHED_TUFF_SLAB(lazy { Key.key("minecraft:item/polished_tuff_slab") }, lazy {
      Key.key("minecraft:block/polished_tuff_slab") }, lazy { mapOf() }),
  POLISHED_TUFF_STAIRS(lazy { Key.key("minecraft:item/polished_tuff_stairs") }, lazy {
      Key.key("minecraft:block/polished_tuff_stairs") }, lazy { mapOf() }),
  POLISHED_TUFF_WALL(lazy { Key.key("minecraft:item/polished_tuff_wall") }, lazy {
      Key.key("minecraft:block/polished_tuff_wall_inventory") }, lazy { mapOf() }),
  POPPED_CHORUS_FRUIT(lazy { Key.key("minecraft:item/popped_chorus_fruit") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/popped_chorus_fruit")) }),
  POPPY(lazy { Key.key("minecraft:item/poppy") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:block/poppy")) }),
  PORKCHOP(lazy { Key.key("minecraft:item/porkchop") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/porkchop")) }),
  POTATO(lazy { Key.key("minecraft:item/potato") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/potato")) }),
  POTION(lazy { Key.key("minecraft:item/potion") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/potion_overlay"), "layer1" to
      Key.key("minecraft:item/potion")) }),
  POWDER_SNOW_BUCKET(lazy { Key.key("minecraft:item/powder_snow_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/powder_snow_bucket")) }),
  POWERED_RAIL(lazy { Key.key("minecraft:item/powered_rail") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/powered_rail")) }),
  PRISMARINE(lazy { Key.key("minecraft:item/prismarine") }, lazy {
      Key.key("minecraft:block/prismarine") }, lazy { mapOf() }),
  PRISMARINE_BRICKS(lazy { Key.key("minecraft:item/prismarine_bricks") }, lazy {
      Key.key("minecraft:block/prismarine_bricks") }, lazy { mapOf() }),
  PRISMARINE_BRICK_SLAB(lazy { Key.key("minecraft:item/prismarine_brick_slab") }, lazy {
      Key.key("minecraft:block/prismarine_brick_slab") }, lazy { mapOf() }),
  PRISMARINE_BRICK_STAIRS(lazy { Key.key("minecraft:item/prismarine_brick_stairs") }, lazy {
      Key.key("minecraft:block/prismarine_brick_stairs") }, lazy { mapOf() }),
  PRISMARINE_CRYSTALS(lazy { Key.key("minecraft:item/prismarine_crystals") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/prismarine_crystals")) }),
  PRISMARINE_SHARD(lazy { Key.key("minecraft:item/prismarine_shard") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/prismarine_shard")) }),
  PRISMARINE_SLAB(lazy { Key.key("minecraft:item/prismarine_slab") }, lazy {
      Key.key("minecraft:block/prismarine_slab") }, lazy { mapOf() }),
  PRISMARINE_STAIRS(lazy { Key.key("minecraft:item/prismarine_stairs") }, lazy {
      Key.key("minecraft:block/prismarine_stairs") }, lazy { mapOf() }),
  PRISMARINE_WALL(lazy { Key.key("minecraft:item/prismarine_wall") }, lazy {
      Key.key("minecraft:block/prismarine_wall_inventory") }, lazy { mapOf() }),
  PRIZE_POTTERY_SHERD(lazy { Key.key("minecraft:item/prize_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/prize_pottery_sherd")) }),
  PUFFERFISH(lazy { Key.key("minecraft:item/pufferfish") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pufferfish")) }),
  PUFFERFISH_BUCKET(lazy { Key.key("minecraft:item/pufferfish_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pufferfish_bucket")) }),
  PUFFERFISH_SPAWN_EGG(lazy { Key.key("minecraft:item/pufferfish_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  PUMPKIN(lazy { Key.key("minecraft:item/pumpkin") }, lazy { Key.key("minecraft:block/pumpkin") },
      lazy { mapOf() }),
  PUMPKIN_PIE(lazy { Key.key("minecraft:item/pumpkin_pie") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pumpkin_pie")) }),
  PUMPKIN_SEEDS(lazy { Key.key("minecraft:item/pumpkin_seeds") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/pumpkin_seeds")) }),
  PURPLE_BANNER(lazy { Key.key("minecraft:item/purple_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  PURPLE_BED(lazy { Key.key("minecraft:item/purple_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/purple_wool")) }),
  PURPLE_CANDLE(lazy { Key.key("minecraft:item/purple_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/purple_candle")) }),
  PURPLE_CARPET(lazy { Key.key("minecraft:item/purple_carpet") }, lazy {
      Key.key("minecraft:block/purple_carpet") }, lazy { mapOf() }),
  PURPLE_CONCRETE(lazy { Key.key("minecraft:item/purple_concrete") }, lazy {
      Key.key("minecraft:block/purple_concrete") }, lazy { mapOf() }),
  PURPLE_CONCRETE_POWDER(lazy { Key.key("minecraft:item/purple_concrete_powder") }, lazy {
      Key.key("minecraft:block/purple_concrete_powder") }, lazy { mapOf() }),
  PURPLE_DYE(lazy { Key.key("minecraft:item/purple_dye") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/purple_dye")) }),
  PURPLE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/purple_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/purple_glazed_terracotta") }, lazy { mapOf() }),
  PURPLE_SHULKER_BOX(lazy { Key.key("minecraft:item/purple_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/purple_shulker_box")) }),
  PURPLE_STAINED_GLASS(lazy { Key.key("minecraft:item/purple_stained_glass") }, lazy {
      Key.key("minecraft:block/purple_stained_glass") }, lazy { mapOf() }),
  PURPLE_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/purple_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/purple_stained_glass")) }),
  PURPLE_TERRACOTTA(lazy { Key.key("minecraft:item/purple_terracotta") }, lazy {
      Key.key("minecraft:block/purple_terracotta") }, lazy { mapOf() }),
  PURPLE_WOOL(lazy { Key.key("minecraft:item/purple_wool") }, lazy {
      Key.key("minecraft:block/purple_wool") }, lazy { mapOf() }),
  PURPUR_BLOCK(lazy { Key.key("minecraft:item/purpur_block") }, lazy {
      Key.key("minecraft:block/purpur_block") }, lazy { mapOf() }),
  PURPUR_PILLAR(lazy { Key.key("minecraft:item/purpur_pillar") }, lazy {
      Key.key("minecraft:block/purpur_pillar") }, lazy { mapOf() }),
  PURPUR_SLAB(lazy { Key.key("minecraft:item/purpur_slab") }, lazy {
      Key.key("minecraft:block/purpur_slab") }, lazy { mapOf() }),
  PURPUR_STAIRS(lazy { Key.key("minecraft:item/purpur_stairs") }, lazy {
      Key.key("minecraft:block/purpur_stairs") }, lazy { mapOf() }),
  QUARTZ(lazy { Key.key("minecraft:item/quartz") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/quartz")) }),
  QUARTZ_BLOCK(lazy { Key.key("minecraft:item/quartz_block") }, lazy {
      Key.key("minecraft:block/quartz_block") }, lazy { mapOf() }),
  QUARTZ_BRICKS(lazy { Key.key("minecraft:item/quartz_bricks") }, lazy {
      Key.key("minecraft:block/quartz_bricks") }, lazy { mapOf() }),
  QUARTZ_PILLAR(lazy { Key.key("minecraft:item/quartz_pillar") }, lazy {
      Key.key("minecraft:block/quartz_pillar") }, lazy { mapOf() }),
  QUARTZ_SLAB(lazy { Key.key("minecraft:item/quartz_slab") }, lazy {
      Key.key("minecraft:block/quartz_slab") }, lazy { mapOf() }),
  QUARTZ_STAIRS(lazy { Key.key("minecraft:item/quartz_stairs") }, lazy {
      Key.key("minecraft:block/quartz_stairs") }, lazy { mapOf() }),
  RABBIT(lazy { Key.key("minecraft:item/rabbit") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/rabbit")) }),
  RABBIT_FOOT(lazy { Key.key("minecraft:item/rabbit_foot") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/rabbit_foot")) }),
  RABBIT_HIDE(lazy { Key.key("minecraft:item/rabbit_hide") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/rabbit_hide")) }),
  RABBIT_SPAWN_EGG(lazy { Key.key("minecraft:item/rabbit_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  RABBIT_STEW(lazy { Key.key("minecraft:item/rabbit_stew") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/rabbit_stew")) }),
  RAIL(lazy { Key.key("minecraft:item/rail") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:block/rail")) }),
  RAISER_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/raiser_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/raiser_armor_trim_smithing_template")) }),
  RAVAGER_SPAWN_EGG(lazy { Key.key("minecraft:item/ravager_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  RAW_COPPER(lazy { Key.key("minecraft:item/raw_copper") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/raw_copper")) }),
  RAW_COPPER_BLOCK(lazy { Key.key("minecraft:item/raw_copper_block") }, lazy {
      Key.key("minecraft:block/raw_copper_block") }, lazy { mapOf() }),
  RAW_GOLD(lazy { Key.key("minecraft:item/raw_gold") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/raw_gold")) }),
  RAW_GOLD_BLOCK(lazy { Key.key("minecraft:item/raw_gold_block") }, lazy {
      Key.key("minecraft:block/raw_gold_block") }, lazy { mapOf() }),
  RAW_IRON(lazy { Key.key("minecraft:item/raw_iron") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/raw_iron")) }),
  RAW_IRON_BLOCK(lazy { Key.key("minecraft:item/raw_iron_block") }, lazy {
      Key.key("minecraft:block/raw_iron_block") }, lazy { mapOf() }),
  RECOVERY_COMPASS(lazy { Key.key("minecraft:item/recovery_compass") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/recovery_compass_16")) }),
  REDSTONE(lazy { Key.key("minecraft:item/redstone") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/redstone")) }),
  REDSTONE_BLOCK(lazy { Key.key("minecraft:item/redstone_block") }, lazy {
      Key.key("minecraft:block/redstone_block") }, lazy { mapOf() }),
  REDSTONE_LAMP(lazy { Key.key("minecraft:item/redstone_lamp") }, lazy {
      Key.key("minecraft:block/redstone_lamp") }, lazy { mapOf() }),
  REDSTONE_ORE(lazy { Key.key("minecraft:item/redstone_ore") }, lazy {
      Key.key("minecraft:block/redstone_ore") }, lazy { mapOf() }),
  REDSTONE_TORCH(lazy { Key.key("minecraft:item/redstone_torch") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/redstone_torch")) }),
  RED_BANNER(lazy { Key.key("minecraft:item/red_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  RED_BED(lazy { Key.key("minecraft:item/red_bed") }, lazy { Key.key("minecraft:item/template_bed")
      }, lazy { mapOf("particle" to Key.key("minecraft:block/red_wool")) }),
  RED_CANDLE(lazy { Key.key("minecraft:item/red_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/red_candle")) }),
  RED_CARPET(lazy { Key.key("minecraft:item/red_carpet") }, lazy {
      Key.key("minecraft:block/red_carpet") }, lazy { mapOf() }),
  RED_CONCRETE(lazy { Key.key("minecraft:item/red_concrete") }, lazy {
      Key.key("minecraft:block/red_concrete") }, lazy { mapOf() }),
  RED_CONCRETE_POWDER(lazy { Key.key("minecraft:item/red_concrete_powder") }, lazy {
      Key.key("minecraft:block/red_concrete_powder") }, lazy { mapOf() }),
  RED_DYE(lazy { Key.key("minecraft:item/red_dye") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/red_dye")) }),
  RED_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/red_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/red_glazed_terracotta") }, lazy { mapOf() }),
  RED_MUSHROOM(lazy { Key.key("minecraft:item/red_mushroom") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/red_mushroom")) }),
  RED_MUSHROOM_BLOCK(lazy { Key.key("minecraft:item/red_mushroom_block") }, lazy {
      Key.key("minecraft:block/red_mushroom_block_inventory") }, lazy { mapOf() }),
  RED_NETHER_BRICKS(lazy { Key.key("minecraft:item/red_nether_bricks") }, lazy {
      Key.key("minecraft:block/red_nether_bricks") }, lazy { mapOf() }),
  RED_NETHER_BRICK_SLAB(lazy { Key.key("minecraft:item/red_nether_brick_slab") }, lazy {
      Key.key("minecraft:block/red_nether_brick_slab") }, lazy { mapOf() }),
  RED_NETHER_BRICK_STAIRS(lazy { Key.key("minecraft:item/red_nether_brick_stairs") }, lazy {
      Key.key("minecraft:block/red_nether_brick_stairs") }, lazy { mapOf() }),
  RED_NETHER_BRICK_WALL(lazy { Key.key("minecraft:item/red_nether_brick_wall") }, lazy {
      Key.key("minecraft:block/red_nether_brick_wall_inventory") }, lazy { mapOf() }),
  RED_SAND(lazy { Key.key("minecraft:item/red_sand") }, lazy { Key.key("minecraft:block/red_sand")
      }, lazy { mapOf() }),
  RED_SANDSTONE(lazy { Key.key("minecraft:item/red_sandstone") }, lazy {
      Key.key("minecraft:block/red_sandstone") }, lazy { mapOf() }),
  RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:item/red_sandstone_slab") }, lazy {
      Key.key("minecraft:block/red_sandstone_slab") }, lazy { mapOf() }),
  RED_SANDSTONE_STAIRS(lazy { Key.key("minecraft:item/red_sandstone_stairs") }, lazy {
      Key.key("minecraft:block/red_sandstone_stairs") }, lazy { mapOf() }),
  RED_SANDSTONE_WALL(lazy { Key.key("minecraft:item/red_sandstone_wall") }, lazy {
      Key.key("minecraft:block/red_sandstone_wall_inventory") }, lazy { mapOf() }),
  RED_SHULKER_BOX(lazy { Key.key("minecraft:item/red_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/red_shulker_box")) }),
  RED_STAINED_GLASS(lazy { Key.key("minecraft:item/red_stained_glass") }, lazy {
      Key.key("minecraft:block/red_stained_glass") }, lazy { mapOf() }),
  RED_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/red_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/red_stained_glass")) }),
  RED_TERRACOTTA(lazy { Key.key("minecraft:item/red_terracotta") }, lazy {
      Key.key("minecraft:block/red_terracotta") }, lazy { mapOf() }),
  RED_TULIP(lazy { Key.key("minecraft:item/red_tulip") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:block/red_tulip")) }),
  RED_WOOL(lazy { Key.key("minecraft:item/red_wool") }, lazy { Key.key("minecraft:block/red_wool")
      }, lazy { mapOf() }),
  REINFORCED_DEEPSLATE(lazy { Key.key("minecraft:item/reinforced_deepslate") }, lazy {
      Key.key("minecraft:block/reinforced_deepslate") }, lazy { mapOf() }),
  REPEATER(lazy { Key.key("minecraft:item/repeater") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/repeater")) }),
  REPEATING_COMMAND_BLOCK(lazy { Key.key("minecraft:item/repeating_command_block") }, lazy {
      Key.key("minecraft:block/repeating_command_block") }, lazy { mapOf() }),
  RESPAWN_ANCHOR(lazy { Key.key("minecraft:item/respawn_anchor") }, lazy {
      Key.key("minecraft:block/respawn_anchor_0") }, lazy { mapOf() }),
  RIB_ARMOR_TRIM_SMITHING_TEMPLATE(lazy { Key.key("minecraft:item/rib_armor_trim_smithing_template")
      }, lazy { Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/rib_armor_trim_smithing_template")) }),
  ROOTED_DIRT(lazy { Key.key("minecraft:item/rooted_dirt") }, lazy {
      Key.key("minecraft:block/rooted_dirt") }, lazy { mapOf() }),
  ROSE_BUSH(lazy { Key.key("minecraft:item/rose_bush") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:block/rose_bush_top")) }),
  ROTTEN_FLESH(lazy { Key.key("minecraft:item/rotten_flesh") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/rotten_flesh")) }),
  SADDLE(lazy { Key.key("minecraft:item/saddle") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/saddle")) }),
  SALMON(lazy { Key.key("minecraft:item/salmon") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/salmon")) }),
  SALMON_BUCKET(lazy { Key.key("minecraft:item/salmon_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/salmon_bucket")) }),
  SALMON_SPAWN_EGG(lazy { Key.key("minecraft:item/salmon_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SAND(lazy { Key.key("minecraft:item/sand") }, lazy { Key.key("minecraft:block/sand") }, lazy {
      mapOf() }),
  SANDSTONE(lazy { Key.key("minecraft:item/sandstone") }, lazy {
      Key.key("minecraft:block/sandstone") }, lazy { mapOf() }),
  SANDSTONE_SLAB(lazy { Key.key("minecraft:item/sandstone_slab") }, lazy {
      Key.key("minecraft:block/sandstone_slab") }, lazy { mapOf() }),
  SANDSTONE_STAIRS(lazy { Key.key("minecraft:item/sandstone_stairs") }, lazy {
      Key.key("minecraft:block/sandstone_stairs") }, lazy { mapOf() }),
  SANDSTONE_WALL(lazy { Key.key("minecraft:item/sandstone_wall") }, lazy {
      Key.key("minecraft:block/sandstone_wall_inventory") }, lazy { mapOf() }),
  SCAFFOLDING(lazy { Key.key("minecraft:item/scaffolding") }, lazy {
      Key.key("minecraft:block/scaffolding_stable") }, lazy { mapOf() }),
  SCRAPE_POTTERY_SHERD(lazy { Key.key("minecraft:item/scrape_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/scrape_pottery_sherd")) }),
  SCULK(lazy { Key.key("minecraft:item/sculk") }, lazy { Key.key("minecraft:block/sculk") }, lazy {
      mapOf() }),
  SCULK_CATALYST(lazy { Key.key("minecraft:item/sculk_catalyst") }, lazy {
      Key.key("minecraft:block/sculk_catalyst") }, lazy { mapOf() }),
  SCULK_SENSOR(lazy { Key.key("minecraft:item/sculk_sensor") }, lazy {
      Key.key("minecraft:block/sculk_sensor_inactive") }, lazy { mapOf() }),
  SCULK_SHRIEKER(lazy { Key.key("minecraft:item/sculk_shrieker") }, lazy {
      Key.key("minecraft:block/sculk_shrieker") }, lazy { mapOf() }),
  SCULK_VEIN(lazy { Key.key("minecraft:item/sculk_vein") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/sculk_vein")) }),
  SEAGRASS(lazy { Key.key("minecraft:item/seagrass") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/seagrass")) }),
  SEA_LANTERN(lazy { Key.key("minecraft:item/sea_lantern") }, lazy {
      Key.key("minecraft:block/sea_lantern") }, lazy { mapOf() }),
  SEA_PICKLE(lazy { Key.key("minecraft:item/sea_pickle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/sea_pickle")) }),
  SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/sentry_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/sentry_armor_trim_smithing_template")) }),
  SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/shaper_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/shaper_armor_trim_smithing_template")) }),
  SHEAF_POTTERY_SHERD(lazy { Key.key("minecraft:item/sheaf_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/sheaf_pottery_sherd")) }),
  SHEARS(lazy { Key.key("minecraft:item/shears") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/shears")) }),
  SHEEP_SPAWN_EGG(lazy { Key.key("minecraft:item/sheep_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SHELTER_POTTERY_SHERD(lazy { Key.key("minecraft:item/shelter_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/shelter_pottery_sherd")) }),
  SHIELD(lazy { Key.key("minecraft:item/shield") }, lazy { Key.key("minecraft:builtin/entity") },
      lazy { mapOf("particle" to Key.key("minecraft:block/dark_oak_planks")) }),
  SHORT_GRASS(lazy { Key.key("minecraft:item/short_grass") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/short_grass")) }),
  SHROOMLIGHT(lazy { Key.key("minecraft:item/shroomlight") }, lazy {
      Key.key("minecraft:block/shroomlight") }, lazy { mapOf() }),
  SHULKER_BOX(lazy { Key.key("minecraft:item/shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/shulker_box")) }),
  SHULKER_SHELL(lazy { Key.key("minecraft:item/shulker_shell") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/shulker_shell")) }),
  SHULKER_SPAWN_EGG(lazy { Key.key("minecraft:item/shulker_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/silence_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/silence_armor_trim_smithing_template")) }),
  SILVERFISH_SPAWN_EGG(lazy { Key.key("minecraft:item/silverfish_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SKELETON_HORSE_SPAWN_EGG(lazy { Key.key("minecraft:item/skeleton_horse_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SKELETON_SKULL(lazy { Key.key("minecraft:item/skeleton_skull") }, lazy {
      Key.key("minecraft:item/template_skull") }, lazy { mapOf() }),
  SKELETON_SPAWN_EGG(lazy { Key.key("minecraft:item/skeleton_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SKULL_BANNER_PATTERN(lazy { Key.key("minecraft:item/skull_banner_pattern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/skull_banner_pattern")) }),
  SKULL_POTTERY_SHERD(lazy { Key.key("minecraft:item/skull_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/skull_pottery_sherd")) }),
  SLIME_BALL(lazy { Key.key("minecraft:item/slime_ball") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/slime_ball")) }),
  SLIME_BLOCK(lazy { Key.key("minecraft:item/slime_block") }, lazy {
      Key.key("minecraft:block/slime_block") }, lazy { mapOf() }),
  SLIME_SPAWN_EGG(lazy { Key.key("minecraft:item/slime_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SMALL_AMETHYST_BUD(lazy { Key.key("minecraft:item/small_amethyst_bud") }, lazy {
      Key.key("minecraft:item/amethyst_bud") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/small_amethyst_bud")) }),
  SMALL_DRIPLEAF(lazy { Key.key("minecraft:item/small_dripleaf") }, lazy {
      Key.key("minecraft:block/small_dripleaf_top") }, lazy { mapOf() }),
  SMITHING_TABLE(lazy { Key.key("minecraft:item/smithing_table") }, lazy {
      Key.key("minecraft:block/smithing_table") }, lazy { mapOf() }),
  SMOKER(lazy { Key.key("minecraft:item/smoker") }, lazy { Key.key("minecraft:block/smoker") }, lazy
      { mapOf() }),
  SMOOTH_BASALT(lazy { Key.key("minecraft:item/smooth_basalt") }, lazy {
      Key.key("minecraft:block/smooth_basalt") }, lazy { mapOf() }),
  SMOOTH_QUARTZ(lazy { Key.key("minecraft:item/smooth_quartz") }, lazy {
      Key.key("minecraft:block/smooth_quartz") }, lazy { mapOf() }),
  SMOOTH_QUARTZ_SLAB(lazy { Key.key("minecraft:item/smooth_quartz_slab") }, lazy {
      Key.key("minecraft:block/smooth_quartz_slab") }, lazy { mapOf() }),
  SMOOTH_QUARTZ_STAIRS(lazy { Key.key("minecraft:item/smooth_quartz_stairs") }, lazy {
      Key.key("minecraft:block/smooth_quartz_stairs") }, lazy { mapOf() }),
  SMOOTH_RED_SANDSTONE(lazy { Key.key("minecraft:item/smooth_red_sandstone") }, lazy {
      Key.key("minecraft:block/smooth_red_sandstone") }, lazy { mapOf() }),
  SMOOTH_RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:item/smooth_red_sandstone_slab") }, lazy {
      Key.key("minecraft:block/smooth_red_sandstone_slab") }, lazy { mapOf() }),
  SMOOTH_RED_SANDSTONE_STAIRS(lazy { Key.key("minecraft:item/smooth_red_sandstone_stairs") }, lazy {
      Key.key("minecraft:block/smooth_red_sandstone_stairs") }, lazy { mapOf() }),
  SMOOTH_SANDSTONE(lazy { Key.key("minecraft:item/smooth_sandstone") }, lazy {
      Key.key("minecraft:block/smooth_sandstone") }, lazy { mapOf() }),
  SMOOTH_SANDSTONE_SLAB(lazy { Key.key("minecraft:item/smooth_sandstone_slab") }, lazy {
      Key.key("minecraft:block/smooth_sandstone_slab") }, lazy { mapOf() }),
  SMOOTH_SANDSTONE_STAIRS(lazy { Key.key("minecraft:item/smooth_sandstone_stairs") }, lazy {
      Key.key("minecraft:block/smooth_sandstone_stairs") }, lazy { mapOf() }),
  SMOOTH_STONE(lazy { Key.key("minecraft:item/smooth_stone") }, lazy {
      Key.key("minecraft:block/smooth_stone") }, lazy { mapOf() }),
  SMOOTH_STONE_SLAB(lazy { Key.key("minecraft:item/smooth_stone_slab") }, lazy {
      Key.key("minecraft:block/smooth_stone_slab") }, lazy { mapOf() }),
  SNIFFER_EGG(lazy { Key.key("minecraft:item/sniffer_egg") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/sniffer_egg")) }),
  SNIFFER_SPAWN_EGG(lazy { Key.key("minecraft:item/sniffer_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SNORT_POTTERY_SHERD(lazy { Key.key("minecraft:item/snort_pottery_sherd") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/snort_pottery_sherd")) }),
  SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/snout_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/snout_armor_trim_smithing_template")) }),
  SNOW(lazy { Key.key("minecraft:item/snow") }, lazy { Key.key("minecraft:block/snow_height2") },
      lazy { mapOf() }),
  SNOWBALL(lazy { Key.key("minecraft:item/snowball") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/snowball")) }),
  SNOW_BLOCK(lazy { Key.key("minecraft:item/snow_block") }, lazy {
      Key.key("minecraft:block/snow_block") }, lazy { mapOf() }),
  SNOW_GOLEM_SPAWN_EGG(lazy { Key.key("minecraft:item/snow_golem_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SOUL_CAMPFIRE(lazy { Key.key("minecraft:item/soul_campfire") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/soul_campfire")) }),
  SOUL_LANTERN(lazy { Key.key("minecraft:item/soul_lantern") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/soul_lantern")) }),
  SOUL_SAND(lazy { Key.key("minecraft:item/soul_sand") }, lazy {
      Key.key("minecraft:block/soul_sand") }, lazy { mapOf() }),
  SOUL_SOIL(lazy { Key.key("minecraft:item/soul_soil") }, lazy {
      Key.key("minecraft:block/soul_soil") }, lazy { mapOf() }),
  SOUL_TORCH(lazy { Key.key("minecraft:item/soul_torch") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/soul_torch")) }),
  SPAWNER(lazy { Key.key("minecraft:item/spawner") }, lazy { Key.key("minecraft:block/spawner") },
      lazy { mapOf() }),
  SPECTRAL_ARROW(lazy { Key.key("minecraft:item/spectral_arrow") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/spectral_arrow")) }),
  SPIDER_EYE(lazy { Key.key("minecraft:item/spider_eye") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/spider_eye")) }),
  SPIDER_SPAWN_EGG(lazy { Key.key("minecraft:item/spider_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/spire_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/spire_armor_trim_smithing_template")) }),
  SPLASH_POTION(lazy { Key.key("minecraft:item/splash_potion") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/potion_overlay"), "layer1" to Key.key("minecraft:item/splash_potion"))
      }),
  SPONGE(lazy { Key.key("minecraft:item/sponge") }, lazy { Key.key("minecraft:block/sponge") }, lazy
      { mapOf() }),
  SPORE_BLOSSOM(lazy { Key.key("minecraft:item/spore_blossom") }, lazy {
      Key.key("minecraft:block/spore_blossom") }, lazy { mapOf() }),
  SPRUCE_BOAT(lazy { Key.key("minecraft:item/spruce_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/spruce_boat")) }),
  SPRUCE_BUTTON(lazy { Key.key("minecraft:item/spruce_button") }, lazy {
      Key.key("minecraft:block/spruce_button_inventory") }, lazy { mapOf() }),
  SPRUCE_CHEST_BOAT(lazy { Key.key("minecraft:item/spruce_chest_boat") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/spruce_chest_boat")) }),
  SPRUCE_DOOR(lazy { Key.key("minecraft:item/spruce_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/spruce_door")) }),
  SPRUCE_FENCE(lazy { Key.key("minecraft:item/spruce_fence") }, lazy {
      Key.key("minecraft:block/spruce_fence_inventory") }, lazy { mapOf() }),
  SPRUCE_FENCE_GATE(lazy { Key.key("minecraft:item/spruce_fence_gate") }, lazy {
      Key.key("minecraft:block/spruce_fence_gate") }, lazy { mapOf() }),
  SPRUCE_HANGING_SIGN(lazy { Key.key("minecraft:item/spruce_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/spruce_hanging_sign")) }),
  SPRUCE_LEAVES(lazy { Key.key("minecraft:item/spruce_leaves") }, lazy {
      Key.key("minecraft:block/spruce_leaves") }, lazy { mapOf() }),
  SPRUCE_LOG(lazy { Key.key("minecraft:item/spruce_log") }, lazy {
      Key.key("minecraft:block/spruce_log") }, lazy { mapOf() }),
  SPRUCE_PLANKS(lazy { Key.key("minecraft:item/spruce_planks") }, lazy {
      Key.key("minecraft:block/spruce_planks") }, lazy { mapOf() }),
  SPRUCE_PRESSURE_PLATE(lazy { Key.key("minecraft:item/spruce_pressure_plate") }, lazy {
      Key.key("minecraft:block/spruce_pressure_plate") }, lazy { mapOf() }),
  SPRUCE_SAPLING(lazy { Key.key("minecraft:item/spruce_sapling") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/spruce_sapling")) }),
  SPRUCE_SIGN(lazy { Key.key("minecraft:item/spruce_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/spruce_sign")) }),
  SPRUCE_SLAB(lazy { Key.key("minecraft:item/spruce_slab") }, lazy {
      Key.key("minecraft:block/spruce_slab") }, lazy { mapOf() }),
  SPRUCE_STAIRS(lazy { Key.key("minecraft:item/spruce_stairs") }, lazy {
      Key.key("minecraft:block/spruce_stairs") }, lazy { mapOf() }),
  SPRUCE_TRAPDOOR(lazy { Key.key("minecraft:item/spruce_trapdoor") }, lazy {
      Key.key("minecraft:block/spruce_trapdoor_bottom") }, lazy { mapOf() }),
  SPRUCE_WOOD(lazy { Key.key("minecraft:item/spruce_wood") }, lazy {
      Key.key("minecraft:block/spruce_wood") }, lazy { mapOf() }),
  SPYGLASS(lazy { Key.key("minecraft:item/spyglass") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/spyglass")) }),
  SQUID_SPAWN_EGG(lazy { Key.key("minecraft:item/squid_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  STICK(lazy { Key.key("minecraft:item/stick") }, lazy { Key.key("minecraft:item/handheld") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/stick")) }),
  STICKY_PISTON(lazy { Key.key("minecraft:item/sticky_piston") }, lazy {
      Key.key("minecraft:block/sticky_piston_inventory") }, lazy { mapOf() }),
  STONE(lazy { Key.key("minecraft:item/stone") }, lazy { Key.key("minecraft:block/stone") }, lazy {
      mapOf() }),
  STONECUTTER(lazy { Key.key("minecraft:item/stonecutter") }, lazy {
      Key.key("minecraft:block/stonecutter") }, lazy { mapOf() }),
  STONE_AXE(lazy { Key.key("minecraft:item/stone_axe") }, lazy { Key.key("minecraft:item/handheld")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/stone_axe")) }),
  STONE_BRICKS(lazy { Key.key("minecraft:item/stone_bricks") }, lazy {
      Key.key("minecraft:block/stone_bricks") }, lazy { mapOf() }),
  STONE_BRICK_SLAB(lazy { Key.key("minecraft:item/stone_brick_slab") }, lazy {
      Key.key("minecraft:block/stone_brick_slab") }, lazy { mapOf() }),
  STONE_BRICK_STAIRS(lazy { Key.key("minecraft:item/stone_brick_stairs") }, lazy {
      Key.key("minecraft:block/stone_brick_stairs") }, lazy { mapOf() }),
  STONE_BRICK_WALL(lazy { Key.key("minecraft:item/stone_brick_wall") }, lazy {
      Key.key("minecraft:block/stone_brick_wall_inventory") }, lazy { mapOf() }),
  STONE_BUTTON(lazy { Key.key("minecraft:item/stone_button") }, lazy {
      Key.key("minecraft:block/stone_button_inventory") }, lazy { mapOf() }),
  STONE_HOE(lazy { Key.key("minecraft:item/stone_hoe") }, lazy { Key.key("minecraft:item/handheld")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/stone_hoe")) }),
  STONE_PICKAXE(lazy { Key.key("minecraft:item/stone_pickaxe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/stone_pickaxe")) }),
  STONE_PRESSURE_PLATE(lazy { Key.key("minecraft:item/stone_pressure_plate") }, lazy {
      Key.key("minecraft:block/stone_pressure_plate") }, lazy { mapOf() }),
  STONE_SHOVEL(lazy { Key.key("minecraft:item/stone_shovel") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/stone_shovel")) }),
  STONE_SLAB(lazy { Key.key("minecraft:item/stone_slab") }, lazy {
      Key.key("minecraft:block/stone_slab") }, lazy { mapOf() }),
  STONE_STAIRS(lazy { Key.key("minecraft:item/stone_stairs") }, lazy {
      Key.key("minecraft:block/stone_stairs") }, lazy { mapOf() }),
  STONE_SWORD(lazy { Key.key("minecraft:item/stone_sword") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/stone_sword")) }),
  STRAY_SPAWN_EGG(lazy { Key.key("minecraft:item/stray_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  STRIDER_SPAWN_EGG(lazy { Key.key("minecraft:item/strider_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  STRING(lazy { Key.key("minecraft:item/string") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/string")) }),
  STRIPPED_ACACIA_LOG(lazy { Key.key("minecraft:item/stripped_acacia_log") }, lazy {
      Key.key("minecraft:block/stripped_acacia_log") }, lazy { mapOf() }),
  STRIPPED_ACACIA_WOOD(lazy { Key.key("minecraft:item/stripped_acacia_wood") }, lazy {
      Key.key("minecraft:block/stripped_acacia_wood") }, lazy { mapOf() }),
  STRIPPED_BAMBOO_BLOCK(lazy { Key.key("minecraft:item/stripped_bamboo_block") }, lazy {
      Key.key("minecraft:block/stripped_bamboo_block") }, lazy { mapOf() }),
  STRIPPED_BIRCH_LOG(lazy { Key.key("minecraft:item/stripped_birch_log") }, lazy {
      Key.key("minecraft:block/stripped_birch_log") }, lazy { mapOf() }),
  STRIPPED_BIRCH_WOOD(lazy { Key.key("minecraft:item/stripped_birch_wood") }, lazy {
      Key.key("minecraft:block/stripped_birch_wood") }, lazy { mapOf() }),
  STRIPPED_CHERRY_LOG(lazy { Key.key("minecraft:item/stripped_cherry_log") }, lazy {
      Key.key("minecraft:block/stripped_cherry_log") }, lazy { mapOf() }),
  STRIPPED_CHERRY_WOOD(lazy { Key.key("minecraft:item/stripped_cherry_wood") }, lazy {
      Key.key("minecraft:block/stripped_cherry_wood") }, lazy { mapOf() }),
  STRIPPED_CRIMSON_HYPHAE(lazy { Key.key("minecraft:item/stripped_crimson_hyphae") }, lazy {
      Key.key("minecraft:block/stripped_crimson_hyphae") }, lazy { mapOf() }),
  STRIPPED_CRIMSON_STEM(lazy { Key.key("minecraft:item/stripped_crimson_stem") }, lazy {
      Key.key("minecraft:block/stripped_crimson_stem") }, lazy { mapOf() }),
  STRIPPED_DARK_OAK_LOG(lazy { Key.key("minecraft:item/stripped_dark_oak_log") }, lazy {
      Key.key("minecraft:block/stripped_dark_oak_log") }, lazy { mapOf() }),
  STRIPPED_DARK_OAK_WOOD(lazy { Key.key("minecraft:item/stripped_dark_oak_wood") }, lazy {
      Key.key("minecraft:block/stripped_dark_oak_wood") }, lazy { mapOf() }),
  STRIPPED_JUNGLE_LOG(lazy { Key.key("minecraft:item/stripped_jungle_log") }, lazy {
      Key.key("minecraft:block/stripped_jungle_log") }, lazy { mapOf() }),
  STRIPPED_JUNGLE_WOOD(lazy { Key.key("minecraft:item/stripped_jungle_wood") }, lazy {
      Key.key("minecraft:block/stripped_jungle_wood") }, lazy { mapOf() }),
  STRIPPED_MANGROVE_LOG(lazy { Key.key("minecraft:item/stripped_mangrove_log") }, lazy {
      Key.key("minecraft:block/stripped_mangrove_log") }, lazy { mapOf() }),
  STRIPPED_MANGROVE_WOOD(lazy { Key.key("minecraft:item/stripped_mangrove_wood") }, lazy {
      Key.key("minecraft:block/stripped_mangrove_wood") }, lazy { mapOf() }),
  STRIPPED_OAK_LOG(lazy { Key.key("minecraft:item/stripped_oak_log") }, lazy {
      Key.key("minecraft:block/stripped_oak_log") }, lazy { mapOf() }),
  STRIPPED_OAK_WOOD(lazy { Key.key("minecraft:item/stripped_oak_wood") }, lazy {
      Key.key("minecraft:block/stripped_oak_wood") }, lazy { mapOf() }),
  STRIPPED_SPRUCE_LOG(lazy { Key.key("minecraft:item/stripped_spruce_log") }, lazy {
      Key.key("minecraft:block/stripped_spruce_log") }, lazy { mapOf() }),
  STRIPPED_SPRUCE_WOOD(lazy { Key.key("minecraft:item/stripped_spruce_wood") }, lazy {
      Key.key("minecraft:block/stripped_spruce_wood") }, lazy { mapOf() }),
  STRIPPED_WARPED_HYPHAE(lazy { Key.key("minecraft:item/stripped_warped_hyphae") }, lazy {
      Key.key("minecraft:block/stripped_warped_hyphae") }, lazy { mapOf() }),
  STRIPPED_WARPED_STEM(lazy { Key.key("minecraft:item/stripped_warped_stem") }, lazy {
      Key.key("minecraft:block/stripped_warped_stem") }, lazy { mapOf() }),
  STRUCTURE_BLOCK(lazy { Key.key("minecraft:item/structure_block") }, lazy {
      Key.key("minecraft:block/structure_block") }, lazy { mapOf() }),
  STRUCTURE_VOID(lazy { Key.key("minecraft:item/structure_void") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/structure_void")) }),
  SUGAR(lazy { Key.key("minecraft:item/sugar") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/sugar")) }),
  SUGAR_CANE(lazy { Key.key("minecraft:item/sugar_cane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/sugar_cane")) }),
  SUNFLOWER(lazy { Key.key("minecraft:item/sunflower") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:block/sunflower_front")) }),
  SUSPICIOUS_GRAVEL(lazy { Key.key("minecraft:item/suspicious_gravel") }, lazy {
      Key.key("minecraft:block/suspicious_gravel_0") }, lazy { mapOf() }),
  SUSPICIOUS_SAND(lazy { Key.key("minecraft:item/suspicious_sand") }, lazy {
      Key.key("minecraft:block/suspicious_sand_0") }, lazy { mapOf() }),
  SUSPICIOUS_STEW(lazy { Key.key("minecraft:item/suspicious_stew") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/suspicious_stew")) }),
  SWEET_BERRIES(lazy { Key.key("minecraft:item/sweet_berries") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/sweet_berries")) }),
  TADPOLE_BUCKET(lazy { Key.key("minecraft:item/tadpole_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/tadpole_bucket")) }),
  TADPOLE_SPAWN_EGG(lazy { Key.key("minecraft:item/tadpole_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  TALL_GRASS(lazy { Key.key("minecraft:item/tall_grass") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/tall_grass_top")) }),
  TARGET(lazy { Key.key("minecraft:item/target") }, lazy { Key.key("minecraft:block/target") }, lazy
      { mapOf() }),
  TERRACOTTA(lazy { Key.key("minecraft:item/terracotta") }, lazy {
      Key.key("minecraft:block/terracotta") }, lazy { mapOf() }),
  TIDE_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/tide_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/tide_armor_trim_smithing_template")) }),
  TINTED_GLASS(lazy { Key.key("minecraft:item/tinted_glass") }, lazy {
      Key.key("minecraft:block/tinted_glass") }, lazy { mapOf() }),
  TIPPED_ARROW(lazy { Key.key("minecraft:item/tipped_arrow") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/tipped_arrow_head"), "layer1" to
      Key.key("minecraft:item/tipped_arrow_base")) }),
  TNT(lazy { Key.key("minecraft:item/tnt") }, lazy { Key.key("minecraft:block/tnt") }, lazy {
      mapOf() }),
  TNT_MINECART(lazy { Key.key("minecraft:item/tnt_minecart") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/tnt_minecart")) }),
  TORCH(lazy { Key.key("minecraft:item/torch") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:block/torch")) }),
  TORCHFLOWER(lazy { Key.key("minecraft:item/torchflower") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/torchflower")) }),
  TORCHFLOWER_SEEDS(lazy { Key.key("minecraft:item/torchflower_seeds") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/torchflower_seeds")) }),
  TOTEM_OF_UNDYING(lazy { Key.key("minecraft:item/totem_of_undying") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/totem_of_undying")) }),
  TRADER_LLAMA_SPAWN_EGG(lazy { Key.key("minecraft:item/trader_llama_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  TRAPPED_CHEST(lazy { Key.key("minecraft:item/trapped_chest") }, lazy {
      Key.key("minecraft:item/chest") }, lazy { mapOf() }),
  TRIAL_KEY(lazy { Key.key("minecraft:item/trial_key") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/trial_key")) }),
  TRIAL_SPAWNER(lazy { Key.key("minecraft:item/trial_spawner") }, lazy {
      Key.key("minecraft:block/trial_spawner") }, lazy { mapOf() }),
  TRIDENT(lazy { Key.key("minecraft:item/trident") }, lazy { Key.key("minecraft:item/generated") },
      lazy { mapOf("layer0" to Key.key("minecraft:item/trident")) }),
  TRIPWIRE_HOOK(lazy { Key.key("minecraft:item/tripwire_hook") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/tripwire_hook")) }),
  TROPICAL_FISH(lazy { Key.key("minecraft:item/tropical_fish") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/tropical_fish")) }),
  TROPICAL_FISH_BUCKET(lazy { Key.key("minecraft:item/tropical_fish_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/tropical_fish_bucket")) }),
  TROPICAL_FISH_SPAWN_EGG(lazy { Key.key("minecraft:item/tropical_fish_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  TUBE_CORAL(lazy { Key.key("minecraft:item/tube_coral") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/tube_coral")) }),
  TUBE_CORAL_BLOCK(lazy { Key.key("minecraft:item/tube_coral_block") }, lazy {
      Key.key("minecraft:block/tube_coral_block") }, lazy { mapOf() }),
  TUBE_CORAL_FAN(lazy { Key.key("minecraft:item/tube_coral_fan") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/tube_coral_fan")) }),
  TUFF(lazy { Key.key("minecraft:item/tuff") }, lazy { Key.key("minecraft:block/tuff") }, lazy {
      mapOf() }),
  TUFF_BRICKS(lazy { Key.key("minecraft:item/tuff_bricks") }, lazy {
      Key.key("minecraft:block/tuff_bricks") }, lazy { mapOf() }),
  TUFF_BRICK_SLAB(lazy { Key.key("minecraft:item/tuff_brick_slab") }, lazy {
      Key.key("minecraft:block/tuff_brick_slab") }, lazy { mapOf() }),
  TUFF_BRICK_STAIRS(lazy { Key.key("minecraft:item/tuff_brick_stairs") }, lazy {
      Key.key("minecraft:block/tuff_brick_stairs") }, lazy { mapOf() }),
  TUFF_BRICK_WALL(lazy { Key.key("minecraft:item/tuff_brick_wall") }, lazy {
      Key.key("minecraft:block/tuff_brick_wall_inventory") }, lazy { mapOf() }),
  TUFF_SLAB(lazy { Key.key("minecraft:item/tuff_slab") }, lazy {
      Key.key("minecraft:block/tuff_slab") }, lazy { mapOf() }),
  TUFF_STAIRS(lazy { Key.key("minecraft:item/tuff_stairs") }, lazy {
      Key.key("minecraft:block/tuff_stairs") }, lazy { mapOf() }),
  TUFF_WALL(lazy { Key.key("minecraft:item/tuff_wall") }, lazy {
      Key.key("minecraft:block/tuff_wall_inventory") }, lazy { mapOf() }),
  TURTLE_EGG(lazy { Key.key("minecraft:item/turtle_egg") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/turtle_egg")) }),
  TURTLE_HELMET(lazy { Key.key("minecraft:item/turtle_helmet") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/turtle_helmet")) }),
  TURTLE_SCUTE(lazy { Key.key("minecraft:item/turtle_scute") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/turtle_scute")) }),
  TURTLE_SPAWN_EGG(lazy { Key.key("minecraft:item/turtle_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  TWISTING_VINES(lazy { Key.key("minecraft:item/twisting_vines") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/twisting_vines_plant")) }),
  VAULT(lazy { Key.key("minecraft:item/vault") }, lazy { Key.key("minecraft:block/vault") }, lazy {
      mapOf() }),
  VERDANT_FROGLIGHT(lazy { Key.key("minecraft:item/verdant_froglight") }, lazy {
      Key.key("minecraft:block/verdant_froglight") }, lazy { mapOf() }),
  VEX_ARMOR_TRIM_SMITHING_TEMPLATE(lazy { Key.key("minecraft:item/vex_armor_trim_smithing_template")
      }, lazy { Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/vex_armor_trim_smithing_template")) }),
  VEX_SPAWN_EGG(lazy { Key.key("minecraft:item/vex_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  VILLAGER_SPAWN_EGG(lazy { Key.key("minecraft:item/villager_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  VINDICATOR_SPAWN_EGG(lazy { Key.key("minecraft:item/vindicator_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  VINE(lazy { Key.key("minecraft:item/vine") }, lazy { Key.key("minecraft:item/generated") }, lazy {
      mapOf("layer0" to Key.key("minecraft:block/vine")) }),
  WANDERING_TRADER_SPAWN_EGG(lazy { Key.key("minecraft:item/wandering_trader_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  WARDEN_SPAWN_EGG(lazy { Key.key("minecraft:item/warden_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  WARD_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/ward_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/ward_armor_trim_smithing_template")) }),
  WARPED_BUTTON(lazy { Key.key("minecraft:item/warped_button") }, lazy {
      Key.key("minecraft:block/warped_button_inventory") }, lazy { mapOf() }),
  WARPED_DOOR(lazy { Key.key("minecraft:item/warped_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/warped_door")) }),
  WARPED_FENCE(lazy { Key.key("minecraft:item/warped_fence") }, lazy {
      Key.key("minecraft:block/warped_fence_inventory") }, lazy { mapOf() }),
  WARPED_FENCE_GATE(lazy { Key.key("minecraft:item/warped_fence_gate") }, lazy {
      Key.key("minecraft:block/warped_fence_gate") }, lazy { mapOf() }),
  WARPED_FUNGUS(lazy { Key.key("minecraft:item/warped_fungus") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/warped_fungus")) }),
  WARPED_FUNGUS_ON_A_STICK(lazy { Key.key("minecraft:item/warped_fungus_on_a_stick") }, lazy {
      Key.key("minecraft:item/handheld_rod") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/warped_fungus_on_a_stick")) }),
  WARPED_HANGING_SIGN(lazy { Key.key("minecraft:item/warped_hanging_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/warped_hanging_sign")) }),
  WARPED_HYPHAE(lazy { Key.key("minecraft:item/warped_hyphae") }, lazy {
      Key.key("minecraft:block/warped_hyphae") }, lazy { mapOf() }),
  WARPED_NYLIUM(lazy { Key.key("minecraft:item/warped_nylium") }, lazy {
      Key.key("minecraft:block/warped_nylium") }, lazy { mapOf() }),
  WARPED_PLANKS(lazy { Key.key("minecraft:item/warped_planks") }, lazy {
      Key.key("minecraft:block/warped_planks") }, lazy { mapOf() }),
  WARPED_PRESSURE_PLATE(lazy { Key.key("minecraft:item/warped_pressure_plate") }, lazy {
      Key.key("minecraft:block/warped_pressure_plate") }, lazy { mapOf() }),
  WARPED_ROOTS(lazy { Key.key("minecraft:item/warped_roots") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/warped_roots")) }),
  WARPED_SIGN(lazy { Key.key("minecraft:item/warped_sign") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/warped_sign")) }),
  WARPED_SLAB(lazy { Key.key("minecraft:item/warped_slab") }, lazy {
      Key.key("minecraft:block/warped_slab") }, lazy { mapOf() }),
  WARPED_STAIRS(lazy { Key.key("minecraft:item/warped_stairs") }, lazy {
      Key.key("minecraft:block/warped_stairs") }, lazy { mapOf() }),
  WARPED_STEM(lazy { Key.key("minecraft:item/warped_stem") }, lazy {
      Key.key("minecraft:block/warped_stem") }, lazy { mapOf() }),
  WARPED_TRAPDOOR(lazy { Key.key("minecraft:item/warped_trapdoor") }, lazy {
      Key.key("minecraft:block/warped_trapdoor_bottom") }, lazy { mapOf() }),
  WARPED_WART_BLOCK(lazy { Key.key("minecraft:item/warped_wart_block") }, lazy {
      Key.key("minecraft:block/warped_wart_block") }, lazy { mapOf() }),
  WATER_BUCKET(lazy { Key.key("minecraft:item/water_bucket") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/water_bucket")) }),
  WAXED_CHISELED_COPPER(lazy { Key.key("minecraft:item/waxed_chiseled_copper") }, lazy {
      Key.key("minecraft:block/chiseled_copper") }, lazy { mapOf() }),
  WAXED_COPPER_BLOCK(lazy { Key.key("minecraft:item/waxed_copper_block") }, lazy {
      Key.key("minecraft:block/copper_block") }, lazy { mapOf() }),
  WAXED_COPPER_BULB(lazy { Key.key("minecraft:item/waxed_copper_bulb") }, lazy {
      Key.key("minecraft:item/copper_bulb") }, lazy { mapOf() }),
  WAXED_COPPER_DOOR(lazy { Key.key("minecraft:item/waxed_copper_door") }, lazy {
      Key.key("minecraft:item/copper_door") }, lazy { mapOf() }),
  WAXED_COPPER_GRATE(lazy { Key.key("minecraft:item/waxed_copper_grate") }, lazy {
      Key.key("minecraft:block/copper_grate") }, lazy { mapOf() }),
  WAXED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/waxed_copper_trapdoor") }, lazy {
      Key.key("minecraft:item/copper_trapdoor") }, lazy { mapOf() }),
  WAXED_CUT_COPPER(lazy { Key.key("minecraft:item/waxed_cut_copper") }, lazy {
      Key.key("minecraft:block/cut_copper") }, lazy { mapOf() }),
  WAXED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:item/waxed_cut_copper_slab") }, lazy {
      Key.key("minecraft:block/cut_copper_slab") }, lazy { mapOf() }),
  WAXED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:item/waxed_cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/cut_copper_stairs") }, lazy { mapOf() }),
  WAXED_EXPOSED_CHISELED_COPPER(lazy { Key.key("minecraft:item/waxed_exposed_chiseled_copper") },
      lazy { Key.key("minecraft:block/exposed_chiseled_copper") }, lazy { mapOf() }),
  WAXED_EXPOSED_COPPER(lazy { Key.key("minecraft:item/waxed_exposed_copper") }, lazy {
      Key.key("minecraft:block/exposed_copper") }, lazy { mapOf() }),
  WAXED_EXPOSED_COPPER_BULB(lazy { Key.key("minecraft:item/waxed_exposed_copper_bulb") }, lazy {
      Key.key("minecraft:item/exposed_copper_bulb") }, lazy { mapOf() }),
  WAXED_EXPOSED_COPPER_DOOR(lazy { Key.key("minecraft:item/waxed_exposed_copper_door") }, lazy {
      Key.key("minecraft:item/exposed_copper_door") }, lazy { mapOf() }),
  WAXED_EXPOSED_COPPER_GRATE(lazy { Key.key("minecraft:item/waxed_exposed_copper_grate") }, lazy {
      Key.key("minecraft:block/exposed_copper_grate") }, lazy { mapOf() }),
  WAXED_EXPOSED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/waxed_exposed_copper_trapdoor") },
      lazy { Key.key("minecraft:item/exposed_copper_trapdoor") }, lazy { mapOf() }),
  WAXED_EXPOSED_CUT_COPPER(lazy { Key.key("minecraft:item/waxed_exposed_cut_copper") }, lazy {
      Key.key("minecraft:block/exposed_cut_copper") }, lazy { mapOf() }),
  WAXED_EXPOSED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:item/waxed_exposed_cut_copper_slab") },
      lazy { Key.key("minecraft:block/exposed_cut_copper_slab") }, lazy { mapOf() }),
  WAXED_EXPOSED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:item/waxed_exposed_cut_copper_stairs")
      }, lazy { Key.key("minecraft:block/exposed_cut_copper_stairs") }, lazy { mapOf() }),
  WAXED_OXIDIZED_CHISELED_COPPER(lazy { Key.key("minecraft:item/waxed_oxidized_chiseled_copper") },
      lazy { Key.key("minecraft:block/oxidized_chiseled_copper") }, lazy { mapOf() }),
  WAXED_OXIDIZED_COPPER(lazy { Key.key("minecraft:item/waxed_oxidized_copper") }, lazy {
      Key.key("minecraft:block/oxidized_copper") }, lazy { mapOf() }),
  WAXED_OXIDIZED_COPPER_BULB(lazy { Key.key("minecraft:item/waxed_oxidized_copper_bulb") }, lazy {
      Key.key("minecraft:item/oxidized_copper_bulb") }, lazy { mapOf() }),
  WAXED_OXIDIZED_COPPER_DOOR(lazy { Key.key("minecraft:item/waxed_oxidized_copper_door") }, lazy {
      Key.key("minecraft:item/oxidized_copper_door") }, lazy { mapOf() }),
  WAXED_OXIDIZED_COPPER_GRATE(lazy { Key.key("minecraft:item/waxed_oxidized_copper_grate") }, lazy {
      Key.key("minecraft:block/oxidized_copper_grate") }, lazy { mapOf() }),
  WAXED_OXIDIZED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/waxed_oxidized_copper_trapdoor") },
      lazy { Key.key("minecraft:item/oxidized_copper_trapdoor") }, lazy { mapOf() }),
  WAXED_OXIDIZED_CUT_COPPER(lazy { Key.key("minecraft:item/waxed_oxidized_cut_copper") }, lazy {
      Key.key("minecraft:block/oxidized_cut_copper") }, lazy { mapOf() }),
  WAXED_OXIDIZED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:item/waxed_oxidized_cut_copper_slab") },
      lazy { Key.key("minecraft:block/oxidized_cut_copper_slab") }, lazy { mapOf() }),
  WAXED_OXIDIZED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:item/waxed_oxidized_cut_copper_stairs")
      }, lazy { Key.key("minecraft:block/oxidized_cut_copper_stairs") }, lazy { mapOf() }),
  WAXED_WEATHERED_CHISELED_COPPER(lazy { Key.key("minecraft:item/waxed_weathered_chiseled_copper")
      }, lazy { Key.key("minecraft:block/weathered_chiseled_copper") }, lazy { mapOf() }),
  WAXED_WEATHERED_COPPER(lazy { Key.key("minecraft:item/waxed_weathered_copper") }, lazy {
      Key.key("minecraft:block/weathered_copper") }, lazy { mapOf() }),
  WAXED_WEATHERED_COPPER_BULB(lazy { Key.key("minecraft:item/waxed_weathered_copper_bulb") }, lazy {
      Key.key("minecraft:item/weathered_copper_bulb") }, lazy { mapOf() }),
  WAXED_WEATHERED_COPPER_DOOR(lazy { Key.key("minecraft:item/waxed_weathered_copper_door") }, lazy {
      Key.key("minecraft:item/weathered_copper_door") }, lazy { mapOf() }),
  WAXED_WEATHERED_COPPER_GRATE(lazy { Key.key("minecraft:item/waxed_weathered_copper_grate") }, lazy
      { Key.key("minecraft:block/weathered_copper_grate") }, lazy { mapOf() }),
  WAXED_WEATHERED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/waxed_weathered_copper_trapdoor")
      }, lazy { Key.key("minecraft:item/weathered_copper_trapdoor") }, lazy { mapOf() }),
  WAXED_WEATHERED_CUT_COPPER(lazy { Key.key("minecraft:item/waxed_weathered_cut_copper") }, lazy {
      Key.key("minecraft:block/weathered_cut_copper") }, lazy { mapOf() }),
  WAXED_WEATHERED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:item/waxed_weathered_cut_copper_slab")
      }, lazy { Key.key("minecraft:block/weathered_cut_copper_slab") }, lazy { mapOf() }),
  WAXED_WEATHERED_CUT_COPPER_STAIRS(lazy {
      Key.key("minecraft:item/waxed_weathered_cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/weathered_cut_copper_stairs") }, lazy { mapOf() }),
  WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/wayfinder_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wayfinder_armor_trim_smithing_template")) }),
  WEATHERED_CHISELED_COPPER(lazy { Key.key("minecraft:item/weathered_chiseled_copper") }, lazy {
      Key.key("minecraft:block/weathered_chiseled_copper") }, lazy { mapOf() }),
  WEATHERED_COPPER(lazy { Key.key("minecraft:item/weathered_copper") }, lazy {
      Key.key("minecraft:block/weathered_copper") }, lazy { mapOf() }),
  WEATHERED_COPPER_BULB(lazy { Key.key("minecraft:item/weathered_copper_bulb") }, lazy {
      Key.key("minecraft:block/weathered_copper_bulb") }, lazy { mapOf() }),
  WEATHERED_COPPER_DOOR(lazy { Key.key("minecraft:item/weathered_copper_door") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/weathered_copper_door")) }),
  WEATHERED_COPPER_GRATE(lazy { Key.key("minecraft:item/weathered_copper_grate") }, lazy {
      Key.key("minecraft:block/weathered_copper_grate") }, lazy { mapOf() }),
  WEATHERED_COPPER_TRAPDOOR(lazy { Key.key("minecraft:item/weathered_copper_trapdoor") }, lazy {
      Key.key("minecraft:block/weathered_copper_trapdoor_bottom") }, lazy { mapOf() }),
  WEATHERED_CUT_COPPER(lazy { Key.key("minecraft:item/weathered_cut_copper") }, lazy {
      Key.key("minecraft:block/weathered_cut_copper") }, lazy { mapOf() }),
  WEATHERED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:item/weathered_cut_copper_slab") }, lazy {
      Key.key("minecraft:block/weathered_cut_copper_slab") }, lazy { mapOf() }),
  WEATHERED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:item/weathered_cut_copper_stairs") }, lazy {
      Key.key("minecraft:block/weathered_cut_copper_stairs") }, lazy { mapOf() }),
  WEEPING_VINES(lazy { Key.key("minecraft:item/weeping_vines") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/weeping_vines_plant")) }),
  WET_SPONGE(lazy { Key.key("minecraft:item/wet_sponge") }, lazy {
      Key.key("minecraft:block/wet_sponge") }, lazy { mapOf() }),
  WHEAT(lazy { Key.key("minecraft:item/wheat") }, lazy { Key.key("minecraft:item/generated") }, lazy
      { mapOf("layer0" to Key.key("minecraft:item/wheat")) }),
  WHEAT_SEEDS(lazy { Key.key("minecraft:item/wheat_seeds") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wheat_seeds")) }),
  WHITE_BANNER(lazy { Key.key("minecraft:item/white_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  WHITE_BED(lazy { Key.key("minecraft:item/white_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/white_wool")) }),
  WHITE_CANDLE(lazy { Key.key("minecraft:item/white_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/white_candle")) }),
  WHITE_CARPET(lazy { Key.key("minecraft:item/white_carpet") }, lazy {
      Key.key("minecraft:block/white_carpet") }, lazy { mapOf() }),
  WHITE_CONCRETE(lazy { Key.key("minecraft:item/white_concrete") }, lazy {
      Key.key("minecraft:block/white_concrete") }, lazy { mapOf() }),
  WHITE_CONCRETE_POWDER(lazy { Key.key("minecraft:item/white_concrete_powder") }, lazy {
      Key.key("minecraft:block/white_concrete_powder") }, lazy { mapOf() }),
  WHITE_DYE(lazy { Key.key("minecraft:item/white_dye") }, lazy { Key.key("minecraft:item/generated")
      }, lazy { mapOf("layer0" to Key.key("minecraft:item/white_dye")) }),
  WHITE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/white_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/white_glazed_terracotta") }, lazy { mapOf() }),
  WHITE_SHULKER_BOX(lazy { Key.key("minecraft:item/white_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/white_shulker_box")) }),
  WHITE_STAINED_GLASS(lazy { Key.key("minecraft:item/white_stained_glass") }, lazy {
      Key.key("minecraft:block/white_stained_glass") }, lazy { mapOf() }),
  WHITE_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/white_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/white_stained_glass")) }),
  WHITE_TERRACOTTA(lazy { Key.key("minecraft:item/white_terracotta") }, lazy {
      Key.key("minecraft:block/white_terracotta") }, lazy { mapOf() }),
  WHITE_TULIP(lazy { Key.key("minecraft:item/white_tulip") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/white_tulip")) }),
  WHITE_WOOL(lazy { Key.key("minecraft:item/white_wool") }, lazy {
      Key.key("minecraft:block/white_wool") }, lazy { mapOf() }),
  WILD_ARMOR_TRIM_SMITHING_TEMPLATE(lazy {
      Key.key("minecraft:item/wild_armor_trim_smithing_template") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wild_armor_trim_smithing_template")) }),
  WIND_CHARGE(lazy { Key.key("minecraft:item/wind_charge") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wind_charge")) }),
  WITCH_SPAWN_EGG(lazy { Key.key("minecraft:item/witch_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  WITHER_ROSE(lazy { Key.key("minecraft:item/wither_rose") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/wither_rose")) }),
  WITHER_SKELETON_SKULL(lazy { Key.key("minecraft:item/wither_skeleton_skull") }, lazy {
      Key.key("minecraft:item/template_skull") }, lazy { mapOf() }),
  WITHER_SKELETON_SPAWN_EGG(lazy { Key.key("minecraft:item/wither_skeleton_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  WITHER_SPAWN_EGG(lazy { Key.key("minecraft:item/wither_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  WOLF_ARMOR(lazy { Key.key("minecraft:item/wolf_armor") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wolf_armor"), "layer1" to
      Key.key("minecraft:item/wolf_armor_overlay")) }),
  WOLF_SPAWN_EGG(lazy { Key.key("minecraft:item/wolf_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  WOODEN_AXE(lazy { Key.key("minecraft:item/wooden_axe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wooden_axe")) }),
  WOODEN_HOE(lazy { Key.key("minecraft:item/wooden_hoe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wooden_hoe")) }),
  WOODEN_PICKAXE(lazy { Key.key("minecraft:item/wooden_pickaxe") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wooden_pickaxe")) }),
  WOODEN_SHOVEL(lazy { Key.key("minecraft:item/wooden_shovel") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wooden_shovel")) }),
  WOODEN_SWORD(lazy { Key.key("minecraft:item/wooden_sword") }, lazy {
      Key.key("minecraft:item/handheld") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/wooden_sword")) }),
  WRITABLE_BOOK(lazy { Key.key("minecraft:item/writable_book") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/writable_book")) }),
  WRITTEN_BOOK(lazy { Key.key("minecraft:item/written_book") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/written_book")) }),
  YELLOW_BANNER(lazy { Key.key("minecraft:item/yellow_banner") }, lazy {
      Key.key("minecraft:item/template_banner") }, lazy { mapOf() }),
  YELLOW_BED(lazy { Key.key("minecraft:item/yellow_bed") }, lazy {
      Key.key("minecraft:item/template_bed") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/yellow_wool")) }),
  YELLOW_CANDLE(lazy { Key.key("minecraft:item/yellow_candle") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/yellow_candle")) }),
  YELLOW_CARPET(lazy { Key.key("minecraft:item/yellow_carpet") }, lazy {
      Key.key("minecraft:block/yellow_carpet") }, lazy { mapOf() }),
  YELLOW_CONCRETE(lazy { Key.key("minecraft:item/yellow_concrete") }, lazy {
      Key.key("minecraft:block/yellow_concrete") }, lazy { mapOf() }),
  YELLOW_CONCRETE_POWDER(lazy { Key.key("minecraft:item/yellow_concrete_powder") }, lazy {
      Key.key("minecraft:block/yellow_concrete_powder") }, lazy { mapOf() }),
  YELLOW_DYE(lazy { Key.key("minecraft:item/yellow_dye") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:item/yellow_dye")) }),
  YELLOW_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:item/yellow_glazed_terracotta") }, lazy {
      Key.key("minecraft:block/yellow_glazed_terracotta") }, lazy { mapOf() }),
  YELLOW_SHULKER_BOX(lazy { Key.key("minecraft:item/yellow_shulker_box") }, lazy {
      Key.key("minecraft:item/template_shulker_box") }, lazy { mapOf("particle" to
      Key.key("minecraft:block/yellow_shulker_box")) }),
  YELLOW_STAINED_GLASS(lazy { Key.key("minecraft:item/yellow_stained_glass") }, lazy {
      Key.key("minecraft:block/yellow_stained_glass") }, lazy { mapOf() }),
  YELLOW_STAINED_GLASS_PANE(lazy { Key.key("minecraft:item/yellow_stained_glass_pane") }, lazy {
      Key.key("minecraft:item/generated") }, lazy { mapOf("layer0" to
      Key.key("minecraft:block/yellow_stained_glass")) }),
  YELLOW_TERRACOTTA(lazy { Key.key("minecraft:item/yellow_terracotta") }, lazy {
      Key.key("minecraft:block/yellow_terracotta") }, lazy { mapOf() }),
  YELLOW_WOOL(lazy { Key.key("minecraft:item/yellow_wool") }, lazy {
      Key.key("minecraft:block/yellow_wool") }, lazy { mapOf() }),
  ZOGLIN_SPAWN_EGG(lazy { Key.key("minecraft:item/zoglin_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ZOMBIE_HEAD(lazy { Key.key("minecraft:item/zombie_head") }, lazy {
      Key.key("minecraft:item/template_skull") }, lazy { mapOf() }),
  ZOMBIE_HORSE_SPAWN_EGG(lazy { Key.key("minecraft:item/zombie_horse_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ZOMBIE_SPAWN_EGG(lazy { Key.key("minecraft:item/zombie_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ZOMBIE_VILLAGER_SPAWN_EGG(lazy { Key.key("minecraft:item/zombie_villager_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ZOMBIFIED_PIGLIN_SPAWN_EGG(lazy { Key.key("minecraft:item/zombified_piglin_spawn_egg") }, lazy {
      Key.key("minecraft:item/template_spawn_egg") }, lazy { mapOf() }),
  ;

  public fun toGeneric(): SolidMaterial = SolidMaterial(key.value, parent.value, textures.value)
}
