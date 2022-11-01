package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.dancervlt69.slabsnstairs.Init.Blocks.Utils.Flammable.BlockFlammable;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;

import static net.minecraft.commands.arguments.blocks.BlockStateArgument.getBlock;

@SuppressWarnings("deprecation")
public class ModDryIceBlock extends Block {

    public ModDryIceBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void playerDestroy( Level pLevel,  Player pPlayer,  BlockPos pPos,  BlockState pState,
                               BlockEntity pBlockEntity,  ItemStack pStack) {
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
    public void randomTick( BlockState pState, ServerLevel pLevel,  BlockPos pPos,  RandomSource pRandom) {
        if (pLevel.getBrightness(LightLayer.BLOCK, pPos) > 12 - pState.getLightBlock(pLevel, pPos)) {
            pLevel.destroyBlock(pPos, false);
            this.melt(pState, pLevel, pPos);
        }
    }

    protected void melt(BlockState pState, Level pLevel, BlockPos pPos) {
        if (pLevel.dimensionType().ultraWarm()) {
            pLevel.removeBlock(pPos, false);
        } else {
            pLevel.setBlockAndUpdate(pPos, Blocks.AIR.defaultBlockState());
            pLevel.neighborChanged(pPos, Blocks.AIR, pPos);
        }
    }

    @Override
    public  PushReaction getPistonPushReaction( BlockState pState) {
        return PushReaction.DESTROY;
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
        super.animateTick(pState, pLevel, pPos, pRandom);
        float particleChance = 0.75f;

        if (particleChance > pRandom.nextFloat()) {
            pLevel.addParticle(ParticleTypes.CLOUD, pPos.getX() + pRandom.nextDouble(), pPos.getY() + 0.75,
                    pPos.getZ() + pRandom.nextDouble(), 0d + 0.025, 0d - 0.0125, 0d + 0.025);
        }
    }

    public void freeze(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
        BlockPos[] blockPos = new BlockPos[] {
                pPos.above(1), pPos.below(1), pPos.north(1),
                pPos.east(1), pPos.south(1), pPos.west(1)};
        BlockState blockState = Blocks.WATER.defaultBlockState();

    }
}
