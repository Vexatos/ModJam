package com.teamneo.modjam.items;

import com.teamneo.modjam.TeamNEO;

import net.minecraft.item.Item;

public final class ItemShellShard extends Item{
	public ItemShellShard(int id){
		super(id);
		this.setCreativeTab(TeamNEO.tab);
		this.setUnlocalizedName("teamNeoShellShard");
	}
}