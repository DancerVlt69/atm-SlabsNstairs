package net.dancervlt69.slabsnstairs.init.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;


public class ModBlockTags {

    public static final TagKey<Block> NEEDS_CITRINE_TOOL = create(ResourceLocation.tryParse("needs_citrine_tool"));

//    private static <T> TagKey<T> create(ResourceKey<? extends Registry<T>>, String pName) {
//        return (TagKey<T>) VALUES.intern(Registry.register(), new ResourceLocation(pName));
//    }

    public static TagKey<Block> create(ResourceLocation name) {
        return TagKey.create(Registries.BLOCK, name);
    }
}
