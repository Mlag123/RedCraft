package com.MLag.RedCraft.Blocks;

import com.MLag.RedCraft.utils.CreativeTabsRegister;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockCreateOre extends BlockOre {
    private boolean EntityPlayerDamageFire = false;
    private int setLightingLevel = 0;

    //шаблок создания рудного блога
/*    public BlockCreateOre(String name, boolean EntityPlayerDamageFire) {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(3);
        this.setLightOpacity(setLightingLevel);
        this.setCreativeTab(CreativeTabsRegister.BLOCKS);
        BlocksRegisters.BLOCKS_ARRAY.add(this);

    }*/

    public BlockCreateOre(String name) {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
/*        this.setHardness(3);
        *//*this.setLightLevel(setLightingLevel);*//*
        this.setLightOpacity(setLightingLevel);*/
        this.setCreativeTab(CreativeTabsRegister.BLOCKS);
        BlocksRegisters.BLOCKS_ARRAY.add(this);

    }
/*
    public BlockCreateOre(String name, boolean EntityPlayerDamageFire, int setLightingLevel) {
        super();
        this.setLightingLevel = setLightingLevel;
        this.EntityPlayerDamageFire = EntityPlayerDamageFire;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(3);
     //   int randLevelOpacity = (int) (Math.random() * 6 % 3); // FIXME: 29.04.2023 оптимизировать, иначе жрёт как собака проц
        this.setLightOpacity(setLightingLevel);
        this.setCreativeTab(CreativeTabsRegister.BLOCKS);
        BlocksRegisters.BLOCKS_ARRAY.add(this);

    }*/


    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        // return super.getItemDropped(state, rand, fortune);
        return Item.getItemFromBlock(this);
    }



  /*  public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (EntityPlayerDamageFire == true) {
            if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) entityIn)) {
                entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
            }
            super.onEntityWalk(worldIn, pos, entityIn);
        }
    }*/

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {


    }

/*    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    */}

