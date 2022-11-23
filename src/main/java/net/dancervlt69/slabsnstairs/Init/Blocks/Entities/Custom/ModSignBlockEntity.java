package net.dancervlt69.slabsnstairs.Init.Blocks.Entities.Custom;

import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.ModBlockEntities;
import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class ModSignBlockEntity extends SignTileEntity {

    // public ModSignBlockEntity(BlockPos pPos, BlockState pBlockState) { super(); }

    public ModSignBlockEntity() {
    super(); }

    @Override
    public TileEntityType<?> getType() {
        return ModBlockEntities.SIGN_BLOCK_ENTITIES.get(); }
}
