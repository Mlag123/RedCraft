package com.MLag.RedCraft.Entitiyes;
import com.MLag.RedCraft.Entitiyes.Entity.BoyKisserMobMale;
import com.MLag.RedCraft.Entitiyes.Entity.ModelBoyKisserMale;
import com.MLag.RedCraft.utils.Handlers.TextureLoader;
import net.minecraft.client.model.ModelBiped;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityEntry;

import javax.annotation.Nullable;

public class RenderBoyKisserMale extends RenderLiving<BoyKisserMobMale> {

    ResourceLocation mobModel = TextureLoader.modelBoyKisserOBJ;


    public RenderBoyKisserMale(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelBoyKisserMale(), 0.5f);
    }

    public static Factory FACTORY = new Factory();

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(BoyKisserMobMale entity) {
        return mobModel;
    }

    @Override
    public float prepareScale(BoyKisserMobMale entitylivingbaseIn, float partialTicks) {
        GlStateManager.enableRescaleNormal();
        GlStateManager.rotate(180,0,(float)entitylivingbaseIn.posY,0);
        preRenderCallback(entitylivingbaseIn,partialTicks);
        return super.prepareScale(entitylivingbaseIn, partialTicks);
    }
    //    @Override
//    protected void applyRotations(BoyKisserMobMale entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
//        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
//    }
}

/*
package com.MLag.RedCraft.Entitiyes;
import com.MLag.RedCraft.Entitiyes.Entity.BoyKisserMobMale;
import com.MLag.RedCraft.utils.Handlers.TextureLoader;
import net.minecraft.client.model.ModelBiped;

import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityEntry;

import javax.annotation.Nullable;

public class RenderBoyKisserMale extends RenderLiving<BoyKisserMobMale> {

    ResourceLocation mobModel = TextureLoader.modelBoyKisserOBJ;


    public RenderBoyKisserMale(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelBiped(), 0.5f);
    }

    public static Factory FACTORY = new Factory();

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(BoyKisserMobMale entity) {
        return mobModel;
    }

    @Override
    protected void applyRotations(BoyKisserMobMale entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}


 */