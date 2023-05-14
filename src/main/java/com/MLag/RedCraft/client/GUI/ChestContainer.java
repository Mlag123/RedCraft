package com.MLag.RedCraft.client.GUI;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class ChestContainer extends Container {

    private static IInventory tilemachineupgrade;

    public ChestContainer(InventoryPlayer player, IInventory testTile) {
        this.tilemachineupgrade = testTile;
        int i = 0;
        addSlotToContainer(new Slot(testTile, i++, 8, 38));
        //Второй слот инвентаря
        addSlotToContainer(new Slot(testTile, i++, 44, 21));

        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
        }
    }


    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return false;
    }
}
