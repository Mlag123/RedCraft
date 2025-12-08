package com.MLag.RedCraft.GUI;

import com.MLag.RedCraft.Containers.FireCraftingTableContainer;
import com.MLag.RedCraft.Tiles.FiteTileCraftingTableBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GUIProxy implements IGuiHandler {
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID ==0){
            return new FireCraftingTableContainer(player.inventory,(FiteTileCraftingTableBlock) world.getTileEntity(new BlockPos(x,y,z)));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == 0){
            FireCraftingTableContainer container = new FireCraftingTableContainer(player.inventory,
                    (FiteTileCraftingTableBlock) world.getTileEntity(new BlockPos(x,y,z)));
            return new MachineCraftTableGUI(container); // Только один аргумент
        }
        return null;
    }
}
