package com.MLag.RedCraft.Items.SpecificityItems;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class CleanerCatItem extends ItemTool {


    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(BlocksRegisters.maxwell_block);

    public CleanerCatItem(String name, ToolMaterial materialIn) {
        super(0.0f, 1.2f, materialIn, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabsRegister.TOOL);
        ItemsRegisters.Items_Arrays.add(this);
    }
}
