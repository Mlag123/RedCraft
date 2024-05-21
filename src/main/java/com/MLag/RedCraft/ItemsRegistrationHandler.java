package com.MLag.RedCraft;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.MLag.RedCraft.Items.ItemsRegisters;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
//регистрация предметов, и рендер(моделей к ним)
@GameRegistry.ObjectHolder("red_crafting")
@Mod.EventBusSubscriber//
public class ItemsRegistrationHandler {
    static BlocksRegisters blockReg = new BlocksRegisters();
    //   @GameRegistry.ObjectHolder("red_ingot")
    //  public static final Item KEY = null;


    @SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> e) {
         new ItemsRegisters();
            e.getRegistry().registerAll(ItemsRegisters.Items_Arrays.toArray(new Item[0]));
        for (int i = 0; i < ItemsRegisters.Items_Arrays.size(); i++) {
            e.getRegistry().register(ItemsRegisters.Items_Arrays.get(i));
        }
    }


    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e) {

        for (Item item : ItemsRegisters.Items_Arrays) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }


        for (Block block : BlocksRegisters.BLOCKS_ARRAY) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }

        }


    }
    /*@SubscribeEvent
    public static void onBlockRegister (RegistryEvent.Register < Block > event) {
        BlocksRegisters blocksRegisters = new BlocksRegisters();
        event.getRegistry().registerAll(BlocksRegisters.BLOCKS_ARRAY.toArray(new Block[0]));
        for (int i = 0; i < BlocksRegisters.BLOCKS_ARRAY.size(); i++) {
            event.getRegistry().register(BlocksRegisters.BLOCKS_ARRAY.get(i));

        }

    }*/
}