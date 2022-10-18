package net.dancervlt69.slabsnstairs.Init.Settings;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModCommonSettings {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> CITRINE_ORE_GENERATION_ACTIVATED;
    public static final ForgeConfigSpec.ConfigValue<Integer> ILLUMINATED_GROWTH_STOP_LIGHT_RANGE;

    static {
        BUILDER.push("Common - Settings for Slabs 'n Stairs (inactive right now)");

        // SAMPLE_CONFIG_VALUE = BUILDER.comment("How many Samples you need?").define("Needed Samples", 5);

        CITRINE_ORE_GENERATION_ACTIVATED = BUILDER.comment("Will activate the Citrine Ore Generation")
                .define("Activate Citrine Ore Generation", true);
        ILLUMINATED_GROWTH_STOP_LIGHT_RANGE = BUILDER.comment("Set the Light Level of the illuminated Growth-Stops")
                        .defineInRange("Light Level of the illuminated Growth Stops", 5, 1, 15);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
