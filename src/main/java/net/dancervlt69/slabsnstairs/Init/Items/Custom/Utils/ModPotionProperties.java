package net.dancervlt69.slabsnstairs.Init.Items.Custom.Utils;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;

import static net.minecraft.potion.Effects.BLINDNESS;
import static net.minecraft.potion.Effects.CONFUSION;

public class ModPotionProperties {

    public static Food getBreadProperties() {
        return (new Food.Builder()).nutrition(5)
            .saturationMod(0.7f).build();
    }

    public static Food getSpicyProperties() {
        return (new Food.Builder())
                .nutrition(1).saturationMod(0.25f)
                .effect(new EffectInstance(BLINDNESS, 60, 1), 1f)
                .build();
    }

    public static Food getPotionProperties() {
        return (new Food.Builder())
                .nutrition(1).saturationMod(0.25f)
                .effect(new EffectInstance(BLINDNESS, 120, 2), 2f)
                .effect(new EffectInstance(CONFUSION, 60, 2), 1.5f)
                .build();
    }

    public static Food getHotChiliProperties() {
        return (new Food.Builder())
                .nutrition(1).saturationMod(0.25f)
                .effect(new EffectInstance(BLINDNESS, 180, 3), 3f)
                .effect(new EffectInstance(CONFUSION, 120, 3),2.5f)
                .build();
    }

    public static Food getSuperHotChiliProperties() {
        return new Food.Builder()
                .nutrition(1).saturationMod(0.25f)
                .effect(new EffectInstance(BLINDNESS, 240, 4), 4f)
                .effect(new EffectInstance(CONFUSION, 180, 4),3.5f)
                .build();

    }
}
