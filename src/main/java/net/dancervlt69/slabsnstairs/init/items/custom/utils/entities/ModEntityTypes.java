package net.dancervlt69.slabsnstairs.init.items.custom.utils.entities;

import net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.modItemEntities.ModIronArrowEntity;
import net.dancervlt69.slabsnstairs.init.items.custom.utils.entities.modItemEntities.ModStoneArrowEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModEntityTypes {
	public static final DeferredRegister<EntityType<?>> MOD_ENTITY_TYPES =
			DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);


	public static final RegistryObject<EntityType<ModStoneArrowEntity>> STONE_ARROW =
			MOD_ENTITY_TYPES.register("stone_arrow",
					() -> EntityType.Builder.of((EntityType.EntityFactory<ModStoneArrowEntity>) ModStoneArrowEntity::new,
							MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4)
							.updateInterval(20).build("stone_arrow"));

	public static final RegistryObject<EntityType<ModIronArrowEntity>> IRON_ARROW =
			MOD_ENTITY_TYPES.register("iron_arrow",
					() -> EntityType.Builder.of((EntityType.EntityFactory<ModIronArrowEntity>) ModIronArrowEntity::new,
							MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4)
							.updateInterval(20).build("iron_arrow"));

	public static void register(IEventBus eventBus) { MOD_ENTITY_TYPES.register(eventBus); }
}

//	public static final RegistryObject<EntityType<ModBoatEntity>> CRIMSON_BOAT =
//			ENTITY_TYPES.register("crimson_boat",
//					() -> EntityType.Builder.of((EntityType.EntityFactory<ModBoatEntity>) ModBoatEntity::new,
//							MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4)
//							.updateInterval(20).build("crimson_boat"));
//	public static final RegistryObject<EntityType<ModBoatEntity>> WARPED_BOAT =
//			ENTITY_TYPES.register("warped_boat",
//					() -> EntityType.Builder.of((EntityType.EntityFactory<ModBoatEntity>) ModBoatEntity::new,
//									MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4)
//							.updateInterval(20).build("warped_boat"));

