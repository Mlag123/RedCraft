package com.MLag.RedCraft.Armor;

import com.MLag.RedCraft.IHasModel;
import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.Main;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemArmor extends net.minecraft.item.ItemArmor implements IHasModel {

    //броня, что логично по названию классов
    public ItemArmor(String name,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabsRegister.COMBAT);
        ItemsRegisters.Items_Arrays.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
