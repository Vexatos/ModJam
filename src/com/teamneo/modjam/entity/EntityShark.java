package com.teamneo.modjam.entity;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityShark extends EntityWaterMob {

	public EntityShark(World par1World) {
		super(par1World);
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.setEntityHealth(50);
		this.setSize(1, 1);
		this.setAIMoveSpeed(0.3F);
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	protected boolean isAIEnabled() {
		return true;
	}

	/**
	 * Get the experience points the entity currently has.
	 */
	@Override
	protected int getExperiencePoints(EntityPlayer par1EntityPlayer) {
		return 2 + this.worldObj.rand.nextInt(3);
	}

	/**
	 * Checks if this entity is inside water (if inWater field is true as a
	 * result of handleWaterMovement() returning true)
	 */
	@Override
	public boolean isInWater() {
		return this.worldObj.handleMaterialAcceleration(this.boundingBox.expand(0.0D, -0.6000000238418579D, 0.0D), Material.water, this);
	}


	/**
	 * Checks if the entity's current position is a valid location to spawn this
	 * entity.
	 */
	@Override
	public boolean getCanSpawnHere() {
		return this.posY > 45.0D && this.posY < 63.0D && super.getCanSpawnHere();
	}
	// /**
	// * Returns the item ID for the item the mob drops on death.
	// */
	// protected int getDropItemId() {
	// return ItemBlubber.itemID;
	// }
	//
	// /**
	// * Drop 0-2 items of this living's type. @param par1 - Whether this entity
	// * has recently been hit by a player. @param par2 - Level of Looting used
	// to
	// * kill this mob.
	// */
	// protected void dropFewItems(boolean par1, int par2) {
	// int j = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
	//
	// for (int k = 0; k < j; ++k) {
	// this.dropItem(ItemBlubber.itemID, 1);
	// }
	//
	//
	// }
}
