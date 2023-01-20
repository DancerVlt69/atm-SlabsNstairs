package net.dancervlt69.slabsnstairs.init.items.custom;

import net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.modItemEntities.ModIronArrowEntity;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import static net.minecraft.world.item.enchantment.EnchantmentHelper.getTagEnchantmentLevel;
import static net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS;

public class ModIronArrowItem extends ArrowItem {
	public final float pDamage;

	public ModIronArrowItem(Properties pProperties, float pDamage) {
		super(pProperties);
		this.pDamage = pDamage;
				SlabsNstairs.LOGGER.debug("ModIronArrowItem - Methode is firing...");
	}

	// @OnlyIn(Dist.CLIENT)
	@Override
	public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
				SlabsNstairs.LOGGER.debug("AbstractArrowEntity createArrow - Methode is firing...");
		ModIronArrowEntity modIronArrow = new ModIronArrowEntity(pShooter, pLevel);
		modIronArrow.setEffectsFromItem(pStack);
		modIronArrow.setBaseDamage(pDamage);
		return new ModIronArrowEntity(pShooter, pLevel);
	}

	@Override
	public boolean isInfinite(ItemStack stack, ItemStack bow, Player player) {
		int enchant = getTagEnchantmentLevel(INFINITY_ARROWS, bow);
				SlabsNstairs.LOGGER.debug("isInfinite - Iron_Arrow_Item Methode is firing...");
		return enchant > 0 && this.getClass() == ModIronArrowItem.class;
	}

}
