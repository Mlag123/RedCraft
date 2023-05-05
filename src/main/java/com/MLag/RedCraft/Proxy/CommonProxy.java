package com.MLag.RedCraft.Proxy;

import com.MLag.RedCraft.BlockRegistationHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
     BlockRegistationHandler BlockReg = new BlockRegistationHandler();

    public void registerItemRenderer(Item item, int meta, String id) {

    };

}

