package com.teamneo.modjam.blocks;

import net.minecraft.block.Block;

import com.teamneo.modjam.TeamNEO;

public final class BlockClam extends Block {
	public BlockClam(int id) {
		super(id, TeamNEO.materialShell);
		this.setUnlocalizedName("teamNeoBlockClam");
		this.setCreativeTab(TeamNEO.tab);
	}
}