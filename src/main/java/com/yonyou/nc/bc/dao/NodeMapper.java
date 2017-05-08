package com.yonyou.nc.bc.dao;

import java.util.List;

import com.yonyou.nc.bc.entity.Node;

public interface NodeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Node record);

    int insertSelective(Node record);

    Node selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
	 List<Node> getNodeListByProductId(Integer productId);
	 List<Node> getNodeListByParentId(String parentId);
	 int deleteList(List<String> id);
}