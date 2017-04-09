package com.yonyou.nc.bc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yonyou.nc.bc.dao.ProductMapper;
import com.yonyou.nc.bc.entity.Product;
import com.yonyou.nc.bc.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{

	@Resource
	private ProductMapper productDao;
	
	public List<Product> getAllProducts() {
		List<Product> products = productDao.getAllProducts();
		return products;
	}
	 
}
