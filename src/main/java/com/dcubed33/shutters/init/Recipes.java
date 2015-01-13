package com.dcubed33.shutters.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init(){
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.oakShutter), "xyx", "x x", "xyx", 'x', new ItemStack(Blocks.planks), 'y', new ItemStack(Blocks.wooden_slab));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.shuttersCatalog), "blockShutter"));
    }
}
