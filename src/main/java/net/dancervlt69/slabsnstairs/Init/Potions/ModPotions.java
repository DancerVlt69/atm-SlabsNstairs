package net.dancervlt69.slabsnstairs.Init.Potions;

import net.minecraft.potion.Effect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModPotions {

	public static final DeferredRegister<Effect> POTIONS
			= DeferredRegister.create(ForgeRegistries.POTIONS, MODID);

	/*public static final RegistryObject<Potion> FREEZE_POTION = POTIONS.register("freeze_potion",
			() -> new Potion(new EffectInstance(Fre(), 200, 0))); */

	public static void register(IEventBus eventBus) { POTIONS.register(eventBus);}

}
