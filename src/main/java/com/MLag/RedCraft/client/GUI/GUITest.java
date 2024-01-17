package com.MLag.RedCraft.client.GUI;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.MLag.RedCraft.Constants.MODIDS;

public class GUITest extends GuiScreen {
    private static ResourceLocation guitexrure;
    private final int guiHeight = 192;//192
    private final int guiWidth = 256;//256
    ResourceLocation text;

    @SideOnly(Side.CLIENT)
    public GUITest() {


        // guitexrure = new ResourceLocation("red_crafting:textures/GUI/machineblock.png");
        //src/main/resources/assets/
    }


    static Logger log = LogManager.getLogger();

    public static void initTexrute() {

        guitexrure = new ResourceLocation("red_crafting:textures/GUI/mc.png");
        String logs = "ResourcePathLog" + " " + guitexrure.getResourcePath();
        String logs1 = "ResourceDomainLog" + " " + guitexrure.getResourceDomain();


        log.info(logs);
        log.info(logs1);

    }

    @Override
    public void drawScreen(int w, int h, float partialTicks) {
        GL11.glColor4f(1.0f, 1.0f, 10.f, 1.0f);

        mc.getTextureManager().bindTexture(guitexrure);
        int offset = (width - guiWidth) / 2;
        drawTexturedModalRect(offset, 2, 0, 0, guiWidth, guiHeight);
        fontRenderer.drawString("loglogloglg", offset, 170, 0);

        super.drawScreen(w, h, partialTicks);
    }


    @Override
    public void updateScreen() {
        super.updateScreen();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
