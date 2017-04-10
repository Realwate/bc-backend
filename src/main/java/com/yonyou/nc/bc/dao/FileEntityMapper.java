package com.yonyou.nc.bc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yonyou.nc.bc.entity.FileEntity;

public interface FileEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(FileEntity record);

    int insertSelective(FileEntity record);

    FileEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FileEntity record);

    int updateByPrimaryKey(FileEntity record);
    
    List<FileEntity> getFileByDocumentIdAndType(@Param("documentId")String documentId,
    		@Param("type")Integer type);
}