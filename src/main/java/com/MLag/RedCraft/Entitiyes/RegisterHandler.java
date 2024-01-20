package com.MLag.RedCraft.Entitiyes;

import com.MLag.RedCraft.Entitiyes.Entity.BoyKisserMobMale;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class RegisterHandler {

    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(BoyKisserMobMale.class,RenderBoyKisserMale.FACTORY);
    }
}
