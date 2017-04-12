package com.yonyou.nc.bc.web.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.nc.bc.entity.Node;
import com.yonyou.nc.bc.entity.NodeInfo;
import com.yonyou.nc.bc.service.INodeService;
import com.yonyou.nc.bc.util.JsonUtil;

@RestController  //自动添加responsebody 
@RequestMapping("/api")
public class NodeController {
	
	private static final Logger logger = Logger.getLogger(NodeController.class);
	
	    @Resource  
	    private INodeService nodeService;  
	    
 
	    @GetMapping(value={"/nodeInfo"},produces="application/json;charset=UTF-8")
  		public String getNodeInfoByProductId(@RequestParam Integer productId) {
  	    	List<NodeInfo> nodeInfoData = nodeService.getNodeInfoByProductId(productId);
  	    	logger.info("得到指定NodeInfo");
  	    	 return JsonUtil.jsonFormatSuccess(nodeInfoData);
  		}
	    
	    @GetMapping(value={"/node"},produces="application/json;charset=UTF-8")
		public String getNodeByProductId(@RequestParam(value = "productId", required = false, defaultValue = "") 
		int productId) {
	    	Map<String, Object> allNodeData = nodeService.getAllNodeData(productId);
	    	logger.info("得到所有node nodeinfo数据");
	    	 return JsonUtil.jsonFormatSuccess(allNodeData);
		}
	    
	    //添加一个结点修改 node 如果是leaf 添加nodeinfo
	    @PostMapping(value={"/node"},produces="application/json;charset=UTF-8")
		public String addNode(@RequestBody Node node) {
	    	nodeService.addNode(node);
	    	logger.info("添加node数据");
	    	 return JsonUtil.jsonFormatSuccess(node);
		}
	    
	    @PutMapping(value={"/node"},produces="application/json;charset=UTF-8")
		public String editNode(@RequestBody Node node) {
	    	nodeService.editNode(node);
	    	logger.info("更新node数据");
	    	 return JsonUtil.jsonFormatSuccess(node);
		}
	    @PutMapping(value={"/nodeInfo"},produces="application/json;charset=UTF-8")
		public String updateNodeInfo(@RequestBody NodeInfo nodeInfo) {
	    	nodeService.updateNodeInfo(nodeInfo);
	    	logger.info("更新nodeinfo数据");
	    	 return JsonUtil.jsonFormatSuccess(nodeInfo);
		}
	    
	    @DeleteMapping(value="/node/{nodeId}",produces="application/json;charset=UTF-8")
		public String deleteNode(@PathVariable String nodeId) {
	    	nodeService.deleteNode(nodeId);
	    	logger.info("删除node数据");
	    	 return JsonUtil.jsonFormatSuccess("");
		}
	 
	    
	}  

