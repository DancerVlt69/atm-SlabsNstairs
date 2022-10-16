package net.dancervlt69.slabsnstairs.Init.Sounds.Custom;

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
    public AdvancedItem(Properties pProperties) {super (pProperties);}

    @Override
    /** Mouse-over-Item Tooltip */
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel,
                                @NotNull List<Component> pTooltip, @NotNull TooltipFlag pTooltipFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pTooltipFlag);

        if (Screen.hasShiftDown()) {
            pTooltip.add(new TranslatableComponent("tooltip.slabsnstairs.citrine_coin.tooltip"));
        } else {
            pTooltip.add(new TranslatableComponent("tooltip.slabsnstairs.hold_shift.tooltip"));
        }
    }

    @Override
    /** Item-Right-Click */
    public InteractionResultHolder<ItemStack> use(
            @NotNull Level pLevel, @NotNull Player pPlayer, @NotNull InteractionHand pUseHand) {
        return super.use(pLevel, pPlayer, pUseHand);
    }

    @Override
    /** Right Click on living Entity  */
    public @NotNull InteractionResult interactLivingEntity(
            @NotNull ItemStack pStack, @NotNull Player pPlayer,
            @NotNull LivingEntity pInteractionTarget,
            @NotNull InteractionHand pUsedHand) {
        return super.interactLivingEntity(pStack, pPlayer, pInteractionTarget, pUsedHand);
    }

    @Override
    /** use an Item with Right Click on a Block */
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {
        return super.useOn(pContext);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        return super.onLeftClickEntity(stack, player, entity);
    }
}