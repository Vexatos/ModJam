package com.teamneo.modjam.client;

import com.teamneo.modjam.server.CommonProxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public final class ClientProxy extends CommonProxy{
	@Override
	public int addArmor(String name){
		return RenderingRegistry.addNewArmourRendererPrefix(name);
	}
	
	@Override
	public void registerRenders(){
		
	}
	
	@Override
	public void registerRenderIds(){
		
	}
}