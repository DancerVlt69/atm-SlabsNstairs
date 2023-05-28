package net.dancervlt69.slabsnstairs.init.utils.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> MOD_SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);

    public static RegistryObject<SoundEvent> SHAKE_THE_BUS = registerSoundEvent("shake_the_bus");

    public static RegistryObject<SoundEvent> registerSoundEvent (String name) {
        return MOD_SOUNDS.register(
                name,  () -> new SoundEvent(new ResourceLocation(MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        MOD_SOUNDS.register(eventBus);
    }
}
