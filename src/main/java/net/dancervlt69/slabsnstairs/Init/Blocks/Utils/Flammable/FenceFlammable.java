package net.dancervlt69.slabsnstairs.Init.Blocks.Utils.Flammable;

import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class FenceFlammable extends FenceBlock {
    private final int encouragement;
    private final int flammability;
    private final boolean flammable;

    public FenceFlammable(Properties pProperties, int encouragement, int flammability, boolean flammable) {
        super(pProperties);
        this.encouragement = encouragement;
        this.flammability = flammability;
        this.flammable = flammable;
    }

    @Override
    public boolean isFlammable(BlockState state, IBlockReader level, BlockPos pos, Direction direction) {
        return flammable;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction direction) {
        return encouragement; // super.getFireSpreadSpeed(state, level, pos, direction);
    }

    @Override
    public int getFlammability(BlockState state, IBlockReader level, BlockPos pos, Direction direction) {
        return flammability; // super.getFlammability(state, level, pos, direction);
    }

}
