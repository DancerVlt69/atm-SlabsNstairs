package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;

import java.util.List;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ShowToolTips {

    public static void ShowToolTip (Level pLevel, List<Component> components, String pBtnShift, String pItem) {

        if(Screen.hasShiftDown()) {
            components.add(Component.translatable("tooltip.demomod.hold_shift.tooltip"));
        } else {
            components.add(Component.translatable(String.valueOf(
                    "tooltip.demomod." + pItem + ".tooltip")));
        }
    }

    public static void Ctrl (Level pLevel, List<Component> components, String pItem) {

        if(Screen.hasControlDown()) {
            components.add(Component.translatable("tooltip.demomod.hold_ctrl.tooltip"));
        } else {
            components.add(Component.translatable("tooltip.demomod." + pItem + ".tooltip"));
        }
    }

    public void ShowTT (List < Component > components, Level pLevel,
                                 String pBtnShift, String pBtnCtrl, String pItem) {

        String shiftToolTipKey = "tooltip." + MODID + ".hold_" + pBtnShift + ".tooltip";
        String ctrlToolTipKey = "tooltip." + MODID + ".hold_" + pBtnCtrl + ".tooltip";

        if (Screen.hasShiftDown()) {
            String pKey = "tooltip." + MODID + "." + pItem + ".tooltip";
            components.add(Component.translatable(pKey));
        } else {
            components.add(Component.translatable(shiftToolTipKey));
        }
        if (Screen.hasControlDown()) {
            String pKey = "tooltip." + MODID + "." + pItem + ".tooltip";
            components.add(Component.translatable(pKey));
        } else {
            components.add(Component.translatable(ctrlToolTipKey));
        }
    }
}
