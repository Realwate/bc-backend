package com.yonyou.nc.bc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.nc.bc.entity.Product;
import com.yonyou.nc.bc.service.IProductService;
import com.yonyou.nc.bc.util.JsonUtil;

@RestController  //自动添加responsebody 
@RequestMapping("/api/product")
public class ProductController {
	
	private static final Logger logger = Logger.getLogger(ProductController.class);
	    @Resource  
	    private IProductService productService;  

	    
	    @GetMapping(value={ "", "/" },produces="application/json;charset=UTF-8")
		public String getAllProducts() {
	    	logger.info("得到所有products");
	    	List<Product> products = this.productService.getAllProducts();
	    	 return JsonUtil.jsonFormatSuccess(products);
		}
	 
	    
	}  

