package com.teamneo.modjam.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.teamneo.modjam.entity.EntityDolphin;
import com.teamneo.modjam.entity.model.ModelDolphin;

public class RenderDolphin extends RenderLiving {
	private static final ResourceLocation textureDolphin = new ResourceLocation("teamneo:textures/model/Dolphin.png");
	private ModelDolphin model;

	public RenderDolphin(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	private void renderDolphin(EntityDolphin par1Entity, double par2, double par4, double par6, float par8, float par9) {
		this.model = new ModelDolphin();
		super.doRenderLiving(par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
		this.renderDolphin((EntityDolphin) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		return textureDolphin;
	}

}