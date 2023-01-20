package net.dancervlt69.slabsnstairs.init.utils.settings;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModServerConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // public static final ForgeConfigSpec.ConfigValue<Integer> SAMPLE_CONFIG_VALUE;

    static {
        BUILDER.push("Server-Mod-Config for Slabs 'n Stairs");

        // SAMPLE_CONFIG_VALUE = BUILDER.comment("How many Samples you need?").define("Needed Samples", 5);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
