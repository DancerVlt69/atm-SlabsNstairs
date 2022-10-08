package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.Supplier;

public class ModDryIceStairBlock extends StairBlock {

    public ModDryIceStairBlock(Supplier<BlockState> pState, Properties properties) {
        super(pState, properties);
        // super(pState, properties);
    }

    @Override
    public void randomTick(@NotNull BlockState pState, ServerLevel pLevel, @NotNull BlockPos pPos, @NotNull Random pRandom) {
        // super.randomTick(pState, pLevel, pPos, pRandom);
        if (pLevel.getBrightness(LightLayer.BLOCK, pPos) > 11) {
            pLevel.destroyBlock(pPos, false);
            this.melt(pState, pLevel, pPos);
        }
    }

    @Override
    public void animateTick(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull Random pRandom) {
        super.animateTick(pState, pLevel, pPos, pRandom);
        float particleChance = 0.75f;

        if (particleChance > pRandom.nextFloat()) {
            pLevel.addParticle(ParticleTypes.CLOUD, pPos.getX() + pRandom.nextDouble(), pPos.getY() + 0.75,
                    pPos.getZ() + pRandom.nextDouble(), 0d + 0.025, 0d, 0d + 0.025);
        }
    }

    public void melt(BlockState pState, Level pLevel, BlockPos pPos) {
        // super.melt(pState, pLevel, pPos);
        if (pLevel.dimensionType().ultraWarm()) {
            this.melt(pState, pLevel,pPos);
            pLevel.removeBlock(pPos, false);
        } else {
            pLevel.setBlockAndUpdate(pPos, Blocks.AIR.defaultBlockState());
            pLevel.neighborChanged(pPos, Blocks.AIR, pPos);
        }
    }

    @Override
    public void playerDestroy(@NotNull Level pLevel, @NotNull Player pPlayer, @NotNull BlockPos pPos,
                              @NotNull BlockState pState, @Nullable BlockEntity pBlockEntity, @NotNull ItemStack pStack) {
        super.playerDestroy(pLevel, pPlayer, pPos, pState, pBlockEntity, pStack);

        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,pStack) == 0) {

            if (pLevel.dimensionType().ultraWarm()) {pLevel.removeBlock(pPos, false);
                return;
            }

            Material material = pLevel.getBlockState(pPos.below()).getMaterial();

            if (material.blocksMotion() || material.isLiquid()) {
                pLevel.setBlockAndUpdate(pPos, Blocks.AIR.defaultBlockState());

            }
        }
    }

    @Override
    public boolean hidesNeighborFace(BlockGetter level, BlockPos pos, BlockState state, BlockState neighborState, Direction dir)
    {
        return false;
    }
    /*@Override
    public boolean skipRendering(BlockState pState, BlockState pAdjacentBlockState, Direction pSide) {
        return pAdjacentBlockState.is(this) || super.skipRendering(pState, pAdjacentBlockState, pSide);
    }*/

    @Override
    public @NotNull PushReaction getPistonPushReaction(@NotNull BlockState pState) {
        return PushReaction.DESTROY;
    }

}
