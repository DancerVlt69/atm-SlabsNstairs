package net.dancervlt69.slabsnstairs.Init.Sounds;

import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SlabsNstairs.MODID);

    public static void  register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
