package net.poeticswam.minusmod.block;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.poeticswam.minusmod.MinusMod;
import net.poeticswam.minusmod.block.custom.CustomEmptyPresentBlock;
import net.poeticswam.minusmod.block.custom.CustomPresentBlock;
import java.util.function.Function;

public class ModBlocks {

    // --- Gravity Blocks ---
    public static final Block SUGAR_BLOCK = registerFallingBlock("sugar_block", BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND));

    // --- Custom Blocks ---
    public static final Block PRESENT_IRON_INGOT = registerCustomBlock("present_iron_ingot", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_IRON_NUGGET = registerCustomBlock("present_iron_nugget", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_GOLD_INGOT = registerCustomBlock("present_gold_ingot", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_GOLD_NUGGET = registerCustomBlock("present_gold_nugget", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_COPPER_INGOT = registerCustomBlock("present_copper_ingot", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_COPPER_NUGGET = registerCustomBlock("present_copper_nugget", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_NETHERITE_INGOT = registerCustomBlock("present_netherite_ingot", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_NETHERITE_SCRAP = registerCustomBlock("present_netherite_scrap", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_LAPIS_LAZULI = registerCustomBlock("present_lapis_lazuli", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_EMERALD = registerCustomBlock("present_emerald", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_DIAMOND = registerCustomBlock("present_diamond", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_AMETHYST_SHARD = registerCustomBlock("present_amethyst_shard", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_ECHO_SHARD = registerCustomBlock("present_echo_shard", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomPresentBlock::new);
    public static final Block PRESENT_BLUE_EMPTY = registerCustomBlock("present_blue_empty", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomEmptyPresentBlock::new);
    public static final Block PRESENT_GREEN_EMPTY = registerCustomBlock("present_green_empty", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomEmptyPresentBlock::new);
    public static final Block PRESENT_PINK_EMPTY = registerCustomBlock("present_pink_empty", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomEmptyPresentBlock::new);
    public static final Block PRESENT_RED_EMPTY = registerCustomBlock("present_red_empty", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1F).sound(SoundType.WOOL).noOcclusion(), CustomEmptyPresentBlock::new);

    // --- Normal Blocks ---
    public static final Block EXAMPLE_BLOCK = registerBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(1.5F).sound(SoundType.WOOL));


    private static Block registerBlock(String name, BlockBehaviour.Properties settings) {
        Identifier id = Identifier.fromNamespaceAndPath(MinusMod.MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);

        Block block = new Block(settings.setId(blockKey));
        registerBlockItem(name, block);

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static Block registerCustomBlock(String name, BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, Block> factory) {
        Identifier id = Identifier.fromNamespaceAndPath(MinusMod.MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);

        Block block = factory.apply(settings.setId(blockKey));
        registerBlockItem(name, block);

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static Block registerFallingBlock(String name, BlockBehaviour.Properties settings) {
        Identifier id = Identifier.fromNamespaceAndPath(MinusMod.MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);

        FallingBlock block = new FallingBlock(settings.setId(blockKey)) {
            @Override
            protected MapCodec<? extends FallingBlock> codec() {
                return null;
            }

            @Override
            public int getDustColor(BlockState state, BlockGetter world, BlockPos pos) {
                return 0;
            }
        };
        registerBlockItem(name, block);

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }


    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.fromNamespaceAndPath(MinusMod.MOD_ID, name);
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);

        BlockItem item = new BlockItem(
                block,
                new Item.Properties().setId(itemKey)
        );
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }


    public static void registerModBlocks() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {
            entries.accept(SUGAR_BLOCK);
            entries.accept(EXAMPLE_BLOCK);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {
            entries.accept(PRESENT_LAPIS_LAZULI);
            entries.accept(PRESENT_EMERALD);
            entries.accept(PRESENT_DIAMOND);
            entries.accept(PRESENT_IRON_INGOT);
            entries.accept(PRESENT_GOLD_INGOT);
            entries.accept(PRESENT_COPPER_INGOT);
            entries.accept(PRESENT_NETHERITE_INGOT);
            entries.accept(PRESENT_IRON_NUGGET);
            entries.accept(PRESENT_GOLD_NUGGET);
            entries.accept(PRESENT_COPPER_NUGGET);
            entries.accept(PRESENT_NETHERITE_SCRAP);
            entries.accept(PRESENT_AMETHYST_SHARD);
            entries.accept(PRESENT_ECHO_SHARD);
            entries.accept(PRESENT_BLUE_EMPTY);
            entries.accept(PRESENT_RED_EMPTY);
            entries.accept(PRESENT_GREEN_EMPTY);
            entries.accept(PRESENT_PINK_EMPTY);
        });
    }
}
