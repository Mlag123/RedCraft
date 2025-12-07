package com.MLag.RedCraft.Blocks.SpecifityBlocks;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.Blocks.CatBlockBase;
import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.Items.SpecificityItems.CleanerCatItem;
import com.MLag.RedCraft.Main;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import com.MLag.RedCraft.utils.Sound;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;


public class MaxwellBlock extends BlockFalling {
    public PropertyDirection FACING = BlockHorizontal.FACING;

    public MaxwellBlock(String name, Material material, float setHardness, CreativeTabs creativeTabs, SoundType soundType) {
        //super(name, material, setHardness, creativeTabs, soundType);
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(3f);
        this.setCreativeTab(CreativeTabsRegister.BLOCKS);
        this.setResistance(10f);
        BlocksRegisters.BLOCKS_ARRAY.add(this);

    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer, hand).withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{BlockHorizontal.FACING});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(BlockHorizontal.FACING, EnumFacing.getHorizontal(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(BlockHorizontal.FACING).getHorizontalIndex() & 1;
    }

    @Override
    public void onEndFalling(World world, BlockPos pos, IBlockState fallingState, IBlockState hitState) {

        float pitch_sound = 1.2f + (float) Math.random() * (1.5f - 1.2f);

        world.playSound(
                null,
                pos,
                SoundEvents.BLOCK_ANVIL_LAND,
                SoundCategory.BLOCKS,
                1.0F,
                pitch_sound
        );

        world.playSound(
                null,
                pos,
                Sound.MAXWELL_MEOW,
                SoundCategory.BLOCKS,
                1.0F,
                pitch_sound
        );

    }



    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

//check world.remote
        ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);


        if (item.getItem() == Items.FISH) {
            if (!playerIn.capabilities.isCreativeMode) {

                playerIn.sendMessage(new TextComponentString("Maxwell: mrrmeow!"));

                item.shrink(1);


            }

        } else {

            if (item.getItem() instanceof CleanerCatItem) {

                float pitch_sound = 0.6f + (float) Math.random() * (1.0f - 0.6f);

                Main.log.info("Cat pitch " + pitch_sound);
                worldIn.playSound(playerIn, pos, Sound.MAXWELL_MEOW, SoundCategory.PLAYERS, 1.0f, pitch_sound);

            } else {
                worldIn.playSound(playerIn, pos, Sound.MAXWELL_SOUND, SoundCategory.PLAYERS, 1.0f, 1.0f);

            }
        }


        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }


}
