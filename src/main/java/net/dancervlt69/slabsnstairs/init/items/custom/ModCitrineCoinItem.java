package net.dancervlt69.slabsnstairs.init.items.custom;

import net.dancervlt69.slabsnstairs.init.utils.particles.ModParticleTypes;
import net.dancervlt69.slabsnstairs.init.utils.tooltips.ShowToolTips;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
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

import javax.naming.Context;
import java.util.List;
import java.util.Objects;

public class ModCitrineCoinItem extends Item {
    private final String tooltipKeyShift;

    public ModCitrineCoinItem(Properties pProperties, String tooltipKeyShift) {
        super (pProperties);
        this.tooltipKeyShift = tooltipKeyShift;
    }

    /** use an Item with Right-Click on a Block */
    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {

        InteractionResult interactResult = super.useOn(pContext);
        BlockPos posClicked = pContext.getClickedPos();

        if (pContext.getLevel().isClientSide()) {
            Player pPlayer = pContext.getPlayer();

        }
        spawnParticles(pContext, posClicked);
        pContext.getItemInHand().hurtAndBreak(1, Objects.requireNonNull(pContext.getPlayer()),
                (pPlayer) -> pPlayer.broadcastBreakEvent((pPlayer.getUsedItemHand())));

        return interactResult;

        // return super.useOn(pContext);
    }

    private void spawnParticles(UseOnContext pContext, BlockPos posClicked) {
        for (int i = 0; i < 360; i++) {
            if (i % 20 == 0) {
                pContext.getLevel().addParticle(ModParticleTypes.CITRINE_PARTICLES.get(),
                        posClicked.getX() + 0.5d, posClicked.getY() + 1, posClicked.getZ() +  0.5d,
                        Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d);
            }
        }
    }

    @Override
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



}
