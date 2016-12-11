package com.Jordan.SAO.main;

import org.apache.logging.log4j.Logger;

import com.Jordan.SAO.main.proxy.commonproxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod (modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class SAOmod {
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static commonproxy proxy;
	
	@Instance("saomod")
	public static SAOmod instance;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent Event){
		logger = Event.getModLog();
		proxy.preInit(Event);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent Event){
		proxy.init(Event);
	}
	
	@EventHandler
	public void Postinit(FMLPostInitializationEvent Event){
		proxy.Postinit(Event);
	}
}
