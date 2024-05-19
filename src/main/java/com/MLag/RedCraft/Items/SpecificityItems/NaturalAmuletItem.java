package com.MLag.RedCraft.Items.SpecificityItems;

import com.MLag.RedCraft.Items.ItemCreate;
import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.items.ItemHandlerHelper;

public class NaturalAmuletItem extends ItemCreate {
    public NaturalAmuletItem(String name, CreativeTabs creativeTabs) {
        super(name, creativeTabs);
        this.setMaxStackSize(1);
        ItemsRegisters.Items_Arrays.add(this);

    }

}
