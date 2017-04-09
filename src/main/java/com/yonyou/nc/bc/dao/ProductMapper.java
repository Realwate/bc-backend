package com.yonyou.nc.bc.dao;

import java.util.List;

import com.yonyou.nc.bc.entity.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);
    List<Product> getAllProducts();

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}