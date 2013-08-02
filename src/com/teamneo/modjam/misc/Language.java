package com.teamneo.modjam.misc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.teamneo.modjam.blocks.Blocks;
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
	
<<<<<<< HEAD
	private void registerStack(ItemStack stack){
		LanguageRegistry.addName(stack, getLocalizedName(stack.getDisplayName()));
	}
	
	private void registerBlock(Block block){
		LanguageRegistry.addName(block, getLocalizedName(block.getUnlocalizedName()));
=======
	private void registerBlock(Block block)
	{
	    LanguageRegistry.addName(block, getLocalizedName(block.getUnlocalizedName()));
>>>>>>> c495ae4fe4174ee1881f2ecad8baa5053df92fed
	}
}