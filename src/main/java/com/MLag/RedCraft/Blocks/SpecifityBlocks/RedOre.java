package com.MLag.RedCraft.Blocks.SpecifityBlocks;

import com.MLag.RedCraft.Blocks.BlockCreateOre;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RedOre extends BlockCreateOre {
    public RedOre(String name) {
        super(name);
        this.setHardness(5f);

    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        // FIXME: 06.09.2023 
        fireAttack(entityIn);
        this.setLightLevel(0.0f);
        super.onEntityWalk(worldIn, pos, entityIn);

    }

    public static void fireAttack(Entity entityIn) {
      try {  // FIXME: 06.09.2023
          EntityPlayer entityPlayer = (EntityPlayer) entityIn;
          if (entityPlayer.getHealth() >= 1f) {
              if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) entityIn)) {
                  entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
              }
          }
      }catch (Exception e){

      }
    }

    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) {
        return super.isReplaceableOreGen(state, world, pos, target);
    }
}
