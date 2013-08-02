package com.teamneo.modjam.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityWhale extends EntityAnimal {

	public EntityWhale(World par1World) {
		super(par1World);
		this.setEntityHealth(50);
	}

	/**
	 * Get the experience points the entity currently has.
	 */
	@Override
	protected int getExperiencePoints(EntityPlayer par1EntityPlayer) {
		return 1 + this.worldObj.rand.nextInt(3);
	}

	@Override
	public void onLivingUpdate() {
	}

	/**
	 * This function is used when two same-species animals in 'love mode' breed
	 * to generate the new baby animal.
	 */
	public EntityWhale spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
		return new EntityWhale(this.worldObj);
	}

	public EntityAgeable createChild(EntityAgeable par1EntityAgeable) {
		return this.spawnBabyAnimal(par1EntityAgeable);
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected int getDropItemId() {
		return Item.leather.itemID;
	}

	/**
	 * Drop 0-2 items of this living's type. @param par1 - Whether this entity
	 * has recently been hit by a player. @param par2 - Level of Looting used to
	 * kill this mob.
	 */
	protected void dropFewItems(boolean par1, int par2) {
		int j = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
		int k;

		for (k = 0; k < j; ++k) {
			this.dropItem(Item.leather.itemID, 1);
		}

		j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

		for (k = 0; k < j; ++k) {
			this.dropItem(Item.beefRaw.itemID, 1);
		}
	}
}
