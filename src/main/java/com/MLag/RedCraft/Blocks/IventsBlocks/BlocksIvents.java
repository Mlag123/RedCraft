package com.MLag.RedCraft.Blocks.IventsBlocks;

import jdk.nashorn.internal.ir.Block;
import jdk.nashorn.internal.ir.Statement;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.IInventory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;

public class BlocksIvents{
    String EntityEvents;
    // FIXME: 03.05.2023

    public BlocksIvents(String EntityEvents) {

        this.EntityEvents = EntityEvents;
        switch (EntityEvents) {
            case "DamageOnFire":
                break;
            case "Regeniration":
                break;
            case "MomentalRegeniration":
                break;
        }
    }





    /*    if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) entityIn)) {
            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
        }*/


    private enum EventsBlock {
        EntityPlayerDamageOnFire,
        EntityPlayerRegenirtion,
        EntityPlayerInstntlyRegenertion,

    }


}

 /*   public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (EntityPlayerDamageFire == true) {
            if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) entityIn)) {
                entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
            }
            super.onEntityWalk(worldIn, pos, entityIn);
        }
    }*/