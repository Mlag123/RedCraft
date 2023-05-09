package com.MLag.RedCraft.Blocks.Machines;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MachineUpgrade extends Block implements MachineCreated{


    public MachineUpgrade(String name,Material blockMaterialIn) {
        super(blockMaterialIn);
        this.setHardness(5f);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setSoundType(SoundType.METAL);
        this.setCreativeTab(CreativeTabsRegister.BLOCKS);
        BlocksRegisters.BLOCKS_ARRAY.add(this);
    }


    @Override
    public void updateTick() {

    }

    @Override
    public void onBlockActivated() {

    }
}
