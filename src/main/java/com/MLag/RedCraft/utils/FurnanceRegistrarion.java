package com.MLag.RedCraft.utils;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnanceRegistrarion {
//создание рецептов под печку.
    public static void FurnanceRegistarion() {

        GameRegistry.addSmelting(BlocksRegisters.Red_ore, new ItemStack(ItemsRegisters.red_ingot), 10f);
        GameRegistry.addSmelting(BlocksRegisters.Natural_ore,new ItemStack(ItemsRegisters.NaturalIngot),10f);
    }
}
