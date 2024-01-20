package com.MLag.RedCraft.Entitiyes.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;

public class BoyKisserMob extends EntityMob {

    public BoyKisserMob(World world) {
        super(world);
        setSize(0.6f,1.98f);

    }
    public BoyKisserMob(World world,double x,double y, double z){
        super(world);
        setSize(0.6f,1.98f);
        setPositionAndUpdate(x,y,z);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0d);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5d);
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1d);
        getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0d);
        getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).setBaseValue(2.0d);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        tasks.addTask(0,new EntityAIWander(this,1.0d));
        tasks.addTask(0,new EntityAILookIdle(this));
    }
}
