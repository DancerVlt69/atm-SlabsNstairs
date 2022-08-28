package net.dancervlt69.slabsnstairs.Init.Tabs;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModTabs {

    public static final ItemGroup SNSMODTAB = new ItemGroup("snsmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };

    public static final ItemGroup SNS_ARMORS = new ItemGroup("sns_armors") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModItems.CITRINE_COIN.get());
        }
    };

    public ItemStack makeIcon() {
        return null;
    }
}
