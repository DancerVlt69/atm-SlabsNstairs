package net.dancervlt69.slabsnstairs.Init.Events;

import net.dancervlt69.slabsnstairs.Init.World.Features.gen.Ores.ModOreGeneration;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SlabsNstairs.MODID)
public class ModWorldEvents {

	@SubscribeEvent
	public static void biomeLoadingEvents (final BiomeLoadingEvent event) {
		ModOreGeneration.generateOres(event);
	}
}
