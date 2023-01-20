package net.dancervlt69.slabsnstairs.init.world.features;

import net.dancervlt69.slabsnstairs.init.blocks.ModBlocks;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;


public class ModOreFeatures{

    public static final DeferredRegister<ConfiguredFeature<?, ?>> MOD_ORE_FEATURES =
          DeferredRegister.create(ForgeRegistries.FEATURES.getRegistryName(), MODID);

    public static final ResourceKey<ConfiguredFeature<?,? >> CITRINE_ORE =
            FeatureUtils.createKey("citrine_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> pContext ) {
        RuleTest ruletest = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        RuleTest ruletest1 = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest ruletest2 = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        // RuleTest ruletest3 = new BlockMatchTest(Blocks.NETHERRACK);
        // RuleTest ruletest4 = new TagMatchTest(BlockTags.BASE_STONE_NETHER);

        List<OreConfiguration.TargetBlockState> list = List.of(
                OreConfiguration.target(ruletest1, ModBlocks.CITRINE_ORE.get().defaultBlockState()),
                OreConfiguration.target(ruletest2, ModBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState()));

        FeatureUtils.register(pContext, CITRINE_ORE, Feature.ORE, new OreConfiguration(list, 6));
    }

    public static void register(IEventBus eventBus) { MOD_ORE_FEATURES.register(eventBus); }

}
