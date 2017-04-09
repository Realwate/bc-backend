package com.yonyou.nc.bc.dao;

import java.util.List;

import com.yonyou.nc.bc.entity.NodeInfo;

public interface NodeInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(NodeInfo record);

    int insertSelective(NodeInfo record);

    NodeInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NodeInfo record);

    int updateByPrimaryKey(NodeInfo record);
	List<NodeInfo> getAllNodeInfo();
	List<NodeInfo> getNodeInfoByProductId(Integer productId);
	int deleteByNodeId(String nodeId);
}