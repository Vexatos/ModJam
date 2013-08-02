package com.teamneo.modjam.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.teamneo.modjam.TeamNEO;
import com.teamneo.modjam.misc.SessionData;

public final class ItemScubaSuitFlippers extends ItemArmor{
	public ItemScubaSuitFlippers(int id){
		super(id, TeamNEO.materialScuba, SessionData.RENDER_SCUBA_FLIPPERS, 3);
		this.setCreativeTab(TeamNEO.tab);
		this.setUnlocalizedName("teamNeoScubaFlippers");
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
		return null;
	}
}