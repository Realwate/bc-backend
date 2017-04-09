package com.yonyou.nc.bc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.yonyou.nc.bc.dao.DocumentMapper;
import com.yonyou.nc.bc.dao.FileEntityMapper;
import com.yonyou.nc.bc.dao.NodeInfoMapper;
import com.yonyou.nc.bc.dao.NodeMapper;
import com.yonyou.nc.bc.dto.DocumentDto;
import com.yonyou.nc.bc.entity.Document;
import com.yonyou.nc.bc.entity.FileEntity;
import com.yonyou.nc.bc.entity.Node;
import com.yonyou.nc.bc.service.IDocumentService;
import com.yonyou.nc.bc.service.IFileService;
import com.yonyou.nc.bc.util.RandomUtil;

@Service
@Transactional
public class FileServiceImpl implements IFileService{

	@Resource
	private FileEntityMapper fileDao;
	
	@Resource
	private DocumentMapper documentDao;
	
	public String addFile(String path,String fileName,String documentid){
		FileEntity fileEntity = new FileEntity();
		fileEntity.setId(RandomUtil.getUUID());
		fileEntity.setFilename(fileName);
		
		fileEntity.setPath(path);
		fileEntity.setDocumentid(documentid);
		fileDao.insert(fileEntity);
		
		return fileEntity.getId();
	}
	public FileEntity getFileById(String fileid){
		
		FileEntity fileEntity = fileDao.selectByPrimaryKey(fileid);
		
		return fileEntity;
	}
	
}
