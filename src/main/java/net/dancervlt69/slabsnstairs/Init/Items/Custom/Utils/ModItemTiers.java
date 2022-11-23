package net.dancervlt69.slabsnstairs.Init.Items.Custom.Utils;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTiers implements IItemTier {

    CITRINE (4, 2200, 2.0f, 5.0f, 36,
            () -> Ingredient.of(ModItems.CITRINE.get())),

    AMETHYST (4, 2150, 2.0f, 5.0f, 34,
            () -> Ingredient.of(Items.ENDER_PEARL));

    private final int level;
    private final int maxUses;
    private final float speed;
    private final float attacDamageBonus;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ModItemTiers(int level, int maxUses, float speed, float attacDamageBonus,
                 int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.maxUses = maxUses;
        this.speed = speed;
        this.attacDamageBonus = attacDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<> (repairIngredient);
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attacDamageBonus;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
