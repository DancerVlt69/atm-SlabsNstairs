package net.dancervlt69.slabsnstairs.Init.Items;

import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlabsNstairs.MODID);

    // Define your different Items here

        // Food
    @Deprecated (forRemoval = true)
    public static final RegistryObject<Item> APPLE_BREAD = ITEMS.register("apple_bread",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3).food(ModFoodItems.APPLE_BREAD)));
    @Deprecated (forRemoval = true)
    public static final RegistryObject<Item> CARROT_BREAD = ITEMS.register("carrot_bread",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3).food(ModFoodItems.CARROT_BREAD)));
    @Deprecated (forRemoval = true)
    public static final RegistryObject<Item> ONION_BREAD = ITEMS.register("onion_bread",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3).food(ModFoodItems.ONION_BREAD)));
    @Deprecated (forRemoval = true)
    public static final RegistryObject<Item> POTATO_BREAD = ITEMS.register("potato_bread",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3).food(ModFoodItems.POTATO_BREAD)));

        // Dye
    @Deprecated (forRemoval = true)
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = ITEMS.register("light_brown_dye",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE_COIN = ITEMS.register("citrine_coin",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    @Deprecated (forRemoval = true)
    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new SwordItem(ModItemTiers.CITRINE,5,1.2f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2)));

    //Register the defined Item/s
    public static void register(IEventBus eventBus){
        SlabsNstairs.LOGGER.debug("Registering Mod-Items for " + SlabsNstairs.MODID);
        ITEMS.register(eventBus);
    }

}
