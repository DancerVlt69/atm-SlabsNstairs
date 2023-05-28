package net.dancervlt69.slabsnstairs.init.blocks.utils.flammable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class StairsFlammable extends StairBlock {
    private final int encouragement;
    private final int flammability;
    // private final int[] canBurn = new int[]{encouragement, flammability};

    public StairsFlammable(Supplier<BlockState> pBlockstate, Properties pProperties, int encouragement, int flammability) {
        super(pBlockstate, pProperties);
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
