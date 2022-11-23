package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModStaffItem extends Item {
	public ModStaffItem(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
		pAttacker.addEffect(new EffectInstance(Effects.BLINDNESS, 60));
		pTarget.addEffect(new EffectInstance(Effects.LEVITATION, 200, 2));
		return super.hurtEnemy(pStack, pTarget, pAttacker);

	}
}
