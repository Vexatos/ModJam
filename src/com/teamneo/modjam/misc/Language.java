package com.teamneo.modjam.misc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.teamneo.modjam.items.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;

public final class Language{
	public static Localization local = new Localization("/assets/teamneo/lang/");
	
	public void addAll(){
		registerItem(Items.itemScubaTop);
		registerItem(Items.itemScubaFlippers);
		registerItem(Items.itemScubaHelmet);
		registerItem(Items.itemScubaLeggings);
		registerItem(Items.itemPearl);
	}
	
	public static void loadAll(){
		try{
			local.loadLanguage("en_US");
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	private String getLocalizedName(String key, String lang){
		return local.translate(key, lang);
	}
	
	private String getLocalizedName(String key){
		return getLocalizedName(key, SessionData.CURRENT_LANG);
	}
	
	private void registerItem(Item item){
		LanguageRegistry.addName(item, getLocalizedName(item.getUnlocalizedName()));
	}
	
	private void registerBlock(Block block)
	{
	    LanguageRegistry.addName(block, getLocalizedName(block.getUnlocalizedName()));
	}
}