package net.dancervlt69.slabsnstairs.Init.Blocks;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SlabsNstairs.MODID);

    // Define your different Blocks
    public static final RegistryObject<Block> GROWTH_STOP = registerBlock("growth_stop",
            () -> new ChainBlock(AbstractBlock.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.GLASS)
                    .strength(0.5F).noCollission().noOcclusion()), ModTabs.SNSMODTAB,
            "tooltip.slabsnstairs.growth_stop.tooltip");
/*
    public static final RegistryObject<Block> ILLUM_GROWTH_STOP = registerBlock("illum_growth_stop",
            () -> new TorchBlock(()-> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.GLASS)
                    .strength(0.5F).noCollission()), ModTabs.MODTAB_TAB);   */

    // Citrine
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(7F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL)
                            .strength(7F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CITRINE_SLAB = registerBlock("citrine_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(7F)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CITRINE_BUTTON = registerBlock("citrine_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(7F).noCollission()), ItemGroup.TAB_REDSTONE);

    // Cinnamon
    public static final RegistryObject<Block> CINNAMON_PLANKS = registerBlock("cinnamon_planks",
            () -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_STAIRS = registerBlock("cinnamon_stairs",
            () -> new StairsBlock(() -> ModBlocks.CINNAMON_PLANKS.get().defaultBlockState(),
                    AbstractBlock.Properties.copy(Blocks.OAK_STAIRS)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_SLAB = registerBlock("cinnamon_slab",
            () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.OAK_SLAB)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_PRESSURE_PLATE = registerBlock("cinnamon_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_BUTTON = registerBlock("cinnamon_button",
            () -> new WoodButtonBlock(AbstractBlock.Properties.copy(Blocks.OAK_BUTTON).noCollission()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_FENCE = registerBlock("cinnamon_fence",
            () -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE).strength(2F)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_FENCE_GATE = registerBlock ("cinnamon_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE_GATE)),ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_TRAPDOOR = registerBlock ("cinnamon_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.copy(Blocks.OAK_TRAPDOOR)),ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> CINNAMON_DOOR_01 = registerBlock ("cinnamon_door_01",
            () -> new DoorBlock(AbstractBlock.Properties.copy(Blocks.OAK_DOOR)),ModTabs.SNSMODTAB);

    public static final RegistryObject<Block> CINNAMON_DOOR_02 = registerBlock ("cinnamon_door_02",
            () -> new DoorBlock(AbstractBlock.Properties.copy(Blocks.OAK_DOOR)),ModTabs.SNSMODTAB);

/*    public static final RegistryObject<Block> CINNAMON_SIGN = registerBlock("cinnamon_sign",
            () -> new SignBlock(AbstractBlock.Properties.copy(Blocks.OAK_SIGN), WoodType.OAK), ModTabs.MODTAB_TAB);

     public static final RegistryObject<Block> CINNAMON_WALL_SIGN = registerBlock ("cinnamon_wall_sign",
            () -> new WallSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_WALL_SIGN), WoodType.OAK), ModTabs.MODTAB_TAB);

    public static final RegistryObject<Block> CINNAMON_LEAVES = registerBlock ("cinnamon_leaves",
            () -> new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES)),ModTabs.MODTAB_TAB); */

    public static final RegistryObject<Block> CINNAMON_PALISADE = registerBlock ("cinnamon_palisade",
            () -> new WallBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2F,5F)
                    .sound(SoundType.WOOD)), ModTabs.SNSMODTAB);

    // extra Dirt & Sand
    public static final RegistryObject<Block> DIRT_BLOCK_STAIRS = registerBlock("dirt_block_stairs",
            () -> new StairsBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                            .strength(1F)), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> DIRT_BLOCK_SLAB = registerBlock("dirt_block_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRAVEL)
                    .strength(1F)), ModTabs.SNSMODTAB);

/*    public static final RegistryObject<Block> GRASS_BLOCK_STAIRS = registerBlock("grass_block_stairs",
            () -> new ModGrassStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.GRASS).sound(SoundType.GRASS)
                            .strength(1F)), ModTabs.MODTAB_TAB);
    public static final RegistryObject<Block> GRASS_BLOCK_SLAB = registerBlock("grass_block_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.GRASS).sound(SoundType.WET_GRASS)
                    .strength(1F)), ModTabs.MODTAB_TAB); */
    public static final RegistryObject<Block> DIRT_COBBLE = registerBlock("dirt_cobble",
            () -> new GrassBlock(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> DIRT_COBBLE_STAIRS = registerBlock("dirt_cobble_stairs",
            () -> new StairsBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                            .strength(2F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> DIRT_COBBLE_SLAB = registerBlock("dirt_cobble_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);

    public static final RegistryObject<Block> QUARTER_DIRT = registerBlock("quarter_dirt",
            () -> new GrassBlock(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> QUARTER_DIRT_STAIRS = registerBlock("quarter_dirt_stairs",
            () -> new StairsBlock(() -> ModBlocks.QUARTER_DIRT.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                            .strength(2F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> QUARTER_DIRT_SLAB = registerBlock("quarter_dirt_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F)), ModTabs.SNSMODTAB);

    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE = registerBlock("quarter_dirt_cobble",
            () -> new GrassBlock(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE_STAIRS = registerBlock("quarter_dirt_cobble_stairs",
            () -> new StairsBlock(() -> ModBlocks.QUARTER_DIRT_COBBLE.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                            .strength(2F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB);
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE_SLAB = registerBlock("quarter_dirt_cobble_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS)
                    .strength(2F)), ModTabs.SNSMODTAB);

    // Buttons
    public static final RegistryObject<Block> SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BUTTON = registerBlock("mossy_cobblestone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);

        // Sandstone
    public static final RegistryObject<Block> SANDSTONE_BUTTON = registerBlock("sandstone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CUT_SANDSTONE_BUTTON = registerBlock("cut_sandstone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_BUTTON = registerBlock("smooth_sandstone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> RED_SANDSTONE_BUTTON = registerBlock("red_sandstone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_BUTTON = registerBlock("cut_red_sandstone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_BUTTON = registerBlock("smooth_red_sandstone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> ANDESITE_BUTTON = registerBlock("andesite_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> DIORITE_BUTTON = registerBlock("diorite_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> GRANITE_BUTTON = registerBlock("granite_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON =
            registerBlock("cracked_polished_blackstone_brick_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.GILDED_BLACKSTONE)), ItemGroup.TAB_REDSTONE);

    /*
    public static final RegistryObject<Block> DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_BUTTON = registerBlock("cracked_deepslate_brick_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE_BRICKS)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_BUTTON = registerBlock("cracked_deepslate_tile_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE_TILES)), ItemGroup.TAB_REDSTONE);
    */
    // Pressure Plates

    public static final RegistryObject<Block> SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

        // Sandstone
    public static final RegistryObject<Block> SANDSTONE_PRESSURE_PLATE = registerBlock("sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CUT_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> RED_SANDSTONE_PRESSURE_PLATE = registerBlock("red_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_red_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_red_sandstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE =
            registerBlock("cracked_polished_blackstone_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

    /* public static final RegistryObject<Block> DEEPSLATE_PRESSURE_PLATE =
            registerBlock("deepslate_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                            AbstractBlock.Properties.of(Material.STONE).strength(0.5F).
                                    sound(SoundType.DEEPSLATE_BRICKS)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_PRESSURE_PLATE =
            registerBlock("cracked_deepslate_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                            AbstractBlock.Properties.of(Material.STONE).strength(0.5F).
                                    sound(SoundType.DEEPSLATE_BRICKS)),ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_PRESSURE_PLATE =
            registerBlock("cracked_deepslate_tile_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                            AbstractBlock.Properties.of(Material.STONE).strength(0.5F).
                                    sound(SoundType.DEEPSLATE_TILES)),ItemGroup.TAB_REDSTONE); */

    // Stairs
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(2F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS =
            registerBlock("cracked_polished_blackstone_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(1.5F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);

    /* public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                            .strength(3F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_BRICKS)
                            .strength(3F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_TILES)
                            .strength(3F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS); */

    // Slabs
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock
            ("cracked_polished_blackstone_brick_slab",
                    () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(1.53F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);

    /* public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                    .strength(3F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_BRICKS)
                    .strength(3F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_TILES)
                    .strength(3F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS); */

    // Iced - Blocks - Slabs
    public static final RegistryObject<Block> PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1f)
                    .strength(2.8F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1f)
                    .strength(2.8F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);
    // Iced - Blocks - Stairs
    public static final RegistryObject<Block> PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1F)
                            .strength(2.8F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1F)
                            .strength(2.8F).requiresCorrectToolForDrops()), ItemGroup.TAB_BUILDING_BLOCKS);

    // registering the Blocks
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     ItemGroup tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block, ItemGroup tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable World world,
                                        List<ITextComponent> pTooltipComponents, ITooltipFlag iTooltipFlag) {
                if (Screen.hasShiftDown()) {
                    pTooltipComponents.add(new TranslationTextComponent(tooltipKey));
                } else {
                    pTooltipComponents.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_shift.tooltip"));
                }

            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     ItemGroup tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block, ItemGroup tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
