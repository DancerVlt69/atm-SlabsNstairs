package net.dancervlt69.slabsnstairs.Init.Blocks.Utils.Flammable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class SlabFlammable extends SlabBlock {
    private final int encouragement;
    private final int flammability;


    public SlabFlammable(Properties pProperties, int encouragement, int flammability) {
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

    public @NotNull VoxelShape getShape(@NotNull BlockState pState, @NotNull BlockGetter pLevel,
                                        @NotNull BlockPos pPos, @NotNull CollisionContext pContext) {
        SlabType slabtype = pState.getValue(TYPE);
        return switch (slabtype) {
            case DOUBLE -> Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
            case TOP -> TOP_AABB;
            default -> BOTTOM_AABB;
        };
    }

}
