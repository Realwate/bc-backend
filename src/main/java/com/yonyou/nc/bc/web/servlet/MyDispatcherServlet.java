package com.yonyou.nc.bc.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.DispatcherServlet;

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
