package com.yonyou.nc.bc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.nc.bc.dao.IUserDao;
import com.yonyou.nc.bc.entity.User;
import com.yonyou.nc.bc.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	 @Resource  
    private IUserDao userDao;

	public User getUserById(int userId) {
		
		User user = userDao.selectByPrimaryKey(userId);
		return user;
	}  
	 
}
