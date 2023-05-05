package com.MLag.RedCraft.Armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemArmor extends net.minecraft.item.ItemArmor {
    public ItemArmor(String RegName, String UnlName,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setUnlocalizedName(UnlName);
        this.setRegistryName(RegName);
    }
}
