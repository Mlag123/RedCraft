package com.MLag.RedCraft.client.GUI.Slots;

import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.Items.SpecificityItems.FirePickaxeItem;
import com.MLag.RedCraft.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OutputRedMachineSlot extends Slot {


    public OutputRedMachineSlot(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    @Override
    public int getSlotStackLimit() {
        return 64;
    }

    @Override
    public boolean canTakeStack(EntityPlayer playerIn) {
        return  true;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
