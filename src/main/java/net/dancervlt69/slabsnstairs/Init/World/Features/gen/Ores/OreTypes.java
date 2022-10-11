package net.dancervlt69.slabsnstairs.Init.World.Features.gen.Ores;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreTypes {

	CITRINE(Lazy.of(ModBlocks.CITRINE_ORE), 6, 10,56, 5, 2 );

	private final Lazy<Block> block;
	private final int maxVeinSize;
	private final int minHeight;
	private final int maxHeight;
	private final int minOffset;
	private final int veinPerChunk;

	OreTypes(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int minOffset, int maxVeinPerChunk) {
		this.block = block;
		this.maxVeinSize = maxVeinSize;
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
		this.minOffset = minOffset;
		this.veinPerChunk = maxVeinPerChunk;
	}

	public Lazy<Block> getBlock() {
		return block;
	}
	public int getMaxVeinSize() {
		return maxVeinSize;
	}
	public int getMinHeight() {
		return minHeight;
	}
	public int getMaxHeight() {
		return maxHeight;
	}
	public int getMinOffset() {
		return minOffset;
	}
	public int getVeinPerChunk() {
		return veinPerChunk;
	}

	public static OreTypes get(Block block) {
		for (OreTypes ore : values()) {
			if (block == ore.block) { return ore;
			}
		}
		return null;
	}
}
