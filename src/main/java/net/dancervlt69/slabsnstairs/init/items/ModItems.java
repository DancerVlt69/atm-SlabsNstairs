package net.dancervlt69.slabsnstairs.init.items;

import net.dancervlt69.slabsnstairs.init.blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.init.items.custom.ModCoinItem;
import net.dancervlt69.slabsnstairs.init.items.custom.ModIronArrowItem;
import net.dancervlt69.slabsnstairs.init.items.custom.ModStoneArrowItem;
import net.dancervlt69.slabsnstairs.init.items.custom.utils.ModItemTiers;
import net.dancervlt69.slabsnstairs.init.utils.tabs.ModTabs;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.LOGGER;
import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModItems {

    public static final DeferredRegister<Item> MOD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Define your different Items here

        // Dye
    @Deprecated
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = MOD_ITEMS.register("light_brown_dye",
            () -> new DyeItem(DyeColor.BROWN,(new Item.Properties().tab(ModTabs.SNSMODTAB3))));

    public static final RegistryObject<Item> CITRINE = MOD_ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<ModCoinItem> CITRINE_COIN = MOD_ITEMS.register("citrine_coin",
            () -> new ModCoinItem(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CINNAMON_SIGN = MOD_ITEMS.register("cinnamon_sign",
            () -> new SignItem(new Item.Properties().tab(ModTabs.SNSMODTAB1).stacksTo(16),
                    ModBlocks.CINNAMON_SIGN.get(), ModBlocks.CINNAMON_WALL_SIGN.get()));

    // @Deprecated
    public static final RegistryObject<Item> CITRINE_SWORD = MOD_ITEMS.register("citrine_sword",
            () -> new SwordItem(ModItemTiers.CITRINE2,5,1.0f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2)));
    public static final RegistryObject<Item> CITRINE_PICKAXE = MOD_ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(ModItemTiers.CITRINE,1,-2.8f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2)));

    public static final RegistryObject<Item> STONE_ARROW = MOD_ITEMS.register("stone_arrow",
            () -> new ModStoneArrowItem(new Item.Properties().stacksTo(64).tab(ModTabs.SNSMODTAB3),2.5f));
    public static final RegistryObject<Item> IRON_ARROW = MOD_ITEMS.register("iron_arrow",
            () -> new ModIronArrowItem(new Item.Properties().stacksTo(64).tab(ModTabs.SNSMODTAB3),3.0f));

    //Register the defined Item/s
    public static void register(IEventBus eventBus){
        LOGGER.debug("Registering Mod-Items for " + MODID);
        MOD_ITEMS.register(eventBus);
    }
}
