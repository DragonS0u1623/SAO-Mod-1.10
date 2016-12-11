package com.Jordan.SAO.main.proxy;

import com.Jordan.SAO.Init.MArmors;
import com.Jordan.SAO.Init.MBlocks;
import com.Jordan.SAO.Init.MFoods;
import com.Jordan.SAO.Init.MItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class clientproxy extends commonproxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent Event){
		super.preInit(Event);
	}
	
	@Override
	public void init(FMLInitializationEvent Event){
		super.init(Event);
		RenderManager rm = Minecraft.getMinecraft().getRenderManager();
		RenderItem ri = Minecraft.getMinecraft().getRenderItem();
		
		MItems.RegisterRenders();
		MBlocks.RegisterRenders();
		MFoods.RegisterRenders();
		MArmors.RegisterRenders();
	}
	
	@Override
	public void Postinit(FMLPostInitializationEvent Event){
		super.Postinit(Event);
	}
}
