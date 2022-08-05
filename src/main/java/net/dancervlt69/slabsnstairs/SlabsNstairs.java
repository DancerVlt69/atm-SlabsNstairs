
package net.dancervlt69.slabsnstairs;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Settings.ModClientSettings;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
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
        // ModFluids.register(eventBus);
        // ModSounds.register(eventBus);

        // Register the setup method for modLoading
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
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWTH_STOP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CINNAMON_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CINNAMON_TRAPDOOR.get(), RenderType.cutout());
/*      ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_STAIRS.get(), RenderType.translucent());
 */
    }
    private void setup(final FMLCommonSetupEvent event) {
        // Preinit code
        LOGGER.info("PreInit has started...");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
                                             BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }
}

