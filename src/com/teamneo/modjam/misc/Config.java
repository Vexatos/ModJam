package com.teamneo.modjam.misc;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public final class Config {
	private final Configuration config;

	public Config(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
	}

	public void load() {
		config.load();

		SessionData.CURRENT_LANG = config.get("settings", "defaultLang", "en_US").getString();

		config.save();
	}
}