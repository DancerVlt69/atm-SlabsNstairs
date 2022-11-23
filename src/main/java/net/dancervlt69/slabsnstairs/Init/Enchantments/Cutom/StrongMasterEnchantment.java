package net.dancervlt69.slabsnstairs.Init.Enchantments.Cutom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class StrongMasterEnchantment extends Enchantment {
    public StrongMasterEnchantment(Rarity pRarity, EquipmentSlotType[] pApplicableSlots) {
        super(pRarity, EnchantmentType.WEAPON, pApplicableSlots);
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
    public float getDamageBonus(int pLevel, CreatureAttribute pCreatureType) {
        return pCreatureType == CreatureAttribute.UNDEFINED ? (float) pLevel * 20.0F : 0.0F;
    }

    public int getMaxLevel() { return 5; }
}
