package com.teamneo.modjam.misc;

import com.teamneo.modjam.items.Items;

public final class Language{
	public static Localization local = new Localization("/assets/teamneo/lang/");
	
	public void addAll(){
		getLocalizedName(Items.itemScubaTop.getUnlocalizedName());
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
}