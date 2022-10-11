package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

@SuppressWarnings("deprecation")
public class ModIceSlabBlock extends SlabBlock {

    public ModIceSlabBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void randomTick(BlockState pState, ServerWorld pLevel, BlockPos pPos, Random pRandom) {
        super.randomTick(pState, pLevel, pPos, pRandom);
        if (pLevel.getBrightness(LightType.BLOCK, pPos) > 11) {
            pLevel.destroyBlock(pPos, false);
            this.melt(pState, pLevel, pPos);
        }
    }

    protected void melt(BlockState pState, ServerWorld pLevel, BlockPos pPos) {
        // super.melt(pState, pLevel, pPos);
        if (pLevel.dimensionType().ultraWarm()) {
            if (pLevel.dimensionType().bedWorks()) {
                pLevel.removeBlock(pPos, false);
            }
        } else {
            if (pLevel.dimensionType().bedWorks()) {
                pLevel.setBlockAndUpdate(pPos, Blocks.WATER.defaultBlockState());
                pLevel.neighborChanged(pPos, Blocks.WATER, pPos);
            }
        }
    }

    @Override
    public void playerDestroy(World pLevel, PlayerEntity pPlayer, BlockPos pPos,
                             BlockState pState,TileEntity pBlockEntity, ItemStack pStack) {
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

    /*@Override
    public boolean hidesNeighborFace(BlockGetter level, BlockPos pos, BlockState state, BlockState neighborState, Direction dir)
    {
        return false;
    }
    /*@Override
    public boolean skipRendering(BlockState pState, BlockState pAdjacentBlockState, Direction pSide) {
        return pAdjacentBlockState.is(this) || super.skipRendering(pState, pAdjacentBlockState, pSide);
    }*/

    @Override
    public PushReaction getPistonPushReaction(BlockState pState) {
        return PushReaction.DESTROY;
    }

}
