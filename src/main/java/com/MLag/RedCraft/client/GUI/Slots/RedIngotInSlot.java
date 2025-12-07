package com.MLag.RedCraft.client.GUI.Slots;

import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class RedIngotInSlot extends Slot {
    public RedIngotInSlot(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }


    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        if (!(stack.getItem() == ItemsRegisters.red_ingot)){
            return false;
        }
        return true;
    }
}
