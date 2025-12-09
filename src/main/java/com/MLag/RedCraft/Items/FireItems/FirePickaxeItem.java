package com.MLag.RedCraft.Items.FireItems;

import com.MLag.RedCraft.Items.PickaxeBase;
import com.sun.jna.platform.win32.WinDef;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import paulscode.sound.FilenameURL;

public class FirePickaxeItem extends PickaxeBase {
    public FirePickaxeItem(String name, ToolMaterial material) {
        super(name, material);
    }



    private void breakBlockWithFortune(World world, BlockPos pos, EntityPlayer player, ItemStack tool) {
        IBlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (block == Blocks.BEDROCK) return;

        int fortune = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(35), tool);
        // ID 35 — Fortune в 1.12.2

        // Получаем дроп с учетом удачи
        java.util.List<ItemStack> drops = block.getDrops(world, pos, state, fortune);

        // Ломаем блок без дропа
        world.setBlockToAir(pos);

        // Выкидываем вручную
        for (ItemStack drop : drops) {
            Block.spawnAsEntity(world, pos, drop);
        }

        // Наносим урон инструменту
        tool.damageItem(1, player);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        breakBlockWithFortune(worldIn,pos,(EntityPlayer) entityLiving,stack);

        return true;
    }
/*    @Override
    public boolean onBlockStartBreak(ItemStack stack, BlockPos pos, EntityPlayer player) {
        World world = player.world;
        IBlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (!world.isRemote) {
            // Создаём ItemStack для проверки рецепта плавки
            ItemStack input = new ItemStack(block, 1);

            ItemStack smelted = FurnaceRecipes.instance().getSmeltingResult(input);

            if (!smelted.isEmpty()) {
                // Блок есть рецепт плавки
                world.setBlockToAir(pos);

                EntityItem entityItem = new EntityItem(
                        world,
                        pos.getX() + 0.5,
                        pos.getY() + 0.5,
                        pos.getZ() + 0.5,
                        smelted
                );
                world.spawnEntity(entityItem);

                stack.damageItem(1, player);
                return true;
            }
        }

        return false;
    }*/



}
