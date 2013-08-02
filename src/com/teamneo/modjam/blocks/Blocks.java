package com.teamneo.modjam.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public final class Blocks {
	public static Block blockClam = new BlockClam(3000);

	public static void addBlocks() {
		GameRegistry.registerBlock(blockClam, "teamNeoBlockClam");
	}
}