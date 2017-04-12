package com.yonyou.nc.bc.web.intercepter;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSONObject;

//声明这是一个组件
@Component
//声明这是一个切面Bean
@Aspect
public class LogAspect {
	 private final Logger logger = Logger.getLogger(this.getClass());  
	  
	    private String requestPath = null ; // 请求地址  
	    private String requestMethod = null ; // 请求地址  
	    private String userName = null ; // 用户名  
	    private Map<?,?> inputParamMap = null ; // 传入参数  
	    private Map<String, Object> outputParamMap = null; // 存放输出结果  
	    private long startTimeMillis = 0; // 开始时间  
	    private long endTimeMillis = 0; // 结束时间  
	  
	    @Pointcut("execution(* com.yonyou.nc.bc.web.controller..*.*(..))")
		public void aspect(){	}
	    
	    
	    @Before("aspect()")  
	    public void doBeforeInServiceLayer(JoinPoint joinPoint) {  
	        startTimeMillis = System.currentTimeMillis(); // 记录方法开始执行的时间  
	    }  
	  
	    @After("aspect()")  
	    public void doAfterInServiceLayer(JoinPoint joinPoint) {  
	        endTimeMillis = System.currentTimeMillis(); // 记录方法执行完成的时间  
	        this.printOptLog();  
	    }  
	  
	    @Around("aspect()")  
	    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
	    	
	    	RequestAttributes ra = RequestContextHolder.getRequestAttributes();  
	        ServletRequestAttributes sra = (ServletRequestAttributes)ra;  
	        HttpServletRequest request = sra.getRequest();  
	       
	        // 获取输入参数  
	        inputParamMap = request.getParameterMap();  
	        // 获取请求地址  
	        requestPath = request.getRequestURI();  
	        requestMethod = request.getMethod();
	        
	        logger.info("收到请求： method:"+requestMethod+"  url:"+requestPath);
	        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行  
	        outputParamMap = new HashMap<String, Object>();  
	        Object result = pjp.proceed();// result的值就是被拦截方法的返回值  
	        outputParamMap.put("result", result);  
	          
	        return result;  
	    }
	  //配置抛出异常后通知,使用在方法aspect()上注册的切入点
		@AfterThrowing(pointcut="aspect()", throwing="ex")
		public void afterThrow(JoinPoint joinPoint, Exception ex){
			
			logger.error("afterThrow " + joinPoint + "\t" + ex.getMessage());
		}
	  
	    private void printOptLog() {  
	        String optTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTimeMillis);  
	        logger.info("method:"+requestMethod+"  url:"+requestPath+"\t开始时间:" + optTime + "\t用时:" + (endTimeMillis - startTimeMillis) + "ms \n"  
	                +"param："+JSONObject.toJSONString(inputParamMap)+"\nresult："+JSONObject.toJSONString(outputParamMap));  
	    }  
}
