package com.yonyou.nc.bc.dao;

import java.util.List;

import com.yonyou.nc.bc.entity.Config;

public interface ConfigMapper {
    int deleteByPrimaryKey(String id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(String id);
    
    List<Config> getAllConfig();

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}