package net.dancervlt69.slabsnstairs.init.utils.settings;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModClientConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> ILLUMINATED_GROWTH_STOP_LIGHT_RANGE;

    static {
        BUILDER.push("Client-Mod-Config for Slabs 'n Stairs");

        ILLUMINATED_GROWTH_STOP_LIGHT_RANGE = BUILDER.comment("Light Level of the illuminated Growth-Stop")
                .translation("slabsnstairs.config.client.gs_light_level")
                .defineInRange("Growth-Stop Light Level", 9, 1, 12);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
