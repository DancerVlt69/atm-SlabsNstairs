package net.dancervlt69.slabsnstairs.Init.Blocks;

import net.dancervlt69.slabsnstairs.Init.Blocks.Custom.*;
import net.dancervlt69.slabsnstairs.Init.Blocks.Utils.Flammable.BlockFlammable;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
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
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    // Define your own Blocks

    @Deprecated
    public static final RegistryObject<Block> GROWTH_STOP = registerBlock("growth_stop",
            () -> new ChainBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.GLASS)
                    .strength(0.5F).noCollission()), ModTabs.SNSMODTAB3,
            "tooltip.slabsnstairs.growth_stop.shift","tooltip.slabsnstairs.growth_stop.ctrl");

/*    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(4.0f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> ILLUM_GROWTH_STOP = registerBlock("illum_growth_stop",
            () -> new TorchBlock(()-> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.GLASS)
                    .strength(0.5F).noCollission()), ModTabs.MODTAB_TAB);  */

    // Citrine
    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).sound(SoundType.STONE)
                    .strength(4.0f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).sound(SoundType.DEEPSLATE)
                    .strength(4.75f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(5.5f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1,
            "tooltip.slabsnstairs.citrine_block");

    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                            .strength(5.5f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CITRINE_SLAB = registerBlock("citrine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(5.5f)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CITRINE_BUTTON = registerBlock("citrine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(0.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> CITRINE_PRESSURE_PLATE = registerBlock("citrine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    // Prismarine
    public static final RegistryObject<Block> PRISMARINE_BUTTON = registerBlock("prismarine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> PRISMARINE_BRICK_BUTTON = registerBlock("prismarine_brick_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> DARK_PRISMARINE_BUTTON = registerBlock("dark_prismarine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> PRISMARINE_PRESSURE_PLATE = registerBlock("prismarine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> PRISMARINE_BRICK_PRESSURE_PLATE = registerBlock("prismarine_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> DARK_PRISMARINE_PRESSURE_PLATE = registerBlock("dark_prismarine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = registerBlock ("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f, 6.0f)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlock ("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f, 6.0f)), ModTabs.SNSMODTAB1);

    // Quartz
    public static final RegistryObject<Block> CHISELED_QUARTZ_STAIRS = registerBlock("chiseled_quartz_stairs",
            () -> new StairBlock(Blocks.CHISELED_QUARTZ_BLOCK::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_BRICKS::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTZ_PILLAR_STAIRS = registerBlock("quartz_pillar_stairs",
            () -> new StairBlock(Blocks.QUARTZ_PILLAR::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR)), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> CHISELED_QUARTZ_SLAB = registerBlock("chiseled_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTZ_PILLAR_SLAB = registerBlock("quartz_pillar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR)), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> QUARTZ_BUTTON = registerBlock("quartz_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE)
                    .strength(0.5f).noCollission().requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> SMOOTH_QUARTZ_BUTTON = registerBlock("smooth_quartz_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CHISELED_QUARTZ_BUTTON = registerBlock("chiseled_quartz_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> QUARTZ_BRICK_BUTTON = registerBlock("quartz_brick_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> QUARTZ_PILLAR_BUTTON = registerBlock("quartz_pillar_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> QUARTZ_PRESSURE_PLATE = registerBlock("quartz_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_QUARTZ_PRESSURE_PLATE = registerBlock("smooth_quartz_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CHISELED_QUARTZ_PRESSURE_PLATE = registerBlock("chiseled_quartz_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> QUARTZ_BRICK_PRESSURE_PLATE = registerBlock("quartz_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> QUARTZ_PILLAR_PRESSURE_PLATE = registerBlock("quartz_pillar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    // Cinnamon
    public static final RegistryObject<Block> CINNAMON_PLANKS = registerBlock("cinnamon_planks",
            () -> new BlockFlammable(BlockBehaviour.Properties.of(Material.WOOD), 5,20), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> CINNAMON_STAIRS = registerBlock("cinnamon_stairs",
            () -> new StairBlock(() -> ModBlocks.CINNAMON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> CINNAMON_SLAB = registerBlock("cinnamon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_PRESSURE_PLATE = registerBlock("cinnamon_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_BUTTON = registerBlock("cinnamon_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).noCollission()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_FENCE = registerBlock("cinnamon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).strength(2F)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_FENCE_GATE = registerBlock ("cinnamon_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_TRAPDOOR = registerBlock ("cinnamon_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)),ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> CINNAMON_DOOR_01 = registerBlock ("cinnamon_door_01",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_DOOR_02 = registerBlock ("cinnamon_door_02",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> CINNAMON_SIGN = registerBlockNoItem("cinnamon_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CINNAMON));

    public static final RegistryObject<Block> CINNAMON_WALL_SIGN = registerBlockNoItem("cinnamon_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CINNAMON));

/*    public static final RegistryObject<Block> CINNAMON_LEAVES = registerBlock ("cinnamon_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)),ModTabs.SNSMODTAB1); */

    public static final RegistryObject<Block> CINNAMON_PALISADE = registerBlock ("cinnamon_palisade",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModTabs.SNSMODTAB1);

    /** extra Dirt (& Sand) */
        /** Dirt */
    public static final RegistryObject<Block> DIRT_BLOCK_STAIRS = registerBlock ("dirt_block_stairs",
            () -> new ModDirtStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                            .strength(0.5F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> DIRT_BLOCK_SLAB = registerBlock("dirt_block_slab",
            () -> new ModDirtSlabBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(0.5F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);

        /** Path */
/*    public static final RegistryObject<Block> PATH_BLOCK_STAIRS = registerBlock("path_block_stairs",
            () -> new ModGrassStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS)
                            .strength(1F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1); */
/*    public static final RegistryObject<Block> PATH_BLOCK_SLAB = registerBlock("path_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.WET_GRASS)
                    .strength(1F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1); */
        /** Grass */
/*    public static final RegistryObject<Block> GRASS_BLOCK_STAIRS = registerBlock("grass_block_stairs",
            () -> new ModGrassStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS)
                            .strength(1F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1); */
/*    public static final RegistryObject<Block> GRASS_BLOCK_SLAB = registerBlock("grass_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.WET_GRASS)
                    .strength(1F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1); */

        /** Dirt Cobbled */
    public static final RegistryObject<Block> DIRT_COBBLE = registerBlock("dirt_cobble",
            () -> new ModDirtBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> DIRT_COBBLE_STAIRS = registerBlock("dirt_cobble_stairs",
            () -> new ModDirtStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                            .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> DIRT_COBBLE_SLAB = registerBlock("dirt_cobble_slab",
            () -> new ModDirtSlabBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);

        /** Quarter Dirt */
    public static final RegistryObject<Block> QUARTER_DIRT = registerBlock("quarter_dirt",
            () -> new ModDirtBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.0f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTER_DIRT_STAIRS = registerBlock("quarter_dirt_stairs",
            () -> new ModDirtStairBlock(() -> ModBlocks.QUARTER_DIRT.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.GRAVEL)
                            .strength(1.0f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTER_DIRT_SLAB = registerBlock("quarter_dirt_slab",
            () -> new ModDirtSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.GRAVEL)
                    .strength(1.0f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);

        /** Quarter Dirt Cobbled */
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE = registerBlock("quarter_dirt_cobble",
            () -> new ModDirtBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE_STAIRS = registerBlock("quarter_dirt_cobble_stairs",
            () -> new ModDirtStairBlock(() -> ModBlocks.QUARTER_DIRT_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                            .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE_SLAB = registerBlock("quarter_dirt_cobble_slab",
            () -> new ModDirtSlabBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2f).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);

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

    public static final RegistryObject<Block> BLACKSTONE_BUTTON = registerBlock("blackstone_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                            .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON =
            registerBlock("cracked_polished_blackstone_brick_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DEEPSLATE_BUTTON = registerBlock("deepslate_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                            .strength(0.5F).sound(SoundType.DEEPSLATE)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DEEPSLATE_BRICK_BUTTON = registerBlock("deepslate_brick_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> DEEPSLATE_TILE_BUTTON = registerBlock("deepslate_tile_button",
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
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5F).sound(SoundType.STONE)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

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
    public static final RegistryObject<Block> END_STONE_BRICK_PRESSURE_PLATE = registerBlock("end_stone_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                            BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE =
            registerBlock("cracked_polished_blackstone_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                      BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).
                                    sound(SoundType.DEEPSLATE)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> DEEPSLATE_BRICK_PRESSURE_PLATE = registerBlock("deepslate_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).
                            sound(SoundType.DEEPSLATE_BRICKS)), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> DEEPSLATE_TILE_PRESSURE_PLATE = registerBlock("deepslate_tile_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).
                            sound(SoundType.DEEPSLATE_TILES)), CreativeModeTab.TAB_REDSTONE);
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


    // Iced - Blocks - Ice
    public static final RegistryObject<Block> ICE_STAIRS = registerBlock("ice_stairs",
            () -> new ModIceStairBlock(Blocks.ICE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.5F).noOcclusion().requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ICE_SLAB = registerBlock("ice_slab",
            () -> new ModIceSlabBlock(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).friction(1.0f)
                    .strength(0.5F).noOcclusion().requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Iced - Blocks - PackedIde
    public static final RegistryObject<Block> PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            () -> new ModFrostedIceStairBlock(Blocks.PACKED_ICE::defaultBlockState,
                    BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            () -> new ModFrostedIceSlabBlock(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0f)
                    .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Iced - Blocks - BlueIce
    public static final RegistryObject<Block> BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            () -> new ModFrostedIceStairBlock(Blocks.BLUE_ICE::defaultBlockState,
                    BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            () -> new ModFrostedIceSlabBlock(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0f)
                    .strength(0.8F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Iced - Blocks - DryIce
    public static final RegistryObject<Block> DRY_ICE_BLOCK = registerBlock("dry_ice_block",
            () -> new ModDryIceBlock(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).strength(1.8f)
                    .friction(1.0F).requiresCorrectToolForDrops().lightLevel((pLightLevel) -> 9)),
            ModTabs.SNSMODTAB1,"tooltip.slabsnstairs.dry_ice_block");

    public static final RegistryObject<Block> DRY_ICE_STAIRS = registerBlock("dry_ice_stairs",
            () -> new ModDryIceStairBlock(() -> ModBlocks.DRY_ICE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).strength(1.8F)
                            .friction(1.0F).requiresCorrectToolForDrops().lightLevel((pLightLevel) -> 9)),
            ModTabs.SNSMODTAB1,"tooltip.slabsnstairs.dry_ice_stairs");
    public static final RegistryObject<Block> DRY_ICE_SLAB = registerBlock("dry_ice_slab",
            () -> new ModDryIceSlabBlock(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.GLASS)
                    .friction(1.0f).strength(1.8F).requiresCorrectToolForDrops().lightLevel((pLightLevel) -> 9)),
            ModTabs.SNSMODTAB1, "tooltip.slabsnstairs.dry_ice_slab");


    /** registering the Blocks without Item */
    private static <T extends Block> RegistryObject<T> registerBlockNoItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    /** registering the Blocks without Tool-Tips */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(
            String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    /** registering the Blocks with Tool-Tips for Shift */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKeyShift) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKeyShift);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block,
                                                            CreativeModeTab tab, String tooltipKeyShift) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {

            @Override
            public void appendHoverText(@NotNull ItemStack pStack, Level pLevel, @NotNull List<Component> components,
                                        @NotNull TooltipFlag pFlag) {

                if (Screen.hasShiftDown()) {
                    components.add(Component.translatable(tooltipKeyShift));
                } else {
                    components.add(Component.translatable("tooltip.slabsnstairs.hold_shift"));
                }
            }
        });
    }

    /** registering the Blocks with Tool-Tips for Shift & Ctrl */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKeyShift, String tooltipKeyCtrl) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKeyShift, tooltipKeyCtrl);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block,
                                                            CreativeModeTab tab, String tooltipKeyShift, String tooltipKeyCtrl) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {

            @Override
            public void appendHoverText(@NotNull ItemStack pStack, Level pLevel, @NotNull List<Component> components,
                                        @NotNull TooltipFlag pFlag) {

                if (Screen.hasShiftDown()) {
                    components.add(Component.translatable(tooltipKeyShift));
                } else {
                    components.add(Component.translatable("tooltip.slabsnstairs.hold_shift"));
                }
                if (Screen.hasControlDown()) {
                    components.add(Component.translatable(tooltipKeyCtrl));
                } else {
                    components.add(Component.translatable("tooltip.slabsnstairs.hold_ctrl"));
                }
            }
        });
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
