package net.dancervlt69.slabsnstairs.init.world.features;

import com.google.common.base.Suppliers;
import net.dancervlt69.slabsnstairs.init.blocks.ModBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;
import java.util.function.Supplier;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CITRINE_ORE_KEY = registerKey("citrine_ore");

    // private static final ResourceKey<ConfiguredFeature<?, ?>> RED_BEECH_KEY = registerKey("red_beech");

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CITRINE_ORES = Suppliers.memoize(
            () -> List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                            ModBlocks.CITRINE_ORE.get().defaultBlockState()),

                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES),
                            ModBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState())));

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, OVERWORLD_CITRINE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_CITRINE_ORES.get(),12));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register
            (BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature,
             FC configuration) { context.register(key,new ConfiguredFeature<>(feature, configuration)); }

}


//////////////////////////////////

    /*

    register(context,RED_BEECH_KEY, Feature.TREE,new ConfiguredFeature<>(Feature.TREE,
            new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.RED_BEECH_LOG.get()),
            new StraightTrunkPlacer(5, 6,3),
            BlockStateProvider.simple(ModBlocks.RED_BEECH_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
            new TwoLayersFeatureSize(1,0,2)).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RED_BEECH_SPAWN =
            CONFIGURED_FEATURES.register("red_beech_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            ModPlacedFeatures.RED_BEECH_CHECKED.getHolder().get(), 0.5f)),
                            ModPlacedFeatures.RED_BEECH_CHECKED.getHolder().get()))); */
