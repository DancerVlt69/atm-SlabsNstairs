package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;


import javax.annotation.Nullable;
import java.util.List;

public class ModToolTips extends Item {

    public ModToolTips(Properties pProperties) {super (pProperties);}

   //  @Override
    public void appendHoverText(ItemStack pStack, @Nullable World world, List<ITextComponent> pTooltipComponents,
                                ITooltipFlag iTooltipFlag) {

        pTooltipComponents.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_shift.tooltip"));

        super.appendHoverText(pStack, world, pTooltipComponents, iTooltipFlag);
    }

}
