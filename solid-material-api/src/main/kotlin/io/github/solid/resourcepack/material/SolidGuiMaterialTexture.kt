package io.github.solid.resourcepack.material

import kotlin.Lazy
import net.kyori.adventure.key.Key

public enum class SolidGuiMaterialTexture(
  public val key: Lazy<Key>,
) {
  EDITION(lazy { Key.key("minecraft:gui/title/edition") }),
  MINCERAFT(lazy { Key.key("minecraft:gui/title/minceraft") }),
  MINECRAFT(lazy { Key.key("minecraft:gui/title/minecraft") }),
  REALMS(lazy { Key.key("minecraft:gui/title/realms") }),
  TITLE_BOX(lazy { Key.key("minecraft:gui/sprites/advancements/title_box") }),
  TRIAL_AVAILABLE(lazy { Key.key("minecraft:gui/sprites/icon/trial_available") }),
  BACKGROUND(lazy { Key.key("minecraft:gui/sprites/container/bundle/background") }),
  EXPIRES_SOON(lazy { Key.key("minecraft:gui/sprites/realm_status/expires_soon") }),
  OVERLAY_RECIPE(lazy { Key.key("minecraft:gui/sprites/recipe_book/overlay_recipe") }),
  BUTTON(lazy { Key.key("minecraft:gui/sprites/container/beacon/button") }),
  BUTTON_DISABLED(lazy { Key.key("minecraft:gui/sprites/container/beacon/button_disabled") }),
  BUTTON_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/container/beacon/button_highlighted") }),
  SCROLLER(lazy { Key.key("minecraft:gui/sprites/container/villager/scroller") }),
  SCROLLER_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/widget/scroller_background") }),
  SLIDER(lazy { Key.key("minecraft:gui/sprites/widget/slider") }),
  SLIDER_HANDLE(lazy { Key.key("minecraft:gui/sprites/widget/slider_handle") }),
  SLIDER_HANDLE_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/slider_handle_highlighted")
      }),
  SLIDER_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/slider_highlighted") }),
  TAB(lazy { Key.key("minecraft:gui/sprites/recipe_book/tab") }),
  TAB_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/tab_highlighted") }),
  TAB_SELECTED(lazy { Key.key("minecraft:gui/sprites/recipe_book/tab_selected") }),
  TAB_SELECTED_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/tab_selected_highlighted")
      }),
  TEXT_FIELD(lazy { Key.key("minecraft:gui/sprites/container/anvil/text_field") }),
  TEXT_FIELD_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/text_field_highlighted") }),
  BOOK(lazy { Key.key("minecraft:gui/book") }),
  DEMO_BACKGROUND(lazy { Key.key("minecraft:gui/demo_background") }),
  FOOTER_SEPARATOR(lazy { Key.key("minecraft:gui/footer_separator") }),
  HEADER_SEPARATOR(lazy { Key.key("minecraft:gui/header_separator") }),
  INWORLD_FOOTER_SEPARATOR(lazy { Key.key("minecraft:gui/inworld_footer_separator") }),
  INWORLD_HEADER_SEPARATOR(lazy { Key.key("minecraft:gui/inworld_header_separator") }),
  INWORLD_MENU_BACKGROUND(lazy { Key.key("minecraft:gui/inworld_menu_background") }),
  INWORLD_MENU_LIST_BACKGROUND(lazy { Key.key("minecraft:gui/inworld_menu_list_background") }),
  MENU_BACKGROUND(lazy { Key.key("minecraft:gui/menu_background") }),
  MENU_LIST_BACKGROUND(lazy { Key.key("minecraft:gui/menu_list_background") }),
  RECIPE_BOOK(lazy { Key.key("minecraft:gui/sprites/toast/recipe_book") }),
  TAB_HEADER_BACKGROUND(lazy { Key.key("minecraft:gui/tab_header_background") }),
  WINDOW(lazy { Key.key("minecraft:gui/advancements/window") }),
  ANVIL(lazy { Key.key("minecraft:gui/container/anvil") }),
  BEACON(lazy { Key.key("minecraft:gui/container/beacon") }),
  BLAST_FURNACE(lazy { Key.key("minecraft:gui/container/blast_furnace") }),
  BREWING_STAND(lazy { Key.key("minecraft:gui/container/brewing_stand") }),
  CARTOGRAPHY_TABLE(lazy { Key.key("minecraft:gui/container/cartography_table") }),
  CRAFTER(lazy { Key.key("minecraft:gui/container/crafter") }),
  CRAFTING_TABLE(lazy { Key.key("minecraft:gui/container/crafting_table") }),
  DISPENSER(lazy { Key.key("minecraft:gui/container/dispenser") }),
  ENCHANTING_TABLE(lazy { Key.key("minecraft:gui/container/enchanting_table") }),
  FURNACE(lazy { Key.key("minecraft:gui/container/furnace") }),
  GAMEMODE_SWITCHER(lazy { Key.key("minecraft:gui/container/gamemode_switcher") }),
  GENERIC_54(lazy { Key.key("minecraft:gui/container/generic_54") }),
  GRINDSTONE(lazy { Key.key("minecraft:gui/container/grindstone") }),
  HOPPER(lazy { Key.key("minecraft:gui/container/hopper") }),
  HORSE(lazy { Key.key("minecraft:gui/container/horse") }),
  INVENTORY(lazy { Key.key("minecraft:gui/container/inventory") }),
  LOOM(lazy { Key.key("minecraft:gui/container/loom") }),
  SHULKER_BOX(lazy { Key.key("minecraft:gui/container/shulker_box") }),
  SMITHING(lazy { Key.key("minecraft:gui/container/smithing") }),
  SMOKER(lazy { Key.key("minecraft:gui/container/smoker") }),
  STONECUTTER(lazy { Key.key("minecraft:gui/container/stonecutter") }),
  VILLAGER(lazy { Key.key("minecraft:gui/container/villager") }),
  ACACIA(lazy { Key.key("minecraft:gui/hanging_signs/acacia") }),
  BAMBOO(lazy { Key.key("minecraft:gui/hanging_signs/bamboo") }),
  BIRCH(lazy { Key.key("minecraft:gui/hanging_signs/birch") }),
  CHERRY(lazy { Key.key("minecraft:gui/hanging_signs/cherry") }),
  CRIMSON(lazy { Key.key("minecraft:gui/hanging_signs/crimson") }),
  DARK_OAK(lazy { Key.key("minecraft:gui/hanging_signs/dark_oak") }),
  JUNGLE(lazy { Key.key("minecraft:gui/hanging_signs/jungle") }),
  MANGROVE(lazy { Key.key("minecraft:gui/hanging_signs/mangrove") }),
  OAK(lazy { Key.key("minecraft:gui/hanging_signs/oak") }),
  SPRUCE(lazy { Key.key("minecraft:gui/hanging_signs/spruce") }),
  WARPED(lazy { Key.key("minecraft:gui/hanging_signs/warped") }),
  ISLES(lazy { Key.key("minecraft:gui/presets/isles") }),
  ADVENTURE(lazy { Key.key("minecraft:gui/advancements/backgrounds/adventure") }),
  EMPTY_FRAME(lazy { Key.key("minecraft:gui/realms/empty_frame") }),
  EXPERIENCE(lazy { Key.key("minecraft:gui/realms/experience") }),
  INSPIRATION(lazy { Key.key("minecraft:gui/realms/inspiration") }),
  NEW_WORLD(lazy { Key.key("minecraft:gui/realms/new_world") }),
  NO_REALMS(lazy { Key.key("minecraft:gui/realms/no_realms") }),
  SNAPSHOT_REALMS(lazy { Key.key("minecraft:gui/realms/snapshot_realms") }),
  SURVIVAL_SPAWN(lazy { Key.key("minecraft:gui/realms/survival_spawn") }),
  UPLOAD(lazy { Key.key("minecraft:gui/realms/upload") }),
  MOJANGSTUDIOS(lazy { Key.key("minecraft:gui/title/mojangstudios") }),
  END(lazy { Key.key("minecraft:gui/advancements/backgrounds/end") }),
  HUSBANDRY(lazy { Key.key("minecraft:gui/advancements/backgrounds/husbandry") }),
  NETHER(lazy { Key.key("minecraft:gui/advancements/backgrounds/nether") }),
  STONE(lazy { Key.key("minecraft:gui/advancements/backgrounds/stone") }),
  TAB_INVENTORY(lazy { Key.key("minecraft:gui/container/creative_inventory/tab_inventory") }),
  TAB_ITEMS(lazy { Key.key("minecraft:gui/container/creative_inventory/tab_items") }),
  TAB_ITEM_SEARCH(lazy { Key.key("minecraft:gui/container/creative_inventory/tab_item_search") }),
  BOX_OBTAINED(lazy { Key.key("minecraft:gui/sprites/advancements/box_obtained") }),
  BOX_UNOBTAINED(lazy { Key.key("minecraft:gui/sprites/advancements/box_unobtained") }),
  CHALLENGE_FRAME_OBTAINED(lazy {
      Key.key("minecraft:gui/sprites/advancements/challenge_frame_obtained") }),
  CHALLENGE_FRAME_UNOBTAINED(lazy {
      Key.key("minecraft:gui/sprites/advancements/challenge_frame_unobtained") }),
  GOAL_FRAME_OBTAINED(lazy { Key.key("minecraft:gui/sprites/advancements/goal_frame_obtained") }),
  GOAL_FRAME_UNOBTAINED(lazy { Key.key("minecraft:gui/sprites/advancements/goal_frame_unobtained")
      }),
  TAB_ABOVE_LEFT(lazy { Key.key("minecraft:gui/sprites/advancements/tab_above_left") }),
  TAB_ABOVE_LEFT_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_above_left_selected") }),
  TAB_ABOVE_MIDDLE(lazy { Key.key("minecraft:gui/sprites/advancements/tab_above_middle") }),
  TAB_ABOVE_MIDDLE_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_above_middle_selected") }),
  TAB_ABOVE_RIGHT(lazy { Key.key("minecraft:gui/sprites/advancements/tab_above_right") }),
  TAB_ABOVE_RIGHT_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_above_right_selected") }),
  TAB_BELOW_LEFT(lazy { Key.key("minecraft:gui/sprites/advancements/tab_below_left") }),
  TAB_BELOW_LEFT_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_below_left_selected") }),
  TAB_BELOW_MIDDLE(lazy { Key.key("minecraft:gui/sprites/advancements/tab_below_middle") }),
  TAB_BELOW_MIDDLE_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_below_middle_selected") }),
  TAB_BELOW_RIGHT(lazy { Key.key("minecraft:gui/sprites/advancements/tab_below_right") }),
  TAB_BELOW_RIGHT_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_below_right_selected") }),
  TAB_LEFT_BOTTOM(lazy { Key.key("minecraft:gui/sprites/advancements/tab_left_bottom") }),
  TAB_LEFT_BOTTOM_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_left_bottom_selected") }),
  TAB_LEFT_MIDDLE(lazy { Key.key("minecraft:gui/sprites/advancements/tab_left_middle") }),
  TAB_LEFT_MIDDLE_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_left_middle_selected") }),
  TAB_LEFT_TOP(lazy { Key.key("minecraft:gui/sprites/advancements/tab_left_top") }),
  TAB_LEFT_TOP_SELECTED(lazy { Key.key("minecraft:gui/sprites/advancements/tab_left_top_selected")
      }),
  TAB_RIGHT_BOTTOM(lazy { Key.key("minecraft:gui/sprites/advancements/tab_right_bottom") }),
  TAB_RIGHT_BOTTOM_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_right_bottom_selected") }),
  TAB_RIGHT_MIDDLE(lazy { Key.key("minecraft:gui/sprites/advancements/tab_right_middle") }),
  TAB_RIGHT_MIDDLE_SELECTED(lazy {
      Key.key("minecraft:gui/sprites/advancements/tab_right_middle_selected") }),
  TAB_RIGHT_TOP(lazy { Key.key("minecraft:gui/sprites/advancements/tab_right_top") }),
  TAB_RIGHT_TOP_SELECTED(lazy { Key.key("minecraft:gui/sprites/advancements/tab_right_top_selected")
      }),
  TASK_FRAME_OBTAINED(lazy { Key.key("minecraft:gui/sprites/advancements/task_frame_obtained") }),
  TASK_FRAME_UNOBTAINED(lazy { Key.key("minecraft:gui/sprites/advancements/task_frame_unobtained")
      }),
  BLUE_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/blue_background") }),
  BLUE_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/blue_progress") }),
  GREEN_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/green_background") }),
  GREEN_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/green_progress") }),
  NOTCHED_10_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/notched_10_background") }),
  NOTCHED_10_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/notched_10_progress") }),
  NOTCHED_12_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/notched_12_background") }),
  NOTCHED_12_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/notched_12_progress") }),
  NOTCHED_20_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/notched_20_background") }),
  NOTCHED_20_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/notched_20_progress") }),
  NOTCHED_6_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/notched_6_background") }),
  NOTCHED_6_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/notched_6_progress") }),
  PINK_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/pink_background") }),
  PINK_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/pink_progress") }),
  PURPLE_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/purple_background") }),
  PURPLE_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/purple_progress") }),
  RED_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/red_background") }),
  RED_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/red_progress") }),
  WHITE_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/white_background") }),
  WHITE_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/white_progress") }),
  YELLOW_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/boss_bar/yellow_background") }),
  YELLOW_PROGRESS(lazy { Key.key("minecraft:gui/sprites/boss_bar/yellow_progress") }),
  SLOT(lazy { Key.key("minecraft:gui/sprites/container/bundle/slot") }),
  SELECTION(lazy { Key.key("minecraft:gui/sprites/gamemode_switcher/selection") }),
  AIR(lazy { Key.key("minecraft:gui/sprites/hud/air") }),
  AIR_BURSTING(lazy { Key.key("minecraft:gui/sprites/hud/air_bursting") }),
  ARMOR_EMPTY(lazy { Key.key("minecraft:gui/sprites/hud/armor_empty") }),
  ARMOR_FULL(lazy { Key.key("minecraft:gui/sprites/hud/armor_full") }),
  ARMOR_HALF(lazy { Key.key("minecraft:gui/sprites/hud/armor_half") }),
  CROSSHAIR(lazy { Key.key("minecraft:gui/sprites/hud/crosshair") }),
  CROSSHAIR_ATTACK_INDICATOR_BACKGROUND(lazy {
      Key.key("minecraft:gui/sprites/hud/crosshair_attack_indicator_background") }),
  CROSSHAIR_ATTACK_INDICATOR_FULL(lazy {
      Key.key("minecraft:gui/sprites/hud/crosshair_attack_indicator_full") }),
  CROSSHAIR_ATTACK_INDICATOR_PROGRESS(lazy {
      Key.key("minecraft:gui/sprites/hud/crosshair_attack_indicator_progress") }),
  EFFECT_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/hud/effect_background") }),
  EFFECT_BACKGROUND_AMBIENT(lazy { Key.key("minecraft:gui/sprites/hud/effect_background_ambient")
      }),
  EXPERIENCE_BAR_BACKGROUND(lazy {
      Key.key("minecraft:gui/sprites/container/villager/experience_bar_background") }),
  EXPERIENCE_BAR_PROGRESS(lazy { Key.key("minecraft:gui/sprites/hud/experience_bar_progress") }),
  FOOD_EMPTY(lazy { Key.key("minecraft:gui/sprites/hud/food_empty") }),
  FOOD_EMPTY_HUNGER(lazy { Key.key("minecraft:gui/sprites/hud/food_empty_hunger") }),
  FOOD_FULL(lazy { Key.key("minecraft:gui/sprites/hud/food_full") }),
  FOOD_FULL_HUNGER(lazy { Key.key("minecraft:gui/sprites/hud/food_full_hunger") }),
  FOOD_HALF(lazy { Key.key("minecraft:gui/sprites/hud/food_half") }),
  FOOD_HALF_HUNGER(lazy { Key.key("minecraft:gui/sprites/hud/food_half_hunger") }),
  HOTBAR(lazy { Key.key("minecraft:gui/sprites/hud/hotbar") }),
  HOTBAR_ATTACK_INDICATOR_BACKGROUND(lazy {
      Key.key("minecraft:gui/sprites/hud/hotbar_attack_indicator_background") }),
  HOTBAR_ATTACK_INDICATOR_PROGRESS(lazy {
      Key.key("minecraft:gui/sprites/hud/hotbar_attack_indicator_progress") }),
  HOTBAR_OFFHAND_LEFT(lazy { Key.key("minecraft:gui/sprites/hud/hotbar_offhand_left") }),
  HOTBAR_OFFHAND_RIGHT(lazy { Key.key("minecraft:gui/sprites/hud/hotbar_offhand_right") }),
  HOTBAR_SELECTION(lazy { Key.key("minecraft:gui/sprites/hud/hotbar_selection") }),
  JUMP_BAR_BACKGROUND(lazy { Key.key("minecraft:gui/sprites/hud/jump_bar_background") }),
  JUMP_BAR_COOLDOWN(lazy { Key.key("minecraft:gui/sprites/hud/jump_bar_cooldown") }),
  JUMP_BAR_PROGRESS(lazy { Key.key("minecraft:gui/sprites/hud/jump_bar_progress") }),
  ACCESSIBILITY(lazy { Key.key("minecraft:gui/sprites/icon/accessibility") }),
  CHAT_MODIFIED(lazy { Key.key("minecraft:gui/sprites/icon/chat_modified") }),
  CHECKMARK(lazy { Key.key("minecraft:gui/sprites/icon/checkmark") }),
  DRAFT_REPORT(lazy { Key.key("minecraft:gui/sprites/icon/draft_report") }),
  INFO(lazy { Key.key("minecraft:gui/sprites/icon/info") }),
  INVITE(lazy { Key.key("minecraft:gui/sprites/icon/invite") }),
  LANGUAGE(lazy { Key.key("minecraft:gui/sprites/icon/language") }),
  LINK(lazy { Key.key("minecraft:gui/sprites/icon/link") }),
  LINK_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/icon/link_highlighted") }),
  NEWS(lazy { Key.key("minecraft:gui/sprites/icon/news") }),
  NEW_REALM(lazy { Key.key("minecraft:gui/sprites/icon/new_realm") }),
  PING_1(lazy { Key.key("minecraft:gui/sprites/server_list/ping_1") }),
  PING_2(lazy { Key.key("minecraft:gui/sprites/server_list/ping_2") }),
  PING_3(lazy { Key.key("minecraft:gui/sprites/server_list/ping_3") }),
  PING_4(lazy { Key.key("minecraft:gui/sprites/server_list/ping_4") }),
  PING_5(lazy { Key.key("minecraft:gui/sprites/server_list/ping_5") }),
  PING_UNKNOWN(lazy { Key.key("minecraft:gui/sprites/icon/ping_unknown") }),
  SEARCH(lazy { Key.key("minecraft:gui/sprites/icon/search") }),
  UNSEEN_NOTIFICATION(lazy { Key.key("minecraft:gui/sprites/icon/unseen_notification") }),
  VIDEO_LINK(lazy { Key.key("minecraft:gui/sprites/icon/video_link") }),
  VIDEO_LINK_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/icon/video_link_highlighted") }),
  `1`(lazy { Key.key("minecraft:gui/sprites/notification/1") }),
  `2`(lazy { Key.key("minecraft:gui/sprites/notification/2") }),
  `3`(lazy { Key.key("minecraft:gui/sprites/notification/3") }),
  `4`(lazy { Key.key("minecraft:gui/sprites/notification/4") }),
  `5`(lazy { Key.key("minecraft:gui/sprites/notification/5") }),
  MORE(lazy { Key.key("minecraft:gui/sprites/notification/more") }),
  ACCEPT(lazy { Key.key("minecraft:gui/sprites/pending_invite/accept") }),
  ACCEPT_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/pending_invite/accept_highlighted") }),
  REJECT(lazy { Key.key("minecraft:gui/sprites/pending_invite/reject") }),
  REJECT_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/pending_invite/reject_highlighted") }),
  MAKE_OPERATOR(lazy { Key.key("minecraft:gui/sprites/player_list/make_operator") }),
  REMOVE_OPERATOR(lazy { Key.key("minecraft:gui/sprites/player_list/remove_operator") }),
  REMOVE_PLAYER(lazy { Key.key("minecraft:gui/sprites/player_list/remove_player") }),
  CLOSED(lazy { Key.key("minecraft:gui/sprites/realm_status/closed") }),
  EXPIRED(lazy { Key.key("minecraft:gui/sprites/realm_status/expired") }),
  OPEN(lazy { Key.key("minecraft:gui/sprites/realm_status/open") }),
  CRAFTING_OVERLAY(lazy { Key.key("minecraft:gui/sprites/recipe_book/crafting_overlay") }),
  CRAFTING_OVERLAY_DISABLED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/crafting_overlay_disabled") }),
  CRAFTING_OVERLAY_DISABLED_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/crafting_overlay_disabled_highlighted") }),
  CRAFTING_OVERLAY_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/crafting_overlay_highlighted") }),
  FILTER_DISABLED(lazy { Key.key("minecraft:gui/sprites/recipe_book/filter_disabled") }),
  FILTER_DISABLED_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/filter_disabled_highlighted") }),
  FILTER_ENABLED(lazy { Key.key("minecraft:gui/sprites/recipe_book/filter_enabled") }),
  FILTER_ENABLED_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/filter_enabled_highlighted") }),
  FURNACE_FILTER_DISABLED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/furnace_filter_disabled") }),
  FURNACE_FILTER_DISABLED_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/furnace_filter_disabled_highlighted") }),
  FURNACE_FILTER_ENABLED(lazy { Key.key("minecraft:gui/sprites/recipe_book/furnace_filter_enabled")
      }),
  FURNACE_FILTER_ENABLED_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/furnace_filter_enabled_highlighted") }),
  FURNACE_OVERLAY(lazy { Key.key("minecraft:gui/sprites/recipe_book/furnace_overlay") }),
  FURNACE_OVERLAY_DISABLED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/furnace_overlay_disabled") }),
  FURNACE_OVERLAY_DISABLED_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/furnace_overlay_disabled_highlighted") }),
  FURNACE_OVERLAY_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/recipe_book/furnace_overlay_highlighted") }),
  PAGE_BACKWARD(lazy { Key.key("minecraft:gui/sprites/widget/page_backward") }),
  PAGE_BACKWARD_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/page_backward_highlighted")
      }),
  PAGE_FORWARD(lazy { Key.key("minecraft:gui/sprites/widget/page_forward") }),
  PAGE_FORWARD_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/page_forward_highlighted")
      }),
  SLOT_CRAFTABLE(lazy { Key.key("minecraft:gui/sprites/recipe_book/slot_craftable") }),
  SLOT_MANY_CRAFTABLE(lazy { Key.key("minecraft:gui/sprites/recipe_book/slot_many_craftable") }),
  SLOT_MANY_UNCRAFTABLE(lazy { Key.key("minecraft:gui/sprites/recipe_book/slot_many_uncraftable")
      }),
  SLOT_UNCRAFTABLE(lazy { Key.key("minecraft:gui/sprites/recipe_book/slot_uncraftable") }),
  INCOMPATIBLE(lazy { Key.key("minecraft:gui/sprites/server_list/incompatible") }),
  JOIN(lazy { Key.key("minecraft:gui/sprites/world_list/join") }),
  JOIN_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/world_list/join_highlighted") }),
  MOVE_DOWN(lazy { Key.key("minecraft:gui/sprites/transferable_list/move_down") }),
  MOVE_DOWN_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/transferable_list/move_down_highlighted") }),
  MOVE_UP(lazy { Key.key("minecraft:gui/sprites/transferable_list/move_up") }),
  MOVE_UP_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/transferable_list/move_up_highlighted")
      }),
  PINGING_1(lazy { Key.key("minecraft:gui/sprites/server_list/pinging_1") }),
  PINGING_2(lazy { Key.key("minecraft:gui/sprites/server_list/pinging_2") }),
  PINGING_3(lazy { Key.key("minecraft:gui/sprites/server_list/pinging_3") }),
  PINGING_4(lazy { Key.key("minecraft:gui/sprites/server_list/pinging_4") }),
  PINGING_5(lazy { Key.key("minecraft:gui/sprites/server_list/pinging_5") }),
  UNREACHABLE(lazy { Key.key("minecraft:gui/sprites/server_list/unreachable") }),
  MUTE_BUTTON(lazy { Key.key("minecraft:gui/sprites/social_interactions/mute_button") }),
  MUTE_BUTTON_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/social_interactions/mute_button_highlighted") }),
  REPORT_BUTTON(lazy { Key.key("minecraft:gui/sprites/social_interactions/report_button") }),
  REPORT_BUTTON_DISABLED(lazy {
      Key.key("minecraft:gui/sprites/social_interactions/report_button_disabled") }),
  REPORT_BUTTON_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/social_interactions/report_button_highlighted") }),
  UNMUTE_BUTTON(lazy { Key.key("minecraft:gui/sprites/social_interactions/unmute_button") }),
  UNMUTE_BUTTON_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/social_interactions/unmute_button_highlighted") }),
  CLOSE(lazy { Key.key("minecraft:gui/sprites/spectator/close") }),
  SCROLL_LEFT(lazy { Key.key("minecraft:gui/sprites/spectator/scroll_left") }),
  SCROLL_RIGHT(lazy { Key.key("minecraft:gui/sprites/spectator/scroll_right") }),
  TELEPORT_TO_PLAYER(lazy { Key.key("minecraft:gui/sprites/spectator/teleport_to_player") }),
  TELEPORT_TO_TEAM(lazy { Key.key("minecraft:gui/sprites/spectator/teleport_to_team") }),
  BLOCK_MINED(lazy { Key.key("minecraft:gui/sprites/statistics/block_mined") }),
  HEADER(lazy { Key.key("minecraft:gui/sprites/statistics/header") }),
  ITEM_BROKEN(lazy { Key.key("minecraft:gui/sprites/statistics/item_broken") }),
  ITEM_CRAFTED(lazy { Key.key("minecraft:gui/sprites/statistics/item_crafted") }),
  ITEM_DROPPED(lazy { Key.key("minecraft:gui/sprites/statistics/item_dropped") }),
  ITEM_PICKED_UP(lazy { Key.key("minecraft:gui/sprites/statistics/item_picked_up") }),
  ITEM_USED(lazy { Key.key("minecraft:gui/sprites/statistics/item_used") }),
  SORT_DOWN(lazy { Key.key("minecraft:gui/sprites/statistics/sort_down") }),
  SORT_UP(lazy { Key.key("minecraft:gui/sprites/statistics/sort_up") }),
  ADVANCEMENT(lazy { Key.key("minecraft:gui/sprites/toast/advancement") }),
  MOUSE(lazy { Key.key("minecraft:gui/sprites/toast/mouse") }),
  MOVEMENT_KEYS(lazy { Key.key("minecraft:gui/sprites/toast/movement_keys") }),
  RECIPE(lazy { Key.key("minecraft:gui/sprites/container/stonecutter/recipe") }),
  RIGHT_CLICK(lazy { Key.key("minecraft:gui/sprites/toast/right_click") }),
  SOCIAL_INTERACTIONS(lazy { Key.key("minecraft:gui/sprites/toast/social_interactions") }),
  SYSTEM(lazy { Key.key("minecraft:gui/sprites/toast/system") }),
  TREE(lazy { Key.key("minecraft:gui/sprites/toast/tree") }),
  TUTORIAL(lazy { Key.key("minecraft:gui/sprites/toast/tutorial") }),
  WOODEN_PLANKS(lazy { Key.key("minecraft:gui/sprites/toast/wooden_planks") }),
  SELECT(lazy { Key.key("minecraft:gui/sprites/transferable_list/select") }),
  SELECT_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/transferable_list/select_highlighted")
      }),
  UNSELECT(lazy { Key.key("minecraft:gui/sprites/transferable_list/unselect") }),
  UNSELECT_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/transferable_list/unselect_highlighted") }),
  CHECKBOX(lazy { Key.key("minecraft:gui/sprites/widget/checkbox") }),
  CHECKBOX_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/checkbox_highlighted") }),
  CHECKBOX_SELECTED(lazy { Key.key("minecraft:gui/sprites/widget/checkbox_selected") }),
  CHECKBOX_SELECTED_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/widget/checkbox_selected_highlighted") }),
  CROSS_BUTTON(lazy { Key.key("minecraft:gui/sprites/widget/cross_button") }),
  CROSS_BUTTON_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/cross_button_highlighted")
      }),
  LOCKED_BUTTON(lazy { Key.key("minecraft:gui/sprites/widget/locked_button") }),
  LOCKED_BUTTON_DISABLED(lazy { Key.key("minecraft:gui/sprites/widget/locked_button_disabled") }),
  LOCKED_BUTTON_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/widget/locked_button_highlighted")
      }),
  SLOT_FRAME(lazy { Key.key("minecraft:gui/sprites/widget/slot_frame") }),
  UNLOCKED_BUTTON(lazy { Key.key("minecraft:gui/sprites/widget/unlocked_button") }),
  UNLOCKED_BUTTON_DISABLED(lazy { Key.key("minecraft:gui/sprites/widget/unlocked_button_disabled")
      }),
  UNLOCKED_BUTTON_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/widget/unlocked_button_highlighted") }),
  ERROR(lazy { Key.key("minecraft:gui/sprites/container/smithing/error") }),
  ERROR_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/world_list/error_highlighted") }),
  MARKED_JOIN(lazy { Key.key("minecraft:gui/sprites/world_list/marked_join") }),
  MARKED_JOIN_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/world_list/marked_join_highlighted")
      }),
  WARNING(lazy { Key.key("minecraft:gui/sprites/world_list/warning") }),
  WARNING_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/world_list/warning_highlighted") }),
  PANORAMA_0(lazy { Key.key("minecraft:gui/title/background/panorama_0") }),
  PANORAMA_1(lazy { Key.key("minecraft:gui/title/background/panorama_1") }),
  PANORAMA_2(lazy { Key.key("minecraft:gui/title/background/panorama_2") }),
  PANORAMA_3(lazy { Key.key("minecraft:gui/title/background/panorama_3") }),
  PANORAMA_4(lazy { Key.key("minecraft:gui/title/background/panorama_4") }),
  PANORAMA_5(lazy { Key.key("minecraft:gui/title/background/panorama_5") }),
  PANORAMA_OVERLAY(lazy { Key.key("minecraft:gui/title/background/panorama_overlay") }),
  TEXT_FIELD_DISABLED(lazy { Key.key("minecraft:gui/sprites/container/anvil/text_field_disabled")
      }),
  BUTTON_SELECTED(lazy { Key.key("minecraft:gui/sprites/container/beacon/button_selected") }),
  CANCEL(lazy { Key.key("minecraft:gui/sprites/container/beacon/cancel") }),
  CONFIRM(lazy { Key.key("minecraft:gui/sprites/container/beacon/confirm") }),
  BURN_PROGRESS(lazy { Key.key("minecraft:gui/sprites/container/smoker/burn_progress") }),
  LIT_PROGRESS(lazy { Key.key("minecraft:gui/sprites/container/smoker/lit_progress") }),
  BREW_PROGRESS(lazy { Key.key("minecraft:gui/sprites/container/brewing_stand/brew_progress") }),
  BUBBLES(lazy { Key.key("minecraft:gui/sprites/container/brewing_stand/bubbles") }),
  FUEL_LENGTH(lazy { Key.key("minecraft:gui/sprites/container/brewing_stand/fuel_length") }),
  BLOCKED_SLOT(lazy { Key.key("minecraft:gui/sprites/container/bundle/blocked_slot") }),
  DUPLICATED_MAP(lazy { Key.key("minecraft:gui/sprites/container/cartography_table/duplicated_map")
      }),
  LOCKED(lazy { Key.key("minecraft:gui/sprites/container/cartography_table/locked") }),
  MAP(lazy { Key.key("minecraft:gui/sprites/container/cartography_table/map") }),
  SCALED_MAP(lazy { Key.key("minecraft:gui/sprites/container/cartography_table/scaled_map") }),
  DISABLED_SLOT(lazy { Key.key("minecraft:gui/sprites/container/crafter/disabled_slot") }),
  POWERED_REDSTONE(lazy { Key.key("minecraft:gui/sprites/container/crafter/powered_redstone") }),
  UNPOWERED_REDSTONE(lazy { Key.key("minecraft:gui/sprites/container/crafter/unpowered_redstone")
      }),
  SCROLLER_DISABLED(lazy { Key.key("minecraft:gui/sprites/container/villager/scroller_disabled") }),
  TAB_BOTTOM_SELECTED_1(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_selected_1") }),
  TAB_BOTTOM_SELECTED_2(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_selected_2") }),
  TAB_BOTTOM_SELECTED_3(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_selected_3") }),
  TAB_BOTTOM_SELECTED_4(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_selected_4") }),
  TAB_BOTTOM_SELECTED_5(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_selected_5") }),
  TAB_BOTTOM_SELECTED_6(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_selected_6") }),
  TAB_BOTTOM_SELECTED_7(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_selected_7") }),
  TAB_BOTTOM_UNSELECTED_1(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_unselected_1") }),
  TAB_BOTTOM_UNSELECTED_2(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_unselected_2") }),
  TAB_BOTTOM_UNSELECTED_3(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_unselected_3") }),
  TAB_BOTTOM_UNSELECTED_4(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_unselected_4") }),
  TAB_BOTTOM_UNSELECTED_5(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_unselected_5") }),
  TAB_BOTTOM_UNSELECTED_6(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_unselected_6") }),
  TAB_BOTTOM_UNSELECTED_7(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_bottom_unselected_7") }),
  TAB_TOP_SELECTED_1(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_selected_1") }),
  TAB_TOP_SELECTED_2(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_selected_2") }),
  TAB_TOP_SELECTED_3(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_selected_3") }),
  TAB_TOP_SELECTED_4(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_selected_4") }),
  TAB_TOP_SELECTED_5(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_selected_5") }),
  TAB_TOP_SELECTED_6(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_selected_6") }),
  TAB_TOP_SELECTED_7(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_selected_7") }),
  TAB_TOP_UNSELECTED_1(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_unselected_1") }),
  TAB_TOP_UNSELECTED_2(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_unselected_2") }),
  TAB_TOP_UNSELECTED_3(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_unselected_3") }),
  TAB_TOP_UNSELECTED_4(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_unselected_4") }),
  TAB_TOP_UNSELECTED_5(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_unselected_5") }),
  TAB_TOP_UNSELECTED_6(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_unselected_6") }),
  TAB_TOP_UNSELECTED_7(lazy {
      Key.key("minecraft:gui/sprites/container/creative_inventory/tab_top_unselected_7") }),
  ENCHANTMENT_SLOT(lazy {
      Key.key("minecraft:gui/sprites/container/enchanting_table/enchantment_slot") }),
  ENCHANTMENT_SLOT_DISABLED(lazy {
      Key.key("minecraft:gui/sprites/container/enchanting_table/enchantment_slot_disabled") }),
  ENCHANTMENT_SLOT_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/container/enchanting_table/enchantment_slot_highlighted") }),
  LEVEL_1(lazy { Key.key("minecraft:gui/sprites/container/enchanting_table/level_1") }),
  LEVEL_1_DISABLED(lazy {
      Key.key("minecraft:gui/sprites/container/enchanting_table/level_1_disabled") }),
  LEVEL_2(lazy { Key.key("minecraft:gui/sprites/container/enchanting_table/level_2") }),
  LEVEL_2_DISABLED(lazy {
      Key.key("minecraft:gui/sprites/container/enchanting_table/level_2_disabled") }),
  LEVEL_3(lazy { Key.key("minecraft:gui/sprites/container/enchanting_table/level_3") }),
  LEVEL_3_DISABLED(lazy {
      Key.key("minecraft:gui/sprites/container/enchanting_table/level_3_disabled") }),
  ARMOR_SLOT(lazy { Key.key("minecraft:gui/sprites/container/horse/armor_slot") }),
  CHEST_SLOTS(lazy { Key.key("minecraft:gui/sprites/container/horse/chest_slots") }),
  LLAMA_ARMOR_SLOT(lazy { Key.key("minecraft:gui/sprites/container/horse/llama_armor_slot") }),
  SADDLE_SLOT(lazy { Key.key("minecraft:gui/sprites/container/horse/saddle_slot") }),
  EFFECT_BACKGROUND_LARGE(lazy {
      Key.key("minecraft:gui/sprites/container/inventory/effect_background_large") }),
  EFFECT_BACKGROUND_SMALL(lazy {
      Key.key("minecraft:gui/sprites/container/inventory/effect_background_small") }),
  BANNER_SLOT(lazy { Key.key("minecraft:gui/sprites/container/loom/banner_slot") }),
  DYE_SLOT(lazy { Key.key("minecraft:gui/sprites/container/loom/dye_slot") }),
  PATTERN(lazy { Key.key("minecraft:gui/sprites/container/loom/pattern") }),
  PATTERN_HIGHLIGHTED(lazy { Key.key("minecraft:gui/sprites/container/loom/pattern_highlighted") }),
  PATTERN_SELECTED(lazy { Key.key("minecraft:gui/sprites/container/loom/pattern_selected") }),
  PATTERN_SLOT(lazy { Key.key("minecraft:gui/sprites/container/loom/pattern_slot") }),
  RECIPE_HIGHLIGHTED(lazy {
      Key.key("minecraft:gui/sprites/container/stonecutter/recipe_highlighted") }),
  RECIPE_SELECTED(lazy { Key.key("minecraft:gui/sprites/container/stonecutter/recipe_selected") }),
  DISCOUNT_STRIKETHROUGH(lazy {
      Key.key("minecraft:gui/sprites/container/villager/discount_strikethrough") }),
  EXPERIENCE_BAR_CURRENT(lazy {
      Key.key("minecraft:gui/sprites/container/villager/experience_bar_current") }),
  EXPERIENCE_BAR_RESULT(lazy {
      Key.key("minecraft:gui/sprites/container/villager/experience_bar_result") }),
  OUT_OF_STOCK(lazy { Key.key("minecraft:gui/sprites/container/villager/out_of_stock") }),
  TRADE_ARROW(lazy { Key.key("minecraft:gui/sprites/container/villager/trade_arrow") }),
  TRADE_ARROW_OUT_OF_STOCK(lazy {
      Key.key("minecraft:gui/sprites/container/villager/trade_arrow_out_of_stock") }),
  ABSORBING_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/absorbing_full") }),
  ABSORBING_FULL_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/absorbing_full_blinking")
      }),
  ABSORBING_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/absorbing_half") }),
  ABSORBING_HALF_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/absorbing_half_blinking")
      }),
  ABSORBING_HARDCORE_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/absorbing_hardcore_full")
      }),
  ABSORBING_HARDCORE_FULL_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/absorbing_hardcore_full_blinking") }),
  ABSORBING_HARDCORE_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/absorbing_hardcore_half")
      }),
  ABSORBING_HARDCORE_HALF_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/absorbing_hardcore_half_blinking") }),
  CONTAINER(lazy { Key.key("minecraft:gui/sprites/hud/heart/container") }),
  CONTAINER_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/container_blinking") }),
  CONTAINER_HARDCORE(lazy { Key.key("minecraft:gui/sprites/hud/heart/container_hardcore") }),
  CONTAINER_HARDCORE_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/container_hardcore_blinking") }),
  FROZEN_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/frozen_full") }),
  FROZEN_FULL_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/frozen_full_blinking") }),
  FROZEN_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/frozen_half") }),
  FROZEN_HALF_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/frozen_half_blinking") }),
  FROZEN_HARDCORE_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/frozen_hardcore_full") }),
  FROZEN_HARDCORE_FULL_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/frozen_hardcore_full_blinking") }),
  FROZEN_HARDCORE_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/frozen_hardcore_half") }),
  FROZEN_HARDCORE_HALF_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/frozen_hardcore_half_blinking") }),
  FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/full") }),
  FULL_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/full_blinking") }),
  HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/half") }),
  HALF_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/half_blinking") }),
  HARDCORE_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/hardcore_full") }),
  HARDCORE_FULL_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/hardcore_full_blinking")
      }),
  HARDCORE_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/hardcore_half") }),
  HARDCORE_HALF_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/hardcore_half_blinking")
      }),
  POISONED_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/poisoned_full") }),
  POISONED_FULL_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/poisoned_full_blinking")
      }),
  POISONED_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/poisoned_half") }),
  POISONED_HALF_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/poisoned_half_blinking")
      }),
  POISONED_HARDCORE_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/poisoned_hardcore_full")
      }),
  POISONED_HARDCORE_FULL_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/poisoned_hardcore_full_blinking") }),
  POISONED_HARDCORE_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/poisoned_hardcore_half")
      }),
  POISONED_HARDCORE_HALF_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/poisoned_hardcore_half_blinking") }),
  VEHICLE_CONTAINER(lazy { Key.key("minecraft:gui/sprites/hud/heart/vehicle_container") }),
  VEHICLE_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/vehicle_full") }),
  VEHICLE_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/vehicle_half") }),
  WITHERED_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/withered_full") }),
  WITHERED_FULL_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/withered_full_blinking")
      }),
  WITHERED_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/withered_half") }),
  WITHERED_HALF_BLINKING(lazy { Key.key("minecraft:gui/sprites/hud/heart/withered_half_blinking")
      }),
  WITHERED_HARDCORE_FULL(lazy { Key.key("minecraft:gui/sprites/hud/heart/withered_hardcore_full")
      }),
  WITHERED_HARDCORE_FULL_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/withered_hardcore_full_blinking") }),
  WITHERED_HARDCORE_HALF(lazy { Key.key("minecraft:gui/sprites/hud/heart/withered_hardcore_half")
      }),
  WITHERED_HARDCORE_HALF_BLINKING(lazy {
      Key.key("minecraft:gui/sprites/hud/heart/withered_hardcore_half_blinking") }),
  ;

  public fun toGeneric(): SolidMaterialTexture = SolidMaterialTexture(key.value)
}
