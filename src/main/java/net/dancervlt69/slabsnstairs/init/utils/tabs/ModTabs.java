package net.dancervlt69.slabsnstairs.init.utils.tabs;

import net.dancervlt69.slabsnstairs.init.blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.init.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

    public static final CreativeModeTab SNSMODTAB1 = new CreativeModeTab("snsmodtab1") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CITRINE_BLOCK.get());
        }
    };

    public static final CreativeModeTab SNSMODTAB2 = new CreativeModeTab("snsmodtab2") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModItems.CITRINE_SWORD.get());
        }
    };

    public static final CreativeModeTab SNSMODTAB3 = new CreativeModeTab("snsmodtab3") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModItems.CITRINE_COIN.get());
        }
    };
}
