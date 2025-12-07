package com.MLag.RedCraft.GUI;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class TestCustomGUI extends GuiContainer {


    private static final ResourceLocation BG = new ResourceLocation("red_crafting:textures/gui/custom_craft.png");


    public TestCustomGUI(Container inventorySlotsIn) {
        super(inventorySlotsIn);
        xSize = 176;
        ySize = 166;

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(BG);
        drawTexturedModalRect(guiLeft,guiTop,0,0,xSize,ySize);
    }
}
