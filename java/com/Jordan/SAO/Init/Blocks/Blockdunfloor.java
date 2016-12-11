package com.Jordan.SAO.Init.Blocks;

import java.util.Random;

import com.Jordan.SAO.Init.MBlocks;
import com.Jordan.SAO.Init.MCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Blockdunfloor extends Block{

	public Blockdunfloor(){
		super(Material.ROCK);
		setRegistryName("dunfloor");
		setUnlocalizedName("dunfloor");
		setCreativeTab(MCreativeTabs.tabSAO_Blocks);
	}
}