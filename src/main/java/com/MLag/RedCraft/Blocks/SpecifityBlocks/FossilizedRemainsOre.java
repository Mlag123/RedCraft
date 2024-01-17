package com.MLag.RedCraft.Blocks.SpecifityBlocks;

import com.MLag.RedCraft.Blocks.BlockCreateOre;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FossilizedRemainsOre extends BlockCreateOre {


    public FossilizedRemainsOre(String name) {
        super(name);
    }

    @Override
    public boolean isReplaceableOreGen(IBlockState p_isReplaceableOreGen_1_, IBlockAccess p_isReplaceableOreGen_2_, BlockPos p_isReplaceableOreGen_3_, Predicate<IBlockState> p_isReplaceableOreGen_4_) {
        return super.isReplaceableOreGen(p_isReplaceableOreGen_1_, p_isReplaceableOreGen_2_, p_isReplaceableOreGen_3_, p_isReplaceableOreGen_4_);
    }
}
