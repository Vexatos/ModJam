package com.teamneo.modjam.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.teamneo.modjam.entity.EntityShark;
import com.teamneo.modjam.entity.model.ModelShark;

public class RenderShark extends RenderLiving {
	private static final ResourceLocation textureShark = new ResourceLocation("teamneo:textures/model/Shark.png");
	private ModelShark model;

	public RenderShark(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	private void renderShark(EntityShark par1Entity, double par2, double par4, double par6, float par8, float par9) {
		this.model = new ModelShark();
		super.doRenderLiving(par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
		this.renderShark((EntityShark) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		return textureShark;
	}

}