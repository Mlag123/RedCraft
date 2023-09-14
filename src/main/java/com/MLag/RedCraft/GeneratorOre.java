package com.MLag.RedCraft;

import com.MLag.RedCraft.Blocks.BlocksRegisters;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class GeneratorOre implements IWorldGenerator {
//Рудный генератор, и не только.


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case -1:
                break;
            case 0:
                runGenerator(BlocksRegisters.Red_ore.getDefaultState(), 8, 8, 2, 16, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
                runGenerator(BlocksRegisters.Natural_ore.getDefaultState(), 8, 8, 2, 16, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
                runGenerator(BlocksRegisters.FossilizedRemainsOre.getDefaultState(),8,8,2,56,BlockMatcher.forBlock(Blocks.STONE),world,random,chunkX,chunkZ);
                break;
        }

    }

    private void runGenerator(IBlockState blockToGen, int blockAmount, int chancesToSpawn, int minHeight, int maxHeight, Predicate<IBlockState> blockToReplace, World world, Random rand, int chunk_X, int chunk_Z) { //Объявление генератора

        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) //Проверка на правильность координаты Y

            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator"); //Если неправильно то будет ошибка в консоли

        WorldGenMinable generator = new WorldGenMinable(blockToGen, blockAmount, blockToReplace); //Новый экземпляр генератора

        int heightdiff = maxHeight - minHeight + 1;

        for (int i = 0; i < chancesToSpawn; i++) { //Запуск генератора в каждом чанке с заданным параметрами

            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightdiff);
            int z = chunk_Z * 16 + rand.nextInt(16);

            generator.generate(world, rand, new BlockPos(x, y, z));

        }
    }


}

