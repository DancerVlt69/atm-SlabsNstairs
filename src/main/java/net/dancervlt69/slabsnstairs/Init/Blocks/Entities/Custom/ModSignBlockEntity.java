package net.dancervlt69.slabsnstairs.Init.Blocks.Entities.Custom;

import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ModSignBlockEntity extends SignBlockEntity {

    public ModSignBlockEntity(BlockPos pPos, BlockState pBlockState) { super(pPos, pBlockState); }

    @Override
    public @NotNull BlockEntityType<?> getType() { return ModBlockEntities.SIGN_BLOCK_ENTITIES.get(); }
}
