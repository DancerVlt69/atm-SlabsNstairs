package net.dancervlt69.slabsnstairs.init.blocks.utils.flammable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockState;

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
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return flammable;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return encouragement; // super.getFireSpreadSpeed(state, level, pos, direction);
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return flammability; // super.getFlammability(state, level, pos, direction);
    }

}
