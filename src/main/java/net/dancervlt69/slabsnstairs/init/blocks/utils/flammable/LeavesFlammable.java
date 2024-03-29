package net.dancervlt69.slabsnstairs.init.blocks.utils.flammable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

public class LeavesFlammable extends LeavesBlock {
    private final int encouragement;
    private final int flammability;


    public LeavesFlammable(Properties pProperties, int encouragement, int flammability) {
        super(pProperties);
        this.encouragement = encouragement;
        this.flammability = flammability;
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
