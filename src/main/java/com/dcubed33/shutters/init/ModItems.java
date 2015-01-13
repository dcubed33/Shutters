package com.dcubed33.shutters.init;

import com.dcubed33.shutters.item.ItemShuttersCatalog;
import com.dcubed33.shutters.item.ItemMain;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemMain shuttersCatalog = new ItemShuttersCatalog();

    public static void init(){
        GameRegistry.registerItem(shuttersCatalog, "blindsCatalog");
    }
}
