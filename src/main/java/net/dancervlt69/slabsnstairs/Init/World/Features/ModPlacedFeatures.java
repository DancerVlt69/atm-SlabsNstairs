package net.dancervlt69.slabsnstairs.Init.World.Features;

import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SlabsNstairs.MODID);

    public static final RegistryObject<PlacedFeature> CITRINE_ORE_PLACED = PLACED_FEATURES.register("citrine_ore_placed",
            () -> new PlacedFeature(net.dancervlt69.slabsnstairs.Init.World.Features.ModConfiguredFeatures.CITRINE_ORE.getHolder().get(), commonOrePlacement(8,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(-80)))));

    /* public static final RegistryObject<PlacedFeature> RED_BEECH_CHECKED = PLACED_FEATURES.register("red_beech_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.RED_BEECH.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival((ModBlocks.RED_BEECH_SAPLING.get())))));

    public static final RegistryObject<PlacedFeature> RED_BEECH_PLACED = PLACED_FEATURES.register("red_beech_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RED_BEECH_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3,0.1f, 2)))); */

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

}
