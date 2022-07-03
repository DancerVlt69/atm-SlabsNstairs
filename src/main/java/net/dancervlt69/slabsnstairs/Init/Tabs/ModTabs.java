package net.dancervlt69.slabsnstairs.Init.Tabs;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

    public static final CreativeModeTab MODTAB_TAB = new CreativeModeTab("modtab_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };
}
