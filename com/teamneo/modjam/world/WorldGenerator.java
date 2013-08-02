package com.teamneo.modjam.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public final class WorldGenerator implements IWorldGenerator{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		default:
			break;
		}
	}
	
	private void addOreGen(int maxYLevel, int blockID, int rarity, int veinSize, int blockX, int blockZ, Random rand, World world){
		for(int i = 0; i < rarity; i++){
			int xCoord = blockX + rand.nextInt(16);
			int yCoord = rand.nextInt(maxYLevel);
			int zCoord = blockZ + rand.nextInt(16);
			
			new WorldGenMinable(blockID, veinSize).generate(world, rand, xCoord, yCoord, zCoord);
		}
	}
	
	private boolean isBiome(BiomeGenBase biome, World world, int x, int z){
		return (world.getBiomeGenForCoords(x, z) == biome);
	}
	
	private void generateNether(World world, Random rand, int x, int z){
		
	}
	
	private void generateEnd(World world, Random rand, int x, int z){
		
	}
	
	private void generateSurface(World world, Random rand, int x, int z){
		
	}
}