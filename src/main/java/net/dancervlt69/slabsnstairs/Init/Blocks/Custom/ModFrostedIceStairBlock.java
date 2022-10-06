package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

import static net.minecraft.world.item.enchantment.Enchantments.SILK_TOUCH;

public class ModFrostedIceStairBlock extends StairBlock {

    public ModFrostedIceStairBlock(Supplier<BlockState> pState, Properties pProperties) {
        super(pState, pProperties);
    }

    @Override
    public void playerDestroy(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState,
                              @Nullable BlockEntity pBlockEntity, ItemStack pStack) {
        super.playerDestroy(pLevel, pPlayer, pPos, pState, pBlockEntity, pStack);

        if (EnchantmentHelper.getTagEnchantmentLevel(SILK_TOUCH,pStack) == 0)
        {

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
    public @NotNull PushReaction getPistonPushReaction(BlockState pState) {
        return PushReaction.DESTROY;
    }
}
