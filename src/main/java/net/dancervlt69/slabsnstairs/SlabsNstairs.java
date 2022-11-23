
package net.dancervlt69.slabsnstairs;

import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.ModBlockEntities;
import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Enchantments.ModEnchantments;
import net.dancervlt69.slabsnstairs.Init.Events.Loot.ModLootModifiers;
import net.dancervlt69.slabsnstairs.Init.Events.ModClientSetupEvents;
import net.dancervlt69.slabsnstairs.Init.Events.ModCommonSetupEvents;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Settings.ModClientSettings;
import net.dancervlt69.slabsnstairs.Init.Settings.ModCommonSettings;
import net.dancervlt69.slabsnstairs.Init.World.Features.ModConfiguredFeatures;
import net.dancervlt69.slabsnstairs.Init.World.Features.ModPlacedFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SlabsNstairs.MODID)
public class SlabsNstairs {
    public static final String MODID = "slabsnstairs";
    public static final Logger LOGGER = LogManager.getLogger(SlabsNstairs.class);

    public static final boolean ENABLE = true;
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID),
            () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    private static final int messageID = 0;

    public SlabsNstairs() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registering Blocks, Items, Sounds, etc.
        ModBlocks.register(eventBus);
        ModItems.register(eventBus);

        ModLootModifiers.register((eventBus));
        ModConfiguredFeatures.register(eventBus);
        ModPlacedFeatures.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModEnchantments.register(eventBus);

        // Register the setup method for modLoading
        eventBus.addListener(this::onClientSetup);
        eventBus.addListener(this::onCommonSetup);
        // eventBus.addListener(this::onServerStarting);

        modSettings(ModConfig.Type.COMMON, ModCommonSettings.SPEC, "slabsnstairs-common.toml");
        modSettings(ModConfig.Type.CLIENT, ModClientSettings.SPEC, "slabsnstairs-client.toml");
        modSettings(ModConfig.Type.SERVER, ModClientSettings.SPEC, "slabsnstairs-server.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @OnlyIn(Dist.CLIENT)
    public void onClientSetup(FMLClientSetupEvent event) {
        // Client Setup Code
        LOGGER.info("Client Setup started...");

        ModClientSetupEvents.modWoodTypeRegister();
        ModClientSetupEvents.modRenderTypes();
        ModClientSetupEvents.modAddingProperties();

        LOGGER.info("Client Setup finished.");
    }

    public void onCommonSetup(FMLCommonSetupEvent event) {

        // Common Setup Code
        LOGGER.info("Common Setup started...");

        ModCommonSetupEvents.addModWoodTypes(event);

        LOGGER.info("Common Setup finished.");
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Starting Server...");
        LOGGER.info("Server Start finished.");
    }

    private static void modSettings(ModConfig.Type configType, ForgeConfigSpec spec, String fileName) {
        ModLoadingContext.get().registerConfig(configType, spec, fileName);
    }

    /* @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class CommonModEvents { */

}
