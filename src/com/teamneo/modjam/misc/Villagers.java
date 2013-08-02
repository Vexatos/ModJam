package com.teamneo.modjam.misc;

import net.minecraft.util.ResourceLocation;

import com.teamneo.modjam.entity.trade.DiverTradeHandler;

import cpw.mods.fml.common.registry.VillagerRegistry;

public final class Villagers{
	public static void addAll(){
		VillagerRegistry.instance().registerVillagerId(10);
		VillagerRegistry.instance().registerVillagerSkin(10, new ResourceLocation(""));
		VillagerRegistry.instance().registerVillageTradeHandler(10, new DiverTradeHandler());
	}
}