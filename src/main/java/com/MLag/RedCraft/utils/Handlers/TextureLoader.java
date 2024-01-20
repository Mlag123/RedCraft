package com.MLag.RedCraft.utils.Handlers;

import net.minecraft.util.ResourceLocation;

import static com.MLag.RedCraft.Constants.MODIDS;

public class TextureLoader {

    public static ResourceLocation MachineTextureGui;
    public static ResourceLocation modelBoyKisserOBJ;
    public TextureLoader(){
        MachineTextureGui = new ResourceLocation(MODIDS+":textures/interfaces/machineblockgui.png");
        modelBoyKisserOBJ = new ResourceLocation(MODIDS+":");
    }
}
