package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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

public class ModDryIceSlabBlock extends SlabBlock {

    public ModDryIceSlabBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pLevel.getBrightness(LightLayer.BLOCK, pPos) > 12) {
            pLevel.destroyBlock(pPos, false);
            this.melt(pState, pLevel, pPos);
        }
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
        float particleChance = 0.95f;

        if (particleChance > pRandom.nextFloat()) {
            pLevel.addParticle(ParticleTypes.CLOUD, pPos.getX() + pRandom.nextDouble(), pPos.getY() + 0.75,
                    pPos.getZ() + pRandom.nextDouble(), 0d + 0.025, 0d, 0d + 0.025);
        }
        super.animateTick(pState, pLevel, pPos, pRandom);
    }

    public void melt(BlockState pState, Level pLevel, BlockPos pPos) {
        // super.melt(pState, pLevel, pPos);
        if (pLevel.dimensionType().ultraWarm()) {
            if (pLevel.dimensionType().bedWorks()) {
                this.melt(pState, pLevel, pPos);
                pLevel.removeBlock(pPos, false);
            }
        } else {
            if (pLevel.dimensionType().bedWorks()) {
                pLevel.setBlockAndUpdate(pPos, Blocks.AIR.defaultBlockState());
                pLevel.neighborChanged(pPos, Blocks.AIR, pPos);
            }
        }
    }

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
    public boolean skipRendering(BlockState pState, BlockState pAdjacentBlockState, Direction pSide) {
        return pAdjacentBlockState.is(this) || super.skipRendering(pState, pAdjacentBlockState, pSide);
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState pState) {
        return PushReaction.DESTROY;
    }
}
