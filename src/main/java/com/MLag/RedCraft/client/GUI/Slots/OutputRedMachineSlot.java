package com.MLag.RedCraft.client.GUI.Slots;

import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.Items.SpecificityItems.FirePickaxeItem;
import com.MLag.RedCraft.Main;
import com.MLag.RedCraft.Tiles.FiteTileCraftingTableBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OutputRedMachineSlot extends Slot {


    private FiteTileCraftingTableBlock te;


    public OutputRedMachineSlot(FiteTileCraftingTableBlock te, int index, int xPosition, int yPosition) {
        super(te, index, xPosition, yPosition);
        this.te =te;
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


    @Override
    public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
        te.doCraft();
        return super.onTake(thePlayer, stack);

    }
}
