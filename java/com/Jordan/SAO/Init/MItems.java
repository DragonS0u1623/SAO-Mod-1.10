package com.Jordan.SAO.Init;

import com.Jordan.SAO.Init.Tools.SAOAxe;
import com.Jordan.SAO.Init.Tools.SAOPickaxe;
import com.Jordan.SAO.Init.Tools.SAOShield;
import com.Jordan.SAO.Init.Tools.SAOSword;
import com.Jordan.SAO.main.Reference;
import com.Jordan.SAO.main.SAOmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MItems {
	
	public static Item Elucidator;
	public static Item DarkRepulsor;
	public static Item Rapier;
	public static Item LongSword;
	public static Item Baton;
	public static Item Fork;
	public static Item Knife;
	public static Item SteelDagger;
	public static Item PracticeSword;
	public static Item Teleport_Crystal;
	public static Item SteelBucket;
	public static Item WoodBucket;
	public static Item Lambient_Light;
	public static Item Liberator_Sword;
	public static Item Liberator_Shield;
	public static Item War_Axe;
	public static Item Alfheim_Pickaxe;
	public static Item Karakurenai;
	public static Item Guilty_Thorn;
	public static Item BlackSteelIngot;
	public static Item SteelIngot;
	public static Item CrystallineIngot;
	public static Item AlfMetal;
	public static Item BlackLeather;
	public static Item SAOLeather;
	
	public static void init(){
		Elucidator = RegisterItem(new SAOSword(MToolMaterials.BLACK_STEEL), "Elucidator").setUnlocalizedName("Elucidator");
		DarkRepulsor = RegisterItem(new SAOSword(MToolMaterials.CRYSTALLINE_INGOT), "DarkRepulsor").setUnlocalizedName("DarkRepulsor");
		Rapier = RegisterItem(new SAOSword(MToolMaterials.STEEL), "Rapier").setUnlocalizedName("Rapier").setCreativeTab(MCreativeTabs.tabSAO_Tools);
		LongSword = RegisterItem(new SAOSword(MToolMaterials.STEEL), "LongSword").setUnlocalizedName("LongSword");
		Baton = RegisterItem(new Item(), "Baton").setUnlocalizedName("Baton").setCreativeTab(MCreativeTabs.tabSAO_Items);
		Fork = RegisterItem(new Item(), "Fork").setUnlocalizedName("Fork").setCreativeTab(MCreativeTabs.tabSAO_Misc);
		Knife = RegisterItem(new Item(), "Knife").setUnlocalizedName("Knife").setCreativeTab(MCreativeTabs.tabSAO_Misc);
		SteelDagger = RegisterItem(new SAOSword(MToolMaterials.STEEL), "SteelDagger").setUnlocalizedName("SteelDagger");
		PracticeSword = RegisterItem(new SAOSword(MToolMaterials.WOOD), "PracticeSword").setUnlocalizedName("PracticeSword").setCreativeTab(MCreativeTabs.tabSAO_Items);
		Teleport_Crystal = RegisterItem(new Item(), "Teleport_Crystal").setUnlocalizedName("Teleport_Crystal").setCreativeTab(MCreativeTabs.tabSAO_Items);
		WoodBucket = RegisterItem(new Item(), "WoodBucket").setUnlocalizedName("WoodBucket").setCreativeTab(MCreativeTabs.tabSAO_Misc);
		SteelBucket = RegisterItem(new Item(), "SteelBucket").setUnlocalizedName("SteelBucket").setCreativeTab(MCreativeTabs.tabSAO_Misc);
		Lambient_Light = RegisterItem(new SAOSword(MToolMaterials.STEEL), "Lambient_Light").setUnlocalizedName("Lambient_Light");
		Liberator_Sword = RegisterItem(new SAOSword(MToolMaterials.STEEL), "Liberator_Sword").setUnlocalizedName("Liberator_Sword");
		Liberator_Shield = RegisterItem(new SAOShield(MToolMaterials.STEEL), "Liberator_Shield").setUnlocalizedName("Liberator_Shield");
		War_Axe = RegisterItem(new SAOAxe(MToolMaterials.STEEL), "War_Axe").setUnlocalizedName("War_Axe");
		Alfheim_Pickaxe = RegisterItem(new SAOPickaxe(MToolMaterials.ALFWOOD), "Alfheim_Pickaxe").setUnlocalizedName("Alfheim_Pickaxe");
		Karakurenai = RegisterItem(new SAOPickaxe(MToolMaterials.STEEL), "Karakurenai").setUnlocalizedName("Karakurenai");
		Guilty_Thorn = RegisterItem(new SAOPickaxe(MToolMaterials.STEEL), "Guilty_Thorn").setUnlocalizedName("Guilty_Thorn");
		BlackSteelIngot = RegisterItem(new Item(), "BlackSteelIngot").setUnlocalizedName("BlackSteelIngot").setCreativeTab(MCreativeTabs.tabSAO_Items);
		SteelIngot = RegisterItem(new Item(), "SteelIngot").setUnlocalizedName("SteelIngot").setCreativeTab(MCreativeTabs.tabSAO_Items);
		CrystallineIngot = RegisterItem(new Item(), "CrystallineIngot").setUnlocalizedName("CrystallineIngot").setCreativeTab(MCreativeTabs.tabSAO_Items);
		AlfMetal = RegisterItem(new Item(), "AlfMetal").setUnlocalizedName("AlfMetal").setCreativeTab(MCreativeTabs.tabSAO_Items);
		BlackLeather = RegisterItem(new Item(), "BlackLeather").setUnlocalizedName("BlackLeather").setCreativeTab(MCreativeTabs.tabSAO_Items);
		SAOLeather = RegisterItem(new Item(), "SAOLeather").setUnlocalizedName("SAOLeather").setCreativeTab(MCreativeTabs.tabSAO_Items);
	}
	
	public static void RegisterRenders(){
		RegisterRender(Elucidator);
		RegisterRender(DarkRepulsor);
		RegisterRender(Rapier);
		RegisterRender(LongSword);
		RegisterRender(Baton);
		RegisterRender(Fork);
		RegisterRender(Knife);
		RegisterRender(SteelDagger);
		RegisterRender(PracticeSword);
		RegisterRender(Teleport_Crystal);
		RegisterRender(WoodBucket);
		RegisterRender(SteelBucket);
		RegisterRender(Lambient_Light);
		RegisterRender(Liberator_Sword);
		RegisterRender(Liberator_Shield);
		RegisterRender(War_Axe);
		RegisterRender(Alfheim_Pickaxe);
		RegisterRender(Karakurenai);
		RegisterRender(Guilty_Thorn);
		RegisterRender(BlackSteelIngot);
		RegisterRender(SteelIngot);
		RegisterRender(CrystallineIngot);
		RegisterRender(AlfMetal);
		RegisterRender(BlackLeather);
		RegisterRender(SAOLeather);
	}
	
	public static void RegisterRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	
	public static Item RegisterItem(Item item, String name){
		
		return RegisterItem(item, name, null);
	}
	
	public static Item RegisterItem(Item item, String name, CreativeTabs tab){
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}
}
