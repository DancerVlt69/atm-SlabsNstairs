
package net.dancervlt69.slabsnstairs;

import com.mojang.serialization.Codec;
import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Enchantments.ModEnchantments;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Recipes.ModRecipes;
import net.dancervlt69.slabsnstairs.Init.Settings.ModClientSettings;
import net.dancervlt69.slabsnstairs.Init.World.Features.ModPlacedFeatures;
import net.dancervlt69.slabsnstairs.Init.World.Features.ModConfiguredFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SlabsNstairs.MODID)
public class SlabsNstairs {
    public static final String MODID = "slabsnstairs";
    public static final boolean ENABLE = true;
    public static final Logger LOGGER = LogManager.getLogger(SlabsNstairs.class);

    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID),
            () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    private static final int messageID = 0;

    public SlabsNstairs() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registering Blocks, Items, Sounds, etc.
        ModBlocks.register(eventBus);
        ModItems.register(eventBus);

        ModConfiguredFeatures.register(eventBus);
        ModEnchantments.register(eventBus);
        ModPlacedFeatures.register(eventBus);
        ModRecipes.register(eventBus);

        // Register the setup method for modLoading
        // eventBus.addListener(this::onSetup);
        // eventBus.addListener(this::onClientSetup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ModClientSettings.SPEC,
                "slabsnstairs-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModClientSettings.SPEC,
                "slabsnstairs-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ModClientSettings.SPEC,
                "slabsnstairs-server.toml");

        // ModLootModifiers.LOOT_MODIFIERS.register(eventBus);
        // ModLootAdditionModifier.LOOT_CONDITIONS_CODEC.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        final DeferredRegister<Codec<?
                        extends IGlobalLootModifier>> GLM = DeferredRegister.create(ForgeRegistries
                .Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MODID);

         /** final RegistryObject<Codec<CitrineCoinInDesertChestsAdditionModifier>> LOOT_IN_DESERT_CHESTS
                = GLM.register("dungeon_loot", CitrineCoinInDesertChestsAdditionModifier.CODEC);

        GLM.register(FMLJavaModLoadingContext.get().getModEventBus()); */
    }
}
