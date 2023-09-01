package com.MLag.RedCraft.client.GUI;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

public class TileEntityStorageMachine extends TileEntity {

    public InventoryBasic basic;

    public TileEntityStorageMachine() {
        basic = new InventoryBasic("invEntityMachineGUI", false, 15);
    }

    public int getSizeInventory() {
        return basic.getSizeInventory();
    }

    public ItemStack GetStackInSlot(int slot) {
        return basic.getStackInSlot(slot);
    }

    public ItemStack dectStackSize(int slot, int amount) {
        if (basic.getStackInSlot(slot) != null) {
            ItemStack itemstack;

            if (basic.getStackInSlot(slot).getCount() == amount) {
                itemstack = basic.getStackInSlot(slot);
                itemstack = null;
                markDirty();
                return itemstack;
            } else {
                ItemStack stack = basic.getStackInSlot(slot);
                itemstack = basic.getStackInSlot(slot).splitStack(amount);
                if (basic.getStackInSlot(slot).getCount() == 0) stack = null;
                markDirty();
                return itemstack;
            }
        } else {
            return null;
        }
    }
    public ItemStack getStackInSlotOnClosing(int slot)
    {
        if (basic.getStackInSlot(slot) != null)
        {
            ItemStack itemstack = basic.getStackInSlot(slot);
            itemstack = null;
            return itemstack;
        } else {
            return null;
        }
    }

    public void setInventorySlotContents(int slot, ItemStack stack)
    {
        ItemStack itemstack = basic.getStackInSlot(slot);
        itemstack = stack;
        if (stack != null && stack.getCount() > getInventoryStackLimit())
        {
            stack.setCount(getInventoryStackLimit());
        }

        markDirty();
    }
    public int getInventoryStackLimit()
    {
        return 64;
    }
    public String getInventoryName()
    {
        return "container.storage";
    }

    public boolean hasCustomInventoryName()
    {
        return false;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        NBTTagList list = nbt.getTagList("Items", Constants.NBT.TAG_COMPOUND);

        for (int i = 0; i < list.tagCount(); ++i)
        {
            NBTTagCompound comp = list.getCompoundTagAt(i);
            int j = comp.getByte("Slot") & 255;

            if (j >= 0 && j < getSizeInventory())
            {
                this.basic.setInventorySlotContents(j, new ItemStack(comp));
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < getSizeInventory(); ++i)
        {
            if (basic.getStackInSlot(i) != null)
            {
                NBTTagCompound comp = new NBTTagCompound();
                comp.setByte("Slot", (byte) i);
                basic.getStackInSlot(i).writeToNBT(comp);
                list.appendTag(comp);
            }
        }

        nbt.setTag("Items", list);
        return nbt;
    }
    public boolean isUseableByPlayer(EntityPlayer player)
    {
        return world.getTileEntity(pos) != this ? false : player.getDistanceSq(pos) <= 64.0D;
    }


    public void openInventory() {}

    public void closeInventory() {}

    public boolean isItemValidForSlot(int slot, ItemStack stack)
    {
        return true;
    }
}
