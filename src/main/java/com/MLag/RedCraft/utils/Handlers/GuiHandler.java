package com.MLag.RedCraft.utils.Handlers;

import com.MLag.RedCraft.client.GUI.ChestContainer;
import com.MLag.RedCraft.client.GUI.GUIMachineUpgrade;
import com.MLag.RedCraft.client.GUI.TileEntityStorageMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;


public class GuiHandler implements IGuiHandler {
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(new BlockPos(x,y,z));
        if(te!= null){
            if(ID==0){
                return new GUIMachineUpgrade((TileEntityStorageMachine)te, player);
            }
        }

        return null;
    }
}


/*     TileEntity tile = world.getTileEntity(new BlockPos(x, y, z));
        if(ID ==0&&tile instanceof TileEntity){ // FIXME: 15.05.2023

           // return new ChestContainer(player.inventory, tile);
        }
        */