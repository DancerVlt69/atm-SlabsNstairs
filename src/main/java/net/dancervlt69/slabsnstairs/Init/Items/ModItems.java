package net.dancervlt69.slabsnstairs.Init.Items;

import net.dancervlt69.slabsnstairs.Init.Items.Custom.ModItemTier;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlabsNstairs.MODID);

    /** Define your different Items here */
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE_COIN = ITEMS.register("citrine_coin",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    @Deprecated
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = ITEMS.register("light_brown_dye",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    @Deprecated
    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new SwordItem(ModItemTier.CITRINE, 5, 1.2f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2).fireResistant()));
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
                    new Item.Properties().tab(ModTabs.SNSMODTAB2).fireResistant()));
*/

    /** Registering the defined Items */
    public static void register(IEventBus eventBus) {
        SlabsNstairs.LOGGER.debug("Registering Mod-Items for " + SlabsNstairs.MODID);

        ITEMS.register(eventBus);
    }
}
