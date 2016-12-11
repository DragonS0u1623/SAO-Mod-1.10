package com.Jordan.SAO.Init.Tools;

import com.Jordan.SAO.Init.MCreativeTabs;

import net.minecraft.item.ItemAxe;

public class SAOAxe extends ItemAxe{

	public SAOAxe(ToolMaterial material) {
		super(material, 3.0F, 3.0F);
		setCreativeTab(MCreativeTabs.tabSAO_Tools);
	}

}
