package net.dancervlt69.slabsnstairs.Init.Tabs;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

    public static final CreativeModeTab SNSMODTAB = new CreativeModeTab("snsmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };

    public static final CreativeModeTab SNSMODTAB2 = new CreativeModeTab("snsmodtab2") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModItems.CITRINE_COIN.get());
        }
    };
}
