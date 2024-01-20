package com.MLag.RedCraft.Items.SpecificityItems;

import com.MLag.RedCraft.Blocks.BlockCreate;
import com.MLag.RedCraft.Items.ItemCreate;
import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SemenItem extends ItemFood {


    public SemenItem(String name,CreativeTabs creativeTabs, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(creativeTabs);
        ItemsRegisters.Items_Arrays.add(this);

    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
      player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA,500));
        super.onFoodEaten(stack, worldIn, player);
    }
}
