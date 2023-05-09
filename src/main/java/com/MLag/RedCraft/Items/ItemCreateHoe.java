package com.MLag.RedCraft.Items;

import com.MLag.RedCraft.utils.CreativeTabsRegister;
import net.minecraft.item.ItemHoe;

public class ItemCreateHoe extends ItemHoe {
    public ItemCreateHoe(String name, ToolMaterial redMaterial) {
        super(redMaterial);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabsRegister.TOOL);
        ItemsRegisters.Items_Arrays.add(this); //add item in Arrays

    }
}
