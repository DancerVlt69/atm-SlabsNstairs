package net.dancervlt69.slabsnstairs.init.sounds;

import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> MOD_SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);

//    @NotNull
//    public static SoundEvents registerSoundEvent (String name) {
//        return SoundEvent.createVariableRangeEvent( new ResourceLocation(MODID, name));
//    }

    public static void register(IEventBus eventBus) { MOD_SOUNDS.register(eventBus); }
}
