package net.dancervlt69.slabsnstairs.Init.Items;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Items.Custom.AdvancedItem;
import net.dancervlt69.slabsnstairs.Init.Items.Custom.Utils.ModItemTiers;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModItems {

    public static final DeferredRegister<Item> MOD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    /** Define your different Items here */
    public static final RegistryObject<Item> CITRINE = MOD_ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE_COIN = MOD_ITEMS.register("citrine_coin",
            () -> new AdvancedItem(new Item.Properties().tab(ModTabs.SNSMODTAB3),
                    "tooltip.slabsnstairs.citrine_coin"));

    @Deprecated
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = MOD_ITEMS.register("light_brown_dye",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    /* public static final RegistryObject<Item> STAFF_ITEM = MOD_ITEMS.register("staff_item",
            () -> new ModStaffItem(new Item.Properties().tab(ModTabs.SNSMODTAB3).stacksTo(1))); */

    /* public static final RegistryObject<Item> TEST_POTION = MOD_ITEMS.register("test_potion",
            () -> new PotionItem(new Item.Properties().food(ModPotionItems.TEST_POTION_ITEM)
                    .tab(ModTabs.SNSMODTAB3).stacksTo(1))); */

    public static final RegistryObject<Item> MOD_TRIDENT = MOD_ITEMS.register("mod_trident",
            () -> new TridentItem(new Item.Properties().tab(ModTabs.SNSMODTAB2)
                    .fireResistant().stacksTo(1)));

    @Deprecated
    public static final RegistryObject<Item> CITRINE_SWORD = MOD_ITEMS.register("citrine_sword",
            () -> new SwordItem(ModItemTiers.CITRINE, 5, 1.2f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2).fireResistant().stacksTo(1)));
/*    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(ModItemTier.CITRINE, 2, 1.2f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2).fireResistant()));
    public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe",
            () -> new AxeItem(ModItemTier.CITRINE, 6.0f, 1.0f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2).fireResistant()));
    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
            () -> new ShovelItem(ModItemTier.CITRINE, 2.5f, 1.0f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2).fireResistant()));
    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe",
            () -> new HoeItem(ModItemTier.CITRINE, 1, 1.6f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2).fireResistant())); */

    public static final RegistryObject<Item> CINNAMON_SIGN = MOD_ITEMS.register("cinnamon_sign",
            () -> new SignItem(new Item.Properties().tab(ModTabs.SNSMODTAB1).stacksTo(16),
                    ModBlocks.CINNAMON_SIGN.get(), ModBlocks.CINNAMON_WALL_SIGN.get()));

    /** Registering the defined Items */
    public static void register(IEventBus eventBus) {
        SlabsNstairs.LOGGER.debug("Registering Mod-Items for " + MODID);

        MOD_ITEMS.register(eventBus);
    }
}
