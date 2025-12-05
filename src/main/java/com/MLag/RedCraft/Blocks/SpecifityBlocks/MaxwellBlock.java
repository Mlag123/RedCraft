package com.MLag.RedCraft.Blocks.SpecifityBlocks;
import com.MLag.RedCraft.Blocks.CatBlockBase;
import com.MLag.RedCraft.Items.SpecificityItems.CleanerCatItem;
import com.MLag.RedCraft.Main;
import com.MLag.RedCraft.utils.Sound;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;


public class MaxwellBlock extends CatBlockBase {
    public MaxwellBlock(String name, Material material, float setHardness, CreativeTabs creativeTabs, SoundType soundType) {
        super(name, material, setHardness, creativeTabs, soundType);


    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {


        ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);
        if (item.getItem()instanceof CleanerCatItem){

            float pitch_sound = 0.6f + (float)Math.random() * (1.0f - 0.6f);

            Main.log.info("Cat pitch "+ pitch_sound);
            worldIn.playSound(playerIn,pos,Sound.MAXWELL_MEOW,SoundCategory.PLAYERS,1.0f,pitch_sound);

        } else {
            worldIn.playSound(playerIn,pos,Sound.MAXWELL_SOUND,SoundCategory.PLAYERS,1.0f,1.0f);

        }


        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }


}
