package net.dancervlt69.slabsnstairs.Init.World.Features.gen.Trees;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class ModTreeGrower extends Tree {
	@Nullable
	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
		return null;
	}

    /* public static class RedBeechTreeGrower extends AbstractTreeGrower {
        @Nullable
        @Override
        protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pLargeHive) {
            return ModConfiguredFeatures.RED_BEECH.getHolder().get();
        }
    } */


}
