package net.dancervlt69.slabsnstairs.init.items.custom;

import net.dancervlt69.slabsnstairs.init.tooltips.ShowToolTips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModSwordItem extends SwordItem {
    private final String tooltipKeyShift;
    private final String tooltipKeyCtrl;
    private final String tooltipKeyAlt;

    public ModSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties,
                        String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
        this.tooltipKeyShift = tooltipKeyShift;
        this.tooltipKeyCtrl = tooltipKeyCtrl;
        this.tooltipKeyAlt = tooltipKeyAlt;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                TooltipFlag pIsAdvanced) {

        ShowToolTips.showTooltips(pTooltipComponents, tooltipKeyCtrl, tooltipKeyAlt, tooltipKeyAlt);
//        if(Screen.hasShiftDown()) {
//           pTooltipComponents.add(Component.translatable(tooltipKeyShift));
//        } else pTooltipComponents.add(Component.literal("Hold Shift for ToolTip"));
//
//        if(Screen.hasControlDown()) {
//            pTooltipComponents.add(Component.translatable(tooltipKeyCtrl));
//        } else pTooltipComponents.add(Component.translatable("tooltip.slabsnstairs.hold_ctrl"));
//
//        if(Screen.hasAltDown()) {
//            pTooltipComponents.add(Component.literal("Type your ToolTip here"));
//        } else pTooltipComponents.add(Component.translatable("tooltip.slabsnstairs.hold_alt"));
    }
}
