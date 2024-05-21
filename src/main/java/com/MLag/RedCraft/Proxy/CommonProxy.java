package com.MLag.RedCraft.Proxy;

import com.MLag.RedCraft.BlockRegistationHandler;
import com.MLag.RedCraft.utils.Sound;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.swing.*;

public class CommonProxy {

    //серверая сторона
    BlockRegistationHandler BlockReg = new BlockRegistationHandler();

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));

    }

    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Sound());

  /*      new Thread(new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "new Thread");
            }
        }).start();*/
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }


}

