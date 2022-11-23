package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import net.minecraft.item.Food;
import net.minecraft.item.PotionItem;

import static net.dancervlt69.slabsnstairs.Init.Items.Custom.Utils.ModPotionProperties.getPotionProperties;

public class ModPotionItems extends PotionItem {

    public ModPotionItems(Properties pProperties) {
        super(pProperties);
    }

        public static final Food TEST_POTION_ITEM = getPotionProperties();

}
