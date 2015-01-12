package com.dcubed33.shutters.block;

import com.dcubed33.shutters.creativetab.CreativeTabShutters;

public class BlockDarkOakShutters extends BlockMain {
    public BlockDarkOakShutters(){
        super();
        this.setBlockName("darkOakShutters");
        this.setBlockTextureName("darkOakShutters");
        this.setCreativeTab(CreativeTabShutters.Shutters_TAB);
        this.setResistance(5.0F);
        this.setHardness(0.8F);
        this.setStepSound(soundTypeWood);
    }
    public boolean isOpaqueCube(){
        return false;
    }
}
