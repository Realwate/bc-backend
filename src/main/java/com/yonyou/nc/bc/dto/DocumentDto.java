package com.yonyou.nc.bc.dto;

import java.util.List;

import com.yonyou.nc.bc.entity.Document;
import com.yonyou.nc.bc.entity.Node;

public class DocumentDto {
	private Document document;
	private Node node;
	
	private List<FileDto> prototypeImgList;
	private List<FileDto> detailImgList;
	
	public DocumentDto(){
		
	}
	public DocumentDto(Document document, Node node) {
		super();
		this.document = document;
		this.node = node;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}

	/**
	 * @return the detailImgList
	 */
	public List<FileDto> getDetailImgList() {
		return detailImgList;
	}
	/**
	 * @param detailImgList the detailImgList to set
	 */
	public void setDetailImgList(List<FileDto> detailImgList) {
		this.detailImgList = detailImgList;
	}
	/**
	 * @return the prototypeImgList
	 */
	public List<FileDto> getPrototypeImgList() {
		return prototypeImgList;
	}
	/**
	 * @param prototypeImgList the prototypeImgList to set
	 */
	public void setPrototypeImgList(List<FileDto> prototypeImgList) {
		this.prototypeImgList = prototypeImgList;
	}
	
	
}
