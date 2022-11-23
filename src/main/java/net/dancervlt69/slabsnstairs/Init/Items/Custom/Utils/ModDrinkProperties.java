package net.dancervlt69.slabsnstairs.Init.Items.Custom.Utils;

import net.minecraft.item.Food;

public class ModDrinkProperties {

    public static Food getDrinkProperties() {
        return (new Food.Builder())
                .nutrition(1).saturationMod(0.25f)
                .build();

    }
}
