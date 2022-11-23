package net.dancervlt69.slabsnstairs.Init.Events;

import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.ModBlockEntities;
import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Blocks.Utils.ModWoodTypes;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.tileentity.SignTileEntityRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;


public class ModClientSetupEvents {

    public static void modRenderTypes() {
        RenderTypeLookup.setRenderLayer(ModBlocks.GROWTH_STOP.get(), RenderType.translucent());
        // RenderTypeLookup.setRenderLayer(ModBlocks.CINNAMON_DOOR.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CINNAMON_DOOR_01.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CINNAMON_DOOR_02.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CINNAMON_TRAPDOOR.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICE_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICE_STAIRS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.DRY_ICE_BLOCK.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.DRY_ICE_SLAB.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.DRY_ICE_STAIRS.get(), RenderType.translucent());

        ClientRegistry.bindTileEntityRenderer(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignTileEntityRenderer::new);
    }

    public static void addModAtlases() {

        Atlases.addWoodType(ModWoodTypes.CINNAMON);

    }

}
