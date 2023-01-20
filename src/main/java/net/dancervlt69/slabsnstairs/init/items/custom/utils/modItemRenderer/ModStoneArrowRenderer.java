package net.dancervlt69.slabsnstairs.init.items.custom.utils.modItemRenderer;

import net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.modItemEntities.ModStoneArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

@OnlyIn(Dist.CLIENT)
public class ModStoneArrowRenderer extends ArrowRenderer<ModStoneArrowEntity> {

	public static final ResourceLocation TEXTURE =
			new ResourceLocation(MODID,"textures/entity/stone_arrow.png");

	public ModStoneArrowRenderer(EntityRendererProvider.Context context) {
		super(context);
		this.shadowRadius = 0.2f;
	}

	@NotNull
	@Override
	public ResourceLocation getTextureLocation(@NotNull ModStoneArrowEntity arrowEntity) {
		return TEXTURE;
	}
}
