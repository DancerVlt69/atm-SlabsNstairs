package net.dancervlt69.slabsnstairs.Init.Events;

import net.dancervlt69.slabsnstairs.Init.Events.Loot.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new CitrineCoinInDesertChests.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "citrine_coin_in_desert_chests")),
                new CitrineCoinInPlainChests.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "citrine_coin_in_plain_chests")),
                new CitrineCoinInSnowyChests.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "citrine_coin_in_snowy_chests")),

                new BerriesFromTallGrass.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "berries_from_tall_grass")),
                new BerriesFromLargeFern.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "berries_from_large_fern")),

                new BonesFromChicken.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_chicken")),
                new BonesFromCows.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_cows")),
                new BonesFromDonkey.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_donkey")),
                new BonesFromFox.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_fox")),
                new BonesFromGoat.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_goat")),
                new BonesFromHorse.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_horse")),
                new BonesFromLama.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_lama")),
                new BonesFromPigs.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_pigs")),
                new BonesFromRabbit.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_rabbit")),

                new BonesFromSheepBlack.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_sheep_black")),
                new BonesFromSheepBrown.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_sheep_brown")),
                new BonesFromSheepGray.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_sheep_gray")),
                new BonesFromSheepWhite.Serializer().setRegistryName
                        (new ResourceLocation(MODID, "bones_from_sheep_white"))
        );
    }
}
