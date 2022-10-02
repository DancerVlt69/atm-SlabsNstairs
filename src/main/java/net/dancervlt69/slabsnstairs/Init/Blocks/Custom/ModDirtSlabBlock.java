package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

/** class to create an own 'Bonemealable' DirtSlabBlock that can grow Grass, Flowers and Trees
 *  right now missed a methode to check if the Slab set on Top on Bottom */

public class ModDirtSlabBlock extends SlabBlock implements BonemealableBlock {
    public ModDirtSlabBlock(Properties pProperties) { super(pProperties); }

    @Override
    public boolean isValidBonemealTarget(BlockGetter pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return pLevel.getBlockState(pPos.above()).isAir(); }

    @Override
    public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        return true; }

    @Override
    public void performBonemeal( ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {

        BlockPos blockPos = pPos.above();
        BlockState blockState = Blocks.DIRT.defaultBlockState();

        label46:
        for(int i = 0; i < 128; ++i) {
            BlockPos blockpos1 = blockPos;

            for(int j = 0; j < i / 16; ++j) {
                blockpos1 = blockpos1.offset(pRandom.nextInt(3) - 1,
                        (pRandom.nextInt(3) - 1) * pRandom.nextInt(3) / 2,
                        pRandom.nextInt(3) - 1);
                if (!pLevel.getBlockState(blockpos1.below()).is(this) ||
                        pLevel.getBlockState(blockpos1).isCollisionShapeFullBlock(pLevel, blockpos1)) {
                    continue label46;
                }
            }

            BlockState blockstate1 = pLevel.getBlockState(blockpos1);
            if (blockstate1.is(blockState.getBlock()) && pRandom.nextInt(10) == 0) {
                ((BonemealableBlock)blockState.getBlock()).performBonemeal(pLevel, pRandom, blockpos1, blockstate1);
            }

            if (blockstate1.isAir()) {
                Holder<PlacedFeature> holder;
                if (pRandom.nextInt(8) == 0) {
                    List<ConfiguredFeature<?, ?>> list =
                            pLevel.getBiome(blockpos1).value().getGenerationSettings().getFlowerFeatures();
                    if (list.isEmpty()) {
                        continue;
                    }

                    holder = ((RandomPatchConfiguration)list.get(0).config()).feature();
                } else {
                    holder = VegetationPlacements.GRASS_BONEMEAL;
                }

                holder.value().place(pLevel, pLevel.getChunkSource().getGenerator(), pRandom, blockpos1);
            }
        }
    }
}
