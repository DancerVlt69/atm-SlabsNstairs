package net.dancervlt69.slabsnstairs.Init.Events;

import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientSetupEvents {
    public static final Logger LOGGER = LogManager.getLogger(SlabsNstairs.class);

        public static void modRenderTypes() {
        }

        public static void modAddingProperties() {
        }
}
