package net.dancervlt69.slabsnstairs.init.items;

import net.dancervlt69.slabsnstairs.init.blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.init.items.custom.ModCitrineCoinItem;
import net.dancervlt69.slabsnstairs.init.items.custom.ModSwordItem;
import net.dancervlt69.slabsnstairs.init.items.custom.utils.ModItemTiers;
import net.dancervlt69.slabsnstairs.init.sounds.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.LOGGER;
import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModItems {

    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Define your different Items here
    public static final RegistryObject<Item> CITRINE = MOD_ITEMS.register("citrine",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<ModCitrineCoinItem> CITRINE_COIN = MOD_ITEMS.register("citrine_coin",
            () -> new ModCitrineCoinItem(new Item.Properties(),
                    "tooltip.slabsnstairs.citrine_coin.shift"));

        // Dye
    // @Deprecated
    public static final RegistryObject<Item> LIGHT_BROWN_DYE = MOD_ITEMS.register("light_brown_dye",
            () -> new DyeItem(DyeColor.BROWN,(new Item.Properties())));

    public static final RegistryObject<Item> CINNAMON_SIGN = MOD_ITEMS.register("cinnamon_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.CINNAMON_SIGN.get(), ModBlocks.CINNAMON_WALL_SIGN.get()));

    public static final RegistryObject<Item> CINNAMON_HANGING_SIGN = MOD_ITEMS.register("cinnamon_hanging_sign",
            () -> new HangingSignItem(ModBlocks.CINNAMON_HANGING_SIGN.get(), ModBlocks.CINNAMON_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

//    public static final RegistryObject<Item> SHAKE_THE_BUS = MOD_ITEMS.register("shake_the_bus",
//            () -> new RecordItem(4, ModSounds.SHAKE_THE_BUS,
//                    (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 0));

    // @Deprecated


    public static final RegistryObject<Item> CITRINE_SWORD = MOD_ITEMS.register("citrine_sword",
            () -> new ModSwordItem(ModItemTiers.CITRINE,5,1.0f,
                    new Item.Properties(),
                    "tooltip.slabsnstairs.citrine_sword.shift",
                    "tooltip.slabsnstairs.citrine_sword.ctrl",
                    "tooltip.slabsnstairs.citrine_sword.alt"));

    //Register the defined Item/s
    public static void register(IEventBus eventBus){
        LOGGER.debug("Registering Mod-Items for " + MODID);
        MOD_ITEMS.register(eventBus);
    }

}
