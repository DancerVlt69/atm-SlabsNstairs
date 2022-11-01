package net.dancervlt69.slabsnstairs.Init.Recipes;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MODID);



    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
