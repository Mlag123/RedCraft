package com.MLag.RedCraft.Items;

import com.MLag.RedCraft.utils.CreativeTabsRegister;
import com.MLag.RedCraft.IHasModel;
import com.MLag.RedCraft.Main;
import net.minecraft.item.ItemSword;

public class ItemCreateSword extends ItemSword implements IHasModel {
    public ItemCreateSword(String name, ToolMaterial material) {
        super(material);
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
