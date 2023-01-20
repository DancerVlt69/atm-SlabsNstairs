package net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.modItemEntities;

import net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.ModEntityTypes;
import net.dancervlt69.slabsnstairs.init.items.ModItems;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModStoneArrowEntity extends AbstractArrow {

	public ModStoneArrowEntity(EntityType<ModStoneArrowEntity> pEntityType, Level pWorld) {
		super(pEntityType, pWorld);
				SlabsNstairs.LOGGER.debug("ModStoneArrowEntity ET<?> - Methode is firing...");
	}

	public ModStoneArrowEntity(LivingEntity pShooter, Level pLevel) {
		super(ModEntityTypes.STONE_ARROW.get(), pShooter, pLevel);
		this.setOwner(pShooter);
		if (pShooter instanceof Player) {
			this.pickup = Pickup.ALLOWED;
		}
				SlabsNstairs.LOGGER.debug("ModStoneArrowEntity pShooter - Methode is firing...");
	}

	public ModStoneArrowEntity(Level pLevel, double pX, double pY, double pZ, Item referenceItem) {
		super(ModEntityTypes.IRON_ARROW.get(), pX, pY, pZ, pLevel);
				SlabsNstairs.LOGGER.debug("ModStoneArrowEntity xyz - Methode is firing...");
		// this.setPos(pX, pY, pZ);
	}

	@Override
	protected ItemStack getPickupItem() {
				SlabsNstairs.LOGGER.debug("getPickupItem - StoneArrowEntity - Methode is firing...");
		return new ItemStack(ModItems.STONE_ARROW.get());
	}

}
