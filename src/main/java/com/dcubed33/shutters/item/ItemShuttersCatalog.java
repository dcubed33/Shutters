package com.dcubed33.shutters.item;

import com.dcubed33.shutters.creativetab.CreativeTabShutters;

public class ItemShuttersCatalog extends ItemMain{
    public ItemShuttersCatalog(){
        super();
        this.setUnlocalizedName("shuttersCatalog");
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabShutters.Shutters_TAB);
    }
}
