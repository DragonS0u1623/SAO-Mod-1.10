package com.Jordan.SAO.Init;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MArmorMaterials {
	
	public static ArmorMaterial BLACK_LEATHER = EnumHelper.addArmorMaterial("BLACK_LEATHER", "saomod: Items/blackleather", 75, new int[] {0, 50, 20, 30}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 6);
	public static ArmorMaterial STEEL = EnumHelper.addArmorMaterial("STEEL", "saomod: steel", 35, new int[] {10, 15, 7, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 4);
	public static ArmorMaterial SAOLEATHER = EnumHelper.addArmorMaterial("SAOLEATHER", "saomod: Items/saoleather", 65, new int[] {0, 50, 20, 30}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 5);
	public static ArmorMaterial BLACKWYRMLEATHER = EnumHelper.addArmorMaterial("BLACKWYRMLEATHER", "saomod: Items/blackwyrm", 100, new int[]{0, 50, 20, 30}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 6);
}
