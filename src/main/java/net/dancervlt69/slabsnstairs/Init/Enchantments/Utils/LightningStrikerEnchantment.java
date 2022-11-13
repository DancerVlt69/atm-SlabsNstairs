package net.dancervlt69.slabsnstairs.Init.Enchantments.Utils;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class LightningStrikerEnchantment extends Enchantment {

    public LightningStrikerEnchantment(Rarity pRarity, EquipmentSlot... pApplicableSlots) {
        super(pRarity, EnchantmentCategory.BOW, pApplicableSlots);
    }
    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pMaxLevel) {
        if (!pAttacker.level.isClientSide()) {
            ServerLevel world = ((ServerLevel) pAttacker.level);
            BlockPos blockPos = pTarget.blockPosition();
            if (pMaxLevel == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
            }
            if (pMaxLevel == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
            }
            if (pMaxLevel == 3) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
            }
        }
        super.doPostAttack(pAttacker, pTarget, pMaxLevel);
    }
    @Override
    public int getMaxLevel() { return 3; }
}
