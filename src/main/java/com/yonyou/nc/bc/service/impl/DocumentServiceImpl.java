package com.yonyou.nc.bc.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.nc.bc.dao.DocumentMapper;
import com.yonyou.nc.bc.dao.FileEntityMapper;
import com.yonyou.nc.bc.dao.NodeInfoMapper;
import com.yonyou.nc.bc.dao.NodeMapper;
import com.yonyou.nc.bc.dto.DocumentDto;
import com.yonyou.nc.bc.dto.FileDto;
import com.yonyou.nc.bc.entity.Document;
import com.yonyou.nc.bc.entity.FileEntity;
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
	
	@Resource
	private FileEntityMapper fileDao;
	
	//得到document 对应的node
	//原型图 详细图
    public DocumentDto getDocumentById(String documentId){
    	Document document = documentDao.selectByPrimaryKey(documentId);
    	Node node = nodeDao.selectByPrimaryKey(document.getNodeid());
    	
    	 List<FileEntity> prototypeImgList = fileDao.getFileByDocumentIdAndType(documentId, 1);
    	 List<FileEntity> detailImgList = fileDao.getFileByDocumentIdAndType(documentId, 2);
    	
    	DocumentDto dto = new DocumentDto(document,node);
    	
    	dto.setDetailImgList(transform2FileDto(detailImgList));
    	dto.setPrototypeImgList(transform2FileDto(prototypeImgList));
    	
    	return dto;
    }
    private List<FileDto> transform2FileDto(List<FileEntity> fileEntityList){

		List<FileDto> result = new ArrayList<FileDto>();
		for(FileEntity item : fileEntityList){
			result.add(new FileDto(item));
		}
		
		return result;
	}

    public void deleteFileById(String fileId){
    	fileDao.deleteByPrimaryKey(fileId);
    	
    }
    public void updateDocument(Document doc){
    	documentDao.updateByPrimaryKeySelective(doc);
    }
    
}
