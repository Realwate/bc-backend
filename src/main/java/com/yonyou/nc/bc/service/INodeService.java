package com.yonyou.nc.bc.service;

import java.util.List;
import java.util.Map;

import com.yonyou.nc.bc.dto.NodeDto;
import com.yonyou.nc.bc.entity.Node;
import com.yonyou.nc.bc.entity.NodeInfo;

public interface INodeService {
	public List<Node> getNodeListByProductId(Integer id);
	
	public Map<String, Object> getAllNodeData(int productId);
	public void addNode(Node node);
	public void editNode(Node node);
	public void deleteNode(String id);

	public List<NodeInfo> getAllNodeInfo();
	
	public void updateNodeInfo(NodeInfo info);
	public List<NodeInfo> getNodeInfoByProductId(Integer productId);
	
}
