package com.MLag.RedCraft.GUI;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class MachineCraftTableGUI extends GuiContainer {


    private static final ResourceLocation BG_idle = new ResourceLocation("red_crafting:textures/gui/machine_craft_idle.png");

    private static final ResourceLocation BD_done = new ResourceLocation("red_crafting:textures/gui/machine_craft_done.png");


    public MachineCraftTableGUI(Container inventorySlotsIn) {
        super(inventorySlotsIn);
        xSize = 176;
        ySize = 166;

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(BG_idle);
        drawTexturedModalRect(guiLeft,guiTop,0,0,xSize,ySize);
    }
}
