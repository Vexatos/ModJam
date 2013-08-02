package com.teamneo.modjam.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class Tab extends CreativeTabs{
	public Tab(){
		super("oceanWorld");
	}
	
	@SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel(){
        return Language.local.translate("tab", SessionData.CURRENT_LANG);
    }
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return Item.bucketWater.itemID;
	}
}