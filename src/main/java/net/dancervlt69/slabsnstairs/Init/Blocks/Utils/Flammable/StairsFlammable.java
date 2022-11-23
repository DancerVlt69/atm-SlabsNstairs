package net.dancervlt69.slabsnstairs.Init.Blocks.Utils.Flammable;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import java.util.function.Supplier;

public class StairsFlammable extends StairsBlock {
    private final int encouragement;
    private final int flammability;
    // private final int[] canBurn = new int[]{encouragement, flammability};

    public StairsFlammable(Supplier<BlockState> pBlockstate, Properties pProperties, int encouragement, int flammability) {
        super(pBlockstate, pProperties);
        this.encouragement = encouragement;
        this.flammability = flammability;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader level, BlockPos pos, Direction direction) {
        return encouragement; // super.getFireSpreadSpeed(state, level, pos, direction);
    }

    @Override
    public int getFlammability(BlockState state, IBlockReader level, BlockPos pos, Direction direction) {
        return flammability; // super.getFlammability(state, level, pos, direction);
    }

}
