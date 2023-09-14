package com.MLag.RedCraft.Blocks.SpecifityBlocks;

import com.MLag.RedCraft.Blocks.BlockCreateOre;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FossilizedRemainsOre extends BlockCreateOre {
    public FossilizedRemainsOre(String name) {
        super(name);
        this.setHardness(5f);
    }

    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) {
        return super.isReplaceableOreGen(state, world, pos, target);
    }
}
