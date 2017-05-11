package com.yonyou.nc.bc.dto;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.yonyou.nc.bc.entity.Config;
import com.yonyou.nc.bc.service.IConfigService;

public class Configration{

	private IConfigService configService;
	  
	private Config config;
	
	private static Configration configration;
	private Configration(){
		//手动注入service
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		configService = (IConfigService) wac.getBean("configServiceImpl");
	};
	
	public static Configration getInstance(){
	   if(configration == null){
		   configration = new Configration();
	   }
	   return configration;
	}
	
	public Config getConfig(){
		if(config == null){
			config = configService.getFirstConfig();
		}
		return this.config;
	}

}
