package com.teamneo.modjam.misc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.teamneo.modjam.items.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;

public final class Language {
	public static Localization local = new Localization("/assets/teamneo/lang/");

<<<<<<< HEAD
	public void addAll() {
=======
	public void addAll(){
>>>>>>> 991d01de4ea2583dfe83af0261bd49ecf347772e
		registerItem(Items.itemScubaTop);
		registerItem(Items.itemScubaFlippers);
		registerItem(Items.itemScubaHelmet);
		registerItem(Items.itemScubaLeggings);
	}

<<<<<<< HEAD
	public static void loadAll() {
		try {
=======
	public static void loadAll(){
		try{
>>>>>>> 991d01de4ea2583dfe83af0261bd49ecf347772e
			local.loadLanguage("en_US");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

<<<<<<< HEAD
	private String getLocalizedName(String key, String lang) {
		return local.translate(key, lang);
	}

	private String getLocalizedName(String key) {
		return getLocalizedName(key, SessionData.CURRENT_LANG);
	}

	private void registerItem(Item item) {
		LanguageRegistry.addName(item, getLocalizedName(item.getUnlocalizedName()));
	}

	private void registerStack(ItemStack stack) {
		LanguageRegistry.addName(stack, getLocalizedName(stack.getDisplayName()));
	}

	private void registerBlock(Block block) {
=======
	private String getLocalizedName(String key, String lang){
		return local.translate(key, lang);
	}

	private String getLocalizedName(String key){
		return getLocalizedName(key, SessionData.CURRENT_LANG);
	}

	private void registerItem(Item item){
		LanguageRegistry.addName(item, getLocalizedName(item.getUnlocalizedName()));
	}

	private void registerStack(ItemStack stack){
		LanguageRegistry.addName(stack, getLocalizedName(stack.getDisplayName()));
	}

	private void registerBlock(Block block){
>>>>>>> 991d01de4ea2583dfe83af0261bd49ecf347772e
		LanguageRegistry.addName(block, getLocalizedName(block.getUnlocalizedName()));
	}
}