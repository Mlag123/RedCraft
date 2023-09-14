package com.MLag.RedCraft.client.GUI;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

public class GUITest extends GuiScreen {
    @SideOnly(Side.CLIENT)
    private static ResourceLocation guitexrure;
    private final int guiHeight = 192;//192
    private final int guiWidth = 256;//256


    public static void initTexrute() {
//        guitexrure = new ResourceLocation("red_crafting/textures/gui/machineblock.png");
    }

    public GUITest() {
        guitexrure = new ResourceLocation("red_crafting/textures/gui/machine_upgrade.png");

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
