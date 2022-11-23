package net.dancervlt69.slabsnstairs.Init.Blocks;

import net.dancervlt69.slabsnstairs.Init.Blocks.Custom.*;
import net.dancervlt69.slabsnstairs.Init.Blocks.Utils.ModWoodTypes;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.dancervlt69.slabsnstairs.Init.Blocks.RegisteringModBlocks.registerBlock;
import static net.dancervlt69.slabsnstairs.Init.Blocks.RegisteringModBlocks.registerBlockNoItem;
import static net.dancervlt69.slabsnstairs.SlabsNstairs.LOGGER;
import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModBlocks {
    public static final DeferredRegister<Block> MOD_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    /** Define your own different Blocks */

   public static final RegistryObject<Block> GROWTH_STOP = registerBlock("growth_stop",
            () -> new ChainBlock(AbstractBlock.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.GLASS)
                    .strength(5F).noCollission().noOcclusion()), ModTabs.SNSMODTAB3,
            "tooltip.slabsnstairs.growth_stop.shift",
            "tooltip.slabsnstairs.growth_stop.ctrl",
            "tooltip.slabsnstairs.growth_stop.alt");

    /*  public static final RegistryObject<Block> ILLUM_GROWTH_STOP = registerBlock("illum_growth_stop",
            () -> new TorchBlock(()-> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.GLASS)
                    .strength(0.5F).noCollission()), ModTabs.MODTAB_TAB);   */

    /** Citrine */

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.GOLD).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(2)), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(6.0f,6.0f).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2)), ModTabs.SNSMODTAB1,
            "tooltip.slabsnstairs.citrine_block");

    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL)
                            .strength(6.0f).requiresCorrectToolForDrops()
                            .harvestLevel(2).harvestTool(ToolType.PICKAXE)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CITRINE_SLAB = registerBlock("citrine_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(6.0f).requiresCorrectToolForDrops()
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CITRINE_BUTTON = registerBlock("citrine_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CITRINE_PRESSURE_PLATE = registerBlock("citrine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

    /** Prismarine */
    public static final RegistryObject<Block> PRISMARINE_BUTTON = registerBlock("prismarine_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> PRISMARINE_BRICK_BUTTON = registerBlock("prismarine_brick_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> DARK_PRISMARINE_BUTTON = registerBlock("dark_prismarine_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> PRISMARINE_PRESSURE_PLATE = registerBlock("prismarine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> PRISMARINE_BRICK_PRESSURE_PLATE = registerBlock("prismarine_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> DARK_PRISMARINE_PRESSURE_PLATE = registerBlock("dark_prismarine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = registerBlock ("prismarine_brick_wall",
            () -> new WallBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f, 6.0f)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlock ("dark_prismarine_wall",
            () -> new WallBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f, 6.0f)), ModTabs.SNSMODTAB1);

    /** Quartz */
    public static final RegistryObject<Block> CHISELED_QUARTZ_STAIRS = registerBlock("chiseled_quartz_stairs",
            () -> new StairsBlock(Blocks.CHISELED_QUARTZ_BLOCK::defaultBlockState,
                    AbstractBlock.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairsBlock(Blocks.QUARTZ_BRICKS::defaultBlockState,
                    AbstractBlock.Properties.copy(Blocks.QUARTZ_BRICKS)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTZ_PILLAR_STAIRS = registerBlock("quartz_pillar_stairs",
            () -> new StairsBlock(Blocks.QUARTZ_PILLAR::defaultBlockState,
                    AbstractBlock.Properties.copy(Blocks.QUARTZ_PILLAR)), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> CHISELED_QUARTZ_SLAB = registerBlock("chiseled_quartz_slab",
            () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.QUARTZ_BRICKS)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTZ_PILLAR_SLAB = registerBlock("quartz_pillar_slab",
            () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.QUARTZ_PILLAR)), ModTabs.SNSMODTAB1);

    public static final RegistryObject<Block> QUARTZ_BUTTON = registerBlock("quartz_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> SMOOTH_QUARTZ_BUTTON = registerBlock("smooth_quartz_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CHISELED_QUARTZ_BUTTON = registerBlock("chiseled_quartz_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> QUARTZ_BRICK_BUTTON = registerBlock("quartz_brick_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> QUARTZ_PILLAR_BUTTON = registerBlock("quartz_pillar_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(0.5f).noCollission()), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> QUARTZ_PRESSURE_PLATE = registerBlock("quartz_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> SMOOTH_QUARTZ_PRESSURE_PLATE = registerBlock("smooth_quartz_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CHISELED_QUARTZ_PRESSURE_PLATE = registerBlock("chiseled_quartz_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> QUARTZ_BRICK_PRESSURE_PLATE = registerBlock("quartz_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> QUARTZ_PILLAR_PRESSURE_PLATE = registerBlock("quartz_pillar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

    /** Cinnamon - for Craftopia-Support*/
    public static final RegistryObject<Block> CINNAMON_PLANKS = registerBlock("cinnamon_planks",
            () -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_STAIRS = registerBlock("cinnamon_stairs",
            () -> new StairsBlock(() -> ModBlocks.CINNAMON_PLANKS.get().defaultBlockState(),
                    AbstractBlock.Properties.copy(Blocks.OAK_STAIRS)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_SLAB = registerBlock("cinnamon_slab",
            () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.OAK_SLAB)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_PRESSURE_PLATE = registerBlock("cinnamon_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CINNAMON_BUTTON = registerBlock("cinnamon_button",
            () -> new WoodButtonBlock(AbstractBlock.Properties.copy(Blocks.OAK_BUTTON).noCollission()), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CINNAMON_FENCE = registerBlock("cinnamon_fence",
            () -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE).strength(2F)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> CINNAMON_FENCE_GATE = registerBlock ("cinnamon_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE_GATE)), ItemGroup.TAB_REDSTONE);
  public static final RegistryObject<Block> CINNAMON_TRAPDOOR = registerBlock ("cinnamon_trapdoor",
          () -> new TrapDoorBlock(AbstractBlock.Properties.copy(Blocks.OAK_TRAPDOOR)), ModTabs.SNSMODTAB1);

    /* @Deprecated
    public static final RegistryObject<Block> CINNAMON_DOOR = registerBlock ("cinnamon_door",
            () -> new DoorBlock(AbstractBlock.Properties.copy(Blocks.OAK_DOOR)),ModTabs.SNSMODTAB1); */
    public static final RegistryObject<Block> CINNAMON_DOOR_01 = registerBlock ("cinnamon_door_01",
            () -> new DoorBlock(AbstractBlock.Properties.copy(Blocks.OAK_DOOR)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CINNAMON_DOOR_02 = registerBlock ("cinnamon_door_02",
            () -> new DoorBlock(AbstractBlock.Properties.copy(Blocks.OAK_DOOR)), ItemGroup.TAB_REDSTONE);

    public static final RegistryObject<Block> CINNAMON_SIGN = registerBlockNoItem("cinnamon_sign",
            () -> new ModStandingSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CINNAMON));

    public static final RegistryObject<Block> CINNAMON_WALL_SIGN = registerBlockNoItem("cinnamon_wall_sign",
            () -> new ModWallSignBlock(AbstractBlock.Properties.of(Material.WOOD), ModWoodTypes.CINNAMON));

    /* public static final RegistryObject<Block> CINNAMON_LEAVES = registerBlock ("cinnamon_leaves",
            () -> new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES)),ModTabs.MODTAB_TAB);    */

    public static final RegistryObject<Block> CINNAMON_PALISADE = registerBlock ("cinnamon_palisade",
            () -> new WallBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2F,5F)
                    .sound(SoundType.WOOD)), ModTabs.SNSMODTAB1);

    /** extra Dirt (& Sand) */
    /** Dirt */
    public static final RegistryObject<Block> DIRT_BLOCK_STAIRS = registerBlock("dirt_block_stairs",
            () -> new ModDirtStairsBlock(Blocks.DIRT::defaultBlockState,
                    AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                            .strength(0.5F).requiresCorrectToolForDrops()
                            .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> DIRT_BLOCK_SLAB = registerBlock("dirt_block_slab",
            () -> new ModDirtSlabBlock(AbstractBlock.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.GRAVEL)
                    .strength(0.5F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);

    /** Path */
/*    public static final RegistryObject<Block> PATH_BLOCK_STAIRS = registerBlock("path_block_stairs",
            () -> new ModGrassStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.GRASS).sound(SoundType.GRASS)
                            .strength(1F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1); */
/*    public static final RegistryObject<Block> PATH_BLOCK_SLAB = registerBlock("path_block_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.GRASS).sound(SoundType.WET_GRASS)
                    .strength(1F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1); */

    /** Grass */
/*    public static final RegistryObject<Block> GRASS_BLOCK_STAIRS = registerBlock("grass_block_stairs",
            () -> new ModGrassStairBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.GRASS).sound(SoundType.GRASS)
                            .strength(1F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1); */
/*    public static final RegistryObject<Block> GRASS_BLOCK_SLAB = registerBlock("grass_block_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.GRASS).sound(SoundType.WET_GRASS)
                    .strength(1F).requiresCorrectToolForDrops()), ModTabs.SNSMODTAB1);    */

    /** Dirt Cobbled */
    public static final RegistryObject<Block> DIRT_COBBLE = registerBlock("dirt_cobble",
            () -> new GrassBlock(AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> DIRT_COBBLE_STAIRS = registerBlock("dirt_cobble_stairs",
            () -> new ModDirtStairsBlock(() -> ModBlocks.DIRT_COBBLE.get().defaultBlockState(),
                    AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                            .strength(1.2F).requiresCorrectToolForDrops()
                            .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> DIRT_COBBLE_SLAB = registerBlock("dirt_cobble_slab",
            () -> new ModDirtSlabBlock(AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);

    /** Quarter Dirt */
    public static final RegistryObject<Block> QUARTER_DIRT = registerBlock("quarter_dirt",
            () -> new ModDirtBlock(AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.0F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTER_DIRT_STAIRS = registerBlock("quarter_dirt_stairs",
            () -> new ModDirtStairsBlock(() -> ModBlocks.QUARTER_DIRT.get().defaultBlockState(),
                    AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                            .strength(1.0F).requiresCorrectToolForDrops()
                            .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTER_DIRT_SLAB = registerBlock("quarter_dirt_slab",
            () -> new ModDirtSlabBlock(AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.0F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);

    /** Quarter Dirt Cobbled */
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE = registerBlock("quarter_dirt_cobble",
            () -> new ModDirtBlock(AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE_STAIRS = registerBlock("quarter_dirt_cobble_stairs",
            () -> new ModDirtStairsBlock(() -> ModBlocks.QUARTER_DIRT_COBBLE.get().defaultBlockState(),
                    AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                            .strength(1.2F).requiresCorrectToolForDrops()
                            .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);
    public static final RegistryObject<Block> QUARTER_DIRT_COBBLE_SLAB = registerBlock("quarter_dirt_cobble_slab",
            () -> new ModDirtSlabBlock(AbstractBlock.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .strength(1.2F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.SHOVEL).harvestLevel(1)), ModTabs.SNSMODTAB1);

    /** Buttons */
    public static final RegistryObject<Block> SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BUTTON = registerBlock("mossy_cobblestone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F)), ItemGroup.TAB_REDSTONE);

        /** Sandstone */
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


    /** - Blackstone */
    public static final RegistryObject<Block> BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.GILDED_BLACKSTONE)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON =
            registerBlock("cracked_polished_blackstone_brick_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.GILDED_BLACKSTONE)), ItemGroup.TAB_REDSTONE);

        /** Deepslate isn't a part of Minecraft less than version 1.17xx  */
/*    public static final RegistryObject<Block> DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_BUTTON = registerBlock("cracked_deepslate_brick_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE_BRICKS)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_BUTTON = registerBlock("cracked_deepslate_tile_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.of(Material.STONE).noCollission()
                    .strength(0.5F).sound(SoundType.DEEPSLATE_TILES)), ItemGroup.TAB_REDSTONE);     */

    /** Pressure Plates */
    public static final RegistryObject<Block> SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

      /** Sandstone */
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
    public static final RegistryObject<Block> END_STONE_BRICK_PRESSURE_PLATE = registerBlock("end_stone_brick_pressure_plate",
          () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                  AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

        /** - Blackstone */
    public static final RegistryObject<Block> BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE =
            registerBlock("cracked_polished_blackstone_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.of(Material.STONE).strength(0.5F)), ItemGroup.TAB_REDSTONE);

        /** Deepslate isn't a part of Minecraft less than version 1.17xx  */
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
                                    sound(SoundType.DEEPSLATE_TILES)),ItemGroup.TAB_REDSTONE);  */

    /** Stairs */
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(2F)), ItemGroup.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS =
            registerBlock("cracked_polished_blackstone_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(1.5F)), ItemGroup.TAB_BUILDING_BLOCKS);

        /** Deepslate isn't a part of Minecraft less than version 1.17xx  */
    /* public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                            .strength(3F)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_BRICKS)
                            .strength(3F)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            () -> new StairsBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_TILES)
                            .strength(3F)), ItemGroup.TAB_BUILDING_BLOCKS);   */

    /** Slabs */
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock
            ("cracked_polished_blackstone_brick_slab",
                    () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)
                            .strength(1.53F)), ItemGroup.TAB_BUILDING_BLOCKS);

        /** Deepslate isn't a part of Minecraft less than version 1.17xx  */
    /* public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                    .strength(3F)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_BRICKS)
                    .strength(3F)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE_TILES)
                    .strength(3F)), ItemGroup.TAB_BUILDING_BLOCKS); */

    /** Iced Blocks - Ice */
    public static final RegistryObject<Block> ICE_STAIRS = registerBlock("ice_stairs",
            () -> new ModIceStairBlock(Blocks.ICE::defaultBlockState,
                    AbstractBlock.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.5F).noOcclusion().requiresCorrectToolForDrops()
                            .harvestTool(ToolType.PICKAXE).harvestLevel(1)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ICE_SLAB = registerBlock("ice_slab",
          () -> new ModIceSlabBlock(AbstractBlock.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).friction(1.0f)
                  .strength(0.5F).noOcclusion().requiresCorrectToolForDrops()
                  .harvestTool(ToolType.PICKAXE).harvestLevel(1)), ItemGroup.TAB_BUILDING_BLOCKS);

    /** Iced Blocks - Packed Ice */
    public static final RegistryObject<Block> PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            () -> new ModFrostedIceStairBlock(Blocks.PACKED_ICE::defaultBlockState,
                    AbstractBlock.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0F)
                            .strength(0.8F).requiresCorrectToolForDrops()
                            .harvestTool(ToolType.PICKAXE).harvestLevel(1)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            () -> new ModFrostedIceSlabBlock(AbstractBlock.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0f)
                    .strength(0.8F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)), ItemGroup.TAB_BUILDING_BLOCKS);

    /** Iced Blocks - Blue Ice */
    public static final RegistryObject<Block> BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            () -> new ModFrostedIceStairBlock(Blocks.BLUE_ICE::defaultBlockState,
                    AbstractBlock.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0f)
                            .strength(2.8F).requiresCorrectToolForDrops()
                            .harvestTool(ToolType.PICKAXE).harvestLevel(1)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            () -> new ModFrostedIceSlabBlock(AbstractBlock.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).friction(1.0f)
                    .strength(2.8F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)), ItemGroup.TAB_BUILDING_BLOCKS);

    /** Iced Blocks - Dry Ice */
    public static final RegistryObject<Block> DRY_ICE_BLOCK = registerBlock("dry_ice_block",
            () -> new ModDryIceBlock(AbstractBlock.Properties.copy(Blocks.ICE).sound(SoundType.GLASS)
                    .strength(1.8F).friction(1.0F).lightLevel((pLightLevel) -> 6)
                    .requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)),
                    ModTabs.SNSMODTAB1,"tooltip.slabsnstairs.dry_ice_block");
  public static final RegistryObject<Block> DRY_ICE_STAIRS = registerBlock("dry_ice_stairs",
          () -> new ModDryIceStairBlock(() -> ModBlocks.DRY_ICE_BLOCK.get().defaultBlockState(),
                  AbstractBlock.Properties.copy(Blocks.ICE).sound(SoundType.GLASS).strength(1.8F)
                          .friction(1.0F).lightLevel((pLightLevel) -> 6)
                          .requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)),
                          ModTabs.SNSMODTAB1,"tooltip.slabsnstairs.dry_ice_stairs");
  public static final RegistryObject<Block> DRY_ICE_SLAB = registerBlock("dry_ice_slab",
          () -> new ModDryIceSlabBlock(AbstractBlock.Properties.copy(Blocks.ICE).sound(SoundType.GLASS)
                  .friction(1.0f).strength(1.8F).lightLevel((pLightLevel) -> 6)
                  .requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)),
                  ModTabs.SNSMODTAB1, "tooltip.slabsnstairs.dry_ice_slab");


    /** Registering the Blocks is moved to a separate Class called <p>
     * RegisteringModBlocks</p>
     * <p>
     * - with Tooltip
     * </p>*/

    /* private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     ItemGroup tab, String tooltipKey) {
        RegistryObject<T> toReturn = MOD_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block, ItemGroup tab, String tooltipKey) {
        return ModItems.MOD_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
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
    } */

        /** without Tooltip */
    /* private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, ItemGroup tab) {
        RegistryObject<T> toReturn = MOD_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block, ItemGroup tab) {
        return ModItems.MOD_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    } */

    public static void register(IEventBus eventBus) {
        LOGGER.debug("Registering Mod-Blocks for " + MODID);
        MOD_BLOCKS.register(eventBus);
    }
}
