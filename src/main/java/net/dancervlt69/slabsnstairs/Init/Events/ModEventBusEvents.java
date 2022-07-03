package net.dancervlt69.slabsnstairs.Init.Events;

import net.dancervlt69.slabsnstairs.Init.Events.Loot.CitrineCoinInDesertChestsAdditionModifier;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = SlabsNstairs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new CitrineCoinInDesertChestsAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(SlabsNstairs.MODID, "citrine_coin_in_desert_chests")),
                new CitrineCoinInDesertChestsAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(SlabsNstairs.MODID, "citrine_coin_in_plains_chests")),
                new CitrineCoinInDesertChestsAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(SlabsNstairs.MODID, "citrine_coin_in_snowy_chests"))
        );
    }
}
