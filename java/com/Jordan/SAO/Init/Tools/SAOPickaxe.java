package com.Jordan.SAO.Init.Tools;

import com.Jordan.SAO.Init.MCreativeTabs;

import net.minecraft.item.ItemPickaxe;

public class SAOPickaxe extends ItemPickaxe{

	public SAOPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(MCreativeTabs.tabSAO_Tools);
	}

}
