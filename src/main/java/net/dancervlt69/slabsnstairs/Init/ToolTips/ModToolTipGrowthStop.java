package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;


import javax.annotation.Nullable;
import java.util.List;

public class ModToolTipGrowthStop extends Item {

    public ModToolTipGrowthStop(Properties pProperties) {super (pProperties);}

   //  @Override
    public void appendHoverText(ItemStack pStack, @Nullable World world, List<ITextComponent> pTooltipComponents, ITooltipFlag iTooltipFlag) {

        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslationTextComponent("tooltip.slabsnstairs.growth_stop.tooltip.shift"));
        } else {
            pTooltipComponents.add(new TranslationTextComponent("tooltip.slabsnstairs.growth_stop.tooltip"));
        };

        super.appendHoverText(pStack, world, pTooltipComponents, iTooltipFlag);
    }

}
