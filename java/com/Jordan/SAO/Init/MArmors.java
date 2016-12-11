package com.Jordan.SAO.Init;

import com.Jordan.SAO.Init.Armors.ItemAsunas_Armor;
import com.Jordan.SAO.Init.Armors.ItemBlackwyrm_Armor;
import com.Jordan.SAO.Init.Armors.ItemLight_Armor;
import com.Jordan.SAO.Init.Armors.ItemMidnight_Armor;
import com.Jordan.SAO.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MArmors {
	
	public static Item LIGHT_HELMET, LIGHT_CUIRASS, LIGHT_PANTS, LIGHT_BOOTS;
	public static Item CLOAK_OF_MIDNIGHT, MIDNIGHT_PANTS, MIDNIGHT_BOOTS;
	public static Item BLACKWYRM_CLOAK, BLACKWYRM_PANTS, BLACKWYRM_BOOTS;
	public static Item ASUNAS_CHEST, ASUNAS_PANTS, ASUNAS_BOOTS;
	
	public static void init(){
		
		LIGHT_HELMET = registerItem(new ItemLight_Armor(1, EntityEquipmentSlot.HEAD), "light_helmet").setUnlocalizedName("light_helmet").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		LIGHT_CUIRASS = registerItem(new ItemLight_Armor(1, EntityEquipmentSlot.CHEST), "light_cuirass").setUnlocalizedName("light_cuirass").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		LIGHT_PANTS = registerItem(new ItemLight_Armor(2, EntityEquipmentSlot.LEGS), "light_pants").setUnlocalizedName("light_pants").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		LIGHT_BOOTS = registerItem(new ItemLight_Armor(2, EntityEquipmentSlot.FEET), "light_boots").setUnlocalizedName("light_boots").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		CLOAK_OF_MIDNIGHT = registerItem(new ItemMidnight_Armor(1, EntityEquipmentSlot.CHEST), "cloak_of_midnight").setUnlocalizedName("cloak_of_midnight").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		MIDNIGHT_PANTS = registerItem(new ItemMidnight_Armor(2, EntityEquipmentSlot.LEGS), "midnight_pants").setUnlocalizedName("midnight_pants").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		MIDNIGHT_BOOTS = registerItem(new ItemMidnight_Armor(2, EntityEquipmentSlot.FEET), "midnight_boots").setUnlocalizedName("midnight_boots").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		BLACKWYRM_CLOAK = registerItem(new ItemBlackwyrm_Armor(1, EntityEquipmentSlot.CHEST), "blackwyrm_cloak").setUnlocalizedName("blackwyrm_cloak").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		BLACKWYRM_PANTS = registerItem(new ItemBlackwyrm_Armor(2, EntityEquipmentSlot.LEGS), "blackwyrm_pants").setUnlocalizedName("blackwyrm_pants").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		BLACKWYRM_BOOTS = registerItem(new ItemBlackwyrm_Armor(2, EntityEquipmentSlot.FEET), "blackwyrm_boots").setUnlocalizedName("blackwyrm_boots").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		ASUNAS_CHEST = registerItem(new ItemAsunas_Armor(1, EntityEquipmentSlot.CHEST), "asunas_chest").setUnlocalizedName("asunas_chest").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		ASUNAS_PANTS = registerItem(new ItemAsunas_Armor(2, EntityEquipmentSlot.LEGS), "asunas_pants").setUnlocalizedName("asunas_pants").setCreativeTab(MCreativeTabs.tabSAO_Armor);
		ASUNAS_BOOTS = registerItem(new ItemAsunas_Armor(2, EntityEquipmentSlot.FEET), "asunas_boots").setUnlocalizedName("asunas_boots").setCreativeTab(MCreativeTabs.tabSAO_Armor);
	}
	
	public static void RegisterRenders(){
		
		RegisterRender(LIGHT_HELMET);
		RegisterRender(LIGHT_CUIRASS);
		RegisterRender(LIGHT_PANTS);
		RegisterRender(LIGHT_BOOTS);
		RegisterRender(CLOAK_OF_MIDNIGHT);
		RegisterRender(MIDNIGHT_PANTS);
		RegisterRender(MIDNIGHT_BOOTS);
		RegisterRender(BLACKWYRM_CLOAK);
		RegisterRender(BLACKWYRM_PANTS);
		RegisterRender(BLACKWYRM_BOOTS);
		RegisterRender(ASUNAS_CHEST);
		RegisterRender(ASUNAS_PANTS);
		RegisterRender(ASUNAS_BOOTS);
	}
	
	public static void RegisterRender(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	//registerItem Start\\
	public static Item registerItem(Item item, String name){
		
		return registerItem(item, name, null);
	}
	
	public static Item registerItem(Item item, String name, CreativeTabs tab){
		
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}
	
	//registerItem End\\
}
