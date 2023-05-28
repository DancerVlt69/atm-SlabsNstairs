package net.dancervlt69.slabsnstairs.events;

import net.dancervlt69.slabsnstairs.init.utils.particles.ModParticleTypes;
import net.dancervlt69.slabsnstairs.init.utils.particles.custom.ModCitrineParticles;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

	@SubscribeEvent
	public static void registerParticles(final ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register(ModParticleTypes.CITRINE_PARTICLES.get(),
				ModCitrineParticles.Provider::new);
	}
}
