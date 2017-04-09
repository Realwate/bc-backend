package com.yonyou.nc.bc.dto;

import com.yonyou.nc.bc.entity.Document;
import com.yonyou.nc.bc.entity.Node;

public class DocumentDto {
	private Document document;
	private Node node;
	
	
	
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
	
	
}
