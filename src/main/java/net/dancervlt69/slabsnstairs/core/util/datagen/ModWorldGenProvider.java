package net.dancervlt69.slabsnstairs.core.util.datagen;

import net.dancervlt69.slabsnstairs.init.world.features.ModConfiguredFeatures;
import net.dancervlt69.slabsnstairs.init.world.features.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder MOD_BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);


    /**
     * Constructs a new datapack provider which generates all registry objects
     * from the provided mods using the holder.
     *
     * @param output     the target directory of the data generator
     * @param registries a future of a lookup for registries and their objects
     * @param modIds     a set of mod ids to generate the dynamic registry objects of
     */
    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {

        super(output, registries, MOD_BUILDER, Collections.singleton(MODID));
    }

}
