 /* adding an own cutter for minerals and metals like Gold, Iron, Citrine, etc.,
  * and Glass, Obsidian, etc., and other Block-Entities planed
  *
  * at the moment all these blocks can cut with the StoneCutter
  */

package net.dancervlt69.slabsnstairs.Init.Blocks.Entities;

 import net.dancervlt69.slabsnstairs.Init.Blocks.Entities.Custom.ModSignBlockEntity;
 import net.dancervlt69.slabsnstairs.Init.Blocks.ModBlocks;
 import net.minecraft.tileentity.TileEntityType;
 import net.minecraftforge.eventbus.api.IEventBus;
 import net.minecraftforge.fml.RegistryObject;
 import net.minecraftforge.registries.DeferredRegister;
 import net.minecraftforge.registries.ForgeRegistries;

 import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

 public class ModBlockEntities {
	 public static final DeferredRegister<TileEntityType<?>> MOD_BLOCK_ENTITIES =
			 DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MODID);

	 /* public static final RegistryObject<BlockEntityType<GemCuttingStationEntity>> GEM_CUTTING_STATION_ENTITY =
			BLOCK_ENTITIES.register("gem_cutting_station_entity", () ->
					BlockEntityType.Builder.of(GemCuttingStationEntity::new,
							ModBlocks.GEM_CUTTING_STATION.get()).build(null)); */

	 public static final RegistryObject<TileEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
			 MOD_BLOCK_ENTITIES.register("sign_block_entity", () ->
					 TileEntityType.Builder.of(ModSignBlockEntity::new,
							 ModBlocks.CINNAMON_SIGN.get(),
							 ModBlocks.CINNAMON_WALL_SIGN.get()).build(null));

	 public static void register(IEventBus eventBus) {MOD_BLOCK_ENTITIES.register(eventBus); }
}
