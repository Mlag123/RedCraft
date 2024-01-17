package com.MLag.RedCraft.Blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

//шаблок создание простого блока
public class BlockCreate extends Block {

    private boolean EntityPlayerDamageFire = false;

    public BlockCreate(String name, Material material, float setHardness, CreativeTabs creativeTabs, SoundType soundType) {
        super(material);
        this.setHardness(setHardness);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(creativeTabs);
        this.setSoundType(soundType);
        BlocksRegisters.BLOCKS_ARRAY.add(this);
    }


    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        // return super.getItemDropped(state, rand, fortune);
        return Item.getItemFromBlock(this);
    }
}