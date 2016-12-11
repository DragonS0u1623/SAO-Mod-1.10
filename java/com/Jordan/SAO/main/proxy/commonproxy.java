package com.Jordan.SAO.main.proxy;

import com.Jordan.SAO.Init.MArmors;
import com.Jordan.SAO.Init.MBlocks;
import com.Jordan.SAO.Init.MFoods;
import com.Jordan.SAO.Init.MItems;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class commonproxy {
	
	public void preInit(FMLPreInitializationEvent Event){
		MItems.init();
		MBlocks.init();
		MBlocks.register();
		MFoods.init();
		MArmors.init();
	}
	
	public void init(FMLInitializationEvent Event){
		
	}
	
	public void Postinit(FMLPostInitializationEvent Event){
		
	}
	
	public void RegisterItemSided(Item item){
		
	}
}
