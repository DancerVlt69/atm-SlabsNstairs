package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.dancervlt69.slabsnstairs.Init.Items.Entities.ModTridentEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.stats.Stats;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class ModTridentItem extends TridentItem {
	private final Multimap<Attribute, AttributeModifier> defaultModifiers;

	public ModTridentItem(Item.Properties itemProperties) {
		super(itemProperties);
		ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
		builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 8.0D, AttributeModifier.Operation.ADDITION));
		builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", (double)-2.9F, AttributeModifier.Operation.ADDITION));
		this.defaultModifiers = builder.build();
	}

	@Override
	public int getUseDuration(ItemStack pStack) {
		return 150000;
	}

	@Override
	public void releaseUsing(ItemStack pStack, World pLevel, LivingEntity pEntityLiving, int pTimeLeft) {
		if (pEntityLiving instanceof PlayerEntity) {
			PlayerEntity playerentity = (PlayerEntity)pEntityLiving;
			int i = this.getUseDuration(pStack) - pTimeLeft;
			if (i >= 10) {
				int j = EnchantmentHelper.getRiptide(pStack);
				if (j <= 0 || playerentity.isInWaterOrRain()) {
					if (!pLevel.isClientSide) {
						pStack.hurtAndBreak(1, playerentity, (p_220047_1_) -> {
							p_220047_1_.broadcastBreakEvent(pEntityLiving.getUsedItemHand());
						});
						if (j == 0) {
							ModTridentEntity modTridentEntity = new ModTridentEntity(pLevel, playerentity, pStack);
							modTridentEntity.shootFromRotation(playerentity, playerentity.xRot, playerentity.yRot, 0.0F, 2.5F + (float)j * 0.5F, 1.0F);
							if (playerentity.abilities.instabuild) {
								modTridentEntity.pickup = AbstractArrowEntity.PickupStatus.CREATIVE_ONLY;
							}

							pLevel.addFreshEntity(modTridentEntity);
							pLevel.playSound((PlayerEntity)null, modTridentEntity, SoundEvents.TRIDENT_THROW, SoundCategory.PLAYERS, 1.0F, 1.0F);
							if (!playerentity.abilities.instabuild) {
								playerentity.inventory.removeItem(pStack);
							}
						}
					}

					playerentity.awardStat(Stats.ITEM_USED.get(this));
					if (j > 0) {
						float f7 = playerentity.yRot;
						float f = playerentity.xRot;
						float f1 = -MathHelper.sin(f7 * ((float)Math.PI / 180F)) * MathHelper.cos(f * ((float)Math.PI / 180F));
						float f2 = -MathHelper.sin(f * ((float)Math.PI / 180F));
						float f3 = MathHelper.cos(f7 * ((float)Math.PI / 180F)) * MathHelper.cos(f * ((float)Math.PI / 180F));
						float f4 = MathHelper.sqrt(f1 * f1 + f2 * f2 + f3 * f3);
						float f5 = 3.0F * ((1.0F + (float)j) / 4.0F);
						f1 = f1 * (f5 / f4);
						f2 = f2 * (f5 / f4);
						f3 = f3 * (f5 / f4);
						playerentity.push((double)f1, (double)f2, (double)f3);
						playerentity.startAutoSpinAttack(20);
						if (playerentity.isOnGround()) {
							float f6 = 1.1999999F;
							playerentity.move(MoverType.SELF, new Vector3d(0.0D, (double)1.1999999F, 0.0D));
						}

						SoundEvent soundevent;
						if (j >= 3) {
							soundevent = SoundEvents.TRIDENT_RIPTIDE_3;
						} else if (j == 2) {
							soundevent = SoundEvents.TRIDENT_RIPTIDE_2;
						} else {
							soundevent = SoundEvents.TRIDENT_RIPTIDE_1;
						}

						pLevel.playSound((PlayerEntity)null, playerentity, soundevent, SoundCategory.PLAYERS, 1.0F, 1.0F);
					}

				}
			}
		}
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType pEquipmentSlot) {
		return pEquipmentSlot == EquipmentSlotType.MAINHAND ? this.defaultModifiers : super.getDefaultAttributeModifiers(pEquipmentSlot);
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}
}
