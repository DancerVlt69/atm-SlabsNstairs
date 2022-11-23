package net.dancervlt69.slabsnstairs.Init.Items;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Items.Utils.ModItemTier;
import net.dancervlt69.slabsnstairs.Init.Sounds.Custom.AdvancedItem;
import net.dancervlt69.slabsnstairs.Init.Tabs.ModTabs;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModItems {

    public static final DeferredRegister<Item> MOD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    //Define your different Items here
    @Deprecated
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = MOD_ITEMS.register("light_brown_dye",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CITRINE = MOD_ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<AdvancedItem> CITRINE_COIN = MOD_ITEMS.register("citrine_coin",
            () -> new AdvancedItem(new Item.Properties().tab(ModTabs.SNSMODTAB3)));

    public static final RegistryObject<Item> CINNAMON_SIGN = MOD_ITEMS.register("cinnamon_sign",
            () -> new SignItem(new Item.Properties().tab(ModTabs.SNSMODTAB1).stacksTo(16),
                    ModBlocks.CINNAMON_SIGN.get(), ModBlocks.CINNAMON_WALL_SIGN.get()));

    @Deprecated
    public static final RegistryObject<Item> CITRINE_SWORD = MOD_ITEMS.register("citrine_sword",
            () -> new SwordItem(ModItemTier.CITRINE,5,1.2f,
                    new Item.Properties().tab(ModTabs.SNSMODTAB2)));

    //Register the defined Item/s
    public static void register(IEventBus eventBus){
        MOD_ITEMS.register(eventBus);
    }
}
