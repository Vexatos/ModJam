package com.teamneo.modjam.misc;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public final class Config{
	private final Configuration config;
	
	public Config(FMLPreInitializationEvent event){
		config = new Configuration(event.getSuggestedConfigurationFile());
	}
	
	public void load(){
		config.load();
		
		SessionData.CURRENT_LANG = config.get("settings", "defaultLang", "en_US").getString();
		SessionData.ITEM_PEARL = config.getItem("pearl", 5004).getInt();
		SessionData.ITEM_SCUBA_LEGGINGS_ID = config.getItem("scuba_leggings", 5002).getInt();
		SessionData.ITEM_SCUBA_FLIPPERS_ID = config.getItem("scuba_flippers", 5003).getInt();
		SessionData.ITEM_SCUBA_HELMET_ID = config.getItem("scuba_helmet", 5001).getInt();
		SessionData.ITEM_SCUBA_TOP_ID = config.getItem("scuba_top", 5000).getInt();
		
		config.save();
	}
}