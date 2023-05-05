package com.MLag.RedCraft.Items;

import com.MLag.RedCraft.IHasModel;
import com.MLag.RedCraft.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCreate extends Item implements IHasModel {
    public ItemCreate(String name, CreativeTabs creativeTabs) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(creativeTabs);
        ItemsRegisters.Items_Arrays.add(this);

    }

    public ItemCreate(String RegName, String UnlName) {
        this.setUnlocalizedName(UnlName);
        this.setRegistryName(RegName);//


    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
