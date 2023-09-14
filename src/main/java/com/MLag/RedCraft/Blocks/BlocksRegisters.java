package com.MLag.RedCraft.Blocks;

import com.MLag.RedCraft.Blocks.Machines.MachineUpgrade;
import com.MLag.RedCraft.Blocks.Machines.MachineUpgrader;
import com.MLag.RedCraft.Blocks.SpecifityBlocks.*;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.ArrayList;

public class BlocksRegisters {

    //массив<block>, там хранятся блоки, которые идут
    // в BlockRegistrationHandler (регистрируются)
    public static final ArrayList<Block> BLOCKS_ARRAY = new ArrayList<>();
    //блоки
    public static Block Red_ore = new RedOre("red_ore");
    public static Block Natural_ore = new NaturalOre("natural_ore");
    public static Block Red_block = new RedBlock("red_block", Material.IRON, 5f, CreativeTabsRegister.BLOCKS, SoundType.METAL);
    //  Block machine_upgrade = new MachineUpgrade("machine_upgrade","Machine Upgrader", Material.IRON); //
    public static Block Natural_Block = new NaturalBlock("natural_block", Material.IRON, 5f, CreativeTabsRegister.BLOCKS, SoundType.METAL);
    public static Block Machine_Upgrade = new MachineUpgrader("machine_upgrade",Material.IRON,7f,CreativeTabsRegister.BLOCKS,SoundType.METAL);
    public static Block stonned_plantes = new BlockCreate("stone_plantes", Material.PLANTS, 0f, CreativeTabsRegister.BLOCKS, SoundType.PLANT);
    public static final Block Red_Chest = new RedChest("red_chest", Material.IRON, 5f, CreativeTabsRegister.BLOCKS, SoundType.METAL);
    public static final Block FossilizedRemainsOre = new FossilizedRemainsOre("fossilized_remain_ore");
    //public static Block super_chest = new SuperChest("super_chest", BlockChest.Type.BASIC);

    public BlocksRegisters() {

    }
}
