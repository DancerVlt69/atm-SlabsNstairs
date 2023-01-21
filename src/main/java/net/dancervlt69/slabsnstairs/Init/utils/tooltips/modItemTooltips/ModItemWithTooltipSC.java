package net.dancervlt69.slabsnstairs.init.utils.tooltips.modItemTooltips;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.dancervlt69.slabsnstairs.init.utils.tooltips.ShowToolTips.showTooltips;

public class ModItemWithTooltipSC extends Item {
	private final String tooltipKeyShift;
	private final String tooltipKeyCtrl;

	public ModItemWithTooltipSC(Properties pProperties, String tooltipKeyShift, String tooltipKeyCtrl) {
		super(pProperties);
		this.tooltipKeyShift = tooltipKeyShift;
		this.tooltipKeyCtrl = tooltipKeyCtrl;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
		showTooltips(pTooltipComponents, tooltipKeyShift, tooltipKeyCtrl);
	}

}
