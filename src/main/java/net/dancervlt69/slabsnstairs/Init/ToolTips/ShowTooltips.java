package net.dancervlt69.slabsnstairs.Init.ToolTips;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ShowTooltips extends Item {

    public ShowTooltips(Properties pProperties) {
        super(pProperties);
    }

    public static void showTooltips(List<ITextComponent> pTooltip, String tooltipKeyShift) {
        if (Screen.hasShiftDown()) {
            pTooltip.add(new TranslationTextComponent(tooltipKeyShift));
        }
        else {
            pTooltip.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_shift"));
        }

    }

    public static void showTooltips(List<ITextComponent> pTooltip, String tooltipKeyShift, String tooltipKeyCtrl) {
        if (Screen.hasShiftDown()) {
            pTooltip.add(new TranslationTextComponent(tooltipKeyShift));
        }
        else {
            pTooltip.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_shift"));
        }

        if (Screen.hasControlDown()) {
            pTooltip.add(new TranslationTextComponent(tooltipKeyCtrl));
        }
        else {
            pTooltip.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_ctrl"));
        }

    }

    public static void showTooltips(List<ITextComponent> pTooltip, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
        if (Screen.hasShiftDown()) {
            pTooltip.add(new TranslationTextComponent(tooltipKeyShift));
        }
        else {
            pTooltip.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_shift"));
        }

        if (Screen.hasControlDown()) {
            pTooltip.add(new TranslationTextComponent(tooltipKeyCtrl));
        }
        else {
            pTooltip.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_ctrl"));
        }

        if (Screen.hasAltDown()) {
            pTooltip.add(new TranslationTextComponent(tooltipKeyAlt));
        }
        else {
            pTooltip.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_alt"));
        }

    }


    public void ShowTT (List<ITextComponent > pTooltip, World pLevel,
                        String pBtnShift, String pBtnCtrl, String pItem, String pBtnAlt) {

        String shiftToolTipKey = "tooltip." + MODID + ".hold_" + pBtnShift;
        String ctrlToolTipKey = "tooltip." + MODID + ".hold_" + pBtnCtrl;
        String altToolTipKey = "tooltip." + MODID + ".hold_" + pBtnAlt;

        if (Screen.hasShiftDown()) {
            String pKey = "tooltip." + MODID + "." + pItem;
            pTooltip.add(new TranslationTextComponent(pKey));
        } else {
            pTooltip.add(new TranslationTextComponent(shiftToolTipKey));
        }
        if (Screen.hasControlDown()) {
            String pKey = "tooltip." + MODID + "." + pItem;
            pTooltip.add(new TranslationTextComponent(pKey));
        } else {
            pTooltip.add(new TranslationTextComponent(ctrlToolTipKey));
        }
        if (Screen.hasControlDown()) {
            String pKey = "tooltip." + MODID + "." + pItem;
            pTooltip.add(new TranslationTextComponent(pKey));
        } else {
            pTooltip.add(new TranslationTextComponent(altToolTipKey));
        }
    }


    /* public ShoTooltips(Properties pProperties) {super (pProperties);}

   //  @Override
    public void appendHoverText(ItemStack pStack, @Nullable World world, List<ITextComponent> pTooltipComponents,
                                ITooltipFlag iTooltipFlag) {

        pTooltipComponents.add(new TranslationTextComponent("tooltip.slabsnstairs.hold_shift"));

        super.appendHoverText(pStack, world, pTooltipComponents, iTooltipFlag);
    } */

}
