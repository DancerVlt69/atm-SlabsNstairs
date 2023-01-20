package net.dancervlt69.slabsnstairs.init.items.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
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
import java.util.Objects;

public class ModCitrineCoinItem extends Item {
    private final String tooltipKeyShift;
    public ModCitrineCoinItem(Properties pProperties, String tooltipKeyShift) {
        super (pProperties);
        this.tooltipKeyShift = tooltipKeyShift;
    }

    @Override
    /** use an Item with Right-Click on a Block */
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) {

            BlockPos posClicked = pContext.getClickedPos();
            Player pPlayer = pContext.getPlayer();

        }

        pContext.getItemInHand().hurtAndBreak(1, Objects.requireNonNull(pContext.getPlayer()),
                (pPlayer) -> pPlayer.broadcastBreakEvent((pPlayer.getUsedItemHand())));

        return super.useOn(pContext);
    }


    @Override
    /** Mouse-over-Item Tooltip */
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel,
                                @NotNull List<Component> pTooltip, @NotNull TooltipFlag pTooltipFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pTooltipFlag);

        if (Screen.hasShiftDown()) {
            pTooltip.add(Component.translatable(tooltipKeyShift));
        } else {
            pTooltip.add(Component.translatable("tooltip.slabsnstairs.hold_shift"));
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




}
