package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModGrowthStopToolTip extends Item {

     public ModGrowthStopToolTip(Properties pProperties) {
         super (pProperties);
     }
     @Override
     public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

         if (Screen.hasShiftDown()) {
             components.add(Component.translatable("tooltip.slabsnstairs.growth_stop.tooltip.shift"));
         } else {
             components.add(Component.translatable("tooltip.slabsnstairs.hold_shift.tooltip"));
         }
         super.appendHoverText(stack, level, components, flag);
     }
}
