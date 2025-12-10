package com.MLag.RedCraft.Blocks.EnergyBlocks;

import com.MLag.RedCraft.Blocks.BlockCreate;
import com.MLag.RedCraft.Tiles.EnergyConverterTile;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EnergyConverter extends BlockCreate {


    public EnergyConverter(String name, Material material, float setHardness, CreativeTabs creativeTabs, SoundType soundType) {
        super(name, material, setHardness, creativeTabs, soundType);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new EnergyConverterTile();
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return  true;
    }
}
