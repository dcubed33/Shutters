package com.dcubed33.shutters.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init(){
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.oakShutter), "xyx", "x x", "xyx", 'x', new ItemStack(Blocks.planks, 1, 0), 'y', new ItemStack(Blocks.wooden_slab, 1, 0));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.spruceShutter), "xyx", "x x", "xyx", 'x', new ItemStack(Blocks.planks, 1, 1), 'y', new ItemStack(Blocks.wooden_slab, 1, 1));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.birchShutter), "xyx", "x x", "xyx", 'x', new ItemStack(Blocks.planks, 1, 2), 'y', new ItemStack(Blocks.wooden_slab, 1 , 2));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.jungleShutter), "xyx", "x x", "xyx", 'x', new ItemStack(Blocks.planks, 1, 3), 'y', new ItemStack(Blocks.wooden_slab, 1, 3));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.acaciaShutter), "xyx", "x x", "xyx", 'x', new ItemStack(Blocks.planks, 1, 4), 'y', new ItemStack(Blocks.wooden_slab, 1, 4));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.darkOakShutter), "xyx", "x x", "xyx", 'x', new ItemStack(Blocks.planks, 1, 5), 'y', new ItemStack(Blocks.wooden_slab, 1, 5));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.shuttersCatalog), "pxx", "pxx", "pxx", 'x', "blockShutter", 'p', new ItemStack(Items.paper)));
    }
}
