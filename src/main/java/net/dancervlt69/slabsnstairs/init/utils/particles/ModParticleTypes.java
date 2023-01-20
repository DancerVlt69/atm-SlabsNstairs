package net.dancervlt69.slabsnstairs.init.utils.particles;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> MOD_PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MODID);

    public static final RegistryObject<SimpleParticleType> CITRINE_PARTICLES =
            MOD_PARTICLE_TYPES.register("citrine_particles",
                    () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) { MOD_PARTICLE_TYPES.register(eventBus); }
}
