package com.teamneo.modjam.blocks;

<<<<<<< HEAD
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
=======
>>>>>>> c495ae4fe4174ee1881f2ecad8baa5053df92fed

public final class Blocks{
	public static final Block blockClam = new BlockClam(3000);
	
	public static void addBlocks(){
		GameRegistry.registerBlock(blockClam, "teamNeoBlockClam");
	}
}