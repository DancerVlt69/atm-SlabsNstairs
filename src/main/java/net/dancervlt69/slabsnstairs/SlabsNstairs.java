
package net.dancervlt69.slabsnstairs;

import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.ModBlockEntities;
import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Blocks.RegisteringModBlocks;
import net.dancervlt69.slabsnstairs.Init.Enchantments.ModEnchantments;
import net.dancervlt69.slabsnstairs.Init.Events.ModClientSetupEvents;
import net.dancervlt69.slabsnstairs.Init.Events.ModCommonSetupEvents;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Settings.ModClientSettings;
import net.dancervlt69.slabsnstairs.Init.World.Features.ModConfiguredFeatures;
import net.dancervlt69.slabsnstairs.Init.World.Features.ModPlacedFeatures;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;


@Mod(SlabsNstairs.MODID)
public class SlabsNstairs {
    public static final Logger LOGGER = LogManager.getLogger(SlabsNstairs.class);
    public static final String MODID = "slabsnstairs";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID),
            () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    private static int messageID = 0;

    public SlabsNstairs()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registering Blocks, Items, Sounds, etc.
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModConfiguredFeatures.register(eventBus);
        ModPlacedFeatures.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModEnchantments.register(eventBus);
        // ModRecipes.register(eventBus);

        // Register the setup methods for modLoading
        eventBus.addListener(this::onClientSetup);
        eventBus.addListener(this::onCommonSetup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ModClientSettings.SPEC, "slabsnstairs-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModClientSettings.SPEC, "slabsnstairs-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ModClientSettings.SPEC, "slabsnstairs-server.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Minecraft.getInstance().player.chat(msg);
    }

    @OnlyIn(Dist.CLIENT)
    public void onClientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Client Setup started...");

        ModClientSetupEvents.modWoodTypeRegister();
        ModClientSetupEvents.modRenderTypes();

        LOGGER.info("Client Setup finished.");
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        // Common Setup Code
        LOGGER.info("Common Setup started...");

        ModCommonSetupEvents.addModWoodTypes(event);

        LOGGER.info("Common Setup finished.");
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
                                             BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }
}

