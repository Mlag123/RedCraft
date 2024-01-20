package com.MLag.RedCraft.Entitiyes;

import com.MLag.RedCraft.Entitiyes.Entity.BoyKisserMob;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderEntity extends RenderLiving<BoyKisserMob> {
    public RenderEntity(RenderManager renderManager) {
            super(renderManager, new ModelBiped(), 0.5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(BoyKisserMob boyKisserMob) {
        return null;
    }
}
