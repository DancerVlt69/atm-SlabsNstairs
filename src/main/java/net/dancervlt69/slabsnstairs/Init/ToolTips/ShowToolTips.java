package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.util.List;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ShowToolTips {

    public static void showTooltips(List<Component> pTooltip, String tooltipKeyShift) {

        if (Screen.hasShiftDown()) {
            pTooltip.add(Component.translatable(tooltipKeyShift));
        } else {
            pTooltip.add(Component.translatable("tooltip.slabsnstairs.hold_shift"));
        }
    }

    public static void showTooltips(List<Component> pTooltip, String tooltipKeyShift, String tooltipKeyCtrl) {

        if (Screen.hasShiftDown()) {
            pTooltip.add(Component.translatable(tooltipKeyShift));
        } else {
            pTooltip.add(Component.translatable("tooltip.slabsnstairs.hold_shift"));
        }

        if (Screen.hasControlDown()) {
            pTooltip.add(Component.translatable(tooltipKeyCtrl));
        } else {
            pTooltip.add(Component.translatable("tooltip.slabsnstairs.hold_ctrl"));
        }
    }

    public static void showTooltips(List<Component> pTooltip, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {

        if (Screen.hasShiftDown()) {
            pTooltip.add(Component.translatable(tooltipKeyShift));
        } else {
            pTooltip.add(Component.translatable("tooltip.slabsnstairs.hold_shift"));
        }

        if (Screen.hasControlDown()) {
            pTooltip.add(Component.translatable(tooltipKeyCtrl));
        } else {
            pTooltip.add(Component.translatable("tooltip.slabsnstairs.hold_ctrl"));
        }

        if (Screen.hasAltDown()) {
            pTooltip.add(Component.translatable(tooltipKeyAlt));
        } else {
            pTooltip.add(Component.translatable("tooltip.slabsnstairs.hold_alt"));
        }
    }


    public void ShowTT (List < Component > components, String pBtnShift, String pBtnCtrl, String pItem) {

        String shiftToolTipKey = "tooltip." + SlabsNstairs.MODID + ".hold_" + pBtnShift;
        String ctrlToolTipKey = "tooltip." + SlabsNstairs.MODID + ".hold_" + pBtnCtrl;

        if (Screen.hasShiftDown()) {
            String pKey = "tooltip." + SlabsNstairs.MODID + "." + pItem;
            components.add(Component.translatable(pKey));
        } else {
            components.add(Component.translatable(shiftToolTipKey));
        }
        if (Screen.hasControlDown()) {
            String pKey = "tooltip." + SlabsNstairs.MODID + "." + pItem;
            components.add(Component.translatable(pKey));
        } else {
            components.add(Component.translatable(ctrlToolTipKey));
        }
    }

}
