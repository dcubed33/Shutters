package com.dcubed33.shutters.block;

import com.dcubed33.shutters.creativetab.CreativeTabShutters;

public class BlockAcadiaShutters extends BlockMain {
    public BlockAcadiaShutters(){
        super();
        this.setBlockName("acadiaShutters");
        this.setBlockTextureName("acadiaShutters");
        this.setCreativeTab(CreativeTabShutters.Shutters_TAB);
        this.setResistance(5.0F);
        this.setHardness(0.8F);
        this.setStepSound(soundTypeWood);
    }
    public boolean isOpaqueCube(){
        return false;
    }
}
