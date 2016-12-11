package com.Jordan.SAO.Init.Tools;

import com.Jordan.SAO.Init.MCreativeTabs;

import net.minecraft.item.ItemSword;

public class SAOSword extends ItemSword{

	public SAOSword(ToolMaterial material) {
		super(material);
		setCreativeTab(MCreativeTabs.tabSAO_Tools);
	}

}
