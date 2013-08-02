package com.teamneo.modjam;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(name=TeamNEO.NAME, modid=TeamNEO.ID, version=TeamNEO.VERSION)
public final class TeamNEO{
	public static final String NAME = "Modjam Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "";
	public static final String ID = "teamNEO";
	
	@Mod.Instance(ID)
	public static TeamNEO instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		
	}
}