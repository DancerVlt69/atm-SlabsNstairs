package net.dancervlt69.slabsnstairs.Init.Items.Custom.Utils.ModItemTooltips;

import net.dancervlt69.slabsnstairs.Init.ToolTips.ShowToolTips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItemTooltipSCA extends Item {
	private final String tooltipKeyShift;
	private final String tooltipKeyCtrl;
	private final String tooltipKeyAlt;

	public ModItemTooltipSCA(Properties pProperties, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
		super(pProperties);
		this.tooltipKeyShift = tooltipKeyShift;
		this.tooltipKeyCtrl = tooltipKeyCtrl;
		this.tooltipKeyAlt = tooltipKeyAlt;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
		ShowToolTips.showTooltips(pTooltipComponents, tooltipKeyShift, tooltipKeyCtrl, tooltipKeyAlt);
	}
}
