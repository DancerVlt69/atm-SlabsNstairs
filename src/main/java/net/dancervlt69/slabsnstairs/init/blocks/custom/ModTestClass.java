package net.dancervlt69.slabsnstairs.init.blocks.custom;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.dimension.DimensionType;

public class ModTestClass extends IceBlock {

    public ModTestClass(Properties pProperties, ResourceKey<Level> dimension) {
        super(pProperties);

    //public ModTestClass(DyeColor pColor, Properties pProperties, ResourceKey<Level> dimension) {
        // super(pColor, pProperties);
        this.dimension = dimension;
    }
    private ResourceKey<Level> dimension;
    protected void Level (ResourceKey<Level> pDimension,
                          Holder<DimensionType> pDimensionTypeRegistration,
                          boolean pIsClientSide){

        final DimensionType dimensionType = pDimensionTypeRegistration.value();
        this.dimension = pDimension;

        if(pIsClientSide) {
            if (dimensionType.hasSkyLight()) {

            }
        }
    }
}
