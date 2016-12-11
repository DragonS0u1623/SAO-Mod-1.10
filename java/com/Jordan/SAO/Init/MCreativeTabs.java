package com.Jordan.SAO.Init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MCreativeTabs {
	
	public static final CreativeTabs tabSAO_Food = new CreativeTabs("tabSAO_Food"){
		
		@Override
		public Item getTabIconItem(){
			return MFoods.Asunas_Sandwich;
		}
	};
	
	public static final CreativeTabs tabSAO_Blocks = new CreativeTabs("tabSAO_Blocks"){
		
		@Override
		public Item getTabIconItem(){
			return Item.getItemFromBlock(MBlocks.DUNGEON_FLOOR);
		}
	};
	
	public static final CreativeTabs tabSAO_Armor = new CreativeTabs("tabSAO_Armor"){
		
		@Override
		public Item getTabIconItem(){
			return MArmors.BLACKWYRM_CLOAK;
		}
	};
	
	public static final CreativeTabs tabSAO_Tools = new CreativeTabs("tabSAO_Tools"){
		
		@Override
		public Item getTabIconItem(){
			return MItems.Elucidator;
		}
	};
	
	public static final CreativeTabs tabSAO_Items = new CreativeTabs("tabSAO_Items"){
		
		@Override
		public Item getTabIconItem(){
			return MItems.Baton;
		}
	};
	
	public static final CreativeTabs tabSAO_Misc = new CreativeTabs("tabSAO_Misc"){
		
		@Override
		public Item getTabIconItem(){
			return MItems.Knife;
		}

	};
}
