package io.github.solid.resourcepack.material

import kotlin.Lazy
import kotlin.String
import kotlin.collections.List
import net.kyori.adventure.key.Key

public enum class SolidBlockMaterialParent(
  public val key: Lazy<Key>,
  public val textureIds: Lazy<List<String>>,
) {
  BUTTON(lazy { Key.key("minecraft:block/button") }, lazy { listOf("texture") }),
  TEMPLATE_FENCE_GATE(lazy { Key.key("minecraft:block/template_fence_gate") }, lazy {
      listOf("texture") }),
  LEAVES(lazy { Key.key("minecraft:block/leaves") }, lazy { listOf("all") }),
  CUBE_COLUMN(lazy { Key.key("minecraft:block/cube_column") }, lazy { listOf("end", "side") }),
  CUBE_ALL(lazy { Key.key("minecraft:block/cube_all") }, lazy { listOf("all") }),
  PRESSURE_PLATE_UP(lazy { Key.key("minecraft:block/pressure_plate_up") }, lazy { listOf("texture")
      }),
  CROSS(lazy { Key.key("minecraft:block/cross") }, lazy { listOf("cross") }),
  SLAB(lazy { Key.key("minecraft:block/slab") }, lazy { listOf("bottom", "side", "top") }),
  STAIRS(lazy { Key.key("minecraft:block/stairs") }, lazy { listOf("bottom", "side", "top") }),
  RAIL_FLAT(lazy { Key.key("minecraft:block/rail_flat") }, lazy { listOf("rail") }),
  TEMPLATE_ANVIL(lazy { Key.key("minecraft:block/template_anvil") }, lazy { listOf("top") }),
  STEM_FRUIT(lazy { Key.key("minecraft:block/stem_fruit") }, lazy { listOf("stem", "upperstem") }),
  TEMPLATE_AZALEA(lazy { Key.key("minecraft:block/template_azalea") }, lazy { listOf("side", "top")
      }),
  TEMPLATE_CUSTOM_FENCE_GATE(lazy { Key.key("minecraft:block/template_custom_fence_gate") }, lazy {
      listOf("texture", "particle") }),
  TINTED_CROSS(lazy { Key.key("minecraft:block/tinted_cross") }, lazy { listOf("cross") }),
  CUBE_BOTTOM_TOP(lazy { Key.key("minecraft:block/cube_bottom_top") }, lazy { listOf("bottom",
      "side", "top") }),
  BLOCK(lazy { Key.key("minecraft:block/block") }, lazy { listOf("bottom", "top", "side", "saw",
      "particle") }),
  ORIENTABLE_WITH_BOTTOM(lazy { Key.key("minecraft:block/orientable_with_bottom") }, lazy {
      listOf("bottom", "front", "side", "top") }),
  TEMPLATE_CAKE_WITH_CANDLE(lazy { Key.key("minecraft:block/template_cake_with_candle") }, lazy {
      listOf("bottom", "candle", "side", "top", "particle") }),
  CARPET(lazy { Key.key("minecraft:block/carpet") }, lazy { listOf("wool") }),
  TEMPLATE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/template_glazed_terracotta") }, lazy {
      listOf("pattern") }),
  ORIENTABLE(lazy { Key.key("minecraft:block/orientable") }, lazy { listOf("front", "side", "top")
      }),
  CORAL_FAN(lazy { Key.key("minecraft:block/coral_fan") }, lazy { listOf("fan") }),
  CORAL_WALL_FAN(lazy { Key.key("minecraft:block/coral_wall_fan") }, lazy { listOf("fan") }),
  TEMPLATE_SINGLE_FACE(lazy { Key.key("minecraft:block/template_single_face") }, lazy {
      listOf("texture") }),
  TEMPLATE_CAMPFIRE(lazy { Key.key("minecraft:block/template_campfire") }, lazy { listOf("fire",
      "lit_log") }),
  CUBE(lazy { Key.key("minecraft:block/cube") }, lazy { listOf("down", "east", "north", "south",
      "up", "west", "particle") }),
  TEMPLATE_COMMAND_BLOCK(lazy { Key.key("minecraft:block/template_command_block") }, lazy {
      listOf("back", "front", "side") }),
  TEMPLATE_CHORUS_FLOWER(lazy { Key.key("minecraft:block/template_chorus_flower") }, lazy {
      listOf("texture") }),
  TEMPLATE_DAYLIGHT_DETECTOR(lazy { Key.key("minecraft:block/template_daylight_detector") }, lazy {
      listOf("side", "top") }),
  TEMPLATE_FARMLAND(lazy { Key.key("minecraft:block/template_farmland") }, lazy { listOf("dirt",
      "top") }),
  TEMPLATE_ITEM_FRAME(lazy { Key.key("minecraft:block/template_item_frame") }, lazy { listOf("wood",
      "back", "particle") }),
  CUBE_DIRECTIONAL(lazy { Key.key("minecraft:block/cube_directional") }, lazy { listOf("down",
      "east", "north", "south", "up", "west", "particle") }),
  CUBE_TOP(lazy { Key.key("minecraft:block/cube_top") }, lazy { listOf("side", "top") }),
  TEMPLATE_LANTERN(lazy { Key.key("minecraft:block/template_lantern") }, lazy { listOf("lantern")
      }),
  TEMPLATE_CAULDRON_FULL(lazy { Key.key("minecraft:block/template_cauldron_full") }, lazy {
      listOf("bottom", "content", "inside", "side", "top", "particle") }),
  TEMPLATE_PISTON(lazy { Key.key("minecraft:block/template_piston") }, lazy { listOf("bottom",
      "platform", "side") }),
  TEMPLATE_PISTON_HEAD(lazy { Key.key("minecraft:block/template_piston_head") }, lazy {
      listOf("platform", "side", "unsticky") }),
  FLOWER_POT_CROSS(lazy { Key.key("minecraft:block/flower_pot_cross") }, lazy { listOf("plant") }),
  TEMPLATE_POTTED_AZALEA_BUSH(lazy { Key.key("minecraft:block/template_potted_azalea_bush") }, lazy
      { listOf("plant", "side", "top") }),
  TINTED_FLOWER_POT_CROSS(lazy { Key.key("minecraft:block/tinted_flower_pot_cross") }, lazy {
      listOf("plant") }),
  TEMPLATE_TORCH(lazy { Key.key("minecraft:block/template_torch") }, lazy { listOf("torch") }),
  TEMPLATE_TORCH_WALL(lazy { Key.key("minecraft:block/template_torch_wall") }, lazy {
      listOf("torch") }),
  TEMPLATE_SCULK_SHRIEKER(lazy { Key.key("minecraft:block/template_sculk_shrieker") }, lazy {
      listOf("bottom", "inner_top", "side", "top", "particle") }),
  TEMPLATE_SEAGRASS(lazy { Key.key("minecraft:block/template_seagrass") }, lazy { listOf("texture")
      }),
  CUBE_ALL_INNER_FACES(lazy { Key.key("minecraft:block/cube_all_inner_faces") }, lazy {
      listOf("all") }),
  CUBE_BOTTOM_TOP_INNER_FACES(lazy { Key.key("minecraft:block/cube_bottom_top_inner_faces") }, lazy
      { listOf("bottom", "side", "top") }),
  TEMPLATE_TURTLE_EGG(lazy { Key.key("minecraft:block/template_turtle_egg") }, lazy { listOf("all")
      }),
  TEMPLATE_VAULT(lazy { Key.key("minecraft:block/template_vault") }, lazy { listOf("bottom",
      "front", "side", "top") }),
  ACACIA_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/acacia_button_inventory") }, lazy {
      listOf() }),
  ACACIA_FENCE_INVENTORY(lazy { Key.key("minecraft:block/acacia_fence_inventory") }, lazy { listOf()
      }),
  ACACIA_FENCE_GATE(lazy { Key.key("minecraft:block/acacia_fence_gate") }, lazy { listOf() }),
  ACACIA_LEAVES(lazy { Key.key("minecraft:block/acacia_leaves") }, lazy { listOf() }),
  ACACIA_LOG(lazy { Key.key("minecraft:block/acacia_log") }, lazy { listOf() }),
  ACACIA_PLANKS(lazy { Key.key("minecraft:block/acacia_planks") }, lazy { listOf() }),
  ACACIA_PRESSURE_PLATE(lazy { Key.key("minecraft:block/acacia_pressure_plate") }, lazy { listOf()
      }),
  ACACIA_SLAB(lazy { Key.key("minecraft:block/acacia_slab") }, lazy { listOf() }),
  ACACIA_STAIRS(lazy { Key.key("minecraft:block/acacia_stairs") }, lazy { listOf() }),
  ACACIA_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/acacia_trapdoor_bottom") }, lazy { listOf()
      }),
  ACACIA_WOOD(lazy { Key.key("minecraft:block/acacia_wood") }, lazy { listOf() }),
  AMETHYST_BLOCK(lazy { Key.key("minecraft:block/amethyst_block") }, lazy { listOf() }),
  ANCIENT_DEBRIS(lazy { Key.key("minecraft:block/ancient_debris") }, lazy { listOf() }),
  ANDESITE(lazy { Key.key("minecraft:block/andesite") }, lazy { listOf() }),
  ANDESITE_SLAB(lazy { Key.key("minecraft:block/andesite_slab") }, lazy { listOf() }),
  ANDESITE_STAIRS(lazy { Key.key("minecraft:block/andesite_stairs") }, lazy { listOf() }),
  ANDESITE_WALL_INVENTORY(lazy { Key.key("minecraft:block/andesite_wall_inventory") }, lazy {
      listOf() }),
  ANVIL(lazy { Key.key("minecraft:block/anvil") }, lazy { listOf() }),
  AZALEA(lazy { Key.key("minecraft:block/azalea") }, lazy { listOf() }),
  AZALEA_LEAVES(lazy { Key.key("minecraft:block/azalea_leaves") }, lazy { listOf() }),
  BAMBOO_BLOCK(lazy { Key.key("minecraft:block/bamboo_block") }, lazy { listOf() }),
  BAMBOO_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/bamboo_button_inventory") }, lazy {
      listOf() }),
  BAMBOO_FENCE_INVENTORY(lazy { Key.key("minecraft:block/bamboo_fence_inventory") }, lazy { listOf()
      }),
  BAMBOO_FENCE_GATE(lazy { Key.key("minecraft:block/bamboo_fence_gate") }, lazy { listOf() }),
  BAMBOO_MOSAIC(lazy { Key.key("minecraft:block/bamboo_mosaic") }, lazy { listOf() }),
  BAMBOO_MOSAIC_SLAB(lazy { Key.key("minecraft:block/bamboo_mosaic_slab") }, lazy { listOf() }),
  BAMBOO_MOSAIC_STAIRS(lazy { Key.key("minecraft:block/bamboo_mosaic_stairs") }, lazy { listOf() }),
  BAMBOO_PLANKS(lazy { Key.key("minecraft:block/bamboo_planks") }, lazy { listOf() }),
  BAMBOO_PRESSURE_PLATE(lazy { Key.key("minecraft:block/bamboo_pressure_plate") }, lazy { listOf()
      }),
  BAMBOO_SLAB(lazy { Key.key("minecraft:block/bamboo_slab") }, lazy { listOf() }),
  BAMBOO_STAIRS(lazy { Key.key("minecraft:block/bamboo_stairs") }, lazy { listOf() }),
  BAMBOO_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/bamboo_trapdoor_bottom") }, lazy { listOf()
      }),
  BARREL(lazy { Key.key("minecraft:block/barrel") }, lazy { listOf() }),
  BASALT(lazy { Key.key("minecraft:block/basalt") }, lazy { listOf() }),
  BEACON(lazy { Key.key("minecraft:block/beacon") }, lazy { listOf() }),
  BEDROCK(lazy { Key.key("minecraft:block/bedrock") }, lazy { listOf() }),
  BEEHIVE(lazy { Key.key("minecraft:block/beehive") }, lazy { listOf() }),
  BEE_NEST(lazy { Key.key("minecraft:block/bee_nest") }, lazy { listOf() }),
  BIG_DRIPLEAF(lazy { Key.key("minecraft:block/big_dripleaf") }, lazy { listOf() }),
  BIRCH_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/birch_button_inventory") }, lazy { listOf()
      }),
  BIRCH_FENCE_INVENTORY(lazy { Key.key("minecraft:block/birch_fence_inventory") }, lazy { listOf()
      }),
  BIRCH_FENCE_GATE(lazy { Key.key("minecraft:block/birch_fence_gate") }, lazy { listOf() }),
  BIRCH_LEAVES(lazy { Key.key("minecraft:block/birch_leaves") }, lazy { listOf() }),
  BIRCH_LOG(lazy { Key.key("minecraft:block/birch_log") }, lazy { listOf() }),
  BIRCH_PLANKS(lazy { Key.key("minecraft:block/birch_planks") }, lazy { listOf() }),
  BIRCH_PRESSURE_PLATE(lazy { Key.key("minecraft:block/birch_pressure_plate") }, lazy { listOf() }),
  BIRCH_SLAB(lazy { Key.key("minecraft:block/birch_slab") }, lazy { listOf() }),
  BIRCH_STAIRS(lazy { Key.key("minecraft:block/birch_stairs") }, lazy { listOf() }),
  BIRCH_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/birch_trapdoor_bottom") }, lazy { listOf()
      }),
  BIRCH_WOOD(lazy { Key.key("minecraft:block/birch_wood") }, lazy { listOf() }),
  BLACKSTONE(lazy { Key.key("minecraft:block/blackstone") }, lazy { listOf() }),
  BLACKSTONE_SLAB(lazy { Key.key("minecraft:block/blackstone_slab") }, lazy { listOf() }),
  BLACKSTONE_STAIRS(lazy { Key.key("minecraft:block/blackstone_stairs") }, lazy { listOf() }),
  BLACKSTONE_WALL_INVENTORY(lazy { Key.key("minecraft:block/blackstone_wall_inventory") }, lazy {
      listOf() }),
  BLACK_CARPET(lazy { Key.key("minecraft:block/black_carpet") }, lazy { listOf() }),
  BLACK_CONCRETE(lazy { Key.key("minecraft:block/black_concrete") }, lazy { listOf() }),
  BLACK_CONCRETE_POWDER(lazy { Key.key("minecraft:block/black_concrete_powder") }, lazy { listOf()
      }),
  BLACK_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/black_glazed_terracotta") }, lazy {
      listOf() }),
  BLACK_STAINED_GLASS(lazy { Key.key("minecraft:block/black_stained_glass") }, lazy { listOf() }),
  BLACK_TERRACOTTA(lazy { Key.key("minecraft:block/black_terracotta") }, lazy { listOf() }),
  BLACK_WOOL(lazy { Key.key("minecraft:block/black_wool") }, lazy { listOf() }),
  BLAST_FURNACE(lazy { Key.key("minecraft:block/blast_furnace") }, lazy { listOf() }),
  BLUE_CARPET(lazy { Key.key("minecraft:block/blue_carpet") }, lazy { listOf() }),
  BLUE_CONCRETE(lazy { Key.key("minecraft:block/blue_concrete") }, lazy { listOf() }),
  BLUE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/blue_concrete_powder") }, lazy { listOf() }),
  BLUE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/blue_glazed_terracotta") }, lazy { listOf()
      }),
  BLUE_ICE(lazy { Key.key("minecraft:block/blue_ice") }, lazy { listOf() }),
  BLUE_STAINED_GLASS(lazy { Key.key("minecraft:block/blue_stained_glass") }, lazy { listOf() }),
  BLUE_TERRACOTTA(lazy { Key.key("minecraft:block/blue_terracotta") }, lazy { listOf() }),
  BLUE_WOOL(lazy { Key.key("minecraft:block/blue_wool") }, lazy { listOf() }),
  BONE_BLOCK(lazy { Key.key("minecraft:block/bone_block") }, lazy { listOf() }),
  BOOKSHELF(lazy { Key.key("minecraft:block/bookshelf") }, lazy { listOf() }),
  BRAIN_CORAL_BLOCK(lazy { Key.key("minecraft:block/brain_coral_block") }, lazy { listOf() }),
  BRICKS(lazy { Key.key("minecraft:block/bricks") }, lazy { listOf() }),
  BRICK_SLAB(lazy { Key.key("minecraft:block/brick_slab") }, lazy { listOf() }),
  BRICK_STAIRS(lazy { Key.key("minecraft:block/brick_stairs") }, lazy { listOf() }),
  BRICK_WALL_INVENTORY(lazy { Key.key("minecraft:block/brick_wall_inventory") }, lazy { listOf() }),
  BROWN_CARPET(lazy { Key.key("minecraft:block/brown_carpet") }, lazy { listOf() }),
  BROWN_CONCRETE(lazy { Key.key("minecraft:block/brown_concrete") }, lazy { listOf() }),
  BROWN_CONCRETE_POWDER(lazy { Key.key("minecraft:block/brown_concrete_powder") }, lazy { listOf()
      }),
  BROWN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/brown_glazed_terracotta") }, lazy {
      listOf() }),
  BROWN_MUSHROOM_BLOCK_INVENTORY(lazy { Key.key("minecraft:block/brown_mushroom_block_inventory") },
      lazy { listOf() }),
  BROWN_STAINED_GLASS(lazy { Key.key("minecraft:block/brown_stained_glass") }, lazy { listOf() }),
  BROWN_TERRACOTTA(lazy { Key.key("minecraft:block/brown_terracotta") }, lazy { listOf() }),
  BROWN_WOOL(lazy { Key.key("minecraft:block/brown_wool") }, lazy { listOf() }),
  BUBBLE_CORAL_BLOCK(lazy { Key.key("minecraft:block/bubble_coral_block") }, lazy { listOf() }),
  BUDDING_AMETHYST(lazy { Key.key("minecraft:block/budding_amethyst") }, lazy { listOf() }),
  CACTUS(lazy { Key.key("minecraft:block/cactus") }, lazy { listOf() }),
  CALCITE(lazy { Key.key("minecraft:block/calcite") }, lazy { listOf() }),
  CALIBRATED_SCULK_SENSOR_INACTIVE(lazy {
      Key.key("minecraft:block/calibrated_sculk_sensor_inactive") }, lazy { listOf() }),
  CARTOGRAPHY_TABLE(lazy { Key.key("minecraft:block/cartography_table") }, lazy { listOf() }),
  CARVED_PUMPKIN(lazy { Key.key("minecraft:block/carved_pumpkin") }, lazy { listOf() }),
  CHAIN_COMMAND_BLOCK(lazy { Key.key("minecraft:block/chain_command_block") }, lazy { listOf() }),
  CHERRY_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/cherry_button_inventory") }, lazy {
      listOf() }),
  CHERRY_FENCE_INVENTORY(lazy { Key.key("minecraft:block/cherry_fence_inventory") }, lazy { listOf()
      }),
  CHERRY_FENCE_GATE(lazy { Key.key("minecraft:block/cherry_fence_gate") }, lazy { listOf() }),
  CHERRY_LEAVES(lazy { Key.key("minecraft:block/cherry_leaves") }, lazy { listOf() }),
  CHERRY_LOG(lazy { Key.key("minecraft:block/cherry_log") }, lazy { listOf() }),
  CHERRY_PLANKS(lazy { Key.key("minecraft:block/cherry_planks") }, lazy { listOf() }),
  CHERRY_PRESSURE_PLATE(lazy { Key.key("minecraft:block/cherry_pressure_plate") }, lazy { listOf()
      }),
  CHERRY_SLAB(lazy { Key.key("minecraft:block/cherry_slab") }, lazy { listOf() }),
  CHERRY_STAIRS(lazy { Key.key("minecraft:block/cherry_stairs") }, lazy { listOf() }),
  CHERRY_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/cherry_trapdoor_bottom") }, lazy { listOf()
      }),
  CHERRY_WOOD(lazy { Key.key("minecraft:block/cherry_wood") }, lazy { listOf() }),
  CHIPPED_ANVIL(lazy { Key.key("minecraft:block/chipped_anvil") }, lazy { listOf() }),
  CHISELED_BOOKSHELF_INVENTORY(lazy { Key.key("minecraft:block/chiseled_bookshelf_inventory") },
      lazy { listOf() }),
  CHISELED_COPPER(lazy { Key.key("minecraft:block/chiseled_copper") }, lazy { listOf() }),
  CHISELED_DEEPSLATE(lazy { Key.key("minecraft:block/chiseled_deepslate") }, lazy { listOf() }),
  CHISELED_NETHER_BRICKS(lazy { Key.key("minecraft:block/chiseled_nether_bricks") }, lazy { listOf()
      }),
  CHISELED_POLISHED_BLACKSTONE(lazy { Key.key("minecraft:block/chiseled_polished_blackstone") },
      lazy { listOf() }),
  CHISELED_QUARTZ_BLOCK(lazy { Key.key("minecraft:block/chiseled_quartz_block") }, lazy { listOf()
      }),
  CHISELED_RED_SANDSTONE(lazy { Key.key("minecraft:block/chiseled_red_sandstone") }, lazy { listOf()
      }),
  CHISELED_SANDSTONE(lazy { Key.key("minecraft:block/chiseled_sandstone") }, lazy { listOf() }),
  CHISELED_STONE_BRICKS(lazy { Key.key("minecraft:block/chiseled_stone_bricks") }, lazy { listOf()
      }),
  CHISELED_TUFF(lazy { Key.key("minecraft:block/chiseled_tuff") }, lazy { listOf() }),
  CHISELED_TUFF_BRICKS(lazy { Key.key("minecraft:block/chiseled_tuff_bricks") }, lazy { listOf() }),
  CHORUS_FLOWER(lazy { Key.key("minecraft:block/chorus_flower") }, lazy { listOf() }),
  CHORUS_PLANT(lazy { Key.key("minecraft:block/chorus_plant") }, lazy { listOf() }),
  CLAY(lazy { Key.key("minecraft:block/clay") }, lazy { listOf() }),
  COAL_BLOCK(lazy { Key.key("minecraft:block/coal_block") }, lazy { listOf() }),
  COAL_ORE(lazy { Key.key("minecraft:block/coal_ore") }, lazy { listOf() }),
  COARSE_DIRT(lazy { Key.key("minecraft:block/coarse_dirt") }, lazy { listOf() }),
  COBBLED_DEEPSLATE(lazy { Key.key("minecraft:block/cobbled_deepslate") }, lazy { listOf() }),
  COBBLED_DEEPSLATE_SLAB(lazy { Key.key("minecraft:block/cobbled_deepslate_slab") }, lazy { listOf()
      }),
  COBBLED_DEEPSLATE_STAIRS(lazy { Key.key("minecraft:block/cobbled_deepslate_stairs") }, lazy {
      listOf() }),
  COBBLED_DEEPSLATE_WALL_INVENTORY(lazy {
      Key.key("minecraft:block/cobbled_deepslate_wall_inventory") }, lazy { listOf() }),
  COBBLESTONE(lazy { Key.key("minecraft:block/cobblestone") }, lazy { listOf() }),
  COBBLESTONE_SLAB(lazy { Key.key("minecraft:block/cobblestone_slab") }, lazy { listOf() }),
  COBBLESTONE_STAIRS(lazy { Key.key("minecraft:block/cobblestone_stairs") }, lazy { listOf() }),
  COBBLESTONE_WALL_INVENTORY(lazy { Key.key("minecraft:block/cobblestone_wall_inventory") }, lazy {
      listOf() }),
  COMMAND_BLOCK(lazy { Key.key("minecraft:block/command_block") }, lazy { listOf() }),
  COMPOSTER(lazy { Key.key("minecraft:block/composter") }, lazy { listOf() }),
  COPPER_BLOCK(lazy { Key.key("minecraft:block/copper_block") }, lazy { listOf() }),
  COPPER_BULB(lazy { Key.key("minecraft:block/copper_bulb") }, lazy { listOf() }),
  COPPER_GRATE(lazy { Key.key("minecraft:block/copper_grate") }, lazy { listOf() }),
  COPPER_ORE(lazy { Key.key("minecraft:block/copper_ore") }, lazy { listOf() }),
  COPPER_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/copper_trapdoor_bottom") }, lazy { listOf()
      }),
  CRACKED_DEEPSLATE_BRICKS(lazy { Key.key("minecraft:block/cracked_deepslate_bricks") }, lazy {
      listOf() }),
  CRACKED_DEEPSLATE_TILES(lazy { Key.key("minecraft:block/cracked_deepslate_tiles") }, lazy {
      listOf() }),
  CRACKED_NETHER_BRICKS(lazy { Key.key("minecraft:block/cracked_nether_bricks") }, lazy { listOf()
      }),
  CRACKED_POLISHED_BLACKSTONE_BRICKS(lazy {
      Key.key("minecraft:block/cracked_polished_blackstone_bricks") }, lazy { listOf() }),
  CRACKED_STONE_BRICKS(lazy { Key.key("minecraft:block/cracked_stone_bricks") }, lazy { listOf() }),
  CRAFTER(lazy { Key.key("minecraft:block/crafter") }, lazy { listOf() }),
  CRAFTING_TABLE(lazy { Key.key("minecraft:block/crafting_table") }, lazy { listOf() }),
  CRIMSON_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/crimson_button_inventory") }, lazy {
      listOf() }),
  CRIMSON_FENCE_INVENTORY(lazy { Key.key("minecraft:block/crimson_fence_inventory") }, lazy {
      listOf() }),
  CRIMSON_FENCE_GATE(lazy { Key.key("minecraft:block/crimson_fence_gate") }, lazy { listOf() }),
  CRIMSON_HYPHAE(lazy { Key.key("minecraft:block/crimson_hyphae") }, lazy { listOf() }),
  CRIMSON_NYLIUM(lazy { Key.key("minecraft:block/crimson_nylium") }, lazy { listOf() }),
  CRIMSON_PLANKS(lazy { Key.key("minecraft:block/crimson_planks") }, lazy { listOf() }),
  CRIMSON_PRESSURE_PLATE(lazy { Key.key("minecraft:block/crimson_pressure_plate") }, lazy { listOf()
      }),
  CRIMSON_SLAB(lazy { Key.key("minecraft:block/crimson_slab") }, lazy { listOf() }),
  CRIMSON_STAIRS(lazy { Key.key("minecraft:block/crimson_stairs") }, lazy { listOf() }),
  CRIMSON_STEM(lazy { Key.key("minecraft:block/crimson_stem") }, lazy { listOf() }),
  CRIMSON_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/crimson_trapdoor_bottom") }, lazy {
      listOf() }),
  CRYING_OBSIDIAN(lazy { Key.key("minecraft:block/crying_obsidian") }, lazy { listOf() }),
  CUT_COPPER(lazy { Key.key("minecraft:block/cut_copper") }, lazy { listOf() }),
  CUT_COPPER_SLAB(lazy { Key.key("minecraft:block/cut_copper_slab") }, lazy { listOf() }),
  CUT_COPPER_STAIRS(lazy { Key.key("minecraft:block/cut_copper_stairs") }, lazy { listOf() }),
  CUT_RED_SANDSTONE(lazy { Key.key("minecraft:block/cut_red_sandstone") }, lazy { listOf() }),
  CUT_RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/cut_red_sandstone_slab") }, lazy { listOf()
      }),
  CUT_SANDSTONE(lazy { Key.key("minecraft:block/cut_sandstone") }, lazy { listOf() }),
  CUT_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/cut_sandstone_slab") }, lazy { listOf() }),
  CYAN_CARPET(lazy { Key.key("minecraft:block/cyan_carpet") }, lazy { listOf() }),
  CYAN_CONCRETE(lazy { Key.key("minecraft:block/cyan_concrete") }, lazy { listOf() }),
  CYAN_CONCRETE_POWDER(lazy { Key.key("minecraft:block/cyan_concrete_powder") }, lazy { listOf() }),
  CYAN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/cyan_glazed_terracotta") }, lazy { listOf()
      }),
  CYAN_STAINED_GLASS(lazy { Key.key("minecraft:block/cyan_stained_glass") }, lazy { listOf() }),
  CYAN_TERRACOTTA(lazy { Key.key("minecraft:block/cyan_terracotta") }, lazy { listOf() }),
  CYAN_WOOL(lazy { Key.key("minecraft:block/cyan_wool") }, lazy { listOf() }),
  DAMAGED_ANVIL(lazy { Key.key("minecraft:block/damaged_anvil") }, lazy { listOf() }),
  DARK_OAK_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/dark_oak_button_inventory") }, lazy {
      listOf() }),
  DARK_OAK_FENCE_INVENTORY(lazy { Key.key("minecraft:block/dark_oak_fence_inventory") }, lazy {
      listOf() }),
  DARK_OAK_FENCE_GATE(lazy { Key.key("minecraft:block/dark_oak_fence_gate") }, lazy { listOf() }),
  DARK_OAK_LEAVES(lazy { Key.key("minecraft:block/dark_oak_leaves") }, lazy { listOf() }),
  DARK_OAK_LOG(lazy { Key.key("minecraft:block/dark_oak_log") }, lazy { listOf() }),
  DARK_OAK_PLANKS(lazy { Key.key("minecraft:block/dark_oak_planks") }, lazy { listOf() }),
  DARK_OAK_PRESSURE_PLATE(lazy { Key.key("minecraft:block/dark_oak_pressure_plate") }, lazy {
      listOf() }),
  DARK_OAK_SLAB(lazy { Key.key("minecraft:block/dark_oak_slab") }, lazy { listOf() }),
  DARK_OAK_STAIRS(lazy { Key.key("minecraft:block/dark_oak_stairs") }, lazy { listOf() }),
  DARK_OAK_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/dark_oak_trapdoor_bottom") }, lazy {
      listOf() }),
  DARK_OAK_WOOD(lazy { Key.key("minecraft:block/dark_oak_wood") }, lazy { listOf() }),
  DARK_PRISMARINE(lazy { Key.key("minecraft:block/dark_prismarine") }, lazy { listOf() }),
  DARK_PRISMARINE_SLAB(lazy { Key.key("minecraft:block/dark_prismarine_slab") }, lazy { listOf() }),
  DARK_PRISMARINE_STAIRS(lazy { Key.key("minecraft:block/dark_prismarine_stairs") }, lazy { listOf()
      }),
  DAYLIGHT_DETECTOR(lazy { Key.key("minecraft:block/daylight_detector") }, lazy { listOf() }),
  DEAD_BRAIN_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_brain_coral_block") }, lazy { listOf()
      }),
  DEAD_BUBBLE_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_bubble_coral_block") }, lazy {
      listOf() }),
  DEAD_FIRE_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_fire_coral_block") }, lazy { listOf()
      }),
  DEAD_HORN_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_horn_coral_block") }, lazy { listOf()
      }),
  DEAD_TUBE_CORAL_BLOCK(lazy { Key.key("minecraft:block/dead_tube_coral_block") }, lazy { listOf()
      }),
  DEEPSLATE(lazy { Key.key("minecraft:block/deepslate") }, lazy { listOf() }),
  DEEPSLATE_BRICKS(lazy { Key.key("minecraft:block/deepslate_bricks") }, lazy { listOf() }),
  DEEPSLATE_BRICK_SLAB(lazy { Key.key("minecraft:block/deepslate_brick_slab") }, lazy { listOf() }),
  DEEPSLATE_BRICK_STAIRS(lazy { Key.key("minecraft:block/deepslate_brick_stairs") }, lazy { listOf()
      }),
  DEEPSLATE_BRICK_WALL_INVENTORY(lazy { Key.key("minecraft:block/deepslate_brick_wall_inventory") },
      lazy { listOf() }),
  DEEPSLATE_COAL_ORE(lazy { Key.key("minecraft:block/deepslate_coal_ore") }, lazy { listOf() }),
  DEEPSLATE_COPPER_ORE(lazy { Key.key("minecraft:block/deepslate_copper_ore") }, lazy { listOf() }),
  DEEPSLATE_DIAMOND_ORE(lazy { Key.key("minecraft:block/deepslate_diamond_ore") }, lazy { listOf()
      }),
  DEEPSLATE_EMERALD_ORE(lazy { Key.key("minecraft:block/deepslate_emerald_ore") }, lazy { listOf()
      }),
  DEEPSLATE_GOLD_ORE(lazy { Key.key("minecraft:block/deepslate_gold_ore") }, lazy { listOf() }),
  DEEPSLATE_IRON_ORE(lazy { Key.key("minecraft:block/deepslate_iron_ore") }, lazy { listOf() }),
  DEEPSLATE_LAPIS_ORE(lazy { Key.key("minecraft:block/deepslate_lapis_ore") }, lazy { listOf() }),
  DEEPSLATE_REDSTONE_ORE(lazy { Key.key("minecraft:block/deepslate_redstone_ore") }, lazy { listOf()
      }),
  DEEPSLATE_TILES(lazy { Key.key("minecraft:block/deepslate_tiles") }, lazy { listOf() }),
  DEEPSLATE_TILE_SLAB(lazy { Key.key("minecraft:block/deepslate_tile_slab") }, lazy { listOf() }),
  DEEPSLATE_TILE_STAIRS(lazy { Key.key("minecraft:block/deepslate_tile_stairs") }, lazy { listOf()
      }),
  DEEPSLATE_TILE_WALL_INVENTORY(lazy { Key.key("minecraft:block/deepslate_tile_wall_inventory") },
      lazy { listOf() }),
  DIAMOND_BLOCK(lazy { Key.key("minecraft:block/diamond_block") }, lazy { listOf() }),
  DIAMOND_ORE(lazy { Key.key("minecraft:block/diamond_ore") }, lazy { listOf() }),
  DIORITE(lazy { Key.key("minecraft:block/diorite") }, lazy { listOf() }),
  DIORITE_SLAB(lazy { Key.key("minecraft:block/diorite_slab") }, lazy { listOf() }),
  DIORITE_STAIRS(lazy { Key.key("minecraft:block/diorite_stairs") }, lazy { listOf() }),
  DIORITE_WALL_INVENTORY(lazy { Key.key("minecraft:block/diorite_wall_inventory") }, lazy { listOf()
      }),
  DIRT(lazy { Key.key("minecraft:block/dirt") }, lazy { listOf() }),
  DIRT_PATH(lazy { Key.key("minecraft:block/dirt_path") }, lazy { listOf() }),
  DISPENSER(lazy { Key.key("minecraft:block/dispenser") }, lazy { listOf() }),
  DRAGON_EGG(lazy { Key.key("minecraft:block/dragon_egg") }, lazy { listOf() }),
  DRIED_KELP_BLOCK(lazy { Key.key("minecraft:block/dried_kelp_block") }, lazy { listOf() }),
  DRIPSTONE_BLOCK(lazy { Key.key("minecraft:block/dripstone_block") }, lazy { listOf() }),
  DROPPER(lazy { Key.key("minecraft:block/dropper") }, lazy { listOf() }),
  EMERALD_BLOCK(lazy { Key.key("minecraft:block/emerald_block") }, lazy { listOf() }),
  EMERALD_ORE(lazy { Key.key("minecraft:block/emerald_ore") }, lazy { listOf() }),
  ENCHANTING_TABLE(lazy { Key.key("minecraft:block/enchanting_table") }, lazy { listOf() }),
  END_PORTAL_FRAME(lazy { Key.key("minecraft:block/end_portal_frame") }, lazy { listOf() }),
  END_ROD(lazy { Key.key("minecraft:block/end_rod") }, lazy { listOf() }),
  END_STONE(lazy { Key.key("minecraft:block/end_stone") }, lazy { listOf() }),
  END_STONE_BRICKS(lazy { Key.key("minecraft:block/end_stone_bricks") }, lazy { listOf() }),
  END_STONE_BRICK_SLAB(lazy { Key.key("minecraft:block/end_stone_brick_slab") }, lazy { listOf() }),
  END_STONE_BRICK_STAIRS(lazy { Key.key("minecraft:block/end_stone_brick_stairs") }, lazy { listOf()
      }),
  END_STONE_BRICK_WALL_INVENTORY(lazy { Key.key("minecraft:block/end_stone_brick_wall_inventory") },
      lazy { listOf() }),
  EXPOSED_CHISELED_COPPER(lazy { Key.key("minecraft:block/exposed_chiseled_copper") }, lazy {
      listOf() }),
  EXPOSED_COPPER(lazy { Key.key("minecraft:block/exposed_copper") }, lazy { listOf() }),
  EXPOSED_COPPER_BULB(lazy { Key.key("minecraft:block/exposed_copper_bulb") }, lazy { listOf() }),
  EXPOSED_COPPER_GRATE(lazy { Key.key("minecraft:block/exposed_copper_grate") }, lazy { listOf() }),
  EXPOSED_COPPER_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/exposed_copper_trapdoor_bottom") },
      lazy { listOf() }),
  EXPOSED_CUT_COPPER(lazy { Key.key("minecraft:block/exposed_cut_copper") }, lazy { listOf() }),
  EXPOSED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:block/exposed_cut_copper_slab") }, lazy {
      listOf() }),
  EXPOSED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:block/exposed_cut_copper_stairs") }, lazy {
      listOf() }),
  FARMLAND(lazy { Key.key("minecraft:block/farmland") }, lazy { listOf() }),
  FIRE_CORAL_BLOCK(lazy { Key.key("minecraft:block/fire_coral_block") }, lazy { listOf() }),
  FLETCHING_TABLE(lazy { Key.key("minecraft:block/fletching_table") }, lazy { listOf() }),
  FLOWERING_AZALEA(lazy { Key.key("minecraft:block/flowering_azalea") }, lazy { listOf() }),
  FLOWERING_AZALEA_LEAVES(lazy { Key.key("minecraft:block/flowering_azalea_leaves") }, lazy {
      listOf() }),
  FURNACE(lazy { Key.key("minecraft:block/furnace") }, lazy { listOf() }),
  GILDED_BLACKSTONE(lazy { Key.key("minecraft:block/gilded_blackstone") }, lazy { listOf() }),
  GLASS(lazy { Key.key("minecraft:block/glass") }, lazy { listOf() }),
  GLOWSTONE(lazy { Key.key("minecraft:block/glowstone") }, lazy { listOf() }),
  GOLD_BLOCK(lazy { Key.key("minecraft:block/gold_block") }, lazy { listOf() }),
  GOLD_ORE(lazy { Key.key("minecraft:block/gold_ore") }, lazy { listOf() }),
  GRANITE(lazy { Key.key("minecraft:block/granite") }, lazy { listOf() }),
  GRANITE_SLAB(lazy { Key.key("minecraft:block/granite_slab") }, lazy { listOf() }),
  GRANITE_STAIRS(lazy { Key.key("minecraft:block/granite_stairs") }, lazy { listOf() }),
  GRANITE_WALL_INVENTORY(lazy { Key.key("minecraft:block/granite_wall_inventory") }, lazy { listOf()
      }),
  GRASS_BLOCK(lazy { Key.key("minecraft:block/grass_block") }, lazy { listOf() }),
  GRAVEL(lazy { Key.key("minecraft:block/gravel") }, lazy { listOf() }),
  GRAY_CARPET(lazy { Key.key("minecraft:block/gray_carpet") }, lazy { listOf() }),
  GRAY_CONCRETE(lazy { Key.key("minecraft:block/gray_concrete") }, lazy { listOf() }),
  GRAY_CONCRETE_POWDER(lazy { Key.key("minecraft:block/gray_concrete_powder") }, lazy { listOf() }),
  GRAY_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/gray_glazed_terracotta") }, lazy { listOf()
      }),
  GRAY_STAINED_GLASS(lazy { Key.key("minecraft:block/gray_stained_glass") }, lazy { listOf() }),
  GRAY_TERRACOTTA(lazy { Key.key("minecraft:block/gray_terracotta") }, lazy { listOf() }),
  GRAY_WOOL(lazy { Key.key("minecraft:block/gray_wool") }, lazy { listOf() }),
  GREEN_CARPET(lazy { Key.key("minecraft:block/green_carpet") }, lazy { listOf() }),
  GREEN_CONCRETE(lazy { Key.key("minecraft:block/green_concrete") }, lazy { listOf() }),
  GREEN_CONCRETE_POWDER(lazy { Key.key("minecraft:block/green_concrete_powder") }, lazy { listOf()
      }),
  GREEN_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/green_glazed_terracotta") }, lazy {
      listOf() }),
  GREEN_STAINED_GLASS(lazy { Key.key("minecraft:block/green_stained_glass") }, lazy { listOf() }),
  GREEN_TERRACOTTA(lazy { Key.key("minecraft:block/green_terracotta") }, lazy { listOf() }),
  GREEN_WOOL(lazy { Key.key("minecraft:block/green_wool") }, lazy { listOf() }),
  GRINDSTONE(lazy { Key.key("minecraft:block/grindstone") }, lazy { listOf() }),
  HAY_BLOCK(lazy { Key.key("minecraft:block/hay_block") }, lazy { listOf() }),
  HEAVY_CORE(lazy { Key.key("minecraft:block/heavy_core") }, lazy { listOf() }),
  HEAVY_WEIGHTED_PRESSURE_PLATE(lazy { Key.key("minecraft:block/heavy_weighted_pressure_plate") },
      lazy { listOf() }),
  HONEYCOMB_BLOCK(lazy { Key.key("minecraft:block/honeycomb_block") }, lazy { listOf() }),
  HONEY_BLOCK(lazy { Key.key("minecraft:block/honey_block") }, lazy { listOf() }),
  HORN_CORAL_BLOCK(lazy { Key.key("minecraft:block/horn_coral_block") }, lazy { listOf() }),
  ICE(lazy { Key.key("minecraft:block/ice") }, lazy { listOf() }),
  MOSSY_STONE_BRICKS(lazy { Key.key("minecraft:block/mossy_stone_bricks") }, lazy { listOf() }),
  STONE(lazy { Key.key("minecraft:block/stone") }, lazy { listOf() }),
  STONE_BRICKS(lazy { Key.key("minecraft:block/stone_bricks") }, lazy { listOf() }),
  IRON_BLOCK(lazy { Key.key("minecraft:block/iron_block") }, lazy { listOf() }),
  IRON_ORE(lazy { Key.key("minecraft:block/iron_ore") }, lazy { listOf() }),
  IRON_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/iron_trapdoor_bottom") }, lazy { listOf() }),
  JACK_O_LANTERN(lazy { Key.key("minecraft:block/jack_o_lantern") }, lazy { listOf() }),
  JIGSAW(lazy { Key.key("minecraft:block/jigsaw") }, lazy { listOf() }),
  JUKEBOX(lazy { Key.key("minecraft:block/jukebox") }, lazy { listOf() }),
  JUNGLE_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/jungle_button_inventory") }, lazy {
      listOf() }),
  JUNGLE_FENCE_INVENTORY(lazy { Key.key("minecraft:block/jungle_fence_inventory") }, lazy { listOf()
      }),
  JUNGLE_FENCE_GATE(lazy { Key.key("minecraft:block/jungle_fence_gate") }, lazy { listOf() }),
  JUNGLE_LEAVES(lazy { Key.key("minecraft:block/jungle_leaves") }, lazy { listOf() }),
  JUNGLE_LOG(lazy { Key.key("minecraft:block/jungle_log") }, lazy { listOf() }),
  JUNGLE_PLANKS(lazy { Key.key("minecraft:block/jungle_planks") }, lazy { listOf() }),
  JUNGLE_PRESSURE_PLATE(lazy { Key.key("minecraft:block/jungle_pressure_plate") }, lazy { listOf()
      }),
  JUNGLE_SLAB(lazy { Key.key("minecraft:block/jungle_slab") }, lazy { listOf() }),
  JUNGLE_STAIRS(lazy { Key.key("minecraft:block/jungle_stairs") }, lazy { listOf() }),
  JUNGLE_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/jungle_trapdoor_bottom") }, lazy { listOf()
      }),
  JUNGLE_WOOD(lazy { Key.key("minecraft:block/jungle_wood") }, lazy { listOf() }),
  LAPIS_BLOCK(lazy { Key.key("minecraft:block/lapis_block") }, lazy { listOf() }),
  LAPIS_ORE(lazy { Key.key("minecraft:block/lapis_ore") }, lazy { listOf() }),
  LECTERN(lazy { Key.key("minecraft:block/lectern") }, lazy { listOf() }),
  LIGHTNING_ROD(lazy { Key.key("minecraft:block/lightning_rod") }, lazy { listOf() }),
  LIGHT_BLUE_CARPET(lazy { Key.key("minecraft:block/light_blue_carpet") }, lazy { listOf() }),
  LIGHT_BLUE_CONCRETE(lazy { Key.key("minecraft:block/light_blue_concrete") }, lazy { listOf() }),
  LIGHT_BLUE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/light_blue_concrete_powder") }, lazy {
      listOf() }),
  LIGHT_BLUE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/light_blue_glazed_terracotta") },
      lazy { listOf() }),
  LIGHT_BLUE_STAINED_GLASS(lazy { Key.key("minecraft:block/light_blue_stained_glass") }, lazy {
      listOf() }),
  LIGHT_BLUE_TERRACOTTA(lazy { Key.key("minecraft:block/light_blue_terracotta") }, lazy { listOf()
      }),
  LIGHT_BLUE_WOOL(lazy { Key.key("minecraft:block/light_blue_wool") }, lazy { listOf() }),
  LIGHT_GRAY_CARPET(lazy { Key.key("minecraft:block/light_gray_carpet") }, lazy { listOf() }),
  LIGHT_GRAY_CONCRETE(lazy { Key.key("minecraft:block/light_gray_concrete") }, lazy { listOf() }),
  LIGHT_GRAY_CONCRETE_POWDER(lazy { Key.key("minecraft:block/light_gray_concrete_powder") }, lazy {
      listOf() }),
  LIGHT_GRAY_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/light_gray_glazed_terracotta") },
      lazy { listOf() }),
  LIGHT_GRAY_STAINED_GLASS(lazy { Key.key("minecraft:block/light_gray_stained_glass") }, lazy {
      listOf() }),
  LIGHT_GRAY_TERRACOTTA(lazy { Key.key("minecraft:block/light_gray_terracotta") }, lazy { listOf()
      }),
  LIGHT_GRAY_WOOL(lazy { Key.key("minecraft:block/light_gray_wool") }, lazy { listOf() }),
  LIGHT_WEIGHTED_PRESSURE_PLATE(lazy { Key.key("minecraft:block/light_weighted_pressure_plate") },
      lazy { listOf() }),
  LIME_CARPET(lazy { Key.key("minecraft:block/lime_carpet") }, lazy { listOf() }),
  LIME_CONCRETE(lazy { Key.key("minecraft:block/lime_concrete") }, lazy { listOf() }),
  LIME_CONCRETE_POWDER(lazy { Key.key("minecraft:block/lime_concrete_powder") }, lazy { listOf() }),
  LIME_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/lime_glazed_terracotta") }, lazy { listOf()
      }),
  LIME_STAINED_GLASS(lazy { Key.key("minecraft:block/lime_stained_glass") }, lazy { listOf() }),
  LIME_TERRACOTTA(lazy { Key.key("minecraft:block/lime_terracotta") }, lazy { listOf() }),
  LIME_WOOL(lazy { Key.key("minecraft:block/lime_wool") }, lazy { listOf() }),
  LODESTONE(lazy { Key.key("minecraft:block/lodestone") }, lazy { listOf() }),
  LOOM(lazy { Key.key("minecraft:block/loom") }, lazy { listOf() }),
  MAGENTA_CARPET(lazy { Key.key("minecraft:block/magenta_carpet") }, lazy { listOf() }),
  MAGENTA_CONCRETE(lazy { Key.key("minecraft:block/magenta_concrete") }, lazy { listOf() }),
  MAGENTA_CONCRETE_POWDER(lazy { Key.key("minecraft:block/magenta_concrete_powder") }, lazy {
      listOf() }),
  MAGENTA_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/magenta_glazed_terracotta") }, lazy {
      listOf() }),
  MAGENTA_STAINED_GLASS(lazy { Key.key("minecraft:block/magenta_stained_glass") }, lazy { listOf()
      }),
  MAGENTA_TERRACOTTA(lazy { Key.key("minecraft:block/magenta_terracotta") }, lazy { listOf() }),
  MAGENTA_WOOL(lazy { Key.key("minecraft:block/magenta_wool") }, lazy { listOf() }),
  MAGMA_BLOCK(lazy { Key.key("minecraft:block/magma_block") }, lazy { listOf() }),
  MANGROVE_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/mangrove_button_inventory") }, lazy {
      listOf() }),
  MANGROVE_FENCE_INVENTORY(lazy { Key.key("minecraft:block/mangrove_fence_inventory") }, lazy {
      listOf() }),
  MANGROVE_FENCE_GATE(lazy { Key.key("minecraft:block/mangrove_fence_gate") }, lazy { listOf() }),
  MANGROVE_LEAVES(lazy { Key.key("minecraft:block/mangrove_leaves") }, lazy { listOf() }),
  MANGROVE_LOG(lazy { Key.key("minecraft:block/mangrove_log") }, lazy { listOf() }),
  MANGROVE_PLANKS(lazy { Key.key("minecraft:block/mangrove_planks") }, lazy { listOf() }),
  MANGROVE_PRESSURE_PLATE(lazy { Key.key("minecraft:block/mangrove_pressure_plate") }, lazy {
      listOf() }),
  MANGROVE_ROOTS(lazy { Key.key("minecraft:block/mangrove_roots") }, lazy { listOf() }),
  MANGROVE_SLAB(lazy { Key.key("minecraft:block/mangrove_slab") }, lazy { listOf() }),
  MANGROVE_STAIRS(lazy { Key.key("minecraft:block/mangrove_stairs") }, lazy { listOf() }),
  MANGROVE_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/mangrove_trapdoor_bottom") }, lazy {
      listOf() }),
  MANGROVE_WOOD(lazy { Key.key("minecraft:block/mangrove_wood") }, lazy { listOf() }),
  MELON(lazy { Key.key("minecraft:block/melon") }, lazy { listOf() }),
  MOSSY_COBBLESTONE(lazy { Key.key("minecraft:block/mossy_cobblestone") }, lazy { listOf() }),
  MOSSY_COBBLESTONE_SLAB(lazy { Key.key("minecraft:block/mossy_cobblestone_slab") }, lazy { listOf()
      }),
  MOSSY_COBBLESTONE_STAIRS(lazy { Key.key("minecraft:block/mossy_cobblestone_stairs") }, lazy {
      listOf() }),
  MOSSY_COBBLESTONE_WALL_INVENTORY(lazy {
      Key.key("minecraft:block/mossy_cobblestone_wall_inventory") }, lazy { listOf() }),
  MOSSY_STONE_BRICK_SLAB(lazy { Key.key("minecraft:block/mossy_stone_brick_slab") }, lazy { listOf()
      }),
  MOSSY_STONE_BRICK_STAIRS(lazy { Key.key("minecraft:block/mossy_stone_brick_stairs") }, lazy {
      listOf() }),
  MOSSY_STONE_BRICK_WALL_INVENTORY(lazy {
      Key.key("minecraft:block/mossy_stone_brick_wall_inventory") }, lazy { listOf() }),
  MOSS_BLOCK(lazy { Key.key("minecraft:block/moss_block") }, lazy { listOf() }),
  MOSS_CARPET(lazy { Key.key("minecraft:block/moss_carpet") }, lazy { listOf() }),
  MUD(lazy { Key.key("minecraft:block/mud") }, lazy { listOf() }),
  MUDDY_MANGROVE_ROOTS(lazy { Key.key("minecraft:block/muddy_mangrove_roots") }, lazy { listOf() }),
  MUD_BRICKS(lazy { Key.key("minecraft:block/mud_bricks") }, lazy { listOf() }),
  MUD_BRICK_SLAB(lazy { Key.key("minecraft:block/mud_brick_slab") }, lazy { listOf() }),
  MUD_BRICK_STAIRS(lazy { Key.key("minecraft:block/mud_brick_stairs") }, lazy { listOf() }),
  MUD_BRICK_WALL_INVENTORY(lazy { Key.key("minecraft:block/mud_brick_wall_inventory") }, lazy {
      listOf() }),
  MUSHROOM_STEM_INVENTORY(lazy { Key.key("minecraft:block/mushroom_stem_inventory") }, lazy {
      listOf() }),
  MYCELIUM(lazy { Key.key("minecraft:block/mycelium") }, lazy { listOf() }),
  NETHERITE_BLOCK(lazy { Key.key("minecraft:block/netherite_block") }, lazy { listOf() }),
  NETHERRACK(lazy { Key.key("minecraft:block/netherrack") }, lazy { listOf() }),
  NETHER_BRICKS(lazy { Key.key("minecraft:block/nether_bricks") }, lazy { listOf() }),
  NETHER_BRICK_FENCE_INVENTORY(lazy { Key.key("minecraft:block/nether_brick_fence_inventory") },
      lazy { listOf() }),
  NETHER_BRICK_SLAB(lazy { Key.key("minecraft:block/nether_brick_slab") }, lazy { listOf() }),
  NETHER_BRICK_STAIRS(lazy { Key.key("minecraft:block/nether_brick_stairs") }, lazy { listOf() }),
  NETHER_BRICK_WALL_INVENTORY(lazy { Key.key("minecraft:block/nether_brick_wall_inventory") }, lazy
      { listOf() }),
  NETHER_GOLD_ORE(lazy { Key.key("minecraft:block/nether_gold_ore") }, lazy { listOf() }),
  NETHER_QUARTZ_ORE(lazy { Key.key("minecraft:block/nether_quartz_ore") }, lazy { listOf() }),
  NETHER_WART_BLOCK(lazy { Key.key("minecraft:block/nether_wart_block") }, lazy { listOf() }),
  NOTE_BLOCK(lazy { Key.key("minecraft:block/note_block") }, lazy { listOf() }),
  OAK_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/oak_button_inventory") }, lazy { listOf() }),
  OAK_FENCE_INVENTORY(lazy { Key.key("minecraft:block/oak_fence_inventory") }, lazy { listOf() }),
  OAK_FENCE_GATE(lazy { Key.key("minecraft:block/oak_fence_gate") }, lazy { listOf() }),
  OAK_LEAVES(lazy { Key.key("minecraft:block/oak_leaves") }, lazy { listOf() }),
  OAK_LOG(lazy { Key.key("minecraft:block/oak_log") }, lazy { listOf() }),
  OAK_PLANKS(lazy { Key.key("minecraft:block/oak_planks") }, lazy { listOf() }),
  OAK_PRESSURE_PLATE(lazy { Key.key("minecraft:block/oak_pressure_plate") }, lazy { listOf() }),
  OAK_SLAB(lazy { Key.key("minecraft:block/oak_slab") }, lazy { listOf() }),
  OAK_STAIRS(lazy { Key.key("minecraft:block/oak_stairs") }, lazy { listOf() }),
  OAK_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/oak_trapdoor_bottom") }, lazy { listOf() }),
  OAK_WOOD(lazy { Key.key("minecraft:block/oak_wood") }, lazy { listOf() }),
  OBSERVER(lazy { Key.key("minecraft:block/observer") }, lazy { listOf() }),
  OBSIDIAN(lazy { Key.key("minecraft:block/obsidian") }, lazy { listOf() }),
  OCHRE_FROGLIGHT(lazy { Key.key("minecraft:block/ochre_froglight") }, lazy { listOf() }),
  ORANGE_CARPET(lazy { Key.key("minecraft:block/orange_carpet") }, lazy { listOf() }),
  ORANGE_CONCRETE(lazy { Key.key("minecraft:block/orange_concrete") }, lazy { listOf() }),
  ORANGE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/orange_concrete_powder") }, lazy { listOf()
      }),
  ORANGE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/orange_glazed_terracotta") }, lazy {
      listOf() }),
  ORANGE_STAINED_GLASS(lazy { Key.key("minecraft:block/orange_stained_glass") }, lazy { listOf() }),
  ORANGE_TERRACOTTA(lazy { Key.key("minecraft:block/orange_terracotta") }, lazy { listOf() }),
  ORANGE_WOOL(lazy { Key.key("minecraft:block/orange_wool") }, lazy { listOf() }),
  OXIDIZED_CHISELED_COPPER(lazy { Key.key("minecraft:block/oxidized_chiseled_copper") }, lazy {
      listOf() }),
  OXIDIZED_COPPER(lazy { Key.key("minecraft:block/oxidized_copper") }, lazy { listOf() }),
  OXIDIZED_COPPER_BULB(lazy { Key.key("minecraft:block/oxidized_copper_bulb") }, lazy { listOf() }),
  OXIDIZED_COPPER_GRATE(lazy { Key.key("minecraft:block/oxidized_copper_grate") }, lazy { listOf()
      }),
  OXIDIZED_COPPER_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/oxidized_copper_trapdoor_bottom")
      }, lazy { listOf() }),
  OXIDIZED_CUT_COPPER(lazy { Key.key("minecraft:block/oxidized_cut_copper") }, lazy { listOf() }),
  OXIDIZED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:block/oxidized_cut_copper_slab") }, lazy {
      listOf() }),
  OXIDIZED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:block/oxidized_cut_copper_stairs") }, lazy {
      listOf() }),
  PACKED_ICE(lazy { Key.key("minecraft:block/packed_ice") }, lazy { listOf() }),
  PACKED_MUD(lazy { Key.key("minecraft:block/packed_mud") }, lazy { listOf() }),
  PEARLESCENT_FROGLIGHT(lazy { Key.key("minecraft:block/pearlescent_froglight") }, lazy { listOf()
      }),
  PETRIFIED_OAK_SLAB(lazy { Key.key("minecraft:block/petrified_oak_slab") }, lazy { listOf() }),
  PINK_CARPET(lazy { Key.key("minecraft:block/pink_carpet") }, lazy { listOf() }),
  PINK_CONCRETE(lazy { Key.key("minecraft:block/pink_concrete") }, lazy { listOf() }),
  PINK_CONCRETE_POWDER(lazy { Key.key("minecraft:block/pink_concrete_powder") }, lazy { listOf() }),
  PINK_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/pink_glazed_terracotta") }, lazy { listOf()
      }),
  PINK_STAINED_GLASS(lazy { Key.key("minecraft:block/pink_stained_glass") }, lazy { listOf() }),
  PINK_TERRACOTTA(lazy { Key.key("minecraft:block/pink_terracotta") }, lazy { listOf() }),
  PINK_WOOL(lazy { Key.key("minecraft:block/pink_wool") }, lazy { listOf() }),
  PISTON_INVENTORY(lazy { Key.key("minecraft:block/piston_inventory") }, lazy { listOf() }),
  PODZOL(lazy { Key.key("minecraft:block/podzol") }, lazy { listOf() }),
  POLISHED_ANDESITE(lazy { Key.key("minecraft:block/polished_andesite") }, lazy { listOf() }),
  POLISHED_ANDESITE_SLAB(lazy { Key.key("minecraft:block/polished_andesite_slab") }, lazy { listOf()
      }),
  POLISHED_ANDESITE_STAIRS(lazy { Key.key("minecraft:block/polished_andesite_stairs") }, lazy {
      listOf() }),
  POLISHED_BASALT(lazy { Key.key("minecraft:block/polished_basalt") }, lazy { listOf() }),
  POLISHED_BLACKSTONE(lazy { Key.key("minecraft:block/polished_blackstone") }, lazy { listOf() }),
  POLISHED_BLACKSTONE_BRICKS(lazy { Key.key("minecraft:block/polished_blackstone_bricks") }, lazy {
      listOf() }),
  POLISHED_BLACKSTONE_BRICK_SLAB(lazy { Key.key("minecraft:block/polished_blackstone_brick_slab") },
      lazy { listOf() }),
  POLISHED_BLACKSTONE_BRICK_STAIRS(lazy {
      Key.key("minecraft:block/polished_blackstone_brick_stairs") }, lazy { listOf() }),
  POLISHED_BLACKSTONE_BRICK_WALL_INVENTORY(lazy {
      Key.key("minecraft:block/polished_blackstone_brick_wall_inventory") }, lazy { listOf() }),
  POLISHED_BLACKSTONE_BUTTON_INVENTORY(lazy {
      Key.key("minecraft:block/polished_blackstone_button_inventory") }, lazy { listOf() }),
  POLISHED_BLACKSTONE_PRESSURE_PLATE(lazy {
      Key.key("minecraft:block/polished_blackstone_pressure_plate") }, lazy { listOf() }),
  POLISHED_BLACKSTONE_SLAB(lazy { Key.key("minecraft:block/polished_blackstone_slab") }, lazy {
      listOf() }),
  POLISHED_BLACKSTONE_STAIRS(lazy { Key.key("minecraft:block/polished_blackstone_stairs") }, lazy {
      listOf() }),
  POLISHED_BLACKSTONE_WALL_INVENTORY(lazy {
      Key.key("minecraft:block/polished_blackstone_wall_inventory") }, lazy { listOf() }),
  POLISHED_DEEPSLATE(lazy { Key.key("minecraft:block/polished_deepslate") }, lazy { listOf() }),
  POLISHED_DEEPSLATE_SLAB(lazy { Key.key("minecraft:block/polished_deepslate_slab") }, lazy {
      listOf() }),
  POLISHED_DEEPSLATE_STAIRS(lazy { Key.key("minecraft:block/polished_deepslate_stairs") }, lazy {
      listOf() }),
  POLISHED_DEEPSLATE_WALL_INVENTORY(lazy {
      Key.key("minecraft:block/polished_deepslate_wall_inventory") }, lazy { listOf() }),
  POLISHED_DIORITE(lazy { Key.key("minecraft:block/polished_diorite") }, lazy { listOf() }),
  POLISHED_DIORITE_SLAB(lazy { Key.key("minecraft:block/polished_diorite_slab") }, lazy { listOf()
      }),
  POLISHED_DIORITE_STAIRS(lazy { Key.key("minecraft:block/polished_diorite_stairs") }, lazy {
      listOf() }),
  POLISHED_GRANITE(lazy { Key.key("minecraft:block/polished_granite") }, lazy { listOf() }),
  POLISHED_GRANITE_SLAB(lazy { Key.key("minecraft:block/polished_granite_slab") }, lazy { listOf()
      }),
  POLISHED_GRANITE_STAIRS(lazy { Key.key("minecraft:block/polished_granite_stairs") }, lazy {
      listOf() }),
  POLISHED_TUFF(lazy { Key.key("minecraft:block/polished_tuff") }, lazy { listOf() }),
  POLISHED_TUFF_SLAB(lazy { Key.key("minecraft:block/polished_tuff_slab") }, lazy { listOf() }),
  POLISHED_TUFF_STAIRS(lazy { Key.key("minecraft:block/polished_tuff_stairs") }, lazy { listOf() }),
  POLISHED_TUFF_WALL_INVENTORY(lazy { Key.key("minecraft:block/polished_tuff_wall_inventory") },
      lazy { listOf() }),
  PRISMARINE(lazy { Key.key("minecraft:block/prismarine") }, lazy { listOf() }),
  PRISMARINE_BRICKS(lazy { Key.key("minecraft:block/prismarine_bricks") }, lazy { listOf() }),
  PRISMARINE_BRICK_SLAB(lazy { Key.key("minecraft:block/prismarine_brick_slab") }, lazy { listOf()
      }),
  PRISMARINE_BRICK_STAIRS(lazy { Key.key("minecraft:block/prismarine_brick_stairs") }, lazy {
      listOf() }),
  PRISMARINE_SLAB(lazy { Key.key("minecraft:block/prismarine_slab") }, lazy { listOf() }),
  PRISMARINE_STAIRS(lazy { Key.key("minecraft:block/prismarine_stairs") }, lazy { listOf() }),
  PRISMARINE_WALL_INVENTORY(lazy { Key.key("minecraft:block/prismarine_wall_inventory") }, lazy {
      listOf() }),
  PUMPKIN(lazy { Key.key("minecraft:block/pumpkin") }, lazy { listOf() }),
  PURPLE_CARPET(lazy { Key.key("minecraft:block/purple_carpet") }, lazy { listOf() }),
  PURPLE_CONCRETE(lazy { Key.key("minecraft:block/purple_concrete") }, lazy { listOf() }),
  PURPLE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/purple_concrete_powder") }, lazy { listOf()
      }),
  PURPLE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/purple_glazed_terracotta") }, lazy {
      listOf() }),
  PURPLE_STAINED_GLASS(lazy { Key.key("minecraft:block/purple_stained_glass") }, lazy { listOf() }),
  PURPLE_TERRACOTTA(lazy { Key.key("minecraft:block/purple_terracotta") }, lazy { listOf() }),
  PURPLE_WOOL(lazy { Key.key("minecraft:block/purple_wool") }, lazy { listOf() }),
  PURPUR_BLOCK(lazy { Key.key("minecraft:block/purpur_block") }, lazy { listOf() }),
  PURPUR_PILLAR(lazy { Key.key("minecraft:block/purpur_pillar") }, lazy { listOf() }),
  PURPUR_SLAB(lazy { Key.key("minecraft:block/purpur_slab") }, lazy { listOf() }),
  PURPUR_STAIRS(lazy { Key.key("minecraft:block/purpur_stairs") }, lazy { listOf() }),
  QUARTZ_BLOCK(lazy { Key.key("minecraft:block/quartz_block") }, lazy { listOf() }),
  QUARTZ_BRICKS(lazy { Key.key("minecraft:block/quartz_bricks") }, lazy { listOf() }),
  QUARTZ_PILLAR(lazy { Key.key("minecraft:block/quartz_pillar") }, lazy { listOf() }),
  QUARTZ_SLAB(lazy { Key.key("minecraft:block/quartz_slab") }, lazy { listOf() }),
  QUARTZ_STAIRS(lazy { Key.key("minecraft:block/quartz_stairs") }, lazy { listOf() }),
  RAW_COPPER_BLOCK(lazy { Key.key("minecraft:block/raw_copper_block") }, lazy { listOf() }),
  RAW_GOLD_BLOCK(lazy { Key.key("minecraft:block/raw_gold_block") }, lazy { listOf() }),
  RAW_IRON_BLOCK(lazy { Key.key("minecraft:block/raw_iron_block") }, lazy { listOf() }),
  REDSTONE_BLOCK(lazy { Key.key("minecraft:block/redstone_block") }, lazy { listOf() }),
  REDSTONE_LAMP(lazy { Key.key("minecraft:block/redstone_lamp") }, lazy { listOf() }),
  REDSTONE_ORE(lazy { Key.key("minecraft:block/redstone_ore") }, lazy { listOf() }),
  RED_CARPET(lazy { Key.key("minecraft:block/red_carpet") }, lazy { listOf() }),
  RED_CONCRETE(lazy { Key.key("minecraft:block/red_concrete") }, lazy { listOf() }),
  RED_CONCRETE_POWDER(lazy { Key.key("minecraft:block/red_concrete_powder") }, lazy { listOf() }),
  RED_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/red_glazed_terracotta") }, lazy { listOf()
      }),
  RED_MUSHROOM_BLOCK_INVENTORY(lazy { Key.key("minecraft:block/red_mushroom_block_inventory") },
      lazy { listOf() }),
  RED_NETHER_BRICKS(lazy { Key.key("minecraft:block/red_nether_bricks") }, lazy { listOf() }),
  RED_NETHER_BRICK_SLAB(lazy { Key.key("minecraft:block/red_nether_brick_slab") }, lazy { listOf()
      }),
  RED_NETHER_BRICK_STAIRS(lazy { Key.key("minecraft:block/red_nether_brick_stairs") }, lazy {
      listOf() }),
  RED_NETHER_BRICK_WALL_INVENTORY(lazy { Key.key("minecraft:block/red_nether_brick_wall_inventory")
      }, lazy { listOf() }),
  RED_SAND(lazy { Key.key("minecraft:block/red_sand") }, lazy { listOf() }),
  RED_SANDSTONE(lazy { Key.key("minecraft:block/red_sandstone") }, lazy { listOf() }),
  RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/red_sandstone_slab") }, lazy { listOf() }),
  RED_SANDSTONE_STAIRS(lazy { Key.key("minecraft:block/red_sandstone_stairs") }, lazy { listOf() }),
  RED_SANDSTONE_WALL_INVENTORY(lazy { Key.key("minecraft:block/red_sandstone_wall_inventory") },
      lazy { listOf() }),
  RED_STAINED_GLASS(lazy { Key.key("minecraft:block/red_stained_glass") }, lazy { listOf() }),
  RED_TERRACOTTA(lazy { Key.key("minecraft:block/red_terracotta") }, lazy { listOf() }),
  RED_WOOL(lazy { Key.key("minecraft:block/red_wool") }, lazy { listOf() }),
  REINFORCED_DEEPSLATE(lazy { Key.key("minecraft:block/reinforced_deepslate") }, lazy { listOf() }),
  REPEATING_COMMAND_BLOCK(lazy { Key.key("minecraft:block/repeating_command_block") }, lazy {
      listOf() }),
  RESPAWN_ANCHOR_0(lazy { Key.key("minecraft:block/respawn_anchor_0") }, lazy { listOf() }),
  ROOTED_DIRT(lazy { Key.key("minecraft:block/rooted_dirt") }, lazy { listOf() }),
  SAND(lazy { Key.key("minecraft:block/sand") }, lazy { listOf() }),
  SANDSTONE(lazy { Key.key("minecraft:block/sandstone") }, lazy { listOf() }),
  SANDSTONE_SLAB(lazy { Key.key("minecraft:block/sandstone_slab") }, lazy { listOf() }),
  SANDSTONE_STAIRS(lazy { Key.key("minecraft:block/sandstone_stairs") }, lazy { listOf() }),
  SANDSTONE_WALL_INVENTORY(lazy { Key.key("minecraft:block/sandstone_wall_inventory") }, lazy {
      listOf() }),
  SCAFFOLDING_STABLE(lazy { Key.key("minecraft:block/scaffolding_stable") }, lazy { listOf() }),
  SCULK(lazy { Key.key("minecraft:block/sculk") }, lazy { listOf() }),
  SCULK_CATALYST(lazy { Key.key("minecraft:block/sculk_catalyst") }, lazy { listOf() }),
  SCULK_SENSOR_INACTIVE(lazy { Key.key("minecraft:block/sculk_sensor_inactive") }, lazy { listOf()
      }),
  SCULK_SHRIEKER(lazy { Key.key("minecraft:block/sculk_shrieker") }, lazy { listOf() }),
  SEA_LANTERN(lazy { Key.key("minecraft:block/sea_lantern") }, lazy { listOf() }),
  SHROOMLIGHT(lazy { Key.key("minecraft:block/shroomlight") }, lazy { listOf() }),
  SLIME_BLOCK(lazy { Key.key("minecraft:block/slime_block") }, lazy { listOf() }),
  SMALL_DRIPLEAF_TOP(lazy { Key.key("minecraft:block/small_dripleaf_top") }, lazy { listOf() }),
  SMITHING_TABLE(lazy { Key.key("minecraft:block/smithing_table") }, lazy { listOf() }),
  SMOKER(lazy { Key.key("minecraft:block/smoker") }, lazy { listOf() }),
  SMOOTH_BASALT(lazy { Key.key("minecraft:block/smooth_basalt") }, lazy { listOf() }),
  SMOOTH_QUARTZ(lazy { Key.key("minecraft:block/smooth_quartz") }, lazy { listOf() }),
  SMOOTH_QUARTZ_SLAB(lazy { Key.key("minecraft:block/smooth_quartz_slab") }, lazy { listOf() }),
  SMOOTH_QUARTZ_STAIRS(lazy { Key.key("minecraft:block/smooth_quartz_stairs") }, lazy { listOf() }),
  SMOOTH_RED_SANDSTONE(lazy { Key.key("minecraft:block/smooth_red_sandstone") }, lazy { listOf() }),
  SMOOTH_RED_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/smooth_red_sandstone_slab") }, lazy {
      listOf() }),
  SMOOTH_RED_SANDSTONE_STAIRS(lazy { Key.key("minecraft:block/smooth_red_sandstone_stairs") }, lazy
      { listOf() }),
  SMOOTH_SANDSTONE(lazy { Key.key("minecraft:block/smooth_sandstone") }, lazy { listOf() }),
  SMOOTH_SANDSTONE_SLAB(lazy { Key.key("minecraft:block/smooth_sandstone_slab") }, lazy { listOf()
      }),
  SMOOTH_SANDSTONE_STAIRS(lazy { Key.key("minecraft:block/smooth_sandstone_stairs") }, lazy {
      listOf() }),
  SMOOTH_STONE(lazy { Key.key("minecraft:block/smooth_stone") }, lazy { listOf() }),
  SMOOTH_STONE_SLAB(lazy { Key.key("minecraft:block/smooth_stone_slab") }, lazy { listOf() }),
  SNOW_HEIGHT2(lazy { Key.key("minecraft:block/snow_height2") }, lazy { listOf() }),
  SNOW_BLOCK(lazy { Key.key("minecraft:block/snow_block") }, lazy { listOf() }),
  SOUL_SAND(lazy { Key.key("minecraft:block/soul_sand") }, lazy { listOf() }),
  SOUL_SOIL(lazy { Key.key("minecraft:block/soul_soil") }, lazy { listOf() }),
  SPAWNER(lazy { Key.key("minecraft:block/spawner") }, lazy { listOf() }),
  SPONGE(lazy { Key.key("minecraft:block/sponge") }, lazy { listOf() }),
  SPORE_BLOSSOM(lazy { Key.key("minecraft:block/spore_blossom") }, lazy { listOf() }),
  SPRUCE_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/spruce_button_inventory") }, lazy {
      listOf() }),
  SPRUCE_FENCE_INVENTORY(lazy { Key.key("minecraft:block/spruce_fence_inventory") }, lazy { listOf()
      }),
  SPRUCE_FENCE_GATE(lazy { Key.key("minecraft:block/spruce_fence_gate") }, lazy { listOf() }),
  SPRUCE_LEAVES(lazy { Key.key("minecraft:block/spruce_leaves") }, lazy { listOf() }),
  SPRUCE_LOG(lazy { Key.key("minecraft:block/spruce_log") }, lazy { listOf() }),
  SPRUCE_PLANKS(lazy { Key.key("minecraft:block/spruce_planks") }, lazy { listOf() }),
  SPRUCE_PRESSURE_PLATE(lazy { Key.key("minecraft:block/spruce_pressure_plate") }, lazy { listOf()
      }),
  SPRUCE_SLAB(lazy { Key.key("minecraft:block/spruce_slab") }, lazy { listOf() }),
  SPRUCE_STAIRS(lazy { Key.key("minecraft:block/spruce_stairs") }, lazy { listOf() }),
  SPRUCE_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/spruce_trapdoor_bottom") }, lazy { listOf()
      }),
  SPRUCE_WOOD(lazy { Key.key("minecraft:block/spruce_wood") }, lazy { listOf() }),
  STICKY_PISTON_INVENTORY(lazy { Key.key("minecraft:block/sticky_piston_inventory") }, lazy {
      listOf() }),
  STONECUTTER(lazy { Key.key("minecraft:block/stonecutter") }, lazy { listOf() }),
  STONE_BRICK_SLAB(lazy { Key.key("minecraft:block/stone_brick_slab") }, lazy { listOf() }),
  STONE_BRICK_STAIRS(lazy { Key.key("minecraft:block/stone_brick_stairs") }, lazy { listOf() }),
  STONE_BRICK_WALL_INVENTORY(lazy { Key.key("minecraft:block/stone_brick_wall_inventory") }, lazy {
      listOf() }),
  STONE_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/stone_button_inventory") }, lazy { listOf()
      }),
  STONE_PRESSURE_PLATE(lazy { Key.key("minecraft:block/stone_pressure_plate") }, lazy { listOf() }),
  STONE_SLAB(lazy { Key.key("minecraft:block/stone_slab") }, lazy { listOf() }),
  STONE_STAIRS(lazy { Key.key("minecraft:block/stone_stairs") }, lazy { listOf() }),
  STRIPPED_ACACIA_LOG(lazy { Key.key("minecraft:block/stripped_acacia_log") }, lazy { listOf() }),
  STRIPPED_ACACIA_WOOD(lazy { Key.key("minecraft:block/stripped_acacia_wood") }, lazy { listOf() }),
  STRIPPED_BAMBOO_BLOCK(lazy { Key.key("minecraft:block/stripped_bamboo_block") }, lazy { listOf()
      }),
  STRIPPED_BIRCH_LOG(lazy { Key.key("minecraft:block/stripped_birch_log") }, lazy { listOf() }),
  STRIPPED_BIRCH_WOOD(lazy { Key.key("minecraft:block/stripped_birch_wood") }, lazy { listOf() }),
  STRIPPED_CHERRY_LOG(lazy { Key.key("minecraft:block/stripped_cherry_log") }, lazy { listOf() }),
  STRIPPED_CHERRY_WOOD(lazy { Key.key("minecraft:block/stripped_cherry_wood") }, lazy { listOf() }),
  STRIPPED_CRIMSON_HYPHAE(lazy { Key.key("minecraft:block/stripped_crimson_hyphae") }, lazy {
      listOf() }),
  STRIPPED_CRIMSON_STEM(lazy { Key.key("minecraft:block/stripped_crimson_stem") }, lazy { listOf()
      }),
  STRIPPED_DARK_OAK_LOG(lazy { Key.key("minecraft:block/stripped_dark_oak_log") }, lazy { listOf()
      }),
  STRIPPED_DARK_OAK_WOOD(lazy { Key.key("minecraft:block/stripped_dark_oak_wood") }, lazy { listOf()
      }),
  STRIPPED_JUNGLE_LOG(lazy { Key.key("minecraft:block/stripped_jungle_log") }, lazy { listOf() }),
  STRIPPED_JUNGLE_WOOD(lazy { Key.key("minecraft:block/stripped_jungle_wood") }, lazy { listOf() }),
  STRIPPED_MANGROVE_LOG(lazy { Key.key("minecraft:block/stripped_mangrove_log") }, lazy { listOf()
      }),
  STRIPPED_MANGROVE_WOOD(lazy { Key.key("minecraft:block/stripped_mangrove_wood") }, lazy { listOf()
      }),
  STRIPPED_OAK_LOG(lazy { Key.key("minecraft:block/stripped_oak_log") }, lazy { listOf() }),
  STRIPPED_OAK_WOOD(lazy { Key.key("minecraft:block/stripped_oak_wood") }, lazy { listOf() }),
  STRIPPED_SPRUCE_LOG(lazy { Key.key("minecraft:block/stripped_spruce_log") }, lazy { listOf() }),
  STRIPPED_SPRUCE_WOOD(lazy { Key.key("minecraft:block/stripped_spruce_wood") }, lazy { listOf() }),
  STRIPPED_WARPED_HYPHAE(lazy { Key.key("minecraft:block/stripped_warped_hyphae") }, lazy { listOf()
      }),
  STRIPPED_WARPED_STEM(lazy { Key.key("minecraft:block/stripped_warped_stem") }, lazy { listOf() }),
  STRUCTURE_BLOCK(lazy { Key.key("minecraft:block/structure_block") }, lazy { listOf() }),
  SUSPICIOUS_GRAVEL_0(lazy { Key.key("minecraft:block/suspicious_gravel_0") }, lazy { listOf() }),
  SUSPICIOUS_SAND_0(lazy { Key.key("minecraft:block/suspicious_sand_0") }, lazy { listOf() }),
  TARGET(lazy { Key.key("minecraft:block/target") }, lazy { listOf() }),
  TERRACOTTA(lazy { Key.key("minecraft:block/terracotta") }, lazy { listOf() }),
  TINTED_GLASS(lazy { Key.key("minecraft:block/tinted_glass") }, lazy { listOf() }),
  TNT(lazy { Key.key("minecraft:block/tnt") }, lazy { listOf() }),
  TRIAL_SPAWNER(lazy { Key.key("minecraft:block/trial_spawner") }, lazy { listOf() }),
  TUBE_CORAL_BLOCK(lazy { Key.key("minecraft:block/tube_coral_block") }, lazy { listOf() }),
  TUFF(lazy { Key.key("minecraft:block/tuff") }, lazy { listOf() }),
  TUFF_BRICKS(lazy { Key.key("minecraft:block/tuff_bricks") }, lazy { listOf() }),
  TUFF_BRICK_SLAB(lazy { Key.key("minecraft:block/tuff_brick_slab") }, lazy { listOf() }),
  TUFF_BRICK_STAIRS(lazy { Key.key("minecraft:block/tuff_brick_stairs") }, lazy { listOf() }),
  TUFF_BRICK_WALL_INVENTORY(lazy { Key.key("minecraft:block/tuff_brick_wall_inventory") }, lazy {
      listOf() }),
  TUFF_SLAB(lazy { Key.key("minecraft:block/tuff_slab") }, lazy { listOf() }),
  TUFF_STAIRS(lazy { Key.key("minecraft:block/tuff_stairs") }, lazy { listOf() }),
  TUFF_WALL_INVENTORY(lazy { Key.key("minecraft:block/tuff_wall_inventory") }, lazy { listOf() }),
  VAULT(lazy { Key.key("minecraft:block/vault") }, lazy { listOf() }),
  VERDANT_FROGLIGHT(lazy { Key.key("minecraft:block/verdant_froglight") }, lazy { listOf() }),
  WARPED_BUTTON_INVENTORY(lazy { Key.key("minecraft:block/warped_button_inventory") }, lazy {
      listOf() }),
  WARPED_FENCE_INVENTORY(lazy { Key.key("minecraft:block/warped_fence_inventory") }, lazy { listOf()
      }),
  WARPED_FENCE_GATE(lazy { Key.key("minecraft:block/warped_fence_gate") }, lazy { listOf() }),
  WARPED_HYPHAE(lazy { Key.key("minecraft:block/warped_hyphae") }, lazy { listOf() }),
  WARPED_NYLIUM(lazy { Key.key("minecraft:block/warped_nylium") }, lazy { listOf() }),
  WARPED_PLANKS(lazy { Key.key("minecraft:block/warped_planks") }, lazy { listOf() }),
  WARPED_PRESSURE_PLATE(lazy { Key.key("minecraft:block/warped_pressure_plate") }, lazy { listOf()
      }),
  WARPED_SLAB(lazy { Key.key("minecraft:block/warped_slab") }, lazy { listOf() }),
  WARPED_STAIRS(lazy { Key.key("minecraft:block/warped_stairs") }, lazy { listOf() }),
  WARPED_STEM(lazy { Key.key("minecraft:block/warped_stem") }, lazy { listOf() }),
  WARPED_TRAPDOOR_BOTTOM(lazy { Key.key("minecraft:block/warped_trapdoor_bottom") }, lazy { listOf()
      }),
  WARPED_WART_BLOCK(lazy { Key.key("minecraft:block/warped_wart_block") }, lazy { listOf() }),
  WEATHERED_CHISELED_COPPER(lazy { Key.key("minecraft:block/weathered_chiseled_copper") }, lazy {
      listOf() }),
  WEATHERED_COPPER(lazy { Key.key("minecraft:block/weathered_copper") }, lazy { listOf() }),
  WEATHERED_COPPER_GRATE(lazy { Key.key("minecraft:block/weathered_copper_grate") }, lazy { listOf()
      }),
  WEATHERED_CUT_COPPER(lazy { Key.key("minecraft:block/weathered_cut_copper") }, lazy { listOf() }),
  WEATHERED_CUT_COPPER_SLAB(lazy { Key.key("minecraft:block/weathered_cut_copper_slab") }, lazy {
      listOf() }),
  WEATHERED_CUT_COPPER_STAIRS(lazy { Key.key("minecraft:block/weathered_cut_copper_stairs") }, lazy
      { listOf() }),
  WEATHERED_COPPER_BULB(lazy { Key.key("minecraft:block/weathered_copper_bulb") }, lazy { listOf()
      }),
  WEATHERED_COPPER_TRAPDOOR_BOTTOM(lazy {
      Key.key("minecraft:block/weathered_copper_trapdoor_bottom") }, lazy { listOf() }),
  WET_SPONGE(lazy { Key.key("minecraft:block/wet_sponge") }, lazy { listOf() }),
  WHITE_CARPET(lazy { Key.key("minecraft:block/white_carpet") }, lazy { listOf() }),
  WHITE_CONCRETE(lazy { Key.key("minecraft:block/white_concrete") }, lazy { listOf() }),
  WHITE_CONCRETE_POWDER(lazy { Key.key("minecraft:block/white_concrete_powder") }, lazy { listOf()
      }),
  WHITE_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/white_glazed_terracotta") }, lazy {
      listOf() }),
  WHITE_STAINED_GLASS(lazy { Key.key("minecraft:block/white_stained_glass") }, lazy { listOf() }),
  WHITE_TERRACOTTA(lazy { Key.key("minecraft:block/white_terracotta") }, lazy { listOf() }),
  WHITE_WOOL(lazy { Key.key("minecraft:block/white_wool") }, lazy { listOf() }),
  YELLOW_CARPET(lazy { Key.key("minecraft:block/yellow_carpet") }, lazy { listOf() }),
  YELLOW_CONCRETE(lazy { Key.key("minecraft:block/yellow_concrete") }, lazy { listOf() }),
  YELLOW_CONCRETE_POWDER(lazy { Key.key("minecraft:block/yellow_concrete_powder") }, lazy { listOf()
      }),
  YELLOW_GLAZED_TERRACOTTA(lazy { Key.key("minecraft:block/yellow_glazed_terracotta") }, lazy {
      listOf() }),
  YELLOW_STAINED_GLASS(lazy { Key.key("minecraft:block/yellow_stained_glass") }, lazy { listOf() }),
  YELLOW_TERRACOTTA(lazy { Key.key("minecraft:block/yellow_terracotta") }, lazy { listOf() }),
  YELLOW_WOOL(lazy { Key.key("minecraft:block/yellow_wool") }, lazy { listOf() }),
  ;

  public fun toGeneric(): SolidMaterialParent = SolidMaterialParent(key.value, textureIds.value)
}
