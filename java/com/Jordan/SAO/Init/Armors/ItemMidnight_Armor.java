package com.Jordan.SAO.Init.Armors;

import java.util.UUID;

import com.Jordan.SAO.Init.MArmorMaterials;
import com.Jordan.SAO.Init.MArmors;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemMidnight_Armor extends ItemArmor{

	public ItemMidnight_Armor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(MArmorMaterials.BLACK_LEATHER, renderIndexIn, equipmentSlotIn);
		
	}
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack){
		
		Multimap mods = HashMultimap.create();
		
		if(this == MArmors.CLOAK_OF_MIDNIGHT)
			mods.put(SharedMonsterAttributes.MAX_HEALTH.getAttributeUnlocalizedName(), new AttributeModifier(UUID.fromString("lbca943c-3cfs-42cc-a3df-2ed994ae0000"), "hp", 5D, 0));
			
			
		return mods;
	}
}
