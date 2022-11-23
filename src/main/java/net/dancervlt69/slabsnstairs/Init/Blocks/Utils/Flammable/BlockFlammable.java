package net.dancervlt69.slabsnstairs.Init.Blocks.Utils.Flammable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class BlockFlammable extends Block {
    private final int encouragement;
    private final int flammability;

    public BlockFlammable(Properties pProperties, int encouragement, int flammability) {
        super(pProperties);
        this.encouragement = encouragement;
        this.flammability = flammability;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction direction) {
        return encouragement; // super.getFireSpreadSpeed(state, level, pos, direction);
    }

    @Override
    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction direction) {
        return flammability; // super.getFlammability(state, level, pos, direction);
    }
}
