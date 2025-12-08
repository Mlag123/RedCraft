package com.MLag.RedCraft.Tiles;

import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;

public class FiteTileCraftingTableBlock extends TileEntity implements IInventory, ITickable {

    private NonNullList<ItemStack> items = NonNullList.withSize(4, ItemStack.EMPTY);

    // ----- BASIC INVENTORY -----


    private boolean idle_gui = true;


    public boolean getIdle() {
        return idle_gui;
    }


    public void updateCraftPreview() {
        ItemStack in_tool = items.get(0);
        ItemStack in_redIngot = items.get(1);
        ItemStack in_redstone = items.get(2);
        ItemStack out = items.get(3);

        idle_gui = true;
        // Если выходной слот уже занят — не трогаем

        // Проверяем вход
        if (in_tool.isEmpty() || in_redstone.isEmpty() || in_redIngot.isEmpty()) {
            items.set(3, ItemStack.EMPTY);
            return;
        }

        // Проверка рецептов
        if (in_tool.getItem() == Items.DIAMOND_PICKAXE
                && in_redIngot.getItem() == ItemsRegisters.red_ingot
                && in_redstone.getItem() == Items.BLAZE_POWDER) {
            idle_gui = false;
            items.set(3, new ItemStack(ItemsRegisters.Red_Pickaxe));

        } else if (in_tool.getItem() == Items.DIAMOND_SHOVEL
                && in_redIngot.getItem() == ItemsRegisters.red_ingot
                && in_redstone.getItem() == Items.BLAZE_POWDER) {
            idle_gui = false;

            items.set(3, new ItemStack(ItemsRegisters.red_spade));

        } else if (in_tool.getItem() == Items.DIAMOND_SWORD
                && in_redIngot.getItem() == ItemsRegisters.red_ingot
                && in_redstone.getItem() == Items.BLAZE_POWDER) {
            idle_gui = false;

            items.set(3, new ItemStack(ItemsRegisters.red_Sword));
        } else if (in_tool.getItem() == Items.DIAMOND_AXE
                && in_redIngot.getItem() == ItemsRegisters.red_ingot
                && in_redstone.getItem() == Items.BLAZE_POWDER) {
            idle_gui = false;

            items.set(3, new ItemStack(ItemsRegisters.Red_Axe));
        } else if (in_tool.getItem() == Items.DIAMOND_HOE
                && in_redIngot.getItem() == ItemsRegisters.red_ingot
                && in_redstone.getItem() == Items.BLAZE_POWDER) {
            idle_gui = false;

            items.set(3, new ItemStack(ItemsRegisters.red_hoe));
        }


        // и т.д.
        markDirty();

      //  idle_gui = true;
    }

    public void doCraft() {
        ItemStack in_tool = items.get(0);
        ItemStack in_redIngot = items.get(1);
        ItemStack in_redstone = items.get(2);
        ItemStack out = items.get(3);

        //   if (out.isEmpty()) return;

        //      if (in_tool.isEmpty() || in_redstone.isEmpty() || in_redIngot.isEmpty()) return;

        in_tool.shrink(1);
        in_redstone.shrink(1);
        in_redIngot.shrink(1);
        markDirty();


    }

    @Override
    public int getSizeInventory() {
        return items.size();
    }


    @Override
    public boolean isEmpty() {
        for (ItemStack stack : items)
            if (!stack.isEmpty()) return false;
        return true;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return items.get(index);
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack stack = ItemStackHelper.getAndSplit(items, index, count);
        if (!stack.isEmpty()) markDirty();
        return stack;
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStackHelper.getAndRemove(items, index);
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        items.set(index, stack);

        if (stack.getCount() > getInventoryStackLimit()) {
            stack.setCount(getInventoryStackLimit());
        }

        if (index != 3) {
            updateCraftPreview();
        }

        markDirty();


 /*       items.set(index, stack);
        if (stack.getCount() > getInventoryStackLimit())
            stack.setCount(getInventoryStackLimit());
        markDirty();*/
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return world.getTileEntity(pos) == this &&
                player.getDistanceSq(pos) <= 64;
    }

    @Override
    public void openInventory(EntityPlayer player) {
    }


    @Override
    public void closeInventory(EntityPlayer player) {
        if (!world.isRemote) {
            for (int i = 0; i < items.size(); i++) {
                ItemStack stack = items.get(i);

                if (!stack.isEmpty()) {
                    // выбрасываем в мир
                    player.dropItem(stack, false);

                    // очищаем слот
                    items.set(i, ItemStack.EMPTY);
                }
            }

            markDirty();
        }

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {
    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {
        items.clear();
    }

    @Override
    public String getName() {
        return "container.test_block";
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }


    // ----- NBT SAVE / LOAD -----

/*    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        ItemStackHelper.saveAllItems(compound, items);

        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);

        items = NonNullList.withSize(4, ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(compound, items);
    }*/

    @Override
    public void update() {
        if (!world.isRemote) {
            // doCraft();

        }
    }
}
