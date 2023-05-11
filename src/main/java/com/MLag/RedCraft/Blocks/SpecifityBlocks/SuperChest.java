package com.MLag.RedCraft.Blocks.SpecifityBlocks;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import net.minecraft.block.BlockChest;

public class SuperChest extends BlockChest {
    public SuperChest(String name, Type chestTypeIn) {
        super(chestTypeIn);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        BlocksRegisters.BLOCKS_ARRAY.add(this);
    }
}
