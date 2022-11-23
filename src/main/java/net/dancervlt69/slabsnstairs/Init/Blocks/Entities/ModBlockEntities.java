package net.dancervlt69.slabsnstairs.Init.Blocks.Entities;

import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.Custom.ModSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModBlockEntities {

	public static final DeferredRegister<BlockEntityType<?>> MOD_BLOCK_ENTITIES =
			DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

	/* public static final RegistryObject<BlockEntityType<GemCuttingStationEntity>> GEM_CUTTING_STATION_ENTITY =
			BLOCK_ENTITIES.register("gem_cutting_station_entity", () ->
					BlockEntityType.Builder.of(GemCuttingStationEntity::new,
							ModBlocks.GEM_CUTTING_STATION.get()).build(null)); */

	public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
			MOD_BLOCK_ENTITIES.register("sign_block_entity", () ->
					BlockEntityType.Builder.of(ModSignBlockEntity::new, ModBlocks.CINNAMON_WALL_SIGN.get(),
							ModBlocks.CINNAMON_SIGN.get()).build(null));

//	public static final BlockEntityType<SculkSensorBlockEntity> SCULK_SENSOR = register("sculk_sensor",
//			BlockEntityType.Builder.of(SculkSensorBlockEntity::new, Blocks.SCULK_SENSOR));

	public static void register(IEventBus eventBus) { MOD_BLOCK_ENTITIES.register(eventBus);}
}
