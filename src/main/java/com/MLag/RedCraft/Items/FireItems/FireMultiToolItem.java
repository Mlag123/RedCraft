package com.MLag.RedCraft.Items.FireItems;

import com.MLag.RedCraft.IHasModel;
import com.MLag.RedCraft.Items.ItemsRegisters;
import com.MLag.RedCraft.Main;
import com.MLag.RedCraft.utils.CreativeTabsRegister;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

import java.util.Set;

public class FireMultiToolItem extends ItemTool implements IHasModel {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.CONCRETE_POWDER, Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);

    public FireMultiToolItem(String name, ToolMaterial materialIn) {
        super(4.0f, 2.0f, materialIn, EFFECTIVE_ON);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabsRegister.TOOL);
        ItemsRegisters.Items_Arrays.add(this);

    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment);
    }

    @Override
    public boolean canHarvestBlock(IBlockState blockIn) {
        Block block = blockIn.getBlock();

        if (block == Blocks.OBSIDIAN) {
            return this.toolMaterial.getHarvestLevel() == 3;
        } else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE) {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK) {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE) {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE) {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE) {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE) {
                                Material material = blockIn.getMaterial();

                                if (material == Material.ROCK) {
                                    return true;
                                } else if (material == Material.IRON) {
                                    return true;
                                } else {
                                    return material == Material.ANVIL;
                                }
                            } else {
                                return this.toolMaterial.getHarvestLevel() >= 2;
                            }
                        } else {
                            return this.toolMaterial.getHarvestLevel() >= 1;
                        }
                    } else {
                        return this.toolMaterial.getHarvestLevel() >= 1;
                    }
                } else {
                    return this.toolMaterial.getHarvestLevel() >= 2;
                }
            } else {
                return this.toolMaterial.getHarvestLevel() >= 2;
            }
        } else {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
            return EnumActionResult.FAIL;
        } else {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up())) {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH) {
                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT) {
                    switch ((BlockDirt.DirtType) iblockstate.getValue(BlockDirt.VARIANT)) {
                        case DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                    }
                }
            }

            return EnumActionResult.PASS;
        }
    }

    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote) {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }




    public static void breakBlockLikePlayer(
            World world,
            BlockPos pos,
            EntityPlayer player,
            ItemStack tool
    ) {
        if (world.isRemote) return;
        if (!(player instanceof EntityPlayerMP)) return;

        EntityPlayerMP playerMP = (EntityPlayerMP) player;

        IBlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (block.isAir(state, world, pos)) return;
        if (block == Blocks.BEDROCK) return;

        int exp = ForgeHooks.onBlockBreakEvent(
                world,
                playerMP.interactionManager.getGameType(),
                playerMP,
                pos
        );

        if (exp == -1) return;

        block.onBlockHarvested(world, pos, state, player);
        block.harvestBlock(world, player, pos, state, null, tool);
        world.setBlockToAir(pos);

        if (exp > 0) {
            block.dropXpOnBlockBreak(world, pos, exp);
        }

        tool.damageItem(1, player);
    }




    @Override
    public boolean onBlockDestroyed(ItemStack itemStack, World inWorld, IBlockState blockState, BlockPos blockpos, EntityLivingBase entityLivingBase) {


        if (!inWorld.isRemote && entityLivingBase instanceof EntityPlayer) {

            EntityPlayer player = (EntityPlayer) entityLivingBase;

            EnumFacing facing = player.getHorizontalFacing();

         //   Block block = blockState.getBlock();

            if (!player.isSneaking()) {



                if (facing.equals(EnumFacing.SOUTH) || facing.equals(EnumFacing.NORTH)) {

                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            BlockPos newPos = blockpos.add(dx, dy, 0);
                            if (!newPos.equals(blockpos)) {
                                IBlockState targetState = inWorld.getBlockState(newPos);
                                if (!targetState.getBlock().isAir(targetState, inWorld, newPos)) {


                                    {
                                        if (targetState.getBlock() == Blocks.BEDROCK) {
                                            continue; // пропускаем бедрок
                                        }
                                        //     breakBlockWithFortune(inWorld,newPos,player,itemStack);
                                    //    inWorld.destroyBlock(newPos, true);
                                    }


                                    if (targetState.getMaterial() == Material.ROCK
                                            || targetState == Blocks.IRON_BLOCK
                                            || targetState == Blocks.GOLD_BLOCK
                                            || targetState == Blocks.DIAMOND_ORE
                                            || targetState == Blocks.COAL_ORE
                                            || targetState == Blocks.EMERALD_ORE
                                            || targetState == Blocks.LAPIS_ORE
                                            || targetState == Blocks.REDSTONE_ORE
                                            || targetState == Blocks.STONE
                                            || targetState == Blocks.COBBLESTONE
                                            || targetState.getMaterial() == Material.GROUND
                                            || targetState == Blocks.GRAVEL
                                            || targetState == Blocks.DIRT)

                                    {

                                        breakBlockLikePlayer(inWorld,newPos,player,itemStack);
                                    //    breakBlockWithFortune(inWorld,newPos,player,itemStack);

                                     //   inWorld.destroyBlock(newPos, true);
                                    }

                                }
                            }
                        }
                    }
                } else if (facing.equals(EnumFacing.WEST) || facing.equals(EnumFacing.EAST)) {
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            BlockPos newPos = blockpos.add(0, dy, dx);
                            if (!newPos.equals(blockpos)) {
                                IBlockState targetState = inWorld.getBlockState(newPos);
                                if (!targetState.getBlock().isAir(targetState, inWorld, newPos)) {

                                    {
                                        if (targetState.getBlock() == Blocks.BEDROCK) {
                                            continue; // пропускаем бедрок
                                        }
                                       // inWorld.destroyBlock(newPos, true);
                                    }


                                    if (targetState.getMaterial() == Material.ROCK
                                            || targetState == Blocks.IRON_BLOCK
                                            || targetState == Blocks.GOLD_BLOCK
                                            || targetState == Blocks.DIAMOND_ORE
                                            || targetState == Blocks.COAL_ORE
                                            || targetState == Blocks.EMERALD_ORE
                                            || targetState == Blocks.LAPIS_ORE
                                            || targetState == Blocks.REDSTONE_ORE
                                            || targetState == Blocks.STONE
                                            || targetState == Blocks.COBBLESTONE
                                            || targetState.getMaterial() == Material.GROUND
                                            || targetState == Blocks.GRAVEL
                                            || targetState == Blocks.DIRT) {
                                        breakBlockLikePlayer(inWorld,newPos,player,itemStack);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        return super.onBlockDestroyed(itemStack, inWorld, blockState, blockpos, entityLivingBase);
    }
}
