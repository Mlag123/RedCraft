package com.MLag.RedCraft.Entitiyes;

import com.MLag.RedCraft.Entitiyes.Entity.BoyKisserMobMale;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.common.registry.EntityEntry;

public class Factory implements IRenderFactory<BoyKisserMobMale> {
    @Override
    public Render<? super BoyKisserMobMale> createRenderFor(RenderManager manager) {


        return new RenderBoyKisserMale(manager);
    }
}
