package com.dcubed33.shutters.block;

import com.dcubed33.shutters.creativetab.CreativeTabShutters;
import com.dcubed33.shutters.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class BlockOakShutters extends BlockMain{
    public BlockOakShutters(){
        super();
        this.setBlockName("oakShutters");
        this.setBlockTextureName("oakShutters");
        this.setCreativeTab(CreativeTabShutters.Shutters_TAB);
        this.setResistance(5.0F);
        this.setHardness(0.8F);
        this.setStepSound(soundTypeWood);
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public Item getItemDropped(int int1, Random random, int int2)
    {
        return Item.getItemFromBlock(ModBlocks.oakShutter);
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 1;
    }
}
