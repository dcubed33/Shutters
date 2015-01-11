package com.dcubed33.shutters.init;

import com.dcubed33.shutters.item.ItemBlindsCatalog;
import com.dcubed33.shutters.item.ItemMain;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemMain blindsCatalog = new ItemBlindsCatalog();

    public static void init(){
        GameRegistry.registerItem(blindsCatalog, "blindsCatalog");
    }
}
