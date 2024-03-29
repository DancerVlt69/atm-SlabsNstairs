package net.dancervlt69.slabsnstairs.init.blocks;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

import static net.dancervlt69.slabsnstairs.init.blocks.ModBlocks.MOD_BLOCKS;
import static net.dancervlt69.slabsnstairs.init.items.ModItems.MOD_ITEMS;
import static net.dancervlt69.slabsnstairs.init.utils.tooltips.ShowToolTips.showTooltips;

public class RegisteringModBlocks {

	/* public static final DeferredRegister<Block> MOD_BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, MODID); */

	/** Registering the Blocks <p>
	 *  - without Item </p> */
	static <T extends Block> RegistryObject<T> registerBlockNoItem(String blockName, Supplier<T> block) {
		return MOD_BLOCKS.register(blockName, block);
	}

	/** - with Item but <p>
	 *  - without Tool-Tips </p> */
	static <T extends Block> RegistryObject<T> registerBlock(String blockName, Supplier<T> block,
															 CreativeModeTab tab) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(blockName, block);
		registerBlockItem(blockName, toReturn, tab);
		return toReturn;
	}

	static <T extends Block> RegistryObject<Item> registerBlockItem(
			String name, RegistryObject<T> block, CreativeModeTab tab) {
		return MOD_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	/** - with Item & <p>
	 *  - with Tool-Tips for Shift </p> */
	static <T extends Block> RegistryObject<T> registerBlock(String blockName, Supplier<T> block,
															 CreativeModeTab tab, String tooltipKeyShift) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(blockName, block);
		registerBlockItem(blockName, toReturn, tab, tooltipKeyShift);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(String blockName, RegistryObject<T> block,
															CreativeModeTab tab, String tooltipKeyShift) {
		MOD_ITEMS.register(blockName, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {

			@Override
			public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {

				showTooltips(pTooltip, tooltipKeyShift);
			}
		});
	}

	/** registering the Blocks with Item & with Tool-Tips for Shift & Ctrl */
	static <T extends Block> RegistryObject<T> registerBlock(String blockName, Supplier<T> block,
															 CreativeModeTab tab, String tooltipKeyShift, String tooltipKeyCtrl) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(blockName, block);
		registerBlockItem(blockName, toReturn, tab, tooltipKeyShift, tooltipKeyCtrl);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(String bockName, RegistryObject<T> block,
															CreativeModeTab tab, String tooltipKeyShift, String tooltipKeyCtrl) {
		MOD_ITEMS.register(bockName, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {

			@Override
			public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> pTooltip, TooltipFlag tooltipFlag) {

				showTooltips(pTooltip, tooltipKeyShift, tooltipKeyCtrl);
			}
		});
	}

	/** registering the Blocks with Item & with Tool-Tips for Shift & Ctrl & Alt */
	static <T extends Block> RegistryObject<T> registerBlock(
            String blockName, Supplier<T> block, CreativeModeTab tab, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(blockName, block);
		registerBlockItem(blockName, toReturn, tab, tooltipKeyShift, tooltipKeyCtrl, tooltipKeyAlt);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(
			String bockName, RegistryObject<T> block, CreativeModeTab tab, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
		MOD_ITEMS.register(bockName, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {

			@Override
			public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> pTooltip, TooltipFlag tooltipFlag) {

				showTooltips(pTooltip, tooltipKeyShift, tooltipKeyCtrl, tooltipKeyAlt);
			}
		});
	}

	/* public static void register(IEventBus eventBus) {
		MOD_BLOCKS.register(eventBus);
	}*/
}
