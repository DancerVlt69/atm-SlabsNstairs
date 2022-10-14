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
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

@SuppressWarnings("deprecation")
public class ModDryIceSlabBlock extends SlabBlock {

    public ModDryIceSlabBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void playerDestroy(World pLevel, PlayerEntity pPlayer, BlockPos pPos,
                              BlockState pState, TileEntity pBlockEntity, ItemStack pStack) {
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
    public void randomTick(BlockState pState, ServerWorld pLevel, BlockPos pPos, Random pRandom) {
        super.randomTick(pState, pLevel, pPos, pRandom);
        if (pLevel.getBrightness(LightType.BLOCK, pPos) > 12 - pState.getLightBlock(pLevel, pPos)) {
            pLevel.destroyBlock(pPos, false);
            this.melt(pState, pLevel, pPos);
        }
    }

    public void melt(BlockState pState, World pLevel, BlockPos pPos) {
        if (pLevel.dimensionType().ultraWarm()) {
            pLevel.removeBlock(pPos, false);
        } else {
            pLevel.setBlockAndUpdate(pPos, Blocks.AIR.defaultBlockState());
            pLevel.neighborChanged(pPos, Blocks.AIR, pPos);
        }
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState pState) {
        return PushReaction.DESTROY;
    }

    @Override
    public void animateTick(BlockState pState, World pLevel, BlockPos pPos, Random pRandom) {
        super.animateTick(pState, pLevel, pPos, pRandom);
        float particleChance = 0.5f;

        if (particleChance > pRandom.nextFloat()) {
            pLevel.addParticle(ParticleTypes.CLOUD, pPos.getX() + pRandom.nextDouble(), pPos.getY() + 1,
                    pPos.getZ() + pRandom.nextDouble(), 0d + 0.025, 0 - 0.0125d, 0d + 0.025);
        }
    }
}