package net.dancervlt69.slabsnstairs.init.tooltips.modItemTooltips;

import net.dancervlt69.slabsnstairs.init.tooltips.ShowToolTips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class ModItemWithTooltipS extends Item {
	private final String tooltipKeyShift;
	public ModItemWithTooltipS(Properties pProperties, String tooltipKeyShift) {
		super(pProperties);
		this.tooltipKeyShift = tooltipKeyShift;
	}

	@Override
	public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
		ShowToolTips.showTooltips(pTooltipComponents, tooltipKeyShift);
	}
}
