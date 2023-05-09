package com.MLag.RedCraft.Armor;

import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemArmor extends net.minecraft.item.ItemArmor {
    public ItemArmor(String Name,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setUnlocalizedName(Name);
        this.setRegistryName(Name);
        this.setCreativeTab(CreativeTabsRegister.COMBAT);
        ItemsRegisters.Items_Arrays.add(this);
    }
}
