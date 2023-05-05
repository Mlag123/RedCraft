package com.MLag.RedCraft.Blocks.SpecifityBlocks;

import com.MLag.RedCraft.Blocks.BlockCreate;
import ibxm.Player;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NaturalBlock extends BlockCreate {
    public NaturalBlock(String name, Material material, float setHardness, CreativeTabs creativeTabs, SoundType soundType) {
        super(name, material, setHardness, creativeTabs, soundType);
    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        EntityPlayer player = (EntityPlayer)entityIn;
        player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,200/3,0));
    }
}
