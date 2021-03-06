package com.teamneo.modjam.entity;

import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.teamneo.modjam.entity.ai.EntityAIDrowning;

public class EntityDolphin extends EntityWaterMob {
	private float randomMotionVecX;
	private float randomMotionVecY;
	private float randomMotionVecZ;

	public EntityDolphin(World par1World) {
		super(par1World);
		this.tasks.addTask(1, new EntityAIDrowning(this));
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
	 * Called frequently so the entity can update its state every tick as
	 * required. For example, zombies and skeletons use this to react to
	 * sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.isInWater()) {

			if (!this.worldObj.isRemote) {
				this.motionX = (double) (this.randomMotionVecX * 0.9);
				this.motionY = (double) (this.randomMotionVecY * 0.9);
				this.motionZ = (double) (this.randomMotionVecZ * 0.9);
			}

			this.renderYawOffset += (-((float) Math.atan2(this.motionX, this.motionZ)) * 180.0F / (float) Math.PI - this.renderYawOffset) * 0.1F;
			this.rotationYaw = this.renderYawOffset;
		} else {

			if (!this.worldObj.isRemote) {
				this.motionX = 0.0D;
				this.motionY -= 0.08D;
				this.motionY *= 0.9800000190734863D;
				this.motionZ = 0.0D;
			}

		}
	}

	@Override
	protected void updateEntityActionState() {
		++this.entityAge;

		if (this.entityAge > 100) {
			this.randomMotionVecX = this.randomMotionVecY = this.randomMotionVecZ = 0.0F;
		} else if (this.rand.nextInt(50) == 0 || !this.inWater || this.randomMotionVecX == 0.0F && this.randomMotionVecY == 0.0F && this.randomMotionVecZ == 0.0F) {
			float f = this.rand.nextFloat() * (float) Math.PI * 2.0F;
			this.randomMotionVecX = MathHelper.cos(f) * 0.2F;
			this.randomMotionVecY = -0.1F + this.rand.nextFloat() * 0.2F;
			this.randomMotionVecZ = MathHelper.sin(f) * 0.2F;
		}

		this.despawnEntity();
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
