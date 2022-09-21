package net.dancervlt69.slabsnstairs.Init.Blocks;

import net.dancervlt69.slabsnstairs.Init.Blocks.Custom.*;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SlabsNstairs.MODID);

    // Define your own Blocks

    @Deprecated (forRemoval = true)
    public static final RegistryObject<Block> TRIPOD = registerBlock("tripod",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5f)
                    .sound(SoundType.WOOD)), ModTabs.SNSMODTAB3, "tooltip.slabsnstairs.tripod.tooltip");

    @Deprecated (forRemoval = true)
    public static final RegistryObject<Block> TELESCOPE = registerBlock("telescope",
            () -> new ModTelescopeBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5f)
                    .sound(SoundType.WOOD)), ModTabs.SNSMODTAB3, "tooltip.slabsnstairs.telescope.tooltip");

    @Deprecated (forRemoval = true)
    public static final RegistryObject<Block> GROWTH_STOP = registerBlock("growth_stop",
            () -> new ChainBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.GLASS)
                    .strength(0.5F).noCollission()), ModTabs.SNSMODTAB3,
            "tooltip.slabsnstairs.growth_stop.tooltip");
/*
    public static final RegistryObject<Block> ILLUM_GROWTH_STOP = registerBlock("illum_growth_stop",
            () -> new TorchBlock(()-> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.GLASS)
                    .strength(0.5F).noCollission()), ModTabs.MODTAB_TAB);   */

    // Citrine
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(5.5f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB,
            "tooltip.slabsnstairs.citrine_block.tooltip");

    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                            .strength(5.5f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CITRINE_SLAB = registerBlock("citrine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(5.5f)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CITRINE_BUTTON = registerBlock("citrine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(5.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);

    // Cinnamon
    public static final RegistryObject<Block> CINNAMON_PLANKS = registerBlock("cinnamon_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_STAIRS = registerBlock("cinnamon_stairs",
            () -> new StairBlock(() -> ModBlocks.CINNAMON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_SLAB = registerBlock("cinnamon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_PRESSURE_PLATE = registerBlock("cinnamon_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_BUTTON = registerBlock("cinnamon_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).noCollission()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_FENCE = registerBlock("cinnamon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).strength(2F)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_FENCE_GATE = registerBlock ("cinnamon_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_TRAPDOOR = registerBlock ("cinnamon_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)),ModTabs.SNSMODTAB);

    @Deprecated (forRemoval = true)
    public static final RegistryObject<Block> CINNAMON_DOOR = registerBlock ("cinnamon_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),ModTabs.SNSMODTAB);

    public static final RegistryObject<Block> CINNAMON_DOOR_01 = registerBlock ("cinnamon_door_01",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_DOOR_02 = registerBlock ("cinnamon_door_02",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),ModTabs.SNSMODTAB);

/*    public static final RegistryObject<Block> CINNAMON_SIGN = registerBlock("cinnamon_sign",
            () -> new SignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), WoodType.OAK), ModTabs.MODTAB_TAB);

     public static final RegistryObject<Block> CINNAMON_WALL_SIGN = registerBlock ("cinnamon_wall_sign",
            () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), WoodType.OAK), ModTabs.MODTAB_TAB);

    public static final RegistryObject<Block> CINNAMON_LEAVES = registerBlock ("cinnamon_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)),ModTabs.MODTAB_TAB); */

    public static final RegistryObject<Block> CINNAMON_PALISADE = registerBlock ("cinnamon_palisade",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModTabs.SNSMODTAB);


    /** extra Dirt (& Sand) */
        /** Dirt */
    public static final RegistryObject<Block> DIRT_BLOCK_STAIRS = registerBlock("dirt_block_stairs",
            () -> new ModDirtStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                            .strength(0.5F)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> DIRT_BLOCK_SLAB = registerBlock("dirt_block_slab",
            () -> new ModDirtSlabBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(0.5F)), ModTabs.SNSMODTAB);

        /** Path */
/*    public static final RegistryObject<Block> PATH_BLOCK_STAIRS = registerBlock("path_block_stairs",
            () -> new ModGrassStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS)
                            .strength(1F)), ModTabs.MODTAB_TAB); */
/*    public static final RegistryObject<Block> PATH_BLOCK_SLAB = registerBlock("path_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.WET_GRASS)
                    .strength(1F)), ModTabs.SNSMODTAB); */
        /** Grass */
/*    public static final RegistryObject<Block> GRASS_BLOCK_STAIRS = registerBlock("grass_block_stairs",
            () -> new ModGrassStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS)
                            .strength(1F)), ModTabs.MODTAB_TAB); */
/*    public static final RegistryObject<Block> GRASS_BLOCK_SLAB = registerBlock("grass_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.WET_GRASS)
                    .strength(1F)), ModTabs.SNSMODTAB); */

        /** Dirt Cobbled */
    public static final RegistryObject<Block> DIRT_COBBLE = registerBlock("dirt_cobble",
            () -> new ModDirtBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> DIRT_COBBLE_STAIRS = registerBlock("dirt_cobble_stairs",
            () -> new ModDirtStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                            .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> DIRT_COBBLE_SLAB = registerBlock("dirt_cobble_slab",
            () -> new ModDirtSlabBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);

        /** Quarter Dirt */
    public static final RegistryObject<Block> QUARTER_DIRT = registerBlock("quarter_dirt",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.GRAVEL)
                    .strength(1.0f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> QUARTER_DIRT_STAIRS = registerBlock("quarter_dirt_stairs",
            () -> new ModDirtStairBlock(() -> ModBlocks.QUARTER_DIRT.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.GRAVEL)
                            .strength(1.0f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> QUARTER_DIRT_SLAB = registerBlock("quarter_dirt_slab",
            () -> new ModDirtSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.GRAVEL)
                    .strength(1.0f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);

        /** Quarter Dirt Cobbled */
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE = registerBlock("quarter_dirt_cobble",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE_STAIRS = registerBlock("quarter_dirt_cobble_stairs",
            () -> new ModDirtStairBlock(() -> ModBlocks.QUARTER_DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                            .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE_SLAB = registerBlock("quarter_dirt_cobble_slab",
            () -> new ModDirtSlabBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);

    /** Buttons */
    public static final RegistryObject<Block> SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BUTTON = registerBlock("mossy_cobblestone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

        // Sandstone
    public static final RegistryObject<Block> SANDSTONE_BUTTON = registerBlock("sandstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CUT_SANDSTONE_BUTTON = registerBlock("cut_sandstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_BUTTON = registerBlock("smooth_sandstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> RED_SANDSTONE_BUTTON = registerBlock("red_sandstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_BUTTON = registerBlock("cut_red_sandstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_BUTTON = registerBlock("smooth_red_sandstone_button",
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

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON =
            registerBlock("cracked_polished_blackstone_brick_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DEEPSLATE_BUTTON = registerBlock("deepslate_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                            .strength(0.5F).sound(SoundType.DEEPSLATE)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_BUTTON = registerBlock("cracked_deepslate_brick_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE_BRICKS)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_BUTTON = registerBlock("cracked_deepslate_tile_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE_TILES)), CreativeModeTab.TAB_REDSTONE);

    // Pressure Plates

    public static final RegistryObject<Block> SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).sound(SoundType.STONE)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

        // Sandstone
    public static final RegistryObject<Block> SANDSTONE_PRESSURE_PLATE = registerBlock("sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CUT_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> RED_SANDSTONE_PRESSURE_PLATE = registerBlock("red_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_red_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_red_sandstone_pressure_plate",
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

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE =
            registerBlock("cracked_polished_blackstone_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DEEPSLATE_PRESSURE_PLATE =
            registerBlock("deepslate_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                            BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).
                                    sound(SoundType.DEEPSLATE_BRICKS)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_PRESSURE_PLATE =
            registerBlock("cracked_deepslate_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                            BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).
                                    sound(SoundType.DEEPSLATE_BRICKS)),CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_PRESSURE_PLATE =
            registerBlock("cracked_deepslate_tile_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                            BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).
                                    sound(SoundType.DEEPSLATE_TILES)),CreativeModeTab.TAB_REDSTONE);

    // Stairs
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(2F,6).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS =
            registerBlock("cracked_polished_blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(1.5F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                            .strength(3.6f, 6).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_BRICKS)
                            .strength(3.6f, 6).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_TILES)
                            .strength(3.6f, 6).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Slabs
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock
            ("cracked_polished_blackstone_brick_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(2.0f, 6).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                            .strength(2.0f, 6).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_BRICKS)
                    .strength(2.0f, 6).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_TILES)
                    .strength(2.0f, 6).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Iced - Blocks - Slabs
    /* public static final RegistryObject<Block> ICE_SLAB = registerBlock("ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).friction(1.0f)
                    .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS); */
    public static final RegistryObject<Block> PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0f)
                    .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0f)
                    .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Iced - Blocks - Stairs
    /* public static final RegistryObject<Block> ICE_STAIRS = registerBlock("ice_stairs",
            () -> new StairBlock(()-> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS); */
    public static final RegistryObject<Block> PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    /* public static final RegistryObject<Block> DRY_ICE = registerBlock("dry_ice",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DRY_ICE_STAIRS = registerBlock("dry_ice_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DRY_ICE_SLAB = registerBlock("dry_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0f)
                    .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS); */

    // registering the Blocks

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> components, TooltipFlag pFlag) {

                if (Screen.hasShiftDown()) {
                    components.add(Component.translatable(tooltipKey));
                } else {
                    components.add(Component.translatable("tooltip.slabsnstairs.hold_shift.tooltip"));
                }
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
