
package net.dancervlt69.slabsnstairs;

import net.dancervlt69.slabsnstairs.init.blocks.entities.ModBlockEntities;
import net.dancervlt69.slabsnstairs.init.blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.init.utils.enchantments.ModEnchantments;
import net.dancervlt69.slabsnstairs.events.loot.ModLootModifiers;
import net.dancervlt69.slabsnstairs.events.ModClientSetupEvents;
import net.dancervlt69.slabsnstairs.events.ModCommonSetupEvents;
import net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.ModEntityTypes;
import net.dancervlt69.slabsnstairs.init.items.ModItems;
import net.dancervlt69.slabsnstairs.init.utils.settings.ModClientConfig;
import net.dancervlt69.slabsnstairs.init.utils.settings.ModCommonConfig;
import net.dancervlt69.slabsnstairs.init.world.features.ModConfiguredFeatures;
import net.dancervlt69.slabsnstairs.init.world.features.ModPlacedFeatures;
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
        ModEntityTypes.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModEnchantments.register(eventBus);

        // Register the setup method for modLoading
        eventBus.addListener(this::onClientSetup);
        eventBus.addListener(this::onCommonSetup);
        // eventBus.addListener(this::onServerStarting);

        modSettings(ModConfig.Type.CLIENT, ModClientConfig.SPEC, "slabsnstairs-client.toml");
        modSettings(ModConfig.Type.COMMON, ModCommonConfig.SPEC, "slabsnstairs-common.toml");

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

}
