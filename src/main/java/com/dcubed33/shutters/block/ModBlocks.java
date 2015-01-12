package com.dcubed33.shutters.block;

import com.dcubed33.shutters.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import jdk.nashorn.internal.ir.Block;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockMain oakShutter = new BlockOakShutters();
    public static final BlockMain birchShutter = new BlockBirchShutters();
    public static final BlockMain spruceShutter = new BlockSpruceShutters();
    public static final BlockMain jungleShutter = new BlockJungleShutters();
    public static final BlockMain acaciaShutter = new BlockAcaciaShutters();
    public static final BlockMain darkOakShutter = new BlockDarkOakShutters();

    public static void init(){
        GameRegistry.registerBlock(oakShutter, "oakShutters");
        GameRegistry.registerBlock(birchShutter, "birchShutters");
        GameRegistry.registerBlock(spruceShutter, "spruceShutters");
        GameRegistry.registerBlock(jungleShutter, "jungleShutters");
        GameRegistry.registerBlock(acaciaShutter, "acaciaShutters");
        GameRegistry.registerBlock(darkOakShutter, "darkOakShutters");
    }
}
