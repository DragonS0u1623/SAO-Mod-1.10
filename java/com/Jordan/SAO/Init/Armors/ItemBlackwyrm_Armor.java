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

public class ItemBlackwyrm_Armor extends ItemArmor{

	public ItemBlackwyrm_Armor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(MArmorMaterials.BLACKWYRMLEATHER, renderIndexIn, equipmentSlotIn);
		
	}
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack){
		
		Multimap mods = HashMultimap.create();
		
		if(this == MArmors.BLACKWYRM_CLOAK)
			mods.put(SharedMonsterAttributes.MAX_HEALTH.getAttributeUnlocalizedName(), new AttributeModifier(UUID.fromString("lbca943c-3cfs-42cc-a3df-2ed994ae0000"), "hp", 10D, 0));
			
			
		return mods;
	}
}
