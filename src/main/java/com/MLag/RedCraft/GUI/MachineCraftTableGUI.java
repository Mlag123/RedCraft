package com.MLag.RedCraft.GUI;

import com.MLag.RedCraft.Containers.FireCraftingTableContainer;
import com.MLag.RedCraft.Main;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class MachineCraftTableGUI extends GuiContainer {


    private static final ResourceLocation BG_idle = new ResourceLocation("red_crafting:textures/gui/machine_craft_idle.png");

    private static final ResourceLocation BD_done = new ResourceLocation("red_crafting:textures/gui/machine_craft_done.png");

    private final FireCraftingTableContainer container;

    public MachineCraftTableGUI(Container inventorySlotsIn) {
        super(inventorySlotsIn);
        this.container = (FireCraftingTableContainer) inventorySlotsIn;
        xSize = 176;
        ySize = 166;

    }


    public void drawIdle(boolean idle) {
        if (idle) {
            mc.getTextureManager().bindTexture(BG_idle);
            drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        } else {
            mc.getTextureManager().bindTexture(BD_done);
            drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        }
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        boolean idle = container.isIdle();
        drawIdle(idle);
       // Main.log.info(idle);
    }
}
