package net.dancervlt69.slabsnstairs.init.items;

import net.dancervlt69.slabsnstairs.init.blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.init.items.custom.*;
import net.dancervlt69.slabsnstairs.init.items.utils.ModItemTier;
import net.dancervlt69.slabsnstairs.init.utils.sounds.ModSounds;
import net.dancervlt69.slabsnstairs.init.utils.tabs.ModTabs;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModItems {

    public static final DeferredRegister<Item> MOD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    //Define your different Items here
    // @Deprecated
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = MOD_ITEMS.register("light_brown_dye",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE = MOD_ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE_COIN = MOD_ITEMS.register("citrine_coin",
            () -> new ModCitrineCoinItem(new Item.Properties().tab(ModTabs.SNSMODTAB3),
                    "tooltip.slabsnstairs.citrine_coin"));

    public static final RegistryObject<Item> CINNAMON_SIGN = MOD_ITEMS.register("cinnamon_sign",
            () -> new SignItem(new Item.Properties().tab(ModTabs.SNSMODTAB1).stacksTo(16),
                    ModBlocks.CINNAMON_SIGN.get(), ModBlocks.CINNAMON_WALL_SIGN.get()));

    // @Deprecated
    public static final RegistryObject<Item> CITRINE_SWORD = MOD_ITEMS.register("citrine_sword",
            () -> new ModCitrineSwordItem(ModItemTier.CITRINE,5,1.2f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2)));

    public static final RegistryObject<Item> SHAKE_THE_BUS = MOD_ITEMS.register("shake_the_bus",
            () -> new RecordItem(4, ModSounds.SHAKE_THE_BUS,
                    (new Item.Properties()).stacksTo(1)
                            .tab(ModTabs.SNSMODTAB3).rarity(Rarity.RARE)));

    // Register the defined Item/s
    public static void register(IEventBus eventBus){
        MOD_ITEMS.register(eventBus);
    }
}
