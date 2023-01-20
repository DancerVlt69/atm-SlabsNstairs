package net.dancervlt69.slabsnstairs.init.items.custom;

import net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.modItemEntities.ModStoneArrowEntity;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.item.enchantment.EnchantmentHelper.getTagEnchantmentLevel;
import static net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS;

public class ModStoneArrowItem extends ArrowItem {
	public final float pDamage;

	public ModStoneArrowItem(Properties pProperties, float pDamage) {
		super(pProperties);
		this.pDamage = pDamage;
				SlabsNstairs.LOGGER.debug("ModStoneArrowItem - Methode is firing...");
	}

	@NotNull
	@Override
	public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
				SlabsNstairs.LOGGER.debug("AbstractArrowEntity - Methode is firing...");
		ModStoneArrowEntity modStoneArrow = new ModStoneArrowEntity(pShooter, pLevel);
		modStoneArrow.setBaseDamage(this.pDamage);
		return modStoneArrow;
	}

	@Override
	public boolean isInfinite(ItemStack stack, ItemStack bow, Player player) {
		int enchant = getTagEnchantmentLevel(INFINITY_ARROWS, bow);
				SlabsNstairs.LOGGER.debug("isInfinite - Methode is firing...");
		return enchant > 0 && this.getClass() == ModStoneArrowItem.class;
	}

	/*public void useArrows(PlayerEntity pPlayer) {
		if (!pPlayer.level.isClientSide()) {
			ModStoneArrowEntity arrow = new ModStoneArrowEntity((ModEntityTypes.STONE_ARROW.get()), pPlayer,
					arrow.setDeltaMovement(0,1,0));
			pPlayer.level.addFreshEntity(arrow);
		}
	}*/
}
