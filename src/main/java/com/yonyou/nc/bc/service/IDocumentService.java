package com.yonyou.nc.bc.service;

import java.util.List;
import java.util.Map;

import com.yonyou.nc.bc.dto.DocumentDto;
import com.yonyou.nc.bc.dto.NodeDto;
import com.yonyou.nc.bc.entity.Document;
import com.yonyou.nc.bc.entity.Node;
import com.yonyou.nc.bc.entity.NodeInfo;

public interface IDocumentService {
	
	 public DocumentDto getDocumentById(String documentId);
	 public void deleteFileById(String fileId);
	 public void updateDocument(Document doc);
}
