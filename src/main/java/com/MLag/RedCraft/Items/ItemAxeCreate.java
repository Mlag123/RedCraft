package com.MLag.RedCraft.Items;

import com.MLag.RedCraft.CreativeTabsRegister;
import com.MLag.RedCraft.IHasModel;
import com.MLag.RedCraft.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemAxeCreate extends ItemAxe  implements IHasModel {
    protected ItemAxeCreate(String name, ToolMaterial material,float speed,float damage) {
        super(material,damage,speed);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabsRegister.TOOL);
        ItemsRegisters.Items_Arrays.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
