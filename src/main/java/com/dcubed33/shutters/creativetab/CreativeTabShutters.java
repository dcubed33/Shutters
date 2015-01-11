package com.dcubed33.shutters.creativetab;

import com.dcubed33.shutters.init.ModItems;
import com.dcubed33.shutters.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabShutters {
    public static final CreativeTabs Shutters_TAB = new CreativeTabs(Reference.MOD_ID){
        @Override
        public Item getTabIconItem() {
            return ModItems.blindsCatalog;
        }

        @Override
        public String getTranslatedTabLabel(){
            return "Shutters";
        }
    };
}
