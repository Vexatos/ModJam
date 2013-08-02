package com.teamneo.modjam.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.teamneo.modjam.TeamNEO;
import com.teamneo.modjam.misc.SessionData;

public final class ItemScubaSuitLeggings extends ItemArmor{
	public ItemScubaSuitLeggings(int id){
		super(id, TeamNEO.materialScuba, SessionData.RENDER_SCUBA_LEGGINGS, 2);
		this.setCreativeTab(TeamNEO.tab);
		this.setUnlocalizedName("teamNeoScubaLeggings");
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
		return null;
	}
}