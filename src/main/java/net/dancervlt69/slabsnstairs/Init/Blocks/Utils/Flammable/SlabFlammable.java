package net.dancervlt69.slabsnstairs.Init.Blocks.Utils.Flammable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class SlabFlammable extends SlabBlock {
    private final int encouragement;
    private final int flammability;


    public SlabFlammable(Properties pProperties, int encouragement, int flammability) {
        super(pProperties);
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

    @Override
    public VoxelShape getShape(BlockState pState, IBlockReader pLevel, BlockPos pPos, ISelectionContext pContext) {
        SlabType slabType = pState.getValue(TYPE);
        switch (slabType) {
            case DOUBLE:
                return Block.box(0.0,0,0,16,16,16);
            case TOP:
                return TOP_AABB;
            default:
                return BOTTOM_AABB;
        } //return super.getShape(pState, pLevel, pPos, pContext);
    }
}
