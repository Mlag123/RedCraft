package com.MLag.RedCraft.Entitiyes;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Mod.EventBusSubscriber(modid = "red_crafting")
public class RegisterHandler {
    @SideOnly(Side.CLIENT)
    public void initModels(){
  //      RenderingRegistry.registerEntityRenderingHandler(BoyKisserMob.class,RenderEntity.FACTORY);
    }
    //public static EntryEntity BoyKisserEntity = EntityEntryBuilder{};

}
