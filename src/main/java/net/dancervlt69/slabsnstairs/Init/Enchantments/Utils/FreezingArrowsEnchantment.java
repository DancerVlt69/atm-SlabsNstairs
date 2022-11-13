package net.dancervlt69.slabsnstairs.Init.Enchantments.Utils;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FreezingArrowsEnchantment extends Enchantment {
    public FreezingArrowsEnchantment(Rarity pRarity, EquipmentSlot... pApplicableSlots) {
        super(pRarity, EnchantmentCategory.BOW, pApplicableSlots);
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


    public int getMaxLevel() { return 1; }
}
