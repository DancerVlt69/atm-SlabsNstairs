package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;

import java.util.List;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ShowToolTips {

    public static void ShowToolTipShift (Level pLevel, List<Component> components, String pBtnShift, String pItem) {

        if(Screen.hasShiftDown()) {
            components.add(Component.translatable("tooltip.demomod." + pItem));
        } else {
            components.add(Component.translatable("tooltip.demomod.hold_shift"));
        }
    }

    public static void ShowToolTipCtrl (Level pLevel, List<Component> components, String pBtnCtrl, String pItem) {

        if(Screen.hasControlDown()) {
            components.add(Component.translatable("tooltip.demomod." + pItem));
        } else {
            components.add(Component.translatable("tooltip.demomod.hold_ctrl"));
        }
    }

    public void ShowTT (List < Component > components, Level pLevel,
                                 String pBtnShift, String pBtnCtrl, String pItem) {

        String shiftToolTipKey = "tooltip." + MODID + ".hold_" + pBtnShift;
        String ctrlToolTipKey = "tooltip." + MODID + ".hold_" + pBtnCtrl;

        if (Screen.hasShiftDown()) {
            String pKey = "tooltip." + MODID + "." + pItem;
            components.add(Component.translatable(pKey));
        } else {
            components.add(Component.translatable(shiftToolTipKey));
        }
        if (Screen.hasControlDown()) {
            String pKey = "tooltip." + MODID + "." + pItem;
            components.add(Component.translatable(pKey));
        } else {
            components.add(Component.translatable(ctrlToolTipKey));
        }
    }

}
