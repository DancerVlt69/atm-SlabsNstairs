package net.dancervlt69.slabsnstairs.events;

import net.dancervlt69.slabsnstairs.init.blocks.utils.ModWoodTypes;
import net.minecraft.client.renderer.Sheets;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonSetupEvents {

    public static void addModWoodTypes(FMLCommonSetupEvent event) {

        event.enqueueWork(() -> {
            Sheets.addWoodType(ModWoodTypes.CINNAMON);
            Sheets.addWoodType(ModWoodTypes.RED_BEECH);


        });
    }

}
/* AxeItem.BLOCK_STRIPPING_MAP = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.BLOCK_STRIPPING_MAP)
                        .put(ModBlocks.RED_BEECH_LOG.get(), ModBlocks.STRIPPED_RED_BEECH_LOG.get())
                        .put(ModBlocks.RED_BEECH_WOOD.get(), ModBlocks.STRIPPED_RED_BEECH_WOOD.get()).build();
                ModStructures.setupStructures(); */
