package com.teamneo.modjam.items;

import com.teamneo.modjam.TeamNEO;

import net.minecraft.item.Item;

public final class ItemPearl extends Item {
	public ItemPearl(int id) {
		super(id);
		this.setCreativeTab(TeamNEO.tab);
		this.setUnlocalizedName("teamNeoPearl");
	}
}