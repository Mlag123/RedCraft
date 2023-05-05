package com.MLag.RedCraft.client.GUI;

import com.MLag.RedCraft.client.GUI.Slots.SlotEnergyInput;
import com.MLag.RedCraft.client.GUI.Slots.SlotOutputItems;
import com.MLag.RedCraft.client.GUI.Slots.SlotToolsInput;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class MachineUpgradeContainer extends Container {
    private static IInventory tilemachineupgrade;

    public MachineUpgradeContainer(InventoryPlayer playerInventory, IInventory MachineUpgrade) {
        this.tilemachineupgrade = MachineUpgrade;
        this.addSlotToContainer(new SlotEnergyInput(MachineUpgrade, 0, 55, 60));//создание слота, и его положение
        //Класс создается от родителя Slot.
        this.addSlotToContainer(new SlotToolsInput(MachineUpgrade, 0, 65, 70));
        this.addSlotToContainer(new SlotOutputItems(MachineUpgrade, 0, 75, 80));


//инвентарь игрока
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k) {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
        }
    }


    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return false;
    }


}
