package com.teamneo.modjam;

import java.util.logging.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

import com.teamneo.modjam.blocks.Blocks;
import com.teamneo.modjam.misc.Config;
import com.teamneo.modjam.misc.Language;
import com.teamneo.modjam.misc.Tab;
import com.teamneo.modjam.server.CommonProxy;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
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
	
	public static final EnumArmorMaterial materialScuba = EnumHelper.addArmorMaterial("rubber", 0, new int[]{0, 0, 0, 0}, 0);
	
	@Mod.Instance(ID)
	public static TeamNEO instance;
	
	@SidedProxy(clientSide="com.teamneo.modjam.client.ClientProxy", serverSide="com.teamneo.modjam.server.CommonProxy")
	public static CommonProxy proxy;
	
	public static final Logger logger = Logger.getLogger(TeamNEO.class.getSimpleName());
	public static CreativeTabs tab;
	
	private Config config;
	private Language lang;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		logger.setParent(FMLLog.getLogger());
		logger.info("Pre-Initialization");
		
		logger.info("Proxy");
		proxy.registerRenderIds();
		proxy.registerRenders();
		proxy.registerMobs();
		logger.info("Done With Proxy");
		
		logger.info("Config");
		config = new Config(event);
		config.load();
		logger.info("Done With Config");
		
		logger.info("Loading Languages");
		lang = new Language();
		Language.loadAll();
		logger.info("Done Loading Languages");
		
		logger.info("Setting Creative Tab");
		tab = new Tab();
		logger.info("Done Setting Creative Tab");
		
		logger.info("Blocks");
        Blocks.addBlocks();
        logger.info("Done With Blocks");
		
		logger.info("Done Pre-Initialization");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		logger.info("Initialization");
		logger.info("Done Initialization");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		logger.info("Post-Initialization");
		
		logger.info("Applying Lang");
		lang.addAll();
		logger.info("Done Applying Lang");
		
		logger.info("Done Post-Initialization");
	}
	
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		logger.info("Server-Starting");
		logger.info("Done Server-Starting");
	}
}