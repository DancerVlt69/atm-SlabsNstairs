package net.dancervlt69.slabsnstairs.Init.Tabs;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTabs {

    public static final ItemGroup SNSMODTAB1 = new ItemGroup("snsmodtab1") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CITRINE_BLOCK.get());
        }
    };

    public static final ItemGroup SNSMODTAB2= new ItemGroup("snsmodtab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE_SWORD.get());
        }
    };

    public static final ItemGroup SNSMODTAB3 = new ItemGroup("snsmodtab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE_COIN.get());
        }
    };

}
