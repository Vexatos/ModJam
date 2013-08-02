package com.teamneo.modjam.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWhale extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer LeftFin;
    ModelRenderer RightFin;
    ModelRenderer LeftSide;
    ModelRenderer RightSide;
    ModelRenderer BackSide;
    ModelRenderer NextSide;
    ModelRenderer ThirdSide;
    ModelRenderer LastSide;
  
  public ModelWhale()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 10, 10, 17);
      Body.setRotationPoint(-5F, 14F, -8F);
      Body.setTextureSize(512, 512);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LeftFin = new ModelRenderer(this, 57, 0);
      LeftFin.addBox(0F, 0F, 0F, 5, 1, 4);
      LeftFin.setRotationPoint(4F, 22F, -4F);
      LeftFin.setTextureSize(512, 512);
      LeftFin.mirror = true;
      setRotation(LeftFin, 0F, 0F, 0.2443461F);
      RightFin = new ModelRenderer(this, 57, 8);
      RightFin.addBox(0F, 0F, 0F, 5, 1, 4);
      RightFin.setRotationPoint(-9F, 23F, -4F);
      RightFin.setTextureSize(512, 512);
      RightFin.mirror = true;
      setRotation(RightFin, 0F, 0F, -0.1745329F);
      LeftSide = new ModelRenderer(this, 78, 0);
      LeftSide.addBox(0F, 0F, 0F, 1, 1, 5);
      LeftSide.setRotationPoint(0F, 19F, 8.5F);
      LeftSide.setTextureSize(512, 512);
      LeftSide.mirror = true;
      setRotation(LeftSide, 0F, 0.5235988F, 0F);
      RightSide = new ModelRenderer(this, 78, 7);
      RightSide.addBox(0F, 0F, 0F, 1, 1, 5);
      RightSide.setRotationPoint(-1F, 19F, 8F);
      RightSide.setTextureSize(512, 512);
      RightSide.mirror = true;
      setRotation(RightSide, 0F, -0.5235988F, 0F);
      BackSide = new ModelRenderer(this, 78, 15);
      BackSide.addBox(0F, 0F, 0F, 7, 1, 1);
      BackSide.setRotationPoint(-3.5F, 19F, 12F);
      BackSide.setTextureSize(512, 512);
      BackSide.mirror = true;
      setRotation(BackSide, 0F, 0F, 0F);
      NextSide = new ModelRenderer(this, 78, 19);
      NextSide.addBox(0F, 0F, 0F, 5, 1, 1);
      NextSide.setRotationPoint(-2.5F, 19F, 11F);
      NextSide.setTextureSize(512, 512);
      NextSide.mirror = true;
      setRotation(NextSide, 0F, 0F, 0F);
      ThirdSide = new ModelRenderer(this, 78, 23);
      ThirdSide.addBox(0F, 0F, 0F, 4, 1, 1);
      ThirdSide.setRotationPoint(-2F, 19F, 10F);
      ThirdSide.setTextureSize(512, 512);
      ThirdSide.mirror = true;
      setRotation(ThirdSide, 0F, 0F, 0F);
      LastSide = new ModelRenderer(this, 78, 29);
      LastSide.addBox(0F, 0F, 0F, 2, 1, 1);
      LastSide.setRotationPoint(-1F, 19F, 9F);
      LastSide.setTextureSize(512, 512);
      LastSide.mirror = true;
      setRotation(LastSide, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    LeftFin.render(f5);
    RightFin.render(f5);
    LeftSide.render(f5);
    RightSide.render(f5);
    BackSide.render(f5);
    NextSide.render(f5);
    ThirdSide.render(f5);
    LastSide.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
