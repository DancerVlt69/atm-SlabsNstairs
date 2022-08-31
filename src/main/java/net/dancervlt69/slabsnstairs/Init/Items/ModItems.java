package net.dancervlt69.slabsnstairs.Init.Items;

import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlabsNstairs.MODID);

    public static final String TTCITRINECOIN = "tooltip.slabsnstairs.growth_stop.shift";

    //Define your different Items here

    public static final RegistryObject<Item> LIGHT_BROWN_DYE = ITEMS.register("light_brown_dye",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB)));

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB)));

    public static final RegistryObject<Item> CITRINE_COIN = ITEMS.register("citrine_coin",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB)));

    //Register the defined Item/s
    public static void register(IEventBus eventBus){
        SlabsNstairs.LOGGER.debug("Registering Mod-Items for " + SlabsNstairs.MODID);
        ITEMS.register(eventBus);
    }
}
