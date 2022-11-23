package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import net.dancervlt69.slabsnstairs.Init.ToolTips.ShowToolTips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItemTTS extends Item {
	private final String tooltipKeyShift;
	public ModItemTTS(Properties pProperties, String tooltipKeyShift) {
		super(pProperties);
		this.tooltipKeyShift = tooltipKeyShift;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pIsAdvanced) {
		super.appendHoverText(pStack, pLevel, pTooltip, pIsAdvanced);

		ShowToolTips.showTooltips(pTooltip, tooltipKeyShift);
	}
}
