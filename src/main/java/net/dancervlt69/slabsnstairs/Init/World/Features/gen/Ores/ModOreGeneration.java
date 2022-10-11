package net.dancervlt69.slabsnstairs.Init.World.Features.gen.Ores;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.Dimension;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGeneration {
	public static void generateOres (final BiomeLoadingEvent event) {
	//	spawnOreIModBiomes(ModBiomes.RIFT_BIOME.get(), OreTypes.CITRINE, event,Dimension.OVERWORLD.toString());
	//	spawnOreInSpecificBiome(Biomes.DARK_FOREST, OreTypes.CITRINE, event, Dimension.OVERWORLD.toString());
	//	spawnOreInAllBiomes(OreTypes.CITRINE, event, Dimension.OVERWORLD.toString());
		spawnOreInOverworldInAllBiomes(OreTypes.CITRINE, event);
	}

	private static OreFeatureConfig getOverworldFeatureConfig(OreTypes ore) {
		return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
				ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());
	}

	private static ConfiguredFeature<?, ?> makeOreFeature (OreTypes ore, String dimensionToSpawnIn) {
		OreFeatureConfig oreFeatureConfig = null;

		if (dimensionToSpawnIn.equals(Dimension.OVERWORLD.toString())) {
			oreFeatureConfig = getOverworldFeatureConfig(ore);
		}
		ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configured(
				new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

		return registerOreFeature(ore, oreFeatureConfig, configuredPlacement);
	}

	private static void spawnOreInSpecificBiome(RegistryKey<Biome> biomeToSpawnIn, OreTypes currentOreType,
												final BiomeLoadingEvent event, String dimension) {
		if(event.getName().toString().contains(biomeToSpawnIn.location().toString())) {
			event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType, dimension));
		}
	}
	private static void spawnOreInOverworldInAllBiomes(OreTypes ore, final BiomeLoadingEvent event) {
		OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
				ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

		ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configured(
				new TopSolidRangeConfig(ore.getMinOffset(),ore.getMinHeight(),ore.getMaxHeight()));

						//ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

		ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

		event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
	}

	private static void spawnOreInAllBiomes(OreTypes currentOreType, final BiomeLoadingEvent event, String dimension) {
		event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				makeOreFeature(currentOreType, dimension));
	}

	private static ConfiguredFeature<?, ?> registerOreFeature(OreTypes ore, OreFeatureConfig oreFeatureConfig,
															  ConfiguredPlacement configuredPlacement) {
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(),
				Feature.ORE.configured(oreFeatureConfig).decorated(configuredPlacement)
						.count(ore.getVeinPerChunk()));
	}

}
