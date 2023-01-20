package net.dancervlt69.slabsnstairs.init.items.custom.utils;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModStaffItem extends Item {
	public ModStaffItem(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
		pAttacker.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60));
		pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200, 2));
		return super.hurtEnemy(pStack, pTarget, pAttacker);

	}
}
