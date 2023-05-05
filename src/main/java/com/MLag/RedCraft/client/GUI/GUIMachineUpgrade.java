package com.MLag.RedCraft.client.GUI;

import com.MLag.RedCraft.Constants;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GUIMachineUpgrade extends GuiContainer {
    private static final ResourceLocation MACHINE_GUI = new ResourceLocation(Constants.MODIDS, Constants.RESOURCE_LOCATION_GUI_MACHINEBLOCK);
    IInventory playerInventory;
    IInventory MachineInventory;

    public GUIMachineUpgrade(InventoryPlayer inventoryPlayer, IInventory inventorySlotsIn) {
        super(new MachineUpgradeContainer(inventoryPlayer,inventorySlotsIn));
        this.playerInventory = inventorySlotsIn;

    }
//рисование экрана, updates
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(MACHINE_GUI);
        int i = this.guiLeft;
        int j = this.guiTop;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
    //    GuiInventory.drawEntityOnScreen(i + 55, j + 75, 30, (float)(i + 51) - this.oldMouseX, (float)(j + 75 - 50)
    }
}
