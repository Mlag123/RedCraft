package com.MLag.RedCraft.Entitiyes.Entity;

import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class BoyKisserMobMale extends EntityMob {

    public BoyKisserMobMale(World world) {
        super(world);
        setSize(0.6f, 1.98f);

    }

    public BoyKisserMobMale(World world, double x, double y, double z) {
        super(world);
        setSize(0.6f, 1.98f);
        setPositionAndUpdate(x, y, z);
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

    @SideOnly(Side.CLIENT)
    @Override
    protected void entityInit() {

        super.entityInit();
    }

    @Override
    protected void playHurtSound(DamageSource source) {
        super.playHurtSound(source);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        tasks.addTask(0, new EntityAIWander(this, 1.0d));
        tasks.addTask(0, new EntityAILookIdle(this));
    }
}
