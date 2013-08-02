package com.teamneo.modjam.client;

import com.teamneo.modjam.entity.EntityShark;
import com.teamneo.modjam.entity.EntityWhale;
import com.teamneo.modjam.entity.model.ModelShark;
import com.teamneo.modjam.entity.model.ModelWhale;
import com.teamneo.modjam.entity.render.RenderShark;
import com.teamneo.modjam.entity.render.RenderWhale;
import com.teamneo.modjam.server.CommonProxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
	
	@Override
	public void registerMobs() {
		EntityRegistry.registerGlobalEntityID(EntityWhale.class, "EntityWhale",EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0x000000);
		EntityRegistry.registerGlobalEntityID(EntityShark.class, "EntityShark",EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0x000000);
		
		LanguageRegistry.instance().addStringLocalization("entity.EntityWhale.name", "Whale");
		LanguageRegistry.instance().addStringLocalization("entity.EntityShark.name", "Shark");
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderWhale(new ModelWhale(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderShark(new ModelShark(), 0.3F));
	}
}