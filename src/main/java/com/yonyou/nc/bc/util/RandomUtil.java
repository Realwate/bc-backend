package com.yonyou.nc.bc.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletContext;

import com.yonyou.nc.bc.dto.Configration;

public class RandomUtil {
	
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}
//	public static String getFormatPath(ServletContext context){
//		
//		SimpleDateFormat df = new SimpleDateFormat("/yyyy/MM/dd/");
//		String basepath = context.getRealPath("/WEB-INF/upload") + df.format(new Date());
//		File file = new File(basepath);
//		if(!file.exists()){
//			file.mkdirs();
//		}
//		String fullPath = basepath + getUUID();
//		
//		return fullPath;
//	}
	
	public static String getFormatPath(){
		
		SimpleDateFormat df = new SimpleDateFormat("/yyyy/MM/dd/");
		String basepath = Configration.getInstance().getConfig().getUploaddir()
				+ df.format(new Date());
		File file = new File(basepath);
		if(!file.exists()){
			file.mkdirs();
		}
		String fullPath = basepath + getUUID();
		
		return fullPath;
	}
}
