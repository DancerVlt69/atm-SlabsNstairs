package net.dancervlt69.slabsnstairs.Init.Loot;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;

/**
 * Author: Autovw
 */

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, SlabsNstairs.MODID);

    /*
    public static final RegistryObject<Codec<ModLootAdditionModifier>> LOOT_ADDITION_MODIFIER =
            LOOT_MODIFIERS.register("loot_addition_modifier", () -> ModLootAdditionModifier.CODEC);

    public static final RegistryObject<Codec<ModLootAdditionModifier>> CITRINE_COIN_IN_DESERT_CHESTS =
            LOOT_MODIFIERS.register("citrine_coin_in_desert_chests", () -> ModLootAdditionModifier.CODEC);

    public static final RegistryObject<Codec<ModLootAdditionModifier>> CITRINE_COIN_IN_PLAINS_CHESTS =
            LOOT_MODIFIERS.register("citrine_coin_in_plains_chests", () -> ModLootAdditionModifier.CODEC);

    public static final RegistryObject<Codec<ModLootAdditionModifier>> CITRINE_COIN_IN_SNOWY_CHESTS =
            LOOT_MODIFIERS.register("citrine_coin_in_snowy_chests", () -> ModLootAdditionModifier.CODEC); */
}
