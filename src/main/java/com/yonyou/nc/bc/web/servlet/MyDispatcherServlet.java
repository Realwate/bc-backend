package com.yonyou.nc.bc.web.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.NoHandlerFoundException;

public class MyDispatcherServlet extends  DispatcherServlet {

	/**
	 * 
	 */
	private Logger logger = Logger.getLogger(DispatcherServlet.class);
	private static final long serialVersionUID = 1L;

	protected void noHandlerFound(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("返回default页面");
//		response.setContentType("text/html; charset=utf-8");
//		InputStream inputStream = request.getServletContext().getResourceAsStream("/dist/index.html");
//		OutputStream outputStream = response.getOutputStream();
//		byte []b = new byte[1024];
//		int len=-1;
//		while((len = inputStream.read(b))>0){
//			outputStream.write(b,0,len);
//		}
//		outputStream.flush();
		request.getRequestDispatcher("/WEB-INF/pages/test.jsp").forward(request, response);
	}

}
