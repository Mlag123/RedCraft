package com.MLag.RedCraft.Items.FireItems;

import com.MLag.RedCraft.Items.SwordBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import java.util.List;

public class FireSwordItem extends SwordBase {
    public FireSwordItem(String name, ToolMaterial material) {
        super(name, material);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

        double radius = 1.5f;

        target.setFire(3);
        List<EntityLivingBase> entityLivingBaseList = attacker.world.getEntitiesWithinAABB(
                EntityLivingBase.class,
                target.getEntityBoundingBox().grow(radius),
                e -> e != attacker
        );

        for (EntityLivingBase e: entityLivingBaseList){
            if (e ==target){
                continue;
            }
            e.setFire(3);
        }


      //  target.setFire(3);

        return super.hitEntity(stack, target, attacker);
    }

}
