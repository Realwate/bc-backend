package com.yonyou.nc.bc.service;

import java.util.List;
import com.yonyou.nc.bc.entity.Config;

public interface IConfigService {
	
	 public List<Config> getAllConfig();
	 
	 public Config getFirstConfig();
}
