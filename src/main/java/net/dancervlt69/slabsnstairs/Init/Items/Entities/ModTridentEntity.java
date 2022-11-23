package net.dancervlt69.slabsnstairs.Init.Items.Entities;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModTridentEntity extends TridentEntity {
	private static final DataParameter<Byte> ID_LOYALTY = EntityDataManager.defineId(ModTridentEntity.class, DataSerializers.BYTE);
	private static final DataParameter<Boolean> ID_FOIL = EntityDataManager.defineId(ModTridentEntity.class, DataSerializers.BOOLEAN);
	private ItemStack modTridentItem = new ItemStack(ModItems.MOD_TRIDENT.get());

	public ModTridentEntity(EntityType<? extends ModTridentEntity> p_i50148_1_, World p_i50148_2_) {
		super(p_i50148_1_, p_i50148_2_);
	}

	public ModTridentEntity(World pLevel, LivingEntity pShooter, ItemStack pStack) {
		super(pLevel, pShooter,pStack);
		// super(EntityType.TRIDENT, pShooter, pLevel);
		this.modTridentItem = pStack.copy();
		this.entityData.set(ID_LOYALTY, (byte) EnchantmentHelper.getLoyalty(pStack));
		this.entityData.set(ID_FOIL, pStack.hasFoil());
	}

	@OnlyIn(Dist.CLIENT)
	public ModTridentEntity(World pLevel, double pX, double pY, double pZ) {
		super(pLevel, pX, pY, pZ);
		// super(EntityType.TRIDENT, pX, pY, pZ, pLevel);
	}
}
