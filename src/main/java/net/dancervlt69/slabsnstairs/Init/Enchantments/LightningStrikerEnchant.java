package net.dancervlt69.slabsnstairs.Init.Enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public class LightningStrikerEnchant extends Enchantment {

    public LightningStrikerEnchant(Enchantment.Rarity pRarity, EnchantmentType pCategory, EquipmentSlotType[] pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }
    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level.isClientSide()) {
            ServerWorld world = ((ServerWorld) pAttacker.level);
            BlockPos blockPos = pTarget.blockPosition();
            if (pLevel == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        SpawnReason.TRIGGERED, true, true);
            }
            if (pLevel == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        SpawnReason.TRIGGERED, true, true);
            }
            if (pLevel == 3) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        SpawnReason.TRIGGERED, true, true);
            }
        }
        super.doPostAttack(pAttacker, pTarget,pLevel);
    }
    @Override
    public int getMaxLevel() {

        return 3;
    }
}
