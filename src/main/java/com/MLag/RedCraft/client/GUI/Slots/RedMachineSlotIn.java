package com.MLag.RedCraft.client.GUI.Slots;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RedMachineSlotIn extends Slot {
    public RedMachineSlotIn(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        if ((stack.getItem() == Items.DIAMOND_AXE)){
            return true;
        } else if (stack.getItem() == Items.DIAMOND_SWORD) {
            return true;
        }else if (stack.getItem() == Items.DIAMOND_PICKAXE){
            return true;
        }else if(stack.getItem()==Items.DIAMOND_HOE){
            return true;
        }else if (stack.getItem()==Items.DIAMOND_SHOVEL){
            return true;
        }
        return false;

    }
}
