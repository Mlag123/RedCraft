package com.MLag.RedCraft;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsRegister {
//создание вкладок в креативе
    public static final CreativeTabs BLOCKS = new CreativeTabs("red_tabs") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlocksRegisters.Red_ore);
        }
    };

    public static final CreativeTabs TOOL = new CreativeTabs("tool_tabs") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemsRegisters.Red_Pickaxe);
        }
    };
    public static final CreativeTabs MATERIALS = new CreativeTabs("red_materials") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemsRegisters.red_ingot);
        }
    };
}
