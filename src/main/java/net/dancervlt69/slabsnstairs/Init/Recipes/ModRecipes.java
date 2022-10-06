package net.dancervlt69.slabsnstairs.Init.Recipes;

import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SlabsNstairs.MODID);



    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
