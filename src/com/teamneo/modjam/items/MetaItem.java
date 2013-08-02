package com.teamneo.modjam.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.teamneo.modjam.TeamNEO;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class MetaItem extends Item{
	private final String[] unlocalizedNames = new String[]{
			"teamNeoItemPearl"
	};
	
	private final String[] textures = new String[]{
			"pearl.png"
	};
	
	private Icon[] icons;
	
	public MetaItem(int id){
		super(id);
		this.setCreativeTab(TeamNEO.tab);
		this.setUnlocalizedName("teamNeoMetaItem");
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.icons = new Icon[this.textures.length];
		
		for(int i = 0; i < this.textures.length; i++){
			this.icons[i] = register.registerIcon("teamneo:" + this.textures[i]);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int meta){
		return this.icons[meta];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return unlocalizedNames[stack.getItemDamage()];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < unlocalizedNames.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
}