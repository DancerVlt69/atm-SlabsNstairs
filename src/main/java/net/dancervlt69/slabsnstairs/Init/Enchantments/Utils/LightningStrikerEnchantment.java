package net.dancervlt69.slabsnstairs.Init.Enchantments.Utils;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class LightningStrikerEnchantment extends Enchantment {

    public LightningStrikerEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }
    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level.isClientSide()) {
            ServerLevel world = ((ServerLevel) pAttacker.level);
            BlockPos blockPos = pTarget.blockPosition();
            if (pLevel == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, (ItemStack) null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
            }
            if (pLevel == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, (ItemStack) null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, (ItemStack) null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
            }
            if (pLevel == 3) {
                EntityType.LIGHTNING_BOLT.spawn(world, (ItemStack) null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, (ItemStack) null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, (ItemStack) null, null, blockPos,
                        MobSpawnType.TRIGGERED, true, true);
            }
        }
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }
    @Override
    public int getMaxLevel() { return 3; }
}
