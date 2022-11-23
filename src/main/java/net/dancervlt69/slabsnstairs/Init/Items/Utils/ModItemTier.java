package net.dancervlt69.slabsnstairs.Init.Items.Utils;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.dancervlt69.slabsnstairs.Init.Tags.ModBlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

@Deprecated // I'm not sure
public class ModItemTier {

    public static final ForgeTier AMETHYST = new ForgeTier(5, 2200, 1.2f,
            5f, 36, ModBlockTags.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(Items.AMETHYST_CLUSTER));

    public static final ForgeTier CITRINE = new ForgeTier(5, 2200, 1.2f,
            5f, 36, ModBlockTags.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

    public static final ForgeTier RUBY = new ForgeTier(5, 2200, 1.2f,
            5f, 36, ModBlockTags.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));
}
