package net.dancervlt69.slabsnstairs.Init.Items.Custom.Utils;

import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

import static net.minecraftforge.common.Tags.Blocks.NEEDS_NETHERITE_TOOL;

@Deprecated // I'm not sure
public class ModItemTiers {

    public static final ForgeTier AMETHYST = new ForgeTier(5, 2200, 1.2f,
            5f, 36, NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(Items.AMETHYST_CLUSTER));

    public static final ForgeTier CITRINE = new ForgeTier(5, 2200, 1.2f,
            5f, 36, NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

    public static final ForgeTier RUBY = new ForgeTier(5, 2200, 1.2f,
            5f, 36, NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));


    /** new | I must check it out before
     *  public static Tier CITRINE;
     *
     *     static {
     *         CITRINE = TierSortingRegistry.registerTier(
     *                 new ForgeTier(5, 2200, 1.2f, 3f, 24,
     *                         ModBlockTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.CITRINE.get())),
     *                 new ResourceLocation(DemoMod.MODID, "citrine"), List.of(Tiers.NETHERITE), List.of());
     *     }
     */
}
