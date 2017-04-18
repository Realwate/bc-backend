package com.yonyou.nc.bc.web.handle;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.yonyou.nc.bc.util.JsonUtil;

//全局异常处理
public class ExceptionHandler implements HandlerExceptionResolver{

	Logger logger = Logger.getLogger(ExceptionHandler.class);
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		
		StringWriter sw = null;
		  PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw =  new PrintWriter(sw);
            //将出错的栈信息输出到printWriter中
            ex.printStackTrace(pw);
            pw.flush();
            sw.flush();
            //异常统一返回处理
            response.setContentType("application/json;charset=UTF-8");
             PrintWriter writer = response.getWriter();
             writer.write(JsonUtil.jsonFormatError(500, "服务器异常"));
             writer.close();
             
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if (sw != null) {
                try {
                    sw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (pw != null) {
                pw.close();
            }
        };
        
        logger.error(sw.toString());
		return null;
	}
	private void write(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
