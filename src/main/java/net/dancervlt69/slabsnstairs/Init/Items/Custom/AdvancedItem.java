package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import net.dancervlt69.slabsnstairs.Init.ToolTips.ShowTooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class AdvancedItem extends Item {
    private final String tooltipKeyShift;
    public AdvancedItem(Properties pProperties, String tooltipKeyShift) {
        super(pProperties);
        this.tooltipKeyShift = tooltipKeyShift;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable World pLevel, List<ITextComponent> pTooltip, ITooltipFlag pFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);

        ShowTooltips.showTooltips(pTooltip, tooltipKeyShift);
    }

    @Override
    public ActionResult<ItemStack> use(World pLevel, PlayerEntity pPlayer, Hand pHand) {
        return super.use(pLevel, pPlayer,pHand);
    }

    @Override
    public ActionResultType interactLivingEntity(ItemStack pStack, PlayerEntity pPlayer, LivingEntity pTarget, Hand pHand) {
        return super.interactLivingEntity(pStack, pPlayer, pTarget, pHand);
    }

    @Override
    public @Nonnull ActionResultType useOn(ItemUseContext pContext) { return super.useOn(pContext); }

    @Override
    public boolean onLeftClickEntity(ItemStack pStack, PlayerEntity pPlayer, Entity pTarget) {
        return super.onLeftClickEntity(pStack, pPlayer, pTarget);
    }
}
