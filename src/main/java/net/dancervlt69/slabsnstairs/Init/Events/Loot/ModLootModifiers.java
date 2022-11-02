package net.dancervlt69.slabsnstairs.Init.Events.Loot;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModLootModifiers {

	public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS_SERIALIZERS =
			DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MODID);

	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> CITRINE_COIN_IN_DESERT_CHESTS =
			LOOT_MODIFIERS_SERIALIZERS.register("citrine_coin_in_desert_chests",
					CitrineCoinInDesertChests.CODEC);

	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> CITRINE_COIN_IN_PLAINS_CHESTS =
			LOOT_MODIFIERS_SERIALIZERS.register("citrine_coin_in_plains_chests",
					CitrineCoinInPlainsChests.CODEC);

	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> CITRINE_COIN_IN_SNOWY_CHESTS =
			LOOT_MODIFIERS_SERIALIZERS.register("citrine_coin_in_snowy_chests",
					CitrineCoinInSnowyChests.CODEC);

	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> GLOW_BERRIES_FROM_TALL_GRASS =
			LOOT_MODIFIERS_SERIALIZERS.register("glow_berries_from_tall_grass",
					GlowBerriesFromTallGrass.CODEC);

	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SWEET_BERRIES_FROM_LARGE_FERN =
			LOOT_MODIFIERS_SERIALIZERS.register("sweet_berries_from_large_fern",
					SweetBerriesFromLargeFern.CODEC);

	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BONES_FROM_PIGS =
			LOOT_MODIFIERS_SERIALIZERS.register("bones_from_pigs",
					BonesFromPigs.CODEC);
	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BONES_FROM_SHEEP =
			LOOT_MODIFIERS_SERIALIZERS.register("bones_from_sheep",
					BonesFromSheep.CODEC);
	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BONES_FROM_COWS =
			LOOT_MODIFIERS_SERIALIZERS.register("bones_from_cows",
					BonesFromCows.CODEC);
	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BONES_FROM_CHICKEN =
			LOOT_MODIFIERS_SERIALIZERS.register("bones_from_chicken",
					BonesFromChicken.CODEC);
	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BONES_FROM_HORSE =
			LOOT_MODIFIERS_SERIALIZERS.register("bones_from_horse",
					BonesFromHorse.CODEC);

	public static void register(IEventBus eventBus) {
		LOOT_MODIFIERS_SERIALIZERS.register(eventBus);
	}
}
