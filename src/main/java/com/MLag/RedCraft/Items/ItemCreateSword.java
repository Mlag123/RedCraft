package com.MLag.RedCraft.Items;

import com.MLag.RedCraft.CreativeTabsRegister;
import com.MLag.RedCraft.IHasModel;
import com.MLag.RedCraft.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemCreateSword extends ItemSword implements IHasModel {
    public ItemCreateSword(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabsRegister.TOOL);
        ItemsRegisters.Items_Arrays.add(this);

    }
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
