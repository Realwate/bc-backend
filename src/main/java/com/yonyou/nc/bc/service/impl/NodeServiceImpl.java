package com.yonyou.nc.bc.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.nc.bc.dao.DocumentMapper;
import com.yonyou.nc.bc.dao.NodeInfoMapper;
import com.yonyou.nc.bc.dao.NodeMapper;
import com.yonyou.nc.bc.dto.NodeDto;
import com.yonyou.nc.bc.entity.Document;
import com.yonyou.nc.bc.entity.Node;
import com.yonyou.nc.bc.entity.NodeInfo;
import com.yonyou.nc.bc.service.INodeService;
import com.yonyou.nc.bc.util.RandomUtil;

@Service
@Transactional
public class NodeServiceImpl implements INodeService{

	@Resource
	private NodeMapper nodeDao;
	
	@Resource
	private NodeInfoMapper nodeInfoDao;
	
	@Resource
	private DocumentMapper documentDao;
	
	public List<Node> getNodeListByProductId(Integer id) {
		List<Node> nodeList = nodeDao.getNodeListByProductId(id);
		
		return nodeList;
	}
	public void updateNodeInfo(NodeInfo info){
		nodeInfoDao.updateByPrimaryKeySelective(info);
	}
	
//	添加结点 如果是三级节点 添加nodeinfo
	//nodeInfo m默认添加document
	@SuppressWarnings("unused")
	public void addNode(Node node){
		
		Node parent = nodeDao.selectByPrimaryKey(node.getParentid());
		node.setId(RandomUtil.getUUID());
		node.setNodelevel(1);
		if(parent!=null){
		  node.setNodelevel(parent.getNodelevel()+1);
		  node.setParentid(parent.getId());
		}
		nodeDao.insertSelective(node);
		
		//int a = 1/0;  //测试 事务
		
		if(node.getNodelevel() == 3){
			//插入空文档
			Document doc = new Document();
			doc.setId(RandomUtil.getUUID());
			doc.setNodeid(node.getId());
			documentDao.insertSelective(doc);
			
			
			//添加Info
			NodeInfo info = new NodeInfo();
			info.setProductid(node.getProductid());
			info.setId(RandomUtil.getUUID());
			info.setDocumentid(doc.getId());
			info.setNodeid(node.getId());
			info.setDevelopflag(0);
			info.setRequirementflag(0);
			info.setTestflag(0);
			nodeInfoDao.insertSelective(info);
		}
		
	}
	public void editNode(Node node){
		
		nodeDao.updateByPrimaryKeySelective(node);
	}
	
	//删除结点 
	public void deleteNode(String id){
		//删除结点
		Node node = nodeDao.selectByPrimaryKey(id);
		if(node.getNodelevel()==3){
			nodeInfoDao.deleteByNodeId(id);
		}
		nodeDao.deleteByPrimaryKey(id);
		//
	}

	//得到全部nodeinfo
	public List<NodeInfo> getAllNodeInfo(){
		List<NodeInfo> nodeList = nodeInfoDao.getAllNodeInfo();
		
		return nodeList;
	}
	
	/**
	 * 得到所有节点的数据
	 */
	public Map<String, Object> getAllNodeData(int productId){
		//得到对应product全部节点
		List<Node> nodeList = nodeDao.getNodeListByProductId(productId);
		Map<String, NodeInfo> mapNodeInfo = getMapNodeInfo();
		
		List<NodeDto> root = getChildNodes(null,nodeList);
		DFSTraverse(root,nodeList,mapNodeInfo);
		
		List<NodeInfo> NodeInfo = nodeInfoDao.getNodeInfoByProductId(productId);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("node", root);
		map.put("nodeInfo", NodeInfo);
		
		return map;
	}
	
	private Map<String,NodeInfo> getMapNodeInfo(){
		List<NodeInfo> allNodeInfo = nodeInfoDao.getAllNodeInfo();
		Map<String,NodeInfo> map = new HashMap<String,NodeInfo>();
		for(NodeInfo info : allNodeInfo){
			map.put(info.getNodeid(), info);
		}
		return map;
	} 
	
	private void DFSTraverse(List<NodeDto> list,List<Node> nodeList,Map<String, NodeInfo> mapNodeInfo){
		for(NodeDto dto : list){
			List<NodeDto> children = getChildNodes(dto.getId(),nodeList);
			
//			if(children.size() == 0 && dto.getNodelevel() ==3){//leaf node 设置nodeinfo
//				dto.setNodeInfo(mapNodeInfo.get(dto.getId()));
//			}
				
			dto.setChildren(children);
			

			DFSTraverse(children,nodeList,mapNodeInfo);
		}
	}
	
	private List<NodeDto> getChildNodes(String id,List<Node> nodeList){
		List<NodeDto> list = new ArrayList<NodeDto>();
		for(Node node : nodeList){
			if((node.getParentid() == null && id==null)
					||(id!=null && id.equals(node.getParentid() ))){
				
				list.add(new NodeDto(node));
			}
		}
		return list;
	}
	public List<NodeInfo> getNodeInfoByProductId(Integer productId) {
		
	    List<NodeInfo> nodeList = nodeInfoDao.getNodeInfoByProductId(productId);
		return nodeList;
		
	}


}
