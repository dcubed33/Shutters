package com.dcubed33.shutters.block;

import com.dcubed33.shutters.creativetab.CreativeTabShutters;

public class BlockAcaciaShutters extends BlockMain {
    public BlockAcaciaShutters(){
        super();
        this.setBlockName("acaciaShutters");
        this.setBlockTextureName("acaciaShutters");
        this.setCreativeTab(CreativeTabShutters.Shutters_TAB);
        this.setResistance(5.0F);
        this.setHardness(0.8F);
        this.setStepSound(soundTypeWood);
    }
    public boolean isOpaqueCube(){
        return false;
    }
}
