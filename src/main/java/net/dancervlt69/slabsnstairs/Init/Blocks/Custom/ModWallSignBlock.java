package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.Custom.ModSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWallSignBlock extends WallSignBlock {

	public ModWallSignBlock(Properties pProperties, WoodType pType) {
		super(pProperties, pType);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
		return new ModSignBlockEntity(pPos, pState);
	}
}
