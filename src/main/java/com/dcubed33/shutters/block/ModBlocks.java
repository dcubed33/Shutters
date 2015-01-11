package com.dcubed33.shutters.block;

import com.dcubed33.shutters.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockMain shutters = new BlockShutters();

    public static void init(){
        GameRegistry.registerBlock(shutters, "shutters");
    }
}
