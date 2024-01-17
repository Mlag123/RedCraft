package com.MLag.RedCraft;

import net.minecraft.util.ResourceLocation;

import java.io.File;

public class ReadingTexture {
    private String path;
    private ResourceLocation resourceLocation;

    private File file;
    private File FileExiest;
   ResourceLocation guitexrure = new ResourceLocation("red_crafting/textures/gui/machineblock.png");

    String fileNonPathToTexture = "test123RSRSR";



    public ReadingTexture(){
        file = new File(guitexrure.getResourcePath());
        if(!file.isDirectory()){
            file.mkdirs();
        }
    }


}
