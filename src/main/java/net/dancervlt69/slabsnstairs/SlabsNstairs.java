
package net.dancervlt69.slabsnstairs;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Settings.ModClientSettings;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(SlabsNstairs.MODID)
public class SlabsNstairs {
    public static final Logger LOGGER = LogManager.getLogger(SlabsNstairs.class);
    public static final String MODID = "slabsnstairs";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID),
            () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    private static final int messageID = 0;

    public SlabsNstairs()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registering Blocks, Items, Sounds, etc.
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        // ModFluids.register(eventBus);
        // ModSounds.register(eventBus);

        // Register the mod-setting methodes for modLoading
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ModClientSettings.SPEC,
                "slabsnstairs-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModClientSettings.SPEC,
                "slabsnstairs-common.toml");
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Minecraft.getInstance().player.chat(msg);
    }

   private void clientSetup(final FMLCommonSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWTH_STOP.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.CINNAMON_DOOR.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CINNAMON_TRAPDOOR.get(), RenderType.cutout());
    /*    ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_STAIRS.get(), RenderType.translucent()); */
    }
    private void setup(final FMLCommonSetupEvent event) {
        // Preinit code
        LOGGER.info("PreInit has started...");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
/*    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
                                             BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    } */
}

