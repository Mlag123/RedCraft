package com.MLag.RedCraft.Tiles;

import net.minecraft.tileentity.TileEntity;

public class CreateTile  extends TileEntity {


    private String name;

    public CreateTile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
