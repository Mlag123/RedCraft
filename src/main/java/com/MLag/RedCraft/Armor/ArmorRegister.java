package com.MLag.RedCraft.Armor;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorRegister {

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial("red_crafting:red_armor", "red_crafting:red_armor", 15, new int[]{2, 6, 5, 3}, 7, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);

    // FIXME: 26.04.2023 разобратся с регистрацией брони, и её созданием ItemArmor;

    public void register(){
        // head = new com.MLag.RedCraft.Armor.ItemArmor("head",ARMOR_MATERIAL,1, EntityEquipmentSlot.HEAD);
    }

}
