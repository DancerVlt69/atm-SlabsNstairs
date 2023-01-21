package net.dancervlt69.slabsnstairs.init.world.features;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> CITRINE_ORE_PLAYCED_KEY = createKey("citrine_ore");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CITRINE_ORE_PLAYCED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CITRINE_ORE_KEY),
                commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                        VerticalAnchor.aboveBottom(60))));
    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MODID, name));
    }

    public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                Holder<ConfiguredFeature<?, ? >> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

}



//    /* public static final RegistryObject<PlacedFeature> RED_BEECH_CHECKED = PLACED_FEATURES.register("red_beech_checked",
//            () -> new PlacedFeature(ModConfiguredFeatures.RED_BEECH.getHolder().get(),
//                    List.of(PlacementUtils.filteredByBlockSurvival((ModBlocks.RED_BEECH_SAPLING.get())))));

//    public static final RegistryObject<PlacedFeature> RED_BEECH_PLACED = PLACED_FEATURES.register("red_beech_placed",
//            () -> new PlacedFeature(ModConfiguredFeatures.RED_BEECH_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
//                    PlacementUtils.countExtra(3,0.1f, 2)))); */
