package com.MLag.RedCraft.Containers;

import com.MLag.RedCraft.Tiles.FiteTileCraftingTableBlock;
import com.MLag.RedCraft.client.GUI.Slots.OutputRedMachineSlot;
import com.MLag.RedCraft.client.GUI.Slots.RedIngotInSlot;
import com.MLag.RedCraft.client.GUI.Slots.RedMachineSlotIn;
import com.MLag.RedCraft.client.GUI.Slots.LeftInSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class FireCraftingTableContainer extends Container {

    private final FiteTileCraftingTableBlock te;

    private int cook,totalTime;

    public FireCraftingTableContainer(InventoryPlayer playerInv, FiteTileCraftingTableBlock te) {
        // Слоты 3×3
        this.te = te;
       this.addSlotToContainer(new RedMachineSlotIn(te,0,47,9));
       this.addSlotToContainer(new RedIngotInSlot(te,1,47,47));
       this.addSlotToContainer(new LeftInSlot(te,2,8,28));
       this.addSlotToContainer(new OutputRedMachineSlot(te,3,92,28));

        // Слоты игрока
        int leftCol = 8;
        for (int y = 0; y < 3; y++)
            for (int x = 0; x < 9; x++)
                this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, leftCol + x * 18, 84 + y * 18));

        for (int x = 0; x < 9; x++)
            this.addSlotToContainer(new Slot(playerInv, x, leftCol + x * 18, 142));
    }


    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    @Override
    public void onContainerClosed(EntityPlayer playerIn) {
        super.onContainerClosed(playerIn);
        if (!playerIn.world.isRemote) {
            for (int i = 0; i < te.getSizeInventory(); i++) {
                ItemStack stack = te.getStackInSlot(i);

                if (!stack.isEmpty()) {
                    playerIn.dropItem(stack, false);
                    te.setInventorySlotContents(i, ItemStack.EMPTY);
                }
            }
            te.markDirty();
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack stack = slot.getStack();
            itemstack = stack.copy();

            // Если клик по слотам TileEntity
            if (index < te.getSizeInventory()) {
                if (!this.mergeItemStack(stack, te.getSizeInventory(),
                        this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                if (!this.mergeItemStack(stack, 0, te.getSizeInventory(), false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (stack.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;    }
}
