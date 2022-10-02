package net.dancervlt69.slabsnstairs.Init.Items;

import net.dancervlt69.slabsnstairs.Init.Tags.ModTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModItemTiers {

    @Deprecated // I'm not sure
    public static final ForgeTier CITRINE = new ForgeTier(5, 2200, 1.2f,
            5f, 36, ModTags.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

    /** new | I must check it out before
     *  public static Tier CITRINE;
     *
     *     static {
     *         CITRINE = TierSortingRegistry.registerTier(
     *                 new ForgeTier(5, 2200, 1.2f, 3f, 24,
     *                         ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.CITRINE.get())),
     *                 new ResourceLocation(DemoMod.MODID, "citrine"), List.of(Tiers.NETHERITE), List.of());
     *     }
     */
}
