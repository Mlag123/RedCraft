package com.MLag.RedCraft.Items.SpecificityItems;

import com.MLag.RedCraft.Items.ItemCreate;
import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.client.GUI.GUITest;
import ibxm.Player;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.logging.Logger;

public class CapsuleItem extends ItemCreate {
    public CapsuleItem(String name, CreativeTabs creativeTabs) {

        super(name, creativeTabs);
        ItemsRegisters.Items_Arrays.add(this);
    }

    Logger log;
@SideOnly(Side.CLIENT) // FIXME: 21.01.2024 
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        float player_health = playerIn.getHealth();
    if(!playerIn.capabilities.isCreativeMode){
        if(player_health>11){
            playerIn.sendMessage(new TextComponentString("Ooowh! I am cumming, BoyKisser, i love you!"));
            if (!playerIn.isImmuneToFire() && playerIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) playerIn)) {
                playerIn.attackEntityFrom(DamageSource.OUT_OF_WORLD,10);
             playerIn.inventory.clearMatchingItems(new ItemStack(ItemsRegisters.capsuleItem).getItem(),0,1, null);
                playerIn.addItemStackToInventory(new ItemStack(ItemsRegisters.semenInCapsule));
                playerIn.addPotionEffect(new PotionEffect(MobEffects.NAUSEA,500));

            }
        }else {
            playerIn.sendMessage(new TextComponentString("I can't cumming, i have a low health"));
        }
    }else{
        playerIn.sendMessage(new TextComponentString("You're being creative, you little pervert."));
    }
//        log.info("Semen Click, player health " + player_health);
        return super.onItemRightClick(worldIn, playerIn, handIn);

    }

//    @Override
//    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
//        float player_health = playerIn.getHealth();
//        log.info("Semen Click, player health "+player_health);
//        FMLCommonHandler.instance().showGuiScreen(new GUITest());
//       playerIn.inventory.addItemStackToInventory(new ItemStack(ItemsRegisters.semenInCapsule));
//        if(player_health>1){
//
//
//        }else {
//            //у вас мало хп
//        }
//        return super.onItemRightClick(worldIn, playerIn, handIn);
//    }
}
