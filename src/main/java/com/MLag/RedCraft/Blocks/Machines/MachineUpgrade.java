package com.MLag.RedCraft.Blocks.Machines;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.client.GUI.GUITest;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MachineUpgrade extends Block implements MachineCreated {


    public MachineUpgrade(String name, Material blockMaterialIn) {
        super(blockMaterialIn);
        this.setHardness(5f);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setSoundType(SoundType.METAL);
        this.setCreativeTab(CreativeTabsRegister.BLOCKS);
        BlocksRegisters.BLOCKS_ARRAY.add(this);
    }


    @Override
    public void updateTick() {

    }

    Logger log = LogManager.getLogger();

    public void RightClickBlock() {

    }

    @Override
    public boolean onBlockActivated(World p_180639_1_, BlockPos p_180639_2_, IBlockState p_180639_3_, EntityPlayer p_180639_4_, EnumHand p_180639_5_, EnumFacing p_180639_6_, float p_180639_7_, float p_180639_8_, float p_180639_9_) {
        log.info("Clicked");
        try {
            FMLCommonHandler.instance().showGuiScreen(new GUITest());
        } catch (Exception e) {
            log.info(e);

            e.printStackTrace();
        }

        return super.onBlockActivated(p_180639_1_, p_180639_2_, p_180639_3_, p_180639_4_, p_180639_5_, p_180639_6_, p_180639_7_, p_180639_8_, p_180639_9_);
    }

}
