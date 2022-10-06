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

        // Dye
    @Deprecated
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = ITEMS.register("light_brown_dye",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE_COIN = ITEMS.register("citrine_coin",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    @Deprecated
    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new SwordItem(ModItemTiers.CITRINE,5,1.0f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2)));

    //Register the defined Item/s
    public static void register(IEventBus eventBus){
        SlabsNstairs.LOGGER.debug("Registering Mod-Items for " + SlabsNstairs.MODID);
        ITEMS.register(eventBus);
    }
}
