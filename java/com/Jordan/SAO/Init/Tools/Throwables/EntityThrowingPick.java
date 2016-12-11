package com.Jordan.SAO.Init.Tools.Throwables;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityThrowingPick extends EntityThrowable{
	
	public EntityThrowingPick(World worldIn) {
		
		super(worldIn);
	}
	
	public EntityThrowingPick(World worldIn, EntityLivingBase throwerIn) {
		
		super(worldIn, throwerIn);
	}
	
	public EntityThrowingPick(World worldIn, double x, double y, double z) {
		
		super(worldIn, x, y, z);
	}
	
	@Override
	protected void onImpact(RayTraceResult result){
		
		if(result.entityHit != null){
			
			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 6.0F);
		}
		
		if(!this.worldObj.isRemote && this.rand.nextInt(8) == 0){
			
			int i = 1;
			if(this.rand.nextInt(32) == 0){
				i = 4;
			}
			
			double d0 = 0.08D;
			
			for(int k = 0; k < 8; ++k){
				
				this.worldObj.spawnParticle(EnumParticleTypes.ITEM_TAKE, this.posX, this.posY, this.posZ, ((double)this.rand.nextFloat() - 0.5D) * 0.08D, ((double)this.rand.nextFloat() - 0.5D) * 0.08D, ((double)this.rand.nextFloat() - 0.5D) * 0.08D, new int[] {Item.getIdFromItem(Items.ARROW)});
			}
			
			if(!this.worldObj.isRemote){
				
				this.setDead();
			}
		}
	}
}
