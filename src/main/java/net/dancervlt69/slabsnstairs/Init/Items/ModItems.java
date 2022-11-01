package net.dancervlt69.slabsnstairs.Init.Items;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Items.Custom.AdvancedItem;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Define your different Items here

    public static final RegistryObject<Item> TEST_BLOCK = ITEMS.register("test_block",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

        // Dye
    @Deprecated
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = ITEMS.register("light_brown_dye",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<AdvancedItem> CITRINE_COIN = ITEMS.register("citrine_coin",
            () -> new AdvancedItem(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CINNAMON_SIGN = ITEMS.register("cinnamon_sign",
            () -> new SignItem(new Item.Properties().tab(ModTabs.SNSMODTAB1).stacksTo(16),
                    ModBlocks.CINNAMON_SIGN.get(), ModBlocks.CINNAMON_WALL_SIGN.get()));

    @Deprecated
    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new SwordItem(ModItemTiers.CITRINE,5,1.0f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2)));

    //Register the defined Item/s
    public static void register(IEventBus eventBus){
        SlabsNstairs.LOGGER.debug("Registering Mod-Items for " + MODID);
        ITEMS.register(eventBus);
    }
}
