package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModToolTips extends Item {
    public ModToolTips(Properties pProperties) {super (pProperties);}
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        pTooltipComponents.add(new TranslatableComponent("tooltip.slabsnstairs.hold_shift.tooltip"));

    }

}
