package net.dancervlt69.slabsnstairs.init.blocks;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

import static net.dancervlt69.slabsnstairs.init.blocks.ModBlocks.MOD_BLOCKS;
import static net.dancervlt69.slabsnstairs.init.items.ModItems.MOD_ITEMS;
import static net.dancervlt69.slabsnstairs.init.tooltips.ShowToolTips.showTooltips;

public class ModBlockRegistering {

	/* public static final DeferredRegister<Block> MOD_BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, MODID); */

	/** Registering the Blocks <p>
	 *  - without Item <p>
	 *  - without Tool-Tips </p> */
	static <T extends Block> RegistryObject<T> registerBlockNoItem(String blockName, Supplier<T> block) {
		return MOD_BLOCKS.register(blockName, block);
	}

	/** - with Item but <p>
	 *  - without Tool-Tips </p> */
	static <T extends Block> RegistryObject<T> registerBlock(String blockName, Supplier<T> block) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(blockName, block);
		registerBlockItem(blockName, toReturn);
		return toReturn;
	}

	static <T extends Block> RegistryObject<Item> registerBlockItem(
			String name, RegistryObject<T> block) {
		return MOD_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

	/** - with Item & <p>
	 *  - with Tool-Tips for Shift </p> */
	static <T extends Block> RegistryObject<T> registerBlock(String blockName, Supplier<T> block, String tooltipKeyShift) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(blockName, block);
		registerBlockItem(blockName, toReturn, tooltipKeyShift);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(String blockName, RegistryObject<T> block,
															String tooltipKeyShift) {
		MOD_ITEMS.register(blockName, () -> new BlockItem(block.get(), new Item.Properties()) {

			@Override
			public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {

				showTooltips(pTooltip, tooltipKeyShift);
			}
		});
	}

	/** registering the Blocks with Item & with Tool-Tips for Shift & Ctrl */
	static <T extends Block> RegistryObject<T> registerBlock(String blockName, Supplier<T> block,
															 String tooltipKeyShift, String tooltipKeyCtrl) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(blockName, block);
		registerBlockItem(blockName, toReturn, tooltipKeyShift, tooltipKeyCtrl);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(String blockName, RegistryObject<T> block,
															String tooltipKeyShift, String tooltipKeyCtrl) {
		MOD_ITEMS.register(blockName, () -> new BlockItem(block.get(), new Item.Properties()) {

			@Override
			public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> pTooltip, TooltipFlag tooltipFlag) {

				showTooltips(pTooltip, tooltipKeyShift, tooltipKeyCtrl);
			}
		});
	}

	/** registering the Blocks with Item & with Tool-Tips for Shift & Ctrl & Alt */
	static <T extends Block> RegistryObject<T> registerBlock(
            String blockName, Supplier<T> block, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(blockName, block);
		registerBlockItem(blockName, toReturn, tooltipKeyShift, tooltipKeyCtrl, tooltipKeyAlt);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(
			String bockName, RegistryObject<T> block, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
		MOD_ITEMS.register(bockName, () -> new BlockItem(block.get(), new Item.Properties()) {

			@Override
			public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> pTooltip, TooltipFlag tooltipFlag) {

				showTooltips(pTooltip, tooltipKeyShift, tooltipKeyCtrl, tooltipKeyAlt);
			}
		});
	}

}
