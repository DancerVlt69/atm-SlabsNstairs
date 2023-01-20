package net.dancervlt69.slabsnstairs.init.utils.tooltips.modItemTooltips;

import net.dancervlt69.slabsnstairs.init.utils.tooltips.ShowToolTips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItemTooltipS extends Item {
	private final String tooltipKeyShift;
	public ModItemTooltipS(Properties pProperties, @Nullable String tooltipKeyShift) {
		super(pProperties);
		this.tooltipKeyShift = tooltipKeyShift;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
		ShowToolTips.showTooltips(pTooltipComponents, tooltipKeyShift);
	}
}
