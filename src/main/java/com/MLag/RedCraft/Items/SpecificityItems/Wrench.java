package com.MLag.RedCraft.Items.SpecificityItems;


import com.MLag.RedCraft.CreativeTabsRegister;
import com.MLag.RedCraft.Items.ItemCreate;
import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.client.GUI.GUIMachineUpgrade;
import com.MLag.RedCraft.client.GUI.MachineUpgradeContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Wrench extends ItemCreate {

    public Wrench(String name, CreativeTabs creativeTabs) {
        super(name, creativeTabs);
        ItemsRegisters.Items_Arrays.add(this);
        this.setMaxStackSize(1);

    }


    Logger log = LogManager.getLogger();

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        log.info("SUCKERS");
        GUIMachineUpgrade guiMachineUpgrade = null;
        Minecraft.getMinecraft().displayGuiScreen(guiMachineUpgrade);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
