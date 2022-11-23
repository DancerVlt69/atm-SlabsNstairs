package net.dancervlt69.slabsnstairs.Init.Items.Custom;

import net.dancervlt69.slabsnstairs.Init.ToolTips.ShowToolTips;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AdvancedItem extends Item {
    private final String tooltipKeyShift;
    public AdvancedItem(Properties pProperties, String tooltipKeyShift) {
        super (pProperties);
        this.tooltipKeyShift = tooltipKeyShift;
    }

    @Override
    /** Mouse-over-Item Tooltip */
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pTooltipFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pTooltipFlag);

        ShowToolTips.showTooltips(pTooltip, tooltipKeyShift);
    }

    @Override
    /** Item-Right-Click */
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUseHand) {
        return super.use(pLevel, pPlayer, pUseHand);
    }

    @Override
    /** Right Click on living Entity  */
    public InteractionResult interactLivingEntity(ItemStack pStack, Player pPlayer,
                                                  LivingEntity pInteractionTarget, InteractionHand pUsedHand) {
        return super.interactLivingEntity(pStack, pPlayer, pInteractionTarget, pUsedHand);
    }

    @Override
    /** use an Item with Right-Click on a Block */
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {
        return super.useOn(pContext);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        return super.onLeftClickEntity(stack, player, entity);
    }
}
