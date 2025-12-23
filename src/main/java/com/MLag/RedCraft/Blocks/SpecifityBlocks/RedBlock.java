package com.MLag.RedCraft.Blocks.SpecifityBlocks;

import com.MLag.RedCraft.Blocks.BlockCreate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.MLag.RedCraft.Blocks.Ores.RedOre.fireAttack;

public class RedBlock extends BlockCreate {
    public RedBlock(String name, Material material, float setHardness, CreativeTabs creativeTabs, SoundType soundType) {
        super(name, material, setHardness, creativeTabs, soundType);
    }


    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        fireAttack(entityIn);

    }

}
