package com.dcubed33.shutters.block;

import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks {
    public static final BlockMain shutters = new BlockShutters();

    public static void init(){
        GameRegistry.registerBlock(shutters, "shutters");
    }
}
