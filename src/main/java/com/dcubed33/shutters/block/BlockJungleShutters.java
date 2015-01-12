package com.dcubed33.shutters.block;

import com.dcubed33.shutters.creativetab.CreativeTabShutters;

public class BlockJungleShutters extends BlockMain {
    public BlockJungleShutters(){
        super();
        this.setBlockName("jungleShutters");
        this.setBlockTextureName("jungleShutters");
        this.setCreativeTab(CreativeTabShutters.Shutters_TAB);
        this.setResistance(5.0F);
        this.setHardness(0.8F);
        this.setStepSound(soundTypeWood);
    }
    public boolean isOpaqueCube(){
        return false;
    }
}
