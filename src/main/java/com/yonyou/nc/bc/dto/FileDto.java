package com.yonyou.nc.bc.dto;

import com.yonyou.nc.bc.entity.FileEntity;

public class FileDto {
	
	private String id;
	private String path;
	private String alt;
	public FileDto(){}
	public FileDto(String documentId,String fileId,String fileName){
		this.alt = fileName;
		this.setId(fileId);
		 StringBuilder sb = new StringBuilder();
	     sb.append("/document/");
	     sb.append(documentId);
	     sb.append("/file/");
	     sb.append(fileId);
		this.path = sb.toString();
	}
	public FileDto(FileEntity fileEntity){
		this.setId(fileEntity.getId());
	     this.alt = fileEntity.getFilename();	
	     StringBuilder sb = new StringBuilder();
	     sb.append("/document/");
	     sb.append(fileEntity.getDocumentid());
	     sb.append("/file/");
	     sb.append(fileEntity.getId());
	     
	     this.path = sb.toString();
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
}
