package net.dancervlt69.slabsnstairs.Init.Blocks;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

import static net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks.MOD_BLOCKS;
import static net.dancervlt69.slabsnstairs.Init.Items.ModItems.MOD_ITEMS;
import static net.dancervlt69.slabsnstairs.Init.ToolTips.ShowTooltips.showTooltips;

public class RegisteringModBlocks {

	/** Registering Blocks <p> - without Items and/or Tooltips </p> */
	static <T extends Block> RegistryObject<T> registerBlockNoItem(String blockName, Supplier<T> block) {
		return MOD_BLOCKS.register(blockName, block);
	}

	/** Registering Blocks <p> - with Item but <p> - without Tooltips</p> */
	static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
																	 ItemGroup tab) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(
			String name, RegistryObject<T> block, ItemGroup tab) {
		MOD_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}


	/** Registering Block <p> - with Item and <p> -with Tooltip Shift</p> */
	static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
																	 ItemGroup tab, String tooltipKeyShift) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab, tooltipKeyShift);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(
			String name, RegistryObject<T> block, ItemGroup tab, String tooltipKeyShift) {
		MOD_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
			@Override
			public void appendHoverText(ItemStack pStack, @Nullable World world,
										List<ITextComponent> pTooltip, ITooltipFlag iTooltipFlag) {
				showTooltips(pTooltip, tooltipKeyShift);
			}
		});
	}

	/** Registering Block <p> - with Item and <p> - with Tooltip Shift & Ctrl</p> */
	static <T extends Block> RegistryObject<T> registerBlock(
			String name, Supplier<T> block, ItemGroup tab, String tooltipKeyShift, String tooltipKeyCtrl) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab, tooltipKeyShift, tooltipKeyCtrl);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(
			String name, RegistryObject<T> block, ItemGroup tab, String tooltipKeyShift, String tooltipKeyCtrl) {
		MOD_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
			@Override
			public void appendHoverText(ItemStack pStack, @Nullable World world,
										List<ITextComponent> pTooltip, ITooltipFlag iTooltipFlag) {
				showTooltips(pTooltip, tooltipKeyShift, tooltipKeyCtrl);
			}
		});
	}

	/** Registering Block <p> - with Item and <p> - with Tooltip Shift & Ctrl & Alt</p> */
	static <T extends Block> RegistryObject<T> registerBlock(
			String name, Supplier<T> block, ItemGroup tab, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab, tooltipKeyShift, tooltipKeyCtrl, tooltipKeyAlt);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(
			String name, RegistryObject<T> block, ItemGroup tab, String tooltipKeyShift, String tooltipKeyCtrl, String tooltipKeyAlt) {
		MOD_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
			@Override
			public void appendHoverText(ItemStack pStack, @Nullable World world,
										List<ITextComponent> pTooltip, ITooltipFlag iTooltipFlag) {
				showTooltips(pTooltip, tooltipKeyShift, tooltipKeyCtrl, tooltipKeyAlt);
			}
		});
	}

}
