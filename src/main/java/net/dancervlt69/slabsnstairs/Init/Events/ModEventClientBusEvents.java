package net.dancervlt69.slabsnstairs.Init.Events;

import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModEventClientBusEvents {
    public static final Logger LOGGER = LogManager.getLogger(SlabsNstairs.class);

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLCommonSetupEvent event) {

            // ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWTH_STOP.get(), RenderType.translucent());
            // ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_SLAB.get(), RenderType.translucent());
            // ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_STAIRS.get(), RenderType.translucent());

            // if(ENABLE)

                // getGenerator().addProvider(event.includeServer(), new DataProvider(event.getGenerator(), MODID));
        }
    }
    public static class ClientModExtends {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Client Setup Code
            LOGGER.info("Client Setup...");
            LOGGER.info("MC Name --> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
