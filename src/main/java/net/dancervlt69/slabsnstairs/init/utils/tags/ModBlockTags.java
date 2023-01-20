package net.dancervlt69.slabsnstairs.init.utils.tags;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ModBlockTags {

    public static final TagKey<Block> NEEDS_NETHERITE_TOOL = create("needs_netherite_tool");

    public static final TagKey<Block> NEEDS_AMETHYST_TOOL = create("needs_amethyst_tool");
    public static final TagKey<Block> NEEDS_CITRINE_TOOL = create("needs_citrine_tool");
    public static final TagKey<Block> NEEDS_RUBY_TOOL = create("needs_ruby_tool");

    @NotNull
    private static TagKey<Block> create (String pName) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(pName));
    }

    @NotNull
    public static TagKey<Block> create (ResourceLocation pName) {
        return TagKey.create(Registry.BLOCK_REGISTRY, pName);
    }
}
