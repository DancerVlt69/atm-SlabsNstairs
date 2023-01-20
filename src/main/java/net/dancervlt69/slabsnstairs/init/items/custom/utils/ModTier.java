package net.dancervlt69.slabsnstairs.init.items.custom.utils;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

/**
 * Helper class to define a custom mod tier
 * If you will use your item to harvest spezial
 * blocks use ForgeTier instead!
 */

public final class ModTier implements Tier {
    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantValue;
    private final Supplier<Ingredient> repairIngredient;

    public ModTier(int level, int uses, float speed, float attackDamageBonus, int enchantValue,
                     Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantValue = enchantValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() { return this.uses; }

    @Override
    public float getSpeed() { return this.speed; }

    @Override
    public float getAttackDamageBonus() { return this.attackDamageBonus; }

    @Override
    public int getLevel() { return this.level; }

    @Override
    public int getEnchantmentValue() { return this.enchantValue; }

    @NotNull
    @Override
    public  Ingredient getRepairIngredient() { return (Ingredient) repairIngredient; }

    @Override
    public String toString() {
        return "ModTier[" + "level=" + level +
                "usages=" + uses +
                "speed= " + speed +
                "bonus=" + attackDamageBonus + ", " +
                "enchant=" + enchantValue + ", " +
                "ingredient= " + repairIngredient + ']';
    }
}
