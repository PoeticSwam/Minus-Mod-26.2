package net.poeticswam.minusmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.EggItem;
import net.minecraft.world.item.Item;
import net.poeticswam.minusmod.MinusMod;
import net.poeticswam.minusmod.item.custom.CustomDrinkItem;
import net.poeticswam.minusmod.item.custom.CustomIceCreamItem;
import net.poeticswam.minusmod.item.custom.CustomStewItem;

public class ModItems {

    public static final Item CREEPER_CRUNCH_ICE_CREAM = registerItem("creeper_crunch_ice_cream", new CustomIceCreamItem(new Item.Properties().food(ModFoodComponents.CREEPER_CRUNCH_ICE_CREAM).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"creeper_crunch_ice_cream")))));
    public static final Item GHAST_TEAR_SWIRL_ICE_CREAM = registerItem("ghast_tear_swirl_ice_cream", new CustomIceCreamItem(new Item.Properties().food(ModFoodComponents.GHAST_TEAR_SWIRL_ICE_CREAM).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"ghast_tear_swirl_ice_cream")))));
    public static final Item MAGMA_CREAM_RIPPLE_ICE_CREAM = registerItem("magma_cream_ripple_ice_cream", new CustomIceCreamItem(new Item.Properties().food(ModFoodComponents.MAGMA_CREAM_RIPPLE_ICE_CREAM).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"magma_cream_ripple_ice_cream")))));
    public static final Item DIAMOND_ORE_CHUNK_ICE_CREAM = registerItem("diamond_ore_chunk_ice_cream", new CustomIceCreamItem(new Item.Properties().food(ModFoodComponents.DIAMOND_ORE_CHUNK_ICE_CREAM).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"diamond_ore_chunk_ice_cream")))));
    public static final Item FERMENTED_POTATO = registerItem("fermented_potato", new Item(new Item.Properties().food(ModFoodComponents.FERMENTED_POTATO).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"fermented_potato")))));
    public static final Item GRASS_STEW = registerItem("grass_stew", new CustomStewItem(new Item.Properties().stacksTo(1).food(ModFoodComponents.GRASS_STEW).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"grass_stew")))));
    public static final Item MUD_SOUP = registerItem("mud_soup", new CustomStewItem(new Item.Properties().stacksTo(1).food(ModFoodComponents.MUD_SOUP).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"mud_soup")))));
    public static final Item COARSE_DIRT_STEW = registerItem("coarse_dirt_stew", new CustomStewItem(new Item.Properties().stacksTo(1).food(ModFoodComponents.COARSE_DIRT_STEW).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"coarse_dirt_stew")))));
    public static final Item GRAVEL_SANDWICH = registerItem("gravel_sandwich", new Item(new Item.Properties().food(ModFoodComponents.GRAVEL_SANDWICH).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"gravel_sandwich")))));
    public static final Item SLIME_PIE = registerItem("slime_pie", new Item(new Item.Properties().food(ModFoodComponents.SLIME_PIE).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"slime_pie")))));
    public static final Item MELON_JUICE = registerItem("melon_juice", new CustomDrinkItem(new Item.Properties().food(ModFoodComponents.MELON_JUICE, ModConsumableComponents.MELON_JUICE).stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"melon_juice")))));
    public static final Item SLIME_BALL_STEW = registerItem("slime_ball_stew", new CustomStewItem(new Item.Properties().stacksTo(1).food(ModFoodComponents.SLIME_BALL_STEW).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"slime_ball_stew")))));
    public static final Item HERB_STEW = registerItem("herb_stew", new CustomStewItem(new Item.Properties().stacksTo(1).food(ModFoodComponents.HERB_STEW).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"herb_stew")))));
    public static final Item ICE_CREAM_WITH_COOKIE_PIECES = registerItem("ice_cream_with_cookie_pieces", new CustomIceCreamItem(new Item.Properties().food(ModFoodComponents.ICE_CREAM_WITH_COOKIE_PIECES).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"ice_cream_with_cookie_pieces")))));
    public static final Item ICE_CREAM_WITH_BITS_OF_CAKE = registerItem("ice_cream_with_bits_of_cake", new CustomIceCreamItem(new Item.Properties().food(ModFoodComponents.ICE_CREAM_WITH_BITS_OF_CAKE).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"ice_cream_with_bits_of_cake")))));
    public static final Item FERMENTED_MELON_JUICE = registerItem("fermented_melon_juice", new CustomDrinkItem(new Item.Properties().food(ModFoodComponents.FERMENTED_MELON_JUICE, ModConsumableComponents.FERMENTED_MELON_JUICE).stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"fermented_melon_juice")))));

    public static final Item SPIDER_LEG = registerItem("spider_leg", new Item(new Item.Properties().food(ModFoodComponents.SPIDER_LEG).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"spider_leg")))));
    public static final Item COOKED_SPIDER_LEG = registerItem("cooked_spider_leg", new Item(new Item.Properties().food(ModFoodComponents.COOKED_SPIDER_LEG).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"cooked_spider_leg")))));

    public static final Item BLACK_COLORED_EGG = registerItem("black_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"black_colored_egg")))));
    public static final Item BLUE_COLORED_EGG = registerItem("blue_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"blue_colored_egg")))));
    public static final Item BROWN_COLORED_EGG = registerItem("brown_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"brown_colored_egg")))));
    public static final Item CYAN_COLORED_EGG = registerItem("cyan_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"cyan_colored_egg")))));
    public static final Item GRAY_COLORED_EGG = registerItem("gray_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"gray_colored_egg")))));
    public static final Item GREEN_COLORED_EGG = registerItem("green_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"green_colored_egg")))));
    public static final Item LIGHT_BLUE_COLORED_EGG = registerItem("light_blue_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"light_blue_colored_egg")))));
    public static final Item LIGHT_GRAY_COLORED_EGG = registerItem("light_gray_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"light_gray_colored_egg")))));
    public static final Item LIME_COLORED_EGG = registerItem("lime_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"lime_colored_egg")))));
    public static final Item MAGENTA_COLORED_EGG = registerItem("magenta_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"magenta_colored_egg")))));
    public static final Item ORANGE_COLORED_EGG = registerItem("orange_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"orange_colored_egg")))));
    public static final Item PINK_COLORED_EGG = registerItem("pink_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"pink_colored_egg")))));
    public static final Item PURPLE_COLORED_EGG = registerItem("purple_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"purple_colored_egg")))));
    public static final Item RED_COLORED_EGG = registerItem("red_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"red_colored_egg")))));
    public static final Item WHITE_COLORED_EGG = registerItem("white_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"white_colored_egg")))));
    public static final Item YELLOW_COLORED_EGG = registerItem("yellow_colored_egg", new EggItem(new Item.Properties().stacksTo(16).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"yellow_colored_egg")))));

    public static final Item FERMENTED_GLOWSTONE_DUST = registerItem("fermented_glowstone_dust", new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID,"fermented_glowstone_dust")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinusMod.LOGGER.info("Registering Mod Items for " + MinusMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(entries -> {
            entries.accept(CREEPER_CRUNCH_ICE_CREAM);
            entries.accept(GHAST_TEAR_SWIRL_ICE_CREAM);
            entries.accept(MAGMA_CREAM_RIPPLE_ICE_CREAM);
            entries.accept(DIAMOND_ORE_CHUNK_ICE_CREAM);
            entries.accept(ICE_CREAM_WITH_COOKIE_PIECES);
            entries.accept(ICE_CREAM_WITH_BITS_OF_CAKE);
            entries.accept(GRAVEL_SANDWICH);
            entries.accept(MUD_SOUP);
            entries.accept(COARSE_DIRT_STEW);
            entries.accept(HERB_STEW);
            entries.accept(GRASS_STEW);
            entries.accept(SLIME_BALL_STEW);
            entries.accept(FERMENTED_POTATO);
            entries.accept(SLIME_PIE);
            entries.accept(SPIDER_LEG);
            entries.accept(COOKED_SPIDER_LEG);
            entries.accept(MELON_JUICE);
            entries.accept(FERMENTED_MELON_JUICE);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(BLACK_COLORED_EGG);
            entries.accept(BLUE_COLORED_EGG);
            entries.accept(BROWN_COLORED_EGG);
            entries.accept(CYAN_COLORED_EGG);
            entries.accept(GRAY_COLORED_EGG);
            entries.accept(GREEN_COLORED_EGG);
            entries.accept(LIGHT_BLUE_COLORED_EGG);
            entries.accept(LIGHT_GRAY_COLORED_EGG);
            entries.accept(LIME_COLORED_EGG);
            entries.accept(MAGENTA_COLORED_EGG);
            entries.accept(ORANGE_COLORED_EGG);
            entries.accept(PINK_COLORED_EGG);
            entries.accept(PURPLE_COLORED_EGG);
            entries.accept(RED_COLORED_EGG);
            entries.accept(WHITE_COLORED_EGG);
            entries.accept(YELLOW_COLORED_EGG);
            entries.accept(FERMENTED_GLOWSTONE_DUST);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(entries -> {
            entries.accept(BLACK_COLORED_EGG);
            entries.accept(BLUE_COLORED_EGG);
            entries.accept(BROWN_COLORED_EGG);
            entries.accept(CYAN_COLORED_EGG);
            entries.accept(GRAY_COLORED_EGG);
            entries.accept(GREEN_COLORED_EGG);
            entries.accept(LIGHT_BLUE_COLORED_EGG);
            entries.accept(LIGHT_GRAY_COLORED_EGG);
            entries.accept(LIME_COLORED_EGG);
            entries.accept(MAGENTA_COLORED_EGG);
            entries.accept(ORANGE_COLORED_EGG);
            entries.accept(PINK_COLORED_EGG);
            entries.accept(PURPLE_COLORED_EGG);
            entries.accept(RED_COLORED_EGG);
            entries.accept(WHITE_COLORED_EGG);
            entries.accept(YELLOW_COLORED_EGG);
        });
    }
}
