package com.yonyou.nc.bc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.nc.bc.dao.DocumentMapper;
import com.yonyou.nc.bc.dao.NodeInfoMapper;
import com.yonyou.nc.bc.dao.NodeMapper;
import com.yonyou.nc.bc.dto.DocumentDto;
import com.yonyou.nc.bc.entity.Document;
import com.yonyou.nc.bc.entity.Node;
import com.yonyou.nc.bc.service.IDocumentService;

@Service
@Transactional
public class DocumentServiceImpl implements IDocumentService{

	@Resource
	private NodeMapper nodeDao;
	
	@Resource
	private NodeInfoMapper nodeInfoDao;
	
	@Resource
	private DocumentMapper documentDao;
	
	//得到document 及对应的node
    public DocumentDto getDocumentById(String documentId){
    	Document document = documentDao.selectByPrimaryKey(documentId);
    	Node node = nodeDao.selectByPrimaryKey(document.getNodeid());
    	
    	DocumentDto dto = new DocumentDto(document,node);
    	
    	return dto;
    }

}
