package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.Nullable;

public class ModIceSlabBlock extends SlabBlock {

    public ModIceSlabBlock(Properties pProperties) { super(pProperties); }

    @Override
    public void playerDestroy(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState,
                              @Nullable BlockEntity pBlockEntity, ItemStack pStack) {
        super.playerDestroy(pLevel, pPlayer, pPos, pState, pBlockEntity, pStack);

        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,pStack) == 0) {
            if (pLevel.dimensionType().ultraWarm()) {
                pLevel.removeBlock(pPos, false);
                return;
            }
            Material material = pLevel.getBlockState(pPos.below()).getMaterial();
            if (material.blocksMotion() || material.isLiquid()) {
                pLevel.setBlockAndUpdate(pPos, Blocks.AIR.defaultBlockState());
            }
        }
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pLevel.getBrightness(LightLayer.BLOCK, pPos) > 11 - pState.getLightBlock(pLevel, pPos)) {
            pLevel.destroyBlock(pPos, false);
            this.melt(pState, pLevel, pPos);
        }
    }

    public void melt(BlockState pState, Level pLevel, BlockPos pPos) {
        if (pLevel.dimensionType().ultraWarm()) {
            pLevel.removeBlock(pPos, false);
        } else {
            pLevel.setBlockAndUpdate(pPos, Blocks.WATER.defaultBlockState());
            pLevel.neighborChanged(pPos, Blocks.WATER, pPos);
        }
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState pState) {
        return PushReaction.DESTROY;
    }

}
