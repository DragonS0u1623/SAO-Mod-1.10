package com.Jordan.SAO.Init;

import com.Jordan.SAO.Init.Blocks.Blockdunfloor;
import com.Jordan.SAO.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MBlocks {
	
	public static Block DUNGEON_FLOOR;
	
	public static void init(){
		DUNGEON_FLOOR = new Blockdunfloor();
	}
	
	public static void register(){
		
		registerBlock(DUNGEON_FLOOR);
	}
	
	public static void RegisterRenders(){
		
		RegisterRender(DUNGEON_FLOOR);
	}
	
	public static void registerBlock(Block block){
		
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void RegisterRender(Block block){

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
