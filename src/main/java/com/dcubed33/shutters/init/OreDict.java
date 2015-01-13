package com.dcubed33.shutters.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
    public static void init(){
        OreDictionary.registerOre("blockShutter", ModBlocks.acaciaShutter);
        OreDictionary.registerOre("blockShutter", ModBlocks.birchShutter);
        OreDictionary.registerOre("blockShutter", ModBlocks.darkOakShutter);
        OreDictionary.registerOre("blockShutter", ModBlocks.jungleShutter);
        OreDictionary.registerOre("blockShutter", ModBlocks.oakShutter);
        OreDictionary.registerOre("blockShutter", ModBlocks.spruceShutter);
    }
}
