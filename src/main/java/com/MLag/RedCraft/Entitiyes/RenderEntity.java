package com.MLag.RedCraft.Entitiyes;

import com.MLag.RedCraft.Entitiyes.Entity.BoyKisserMobMale;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderEntity extends RenderLiving<BoyKisserMobMale> {
    public RenderEntity(RenderManager renderManager) {
            super(renderManager, new ModelBiped(), 0.5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(BoyKisserMobMale boyKisserMob) {
        return null;
    }
}
