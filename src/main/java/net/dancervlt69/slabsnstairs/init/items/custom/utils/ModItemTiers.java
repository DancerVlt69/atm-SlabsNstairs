package net.dancervlt69.slabsnstairs.init.items.custom.utils;

import net.dancervlt69.slabsnstairs.init.items.ModItems;
import net.dancervlt69.slabsnstairs.init.utils.tags.ModBlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

// @Deprecated // I'm not sure
public class ModItemTiers {

    public static final ForgeTier AMETHYST = new ForgeTier(5, 2200, 1.2f,
            5f, 20, ModBlockTags.NEEDS_AMETHYST_TOOL,
            () -> Ingredient.of(Items.AMETHYST_CLUSTER));

    public static final ForgeTier RUBY = new ForgeTier(5, 2200, 1.2f,
            5f, 20, ModBlockTags.NEEDS_RUBY_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

    public static final ForgeTier CITRINE = new ForgeTier(5, 2200, 1.2f,
            5f, 20, ModBlockTags.NEEDS_CITRINE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

    public static final ModTier CITRINE2 = new ModTier(5, 2200, 1.2f,
        5f, 20, () -> Ingredient.of(ModItems.CITRINE.get()));

    /* new | I must check it out before I */
//     public static Tier CITRINE;
//
//        static {
//            CITRINE = TierSortingRegistry.registerTier(
//                    new ForgeTier(5, 2200, 1.2f, 3f, 24,
//                            ModBlockTags.NEEDS_NETHERITE_TOOL,
//                            () -> Ingredient.of(ModItems.CITRINE.get())),
//                    new ResourceLocation(MODID, "citrine"),
//                    List.of(Tiers.NETHERITE), List.of());
//        }

}
