package com.MLag.RedCraft;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class CraftingRegister {
    //регистрация рецептов


    public void register(){
        registerRecipes("red_crafting");
    }
    private void registerRecipes(String name){
       CraftingHelper.register(new ResourceLocation("red_crafting", name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));

    }
}
