package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;

import java.util.List;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ShowToolTips {

    public static void showTooltips(List<Component> pTooltip, String tooltipKeyShift) {

        if (Screen.hasShiftDown()) {
            pTooltip.add(new TranslatableComponent(tooltipKeyShift));
        } else {
            pTooltip.add(new TranslatableComponent("tooltip.slabsnstairs.hold_shift"));
        }
    }

    public static void showTooltips(List<Component> pTooltip, String tooltipKeyShift, String tooltipKeyCtrl) {

        if (Screen.hasShiftDown()) {
            pTooltip.add(new TranslatableComponent(tooltipKeyShift));
        } else {
            pTooltip.add(new TranslatableComponent("tooltip.slabsnstairs.hold_shift"));
        }

        if (Screen.hasControlDown()) {
            pTooltip.add(new TranslatableComponent(tooltipKeyCtrl));
        } else {
            pTooltip.add(new TranslatableComponent("tooltip.slabsnstairs.hold_ctrl"));
        }
    }

    public static void showTooltips(List<Component> pTooltip, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {

        if (Screen.hasShiftDown()) {
            pTooltip.add(new TranslatableComponent(tooltipKeyShift));
        } else {
            pTooltip.add(new TranslatableComponent("tooltip.slabsnstairs.hold_shift"));
        }

        if (Screen.hasControlDown()) {
            pTooltip.add(new TranslatableComponent(tooltipKeyCtrl));
        } else {
            pTooltip.add(new TranslatableComponent("tooltip.slabsnstairs.hold_ctrl"));
        }

        if (Screen.hasControlDown()) {
            pTooltip.add(new TranslatableComponent(tooltipKeyAlt));
        } else {
            pTooltip.add(new TranslatableComponent("tooltip.slabsnstairs.hold_alt"));
        }
    }

    public void ShowTT (List < Component > pTooltip, Level pLevel,
                                 String pBtnShift, String pBtnCtrl, String pItem, String pBtnAlt) {

        String shiftToolTipKey = "tooltip." + MODID + ".hold_" + pBtnShift;
        String ctrlToolTipKey = "tooltip." + MODID + ".hold_" + pBtnCtrl;
        String altToolTipKey = "tooltip." + MODID + ".hold_" + pBtnAlt;

        if (Screen.hasShiftDown()) {
            String pKey = "tooltip." + MODID + "." + pItem;
            pTooltip.add(new TranslatableComponent(pKey));
        } else {
            pTooltip.add(new TranslatableComponent(shiftToolTipKey));
        }
        if (Screen.hasControlDown()) {
            String pKey = "tooltip." + MODID + "." + pItem;
            pTooltip.add(new TranslatableComponent(pKey));
        } else {
            pTooltip.add(new TranslatableComponent(ctrlToolTipKey));
        }
        if (Screen.hasControlDown()) {
            String pKey = "tooltip." + MODID + "." + pItem;
            pTooltip.add(new TranslatableComponent(pKey));
        } else {
            pTooltip.add(new TranslatableComponent(altToolTipKey));
        }
    }
}
