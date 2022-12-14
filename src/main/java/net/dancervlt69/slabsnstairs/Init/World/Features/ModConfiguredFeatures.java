package net.dancervlt69.slabsnstairs.Init.World.Features;

import com.google.common.base.Suppliers;
import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

import java.util.List;
import java.util.function.Supplier;



public class ModConfiguredFeatures {

//    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
//          DeferredRegister.create(ForgeRegistries.FEATURES.getRegistryName(), MODID);

//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CITRINE_ORES = Suppliers.memoize(()
//            -> List.of(
//            OreConfiguration.target(new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD),
//                    ModBlocks.CITRINE_ORE.get().defaultBlockState()),
//            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES),
//                    ModBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState())));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> CITRINE_ORE = CONFIGURED_FEATURES.register("citrine_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CITRINE_ORES.get(), 9)));

    //////////////////////////////////

    /* public static final RegistryObject<ConfiguredFeature<?, ?>> RED_BEECH = CONFIGURED_FEATURES.register("red_beech",
            () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.RED_BEECH_LOG.get()),
                    new StraightTrunkPlacer(5, 6,3),
                    BlockStateProvider.simple(ModBlocks.RED_BEECH_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2),ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1,0,2)).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RED_BEECH_SPAWN =
            CONFIGURED_FEATURES.register("red_beech_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            ModPlacedFeatures.RED_BEECH_CHECKED.getHolder().get(), 0.5f)),
                            ModPlacedFeatures.RED_BEECH_CHECKED.getHolder().get()))); */


//    public static void register(IEventBus eventBus) { CONFIGURED_FEATURES.register(eventBus); }

}
