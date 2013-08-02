package com.teamneo.modjam.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityAIDrowning extends EntityAIBase {
	World worldObj;
	int distance;
	EntityPlayer classTarget;
	EntityCreature attacker;
	PathEntity entityPathEntity;

	public EntityAIDrowning(EntityCreature par1EntityCreature) {
		this.attacker = par1EntityCreature;
		classTarget = this.worldObj.getClosestPlayerToEntity(attacker, -1.0D);
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public boolean shouldExecute() {
		
		return true;
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting() {
		this.attacker.getNavigator().setPath(this.entityPathEntity, attacker.getAIMoveSpeed());
	}

	/**
	 * Resets the task
	 */
	public void resetTask() {
		this.attacker.getNavigator().clearPathEntity();
	}

	/**
	 * Updates the task
	 */
	public void updateTask() {
		classTarget = this.worldObj.getClosestPlayerToEntity(attacker, -1.0D);
		if (classTarget.isInWater() && classTarget.attackEntityFrom(DamageSource.drown, 2.0F)) {
			double d0 = (double) (this.attacker.width * 2.0F * this.attacker.width * 2.0F + classTarget.width);
			if (this.attacker.getDistanceSq(classTarget.posX, classTarget.boundingBox.minY, classTarget.posZ) <= d0) {
				attacker.riddenByEntity = classTarget;
			}
		}
	}
}
