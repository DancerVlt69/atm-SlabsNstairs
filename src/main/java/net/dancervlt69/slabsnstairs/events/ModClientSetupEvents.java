package net.dancervlt69.slabsnstairs.events;

import net.dancervlt69.slabsnstairs.init.blocks.entities.ModBlockEntities;
import net.dancervlt69.slabsnstairs.init.blocks.utils.ModWoodTypes;
import net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.ModEntityTypes;
import net.dancervlt69.slabsnstairs.init.items.custom.utils.modItemRenderer.ModIronArrowRenderer;
import net.dancervlt69.slabsnstairs.init.items.custom.utils.modItemRenderer.ModStoneArrowRenderer;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
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
    private static final Logger LOGGER = LogManager.getLogger(SlabsNstairs.class);

    public static void modRenderTypes() {

        /*  ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWTH_STOP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CINNAMON_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CINNAMON_DOOR_01.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CINNAMON_DOOR_02.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CINNAMON_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_STAIRS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRY_ICE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRY_ICE_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRY_ICE_STAIRS.get(), RenderType.translucent()); */

        EntityRenderers.register(ModEntityTypes.STONE_ARROW.get(), ModStoneArrowRenderer::new);
        EntityRenderers.register(ModEntityTypes.IRON_ARROW.get(), ModIronArrowRenderer::new);

        BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
    }

    public static void modAddingProperties() {
        // ModItemProperties.addCustomItemProperties();
    }

    public static void modWoodTypeRegister() {

        WoodType.register(ModWoodTypes.CINNAMON);
        // WoodType.register(ModWoodTypes.RED_BEECH);
    }

}
