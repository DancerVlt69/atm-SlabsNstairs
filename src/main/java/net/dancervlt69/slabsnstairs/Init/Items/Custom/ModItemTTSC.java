package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import net.dancervlt69.slabsnstairs.Init.ToolTips.ShowTooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ModItemTTSC extends Item {
	private final String tooltipKeyShift;
	private final String tooltipLeyCtrl;

	public ModItemTTSC(Properties pProperties, String tooltipKeyShift, String tooltipKeyCtrl) {
		super(pProperties);
		this.tooltipKeyShift = tooltipKeyShift;
		this.tooltipLeyCtrl = tooltipKeyCtrl;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable World pLevel, List<ITextComponent> pTooltip, ITooltipFlag pFlag) {
		super.appendHoverText(pStack, pLevel, pTooltip, pFlag);

		ShowTooltips.showTooltips(pTooltip, tooltipKeyShift, tooltipLeyCtrl);
	}
}
