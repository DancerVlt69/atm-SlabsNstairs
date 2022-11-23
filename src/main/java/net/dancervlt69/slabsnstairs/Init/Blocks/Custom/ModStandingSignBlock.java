package net.dancervlt69.slabsnstairs.Init.Blocks.Custom;

import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.Custom.ModSignBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.StandingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class ModStandingSignBlock extends StandingSignBlock {

	public ModStandingSignBlock(Properties pProperties, WoodType pType) {
		super(pProperties, pType);
	}

	@Nullable
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new ModSignBlockEntity();
	}
}
