package net.dancervlt69.slabsnstairs.init.blocks.entities.custom;

import net.dancervlt69.slabsnstairs.init.blocks.entities.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ModHangingSignBlockEntity extends HangingSignBlockEntity {

    public ModHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) { super(pPos, pBlockState); }

    @NotNull
    @Override
    public  BlockEntityType<?> getType() { return ModBlockEntityTypes.MOD_HANGING_SIGN_BLOCK_ENTITY_TYPE.get(); }
}
