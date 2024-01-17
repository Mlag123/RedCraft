package com.MLag.RedCraft.Items.SpecificityItems;


import com.MLag.RedCraft.Items.ItemCreate;
import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.client.GUI.GUIMachineUpgrade;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
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
        if (!playerIn.isImmuneToFire() && playerIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) playerIn)) {
            playerIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
        }
        log.info("SUCKERS");

        GUIMachineUpgrade guiMachineUpgrade = null;
        Minecraft.getMinecraft().displayGuiScreen(guiMachineUpgrade);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
