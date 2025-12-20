package com.MLag.RedCraft.utils;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsRegister {
    //создание вкладок в креативе
    public static final CreativeTabs BLOCKS = new CreativeTabs("block_tabs") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlocksRegisters.maxwell_block);
        }
    };

    public static final CreativeTabs TOOL = new CreativeTabs("tool_tabs") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemsRegisters.fire_pickaxe);
        }
    };
    public static final CreativeTabs MATERIALS = new CreativeTabs("red_materials") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemsRegisters.red_ingot);
        }
    };
    public static final CreativeTabs COMBAT = new CreativeTabs("red_combat") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemsRegisters.fire_sword);
        }
    };
}
