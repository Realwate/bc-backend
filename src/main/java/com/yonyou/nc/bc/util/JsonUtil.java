package com.yonyou.nc.bc.util;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.nc.bc.dto.ErrorMsg;

/**
 * 格式化返回的json
 * @author Administrator
 *
 */
public class JsonUtil {

	//{error:{message:""},data:{}}
	public static <T> String jsonFormatError(int statusCode,String content,T t){
		JSONObject json = new JSONObject();
		ErrorMsg msg = new ErrorMsg(content,statusCode);
		json.put("error",msg);
		json.put("data",t);
		return json.toString();
	}
	public static <T> String jsonFormatSuccess(T t){
		JSONObject json = new JSONObject();
		json.put("error",null);
		json.put("data",t);
		return json.toString();
	}
}
