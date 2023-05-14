package com.MLag.RedCraft.client.GUI;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.awt.image.RescaleOp;

public class ChestGUI extends GuiContainer {
    IInventory playerInventory;
    IInventory MachineInventory;
    private static final ResourceLocation textures = new ResourceLocation("red_crafting", "textures/gui/container/chestgui.png");

    public ChestGUI(InventoryPlayer inventoryPlayer, IInventory inventorySlotsIn) {
        super(new ChestContainer(inventoryPlayer, inventorySlotsIn));
        this.playerInventory = inventoryPlayer;
    }

/*    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
        fontRenderer.drawString(I18n.format("container.inventory", new Object[0]), 8, ySize - 96 + 2,
                4210752);
    }*/

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(textures);

    }
}
