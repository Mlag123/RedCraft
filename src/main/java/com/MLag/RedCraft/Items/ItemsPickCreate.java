package com.MLag.RedCraft.Items;

import com.MLag.RedCraft.utils.CreativeTabsRegister;
import com.MLag.RedCraft.IHasModel;
import com.MLag.RedCraft.Main;
import net.minecraft.item.ItemPickaxe;

public class ItemsPickCreate extends ItemPickaxe implements IHasModel {
    public ItemsPickCreate(String name, ToolMaterial material) {
        super(material);
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
