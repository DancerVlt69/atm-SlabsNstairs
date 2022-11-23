package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import net.dancervlt69.slabsnstairs.Init.ToolTips.ShowToolTips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItemTTSCA extends Item {
	private final String tooltipKeyShift;
	private final String tooltipLeyCtrl;
	private final String tooltipKeyAlt;

	public ModItemTTSCA(Properties pProperties, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
		super(pProperties);
		this.tooltipKeyShift = tooltipKeyShift;
		this.tooltipLeyCtrl = tooltipKeyCtrl;
		this.tooltipKeyAlt = tooltipKeyAlt;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pIsAdvanced) {
		super.appendHoverText(pStack, pLevel, pTooltip, pIsAdvanced);

		ShowToolTips.showTooltips(pTooltip, tooltipKeyShift, tooltipLeyCtrl, tooltipKeyAlt);
	}
}
