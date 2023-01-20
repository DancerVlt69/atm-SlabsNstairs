package net.dancervlt69.slabsnstairs.init.settings;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModCommonConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // public static final ForgeConfigSpec.ConfigValue<Integer> SAMPLE_CONFIG_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> CITRINE_ORE_GENERATION_ACTIVATED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> PLANTS_LOOT_ACTIVATED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> TALL_GRASS_LOOT_ACTIVATED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> LARGE_FERN_LOOT_ACTIVATED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ANIMAL_LOOT_ACTIVATED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> COW_LOOT_ACTIVATED;

    static {
        BUILDER.push("Common-Mod-Config for Slabs 'n Stairs");

        // SAMPLE_CONFIG_VALUE = BUILDER.comment("How many Samples you need?").define("Needed Samples", 5);

       CITRINE_ORE_GENERATION_ACTIVATED = BUILDER.comment("De-/Activate Citrine Ore Generation")
               .translation("slabsnstairs.config.common.citrine_ore")
               .define("Citrine Ore Generation", true);

        PLANTS_LOOT_ACTIVATED = BUILDER.comment("De-/Activate Extra Loot from Plants")
                .translation("slabsnstairs.config.common.plants_loot")
                .define("Extra Loot from Plants", true);
        TALL_GRASS_LOOT_ACTIVATED = BUILDER.comment("De-/Activate Extra Loot from Tall Grass")
                .define("Extra Loot from Tall Grass", true);
        LARGE_FERN_LOOT_ACTIVATED = BUILDER.comment("De-/Activate Extra Loot from Large Fern")
                .define("Extra Loot from Large Fern", true);

        ANIMAL_LOOT_ACTIVATED = BUILDER.comment("De-/Activate Extra Loot from all Animals")
                .translation("slabsnstairs.config.common.animal_loot")
                .define("Extra Loot from all Animals", true);
        COW_LOOT_ACTIVATED = BUILDER.comment("De-/Activate Extra Loot from Cows")
                .define("Extra Loot from Cows", true);

        BUILDER.pop();
        SPEC = BUILDER.build();

    }
}
