package com.yonyou.nc.bc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.nc.bc.dao.ConfigMapper;
import com.yonyou.nc.bc.entity.Config;
import com.yonyou.nc.bc.service.IConfigService;

@Service
@Transactional
public class ConfigServiceImpl implements IConfigService{

	@Resource
	private ConfigMapper configDao;

	public List<Config> getAllConfig() {
		return configDao.getAllConfig();
	}

	public Config getFirstConfig() {
		List<Config> allConfig = getAllConfig();
		if(allConfig == null || allConfig.size() == 0){
			throw new RuntimeException("数据库暂无配置信息！");
		}
		
		return allConfig.get(0);
	}
	
    
}
