package com.teamneo.modjam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.teamneo.modjam.TeamNEO;
import com.teamneo.modjam.misc.SessionData;

public final class ItemScubaSuitTop extends ItemArmor {
	public ItemScubaSuitTop(int id) {
		super(id, TeamNEO.materialScuba, SessionData.RENDER_SCUBA_TOP, 1);
		this.setCreativeTab(TeamNEO.tab);
		this.setUnlocalizedName("teamNeoScubaTop");
	}

	@Override
	public String getArmorTexture(ItemStack stac, Entity entity, int slot, int layer) {
		return null;
	}
}