package com.yonyou.nc.bc.service;

import com.yonyou.nc.bc.entity.FileEntity;


public interface IFileService {
	
	public String addFile(String path,String fileName,String documentid,Integer type);
	public FileEntity getFileById(String fileid);
}
