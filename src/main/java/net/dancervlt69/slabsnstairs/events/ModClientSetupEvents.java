package net.dancervlt69.slabsnstairs.events;

import net.dancervlt69.slabsnstairs.init.blocks.entities.ModBlockEntityTypes;
import net.dancervlt69.slabsnstairs.init.blocks.utils.ModWoodTypes;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientSetupEvents {
    public static final Logger LOGGER = LogManager.getLogger(SlabsNstairs.class);

    public static void modRenderTypes() {

        /*  ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWTH_STOP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CINNAMON_TRAPDOOR.get(), RenderType.cutout());*/

        BlockEntityRenderers.register(ModBlockEntityTypes.MOD_SIGN_BLOCK_ENTITY_TYPE.get(), SignRenderer::new);
        BlockEntityRenderers.register(ModBlockEntityTypes.MOD_HANGING_SIGN_BLOCK_ENTITY_TYPE.get(), HangingSignRenderer::new);

    }

    public static void modAddingProperties() {
        //ModItemProperties.addCustomItemProperties();
    }

    public static void modWoodTypeRegister() {

        WoodType.register(ModWoodTypes.CINNAMON);
        // WoodType.register(ModWoodTypes.RED_BEECH);
    }
}
