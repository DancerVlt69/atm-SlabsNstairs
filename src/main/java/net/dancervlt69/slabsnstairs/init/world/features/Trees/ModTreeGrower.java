package net.dancervlt69.slabsnstairs.init.world.features.Trees;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ModTreeGrower extends AbstractTreeGrower {
    /**
     * @param pRandom
     * @param pHasFlowers
     * @return the key of this tree
     */
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(@NotNull RandomSource pRandom, boolean pHasFlowers) {
        return null;
        // return ModConfiguredFeatures.RED_BEECH_KEY;
    }

    /* public static class RedBeechTreeGrower extends AbstractTreeGrower {
        @Nullable
        @Override
        protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pLargeHive) {
            return ModConfiguredFeatures.RED_BEECH.getHolder().get();
        }
    } */
}
