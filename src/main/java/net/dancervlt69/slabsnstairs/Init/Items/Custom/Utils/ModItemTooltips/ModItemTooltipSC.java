package net.dancervlt69.slabsnstairs.Init.Items.Custom.Utils.ModItemTooltips;

import net.dancervlt69.slabsnstairs.Init.ToolTips.ShowToolTips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItemTooltipSC extends Item {
	private final String tooltipKeyShift;
	private final String tooltipKeyCtrl;

	public ModItemTooltipSC(Properties pProperties, String tooltipKeyShift, String tooltipKeyCtrl) {
		super(pProperties);
		this.tooltipKeyShift = tooltipKeyShift;
		this.tooltipKeyCtrl = tooltipKeyCtrl;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
		ShowToolTips.toolTipShiftCtrl(pTooltipComponents, tooltipKeyShift, tooltipKeyCtrl);
	}
}
