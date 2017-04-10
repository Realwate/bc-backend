package com.yonyou.nc.bc.util;

import java.util.ArrayList;
import java.util.List;

import com.yonyou.nc.bc.dto.FileDto;
import com.yonyou.nc.bc.entity.FileEntity;

public class TransformUtil {

	public static List<FileDto> transform2FileDto(List<FileEntity> fileEntityList){

		List<FileDto> result = new ArrayList<FileDto>();
		for(FileEntity item : fileEntityList){
			result.add(new FileDto(item));
		}
		
		return result;
	}
}
