package com.yonyou.nc.bc.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.yonyou.nc.bc.entity.Node;
import com.yonyou.nc.bc.entity.NodeInfo;
import com.yonyou.nc.bc.util.RandomUtil;

public class NodeDto {


	private String id;
	private String localId = RandomUtil.getUUID();
	private String label;
	private Integer productid;
	private String parentid;
	private Integer level;

	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public Integer getProductid() {
		return productid;
	}


	public void setProductid(Integer productid) {
		this.productid = productid;
	}



	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getParentid() {
		return parentid;
	}


	public void setParentid(String parentid) {
		this.parentid = parentid;
	}



	private List<NodeDto> children; //非leaf设置children
	private NodeInfo nodeInfo;//leaf node设置info
	
	public NodeDto(Node node){
		this.id = node.getId();
		this.label = node.getLabel();
		this.productid = node.getProductid();
		this.parentid = node.getParentid();
		this.setLevel(node.getNodelevel());
	}
	

	public List<NodeDto> getChildren() {
		return children;
	}
	public void setChildren(List<NodeDto> children) {
		this.children = children;
	}

	public NodeInfo getNodeInfo() {
		return nodeInfo;
	}

	public void setNodeInfo(NodeInfo nodeInfo) {
		this.nodeInfo = nodeInfo;
	}


	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}


	/**
	 * @param level the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}


	/**
	 * @return the localId
	 */
	public String getLocalId() {
		return localId;
	}


	/**
	 * @param localId the localId to set
	 */
	public void setLocalId(String localId) {
		this.localId = localId;
	}
	
}
