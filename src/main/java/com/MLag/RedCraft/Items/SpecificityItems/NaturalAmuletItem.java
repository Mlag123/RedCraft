package com.MLag.RedCraft.Items.SpecificityItems;

import com.MLag.RedCraft.Items.ItemBase;
import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.creativetab.CreativeTabs;

public class NaturalAmuletItem extends ItemBase {
    public NaturalAmuletItem(String name, CreativeTabs creativeTabs) {
        super(name, creativeTabs);
        this.setMaxStackSize(1);
        ItemsRegisters.Items_Arrays.add(this);

    }

}
