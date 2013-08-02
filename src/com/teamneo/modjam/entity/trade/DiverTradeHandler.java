package com.teamneo.modjam.entity.trade;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import com.teamneo.modjam.items.Items;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public final class DiverTradeHandler implements IVillageTradeHandler{
	private final HashMap<ItemStack, ItemStack> map = new HashMap<ItemStack, ItemStack>();
	
	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipes, Random random){
		addTrade(new ItemStack(Items.itemPearl, 10), new ItemStack(Items.itemScubaFlippers));
		addTrade(new ItemStack(Items.itemPearl, 10), new ItemStack(Items.itemScubaHelmet));
		addTrade(new ItemStack(Items.itemPearl, 10), new ItemStack(Items.itemScubaLeggings));
		addTrade(new ItemStack(Items.itemPearl, 10), new ItemStack(Items.itemScubaTop));
		
		loadAll(recipes);
	}
	
	private void addTrade(ItemStack input, ItemStack output){
		map.put(input, output);
	}
	
	private void loadAll(MerchantRecipeList list){
		for(Entry<ItemStack, ItemStack> entry : map.entrySet()){
			list.add(new MerchantRecipe(entry.getKey(), entry.getValue()));
		}
	}
}