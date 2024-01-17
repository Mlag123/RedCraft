package com.MLag.RedCraft.Blocks.Machines;

import com.MLag.RedCraft.Blocks.BlockCreate;
import com.MLag.RedCraft.client.GUI.GUITest;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.MLag.RedCraft.Main.GUITexture;

public class MachineUpgrader extends BlockCreate {

    public MachineUpgrader(String name, Material material, float setHardness, CreativeTabs creativeTabs, SoundType soundType) {
        super(name, material, setHardness, creativeTabs, soundType);
    }
    Logger log = LogManager.getLogger();
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        log.info("Clicked");
        FMLCommonHandler.instance().showGuiScreen(new GUITest());

        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }
}
