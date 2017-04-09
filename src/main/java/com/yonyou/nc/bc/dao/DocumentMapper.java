package com.yonyou.nc.bc.dao;

import com.yonyou.nc.bc.entity.Document;

public interface DocumentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Document record);

    int insertSelective(Document record);

    Document selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);
}