package net.dancervlt69.slabsnstairs.Init.World.Features;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;

import net.minecraft.world.gen.feature.*;

public class ModConfiguredFeatures {
    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String pId, ConfiguredFeature<FC, ?> pConfiguredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, pId, pConfiguredFeature);
    }

    public static final ConfiguredFeature<?, ?> CITRINE_ORE =
            register("citrine_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.CITRINE_ORE.get().defaultBlockState(), 6)).range(56).squared().count(6));

    /*public static final ConfiguredFeature<?, ?> ORE_COAL = register("ore_coal",
            Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    Features.States.COAL_ORE, 17)).range(128).squared().count(20)); */


    /* public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_BEECH =
            register("red_beech", Feature.TREE.configured((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.RED_BEECH_LOG.getDefaultState()),
                            new SimpleBlockStateProvider(ModBlocks.RED_BEECH_LEAVES.getDefaultState()),
                            new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3),
                            new StraightTrunkPlacer(4, 2, 0),
                            new TwoLayerFeature(1, 0, 1))).ignoreVines().build())); */

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

    // public static void register(IEventBus eventBus) { CONFIGURED_FEATURES.register(eventBus);    }

}
