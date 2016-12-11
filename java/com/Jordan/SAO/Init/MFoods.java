package com.Jordan.SAO.Init;

import com.Jordan.SAO.main.Reference;
import com.Jordan.SAO.main.SAOmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MFoods {
	
	public static Item Sandwich;
	public static Item Asunas_Sandwich;
	
	public static void init(){
		Sandwich = RegisterItem(new ItemFood(1, 2F, false), "Sandwich").setUnlocalizedName("Sandwich").setCreativeTab(MCreativeTabs.tabSAO_Food);
		Asunas_Sandwich = RegisterItem(new ItemFood(1, 9F, false), "Asunas_Sandwich").setUnlocalizedName("Asunas_Sandwich").setCreativeTab(MCreativeTabs.tabSAO_Food);
	}
	
	public static void RegisterRenders(){
		RegisterRender(Sandwich);
		RegisterRender(Asunas_Sandwich);
	}
	
	public static void RegisterRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	
	public static Item RegisterItem(Item item, String name){
		
		return RegisterItem(item, name, null);
	}
	
	public static Item RegisterItem(Item item, String name, CreativeTabs tab){
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}
}
