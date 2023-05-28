package net.dancervlt69.slabsnstairs.init.utils.tags;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    public static final TagKey<Item> NEEDS_NETHERITE_TOOL = create("needs_netherite_tool");

    // private BlockTags() {
    // }

    private static TagKey<Item> create(String pName) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(pName));

    }

    public static TagKey<Item> create(ResourceLocation name) {
        return TagKey.create(Registry.ITEM_REGISTRY, name);
    }

}
