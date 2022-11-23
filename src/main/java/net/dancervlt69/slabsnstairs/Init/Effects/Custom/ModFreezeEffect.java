package net.dancervlt69.slabsnstairs.Init.Effects.Custom;

import net.dancervlt69.slabsnstairs.Init.Effects.ModEffects;
import net.minecraft.advancements.criterion.MobEffectsPredicate;
import net.minecraft.entity.LivingEntity;

public class ModFreezeEffect extends ModEffects {

	public ModFreezeEffect(MobEffectsPredicate mobEffectsPredicate, int pColor) {
		super(mobEffectsPredicate, pColor);
	}

	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		if (!pLivingEntity.level.isClientSide()) {
			Double x = pLivingEntity.getX();
			Double y = pLivingEntity.getY();
			Double z = pLivingEntity.getZ();

			pLivingEntity.teleportTo(x, y, z);
			pLivingEntity.setDeltaMovement(0, 0, 0);
		}
		super.applyEffectTick(pLivingEntity, pAmplifier);
	}

	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}

}
