package net.dancervlt69.slabsnstairs.init.enchantments.utils;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class StrongMasterEnchantment extends Enchantment {
    public StrongMasterEnchantment(Rarity pRarity, EquipmentSlot... pApplicableSlots) {
        super(pRarity, EnchantmentCategory.WEAPON, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    public int getMinCost(int pEnchantmentLevel) {
        return 1 + (pEnchantmentLevel - 1) * 2;
    }

    public int getMaxCost(int pEnchantmentLevel) {
        return this.getMinCost(pEnchantmentLevel) + 4;
    }

    @Override
    public float getDamageBonus(int pLevel, MobType pCreatureType) {
        return pCreatureType == MobType.UNDEFINED ? (float) pLevel * 20.0F : 0.0F;
    }
    public int getMaxLevel() { return 5; }
}
