package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import net.dancervlt69.slabsnstairs.Init.ToolTips.ShowTooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
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
	public void appendHoverText(ItemStack pStack, @Nullable World pLevel, List<ITextComponent> pTooltip, ITooltipFlag pFlag) {
		super.appendHoverText(pStack, pLevel, pTooltip, pFlag);

		ShowTooltips.showTooltips(pTooltip, tooltipKeyShift, tooltipLeyCtrl, tooltipKeyAlt);
	}
}
