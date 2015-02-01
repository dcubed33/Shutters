package com.dcubed33.shutters.block;

import com.dcubed33.shutters.creativetab.CreativeTabShutters;
import com.dcubed33.shutters.init.ModBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockJungleShutters extends BlockMain {
    public BlockJungleShutters(){
        super(Material.wood);
        this.setBlockName("jungleShutters");
        this.setBlockTextureName("jungleShutters");
        this.setCreativeTab(CreativeTabShutters.Shutters_TAB);
        this.setResistance(5.0F);
        this.setHardness(1.8F);
        this.setStepSound(soundTypeWood);
        this.setHarvestLevel("axe", 0);
    }
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public Item getItemDropped(int int1, Random random, int int2) {
        return Item.getItemFromBlock(ModBlocks.jungleShutter);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }
}
