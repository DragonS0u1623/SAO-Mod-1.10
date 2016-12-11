package com.Jordan.SAO.Init.Tools.Throwables;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ThrowingPick extends Item{

	public ThrowingPick(){
		
		this.maxStackSize = 32;
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if (!entityplayer.capabilities.isCreativeMode) {
			itemstack.stackSize--;
		}
	  
		world.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	  
		if (!world.isRemote) {
			
			world.spawnEntityInWorld(new EntityThrowingPick(world, entityplayer));
		}
	  
		return itemstack;
	}
}