package com.yonyou.nc.bc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yonyou.nc.bc.dto.DocumentDto;
import com.yonyou.nc.bc.entity.FileEntity;
import com.yonyou.nc.bc.service.IDocumentService;
import com.yonyou.nc.bc.service.IFileService;
import com.yonyou.nc.bc.service.INodeService;
import com.yonyou.nc.bc.util.JsonUtil;
import com.yonyou.nc.bc.util.RandomUtil;

@RestController  //自动添加responsebody 
@RequestMapping("/api")
public class DocumentController {
	
	private static final Logger logger = Logger.getLogger(DocumentController.class);
	
	    @Resource  
	    private INodeService nodeService;

	    @Resource  
	    private IDocumentService documentService;

		@Resource
		 private IFileService fileService;
		
	    
	    @GetMapping(value={"/document/{documentId}"},produces="application/json;charset=UTF-8")
		public String getDocumentById(@PathVariable String documentId) {
	    	
	    	DocumentDto documentDto = documentService.getDocumentById(documentId);
	    	logger.info("得到documentDTO");
	    	
	    	 return JsonUtil.jsonFormatSuccess(documentDto);
		}
	    
	    
	    /*---- document对应的file ----*/
	    
	    @PostMapping(value={"/document/{documentId}/file"},produces="application/json;charset=UTF-8")
	    public String fileUpload(@PathVariable String documentId,HttpServletRequest request,@RequestParam("file") MultipartFile file) {  
	        // 判断文件是否为空  
	        if (!file.isEmpty()) {  
	            try {     	
	                // 文件保存路径  
	                String filePath = 
	                		RandomUtil.getFormatPath(request.getServletContext());
	                		
	                // 转存文件  
	                file.transferTo(new File(filePath));  
	                
	                String fileId = fileService.addFile(filePath,file.getOriginalFilename(),documentId);
	                
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        }  
	        return JsonUtil.jsonFormatSuccess("");
	    }  
	    
	    //根据fileId获得文件
	    @GetMapping("/document/{documentId}/file/{fileId}")  
	    public void getFileById(HttpServletRequest request, HttpServletResponse response, @PathVariable String fileId) {  
	       
	    	FileEntity fileEntity = fileService.getFileById(fileId);
	    	File file =  new File(fileEntity.getPath());
	    	logger.info("获取文件 "+fileEntity.getPath());
	    	if(!file.exists()){
	    		return;
	    	}

	    	response.setContentType("application/octet-stream");
	    	response.addHeader("Content-Disposition", "attachment; filename="+fileEntity.getFilename());
	    	
	    	FileInputStream fileInputStream = null;
	    	OutputStream outputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
				byte[] by  = new byte[fileInputStream.available()];
		    	fileInputStream.read(by);
		    	
		    	outputStream = response.getOutputStream();
		    	outputStream.write(by);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try{
				fileInputStream.close();
		    	outputStream.close();
				}
				catch(Exception e2){
					e2.printStackTrace();
				}
			}
	    	
	    	
	    	
	    	
	    }  
	 
	    
	}  

