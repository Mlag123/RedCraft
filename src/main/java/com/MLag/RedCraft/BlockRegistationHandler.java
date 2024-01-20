package com.MLag.RedCraft;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.MLag.RedCraft.client.GUI.GUITest.initTexrute;

public class BlockRegistationHandler {
    // public static Block BEST_STONE = new BlockBestStone("best_stone");
//регистрация блоков, и рендер(моделей к ним)
    public static void register() {


        for (int i = 0; i < BlocksRegisters.BLOCKS_ARRAY.size(); i++) {
            setRegister(BlocksRegisters.BLOCKS_ARRAY.get(i));
        }

    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        for (int i = 0; i < BlocksRegisters.BLOCKS_ARRAY.size(); i++) {
            setRender(BlocksRegisters.BLOCKS_ARRAY.get(i));
        }
    }

    private static void setRegister(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");


    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block) {

    }
}
