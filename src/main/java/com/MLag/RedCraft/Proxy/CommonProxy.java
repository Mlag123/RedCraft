package com.MLag.RedCraft.Proxy;

import com.MLag.RedCraft.BlockRegistationHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
     BlockRegistationHandler BlockReg = new BlockRegistationHandler();
     public void registerItemRenderer(Item item, int meta, String id) {
          ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
     }
     public void preInit(FMLPreInitializationEvent event){

     }
     public void init(FMLInitializationEvent event){

     }
     public void postInit(FMLPostInitializationEvent event){

     }


}

