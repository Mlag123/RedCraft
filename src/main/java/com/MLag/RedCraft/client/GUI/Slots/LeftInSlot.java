package com.MLag.RedCraft.client.GUI.Slots;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class LeftInSlot extends Slot {
    public LeftInSlot(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        if (!(stack.getItem() == Items.BLAZE_POWDER)){
            return false;
        }
        return true;
    }
}
