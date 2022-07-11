package net.dancervlt69.slabsnstairs.Init.Blocks;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SlabsNstairs.MODID);

    // Define your different Blocks
    public static final RegistryObject<Block> GROWTH_STOP = registerBlock("growth_stop",
            () -> new ChainBlock(BlockBehaviour.Properties.of(Material.DECORATION).sound(SoundType.STONE)
                    .strength(0.5F).noCollission()), ModTabs.MODTAB_TAB);

        // Citrine
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(7F).requiresCorrectToolForDrops()), ModTabs.MODTAB_TAB);
    public static final RegistryObject<Block> CITRINE_SLAB = registerBlock("citrine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(7F)), ModTabs.MODTAB_TAB);
    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                            .strength(7F).requiresCorrectToolForDrops()), ModTabs.MODTAB_TAB);

       // Extra Dirt
    public static final RegistryObject<Block> DIRT_COBBLE = registerBlock("dirt_cobble",
            () -> new GrassBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F).requiresCorrectToolForDrops()), ModTabs.MODTAB_TAB);
    public static final RegistryObject<Block> QUATER_DIRT = registerBlock("quarter_dirt",
            () -> new GrassBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F).requiresCorrectToolForDrops()), ModTabs.MODTAB_TAB);
    public static final RegistryObject<Block> QUATER_DIRT_COBBLE = registerBlock("quarter_dirt_cobble",
            () -> new GrassBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F).requiresCorrectToolForDrops()), ModTabs.MODTAB_TAB);

        // Buttons
    public static final RegistryObject<Block> COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> ANDESITE_BUTTON = registerBlock("andesite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> DIORITE_BUTTON = registerBlock("diorite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> GRANITE_BUTTON = registerBlock("granite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

        // Pressure Plates
    public static final RegistryObject<Block> COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

        // Iced - Blocks - Slabs
    public static final RegistryObject<Block> PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1f)
                    .strength(2F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1f)
                    .strength(2F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        // Iced - Blocks - Stairs
    public static final RegistryObject<Block> PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1F)
                            .strength(2F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1F)
                            .strength(2F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // registering the Blocks
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
        CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
