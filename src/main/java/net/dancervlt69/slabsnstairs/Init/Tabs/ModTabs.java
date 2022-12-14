package net.dancervlt69.slabsnstairs.Init.Tabs;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

// @ApiStatus.Internal
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTabs {

    // private ModTabs(){ }

    private static final String TAB_KEY1 = MODID + ".snsmodtab1";
    private static final String TAB_KEY2 = MODID + ".snsmodtab2";
    private static final String TAB_KEY3 = MODID + ".snsmodtab3";

    private static final ResourceLocation TAB_ID1 = new ResourceLocation(TAB_KEY1);
    private static final ResourceLocation TAB_ID2 = new ResourceLocation(TAB_KEY2);
    private static final ResourceLocation TAB_ID3 = new ResourceLocation(TAB_KEY3);

    @SubscribeEvent
    public static void onRegisterCreativeModeTabEvent(final CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(TAB_ID1, builder ->
                builder.title(Component.translatable("itemGroup.snsmodtab1"))
                .icon(() -> new ItemStack (ModBlocks.CITRINE_BLOCK.get()))
                .displayItems((flagSet, entries, flag) ->
                        ModItems.MOD_ITEMS.getEntries().stream().map(RegistryObject::get).forEachOrdered(entries::accept)));

        event.registerCreativeModeTab(TAB_ID2, builder ->
                builder.title(Component.translatable("itemGroup.snsmodtab2"))
                .icon(() -> ModItems.CITRINE_SWORD.get().getDefaultInstance())
                .displayItems((flagSet, entries, flag) -> entries.accept(ModItems.CITRINE_SWORD.get())));

        event.registerCreativeModeTab(TAB_ID3, builder ->
                builder.title(Component.translatable("itemGroup.snsmodtab3"))
                .icon(() -> ModItems.CITRINE_COIN.get().getDefaultInstance())
                .displayItems((flagSet, entries, flag) -> {
                    entries.accept(ModItems.CITRINE.get());
                    entries.accept(ModItems.CITRINE_COIN.get());

                    entries.accept(ModItems.LIGHT_BROWN_DYE.get());
                }));
    }

    @SubscribeEvent
    public static void onCreativeModTabEvent(CreativeModeTabEvent.BuildContents event) {

        if (event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept(new ItemStack(ModItems.CITRINE_SWORD.get()));
        }

        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {

            // Cinnamon
            event.accept(ModBlocks.CINNAMON_PLANKS.get());
            event.accept(ModItems.CINNAMON_SIGN.get());

            // Pressure Plates
            event.accept(ModBlocks.CINNAMON_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CITRINE_PRESSURE_PLATE.get());

            event.accept(ModBlocks.COBBLESTONE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get());

            event.accept(ModBlocks.ANDESITE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.DIORITE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.GRANITE_PRESSURE_PLATE.get());

            event.accept(ModBlocks.BLACKSTONE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE.get());

            event.accept(ModBlocks.DEEPSLATE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE.get());
            event.accept(ModBlocks.DEEPSLATE_TILE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_PRESSURE_PLATE.get());

            event.accept(ModBlocks.END_STONE_BRICK_PRESSURE_PLATE.get());

            event.accept(ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE.get());
            event.accept(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE.get());

            event.accept(ModBlocks.QUARTZ_PRESSURE_PLATE.get());
            event.accept(ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CHISELED_QUARTZ_PRESSURE_PLATE.get());
            event.accept(ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE.get());
            event.accept(ModBlocks.QUARTZ_PILLAR_PRESSURE_PLATE.get());

            event.accept(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.SANDSTONE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.RED_SANDSTONE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.get());
        }

    }



//    public static final CreativeModeTab SNSMODTAB1 = new CreativeModeTab("snsmodtab1") {
//
//        @Override
//        public ItemStack ItemDisplayGenerator() { return new ItemStack(ModBlocks.CITRINE_BLOCK.get()); }
//    };
//
//    public static final CreativeModeTab SNSMODTAB2 = new CreativeModeTab("snsmodtab2") {
//        @Override
//        public @NotNull ItemStack makeIcon() {
//            return new ItemStack(ModItems.CITRINE_SWORD.get());
//        }
//    };
//
//    public static final CreativeModeTab SNSMODTAB3 = new CreativeModeTab("snsmodtab3") {
//        @Override
//        public @NotNull ItemStack makeIcon() {
//            return new ItemStack(ModItems.CITRINE_COIN.get());
//        }
//    };

    public static ResourceLocation getTabId1() {
        return TAB_ID1;
    }

    public static ResourceLocation getTabId2() {
        return TAB_ID2;
    }
    public static ResourceLocation getTabId3() {
        return TAB_ID3;
    }

//    public static final CreativeModeTab SNS1 = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
//            .title(Component.translatable("itemGroup.snsmodtab1"))
//            .icon(() -> {
//                return new ItemStack (ModBlocks.CITRINE_BLOCK.get());
//            }).build();

//    public static final CreativeModeTab SNS2 = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
//            .title(Component.translatable("itemGroup.snsmodtab2"))
//            .icon((Supplier<ItemStack>) ModItems.CITRINE_SWORD.get()).build();
//
//    public static final CreativeModeTab SNS3 = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
//            .title(Component.translatable("itemGroup.snsmodtab3"))
//            .icon((Supplier<ItemStack>) ModItems.CITRINE_COIN.get()).build();
//
//    public static final CreativeModeTab SNS4 = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
//            .title(Component.translatable("itemGroup.snsmodtab4"))
//            .icon((Supplier<ItemStack>) ModBlocks.CINNAMON_PLANKS.get()).build();
}
