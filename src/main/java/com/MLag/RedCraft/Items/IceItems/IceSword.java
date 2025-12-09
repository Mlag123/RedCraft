package com.MLag.RedCraft.Items.IceItems;

import com.MLag.RedCraft.Items.SwordBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

import java.util.List;

public class IceSword extends SwordBase {
    public IceSword(String name, ToolMaterial redMaterial) {
        super(name, redMaterial);
    }


    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

        target.extinguish();
        target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 0));
        if (!target.isEntityUndead()) {
            target.addPotionEffect(new PotionEffect(MobEffects.POISON, 150, 0));
        } else {
            target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 150, 0));
        }

        double radius = 1.5f;

        List<EntityLivingBase> entityLivingBaseList = attacker.world.getEntitiesWithinAABB(
                EntityLivingBase.class,
                target.getEntityBoundingBox().grow(radius),
                e -> e != attacker
        );

        for (EntityLivingBase e : entityLivingBaseList) {
            if (e == target) {
                continue;
            }


            e.extinguish();
            e.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 0));
            if (!e.isEntityUndead()) {
                e.addPotionEffect(new PotionEffect(MobEffects.POISON, 150, 0));
            } else {
                e.addPotionEffect(new PotionEffect(MobEffects.WITHER, 150, 0));
            }


        }


        return super.hitEntity(stack, target, attacker);


    }
}
