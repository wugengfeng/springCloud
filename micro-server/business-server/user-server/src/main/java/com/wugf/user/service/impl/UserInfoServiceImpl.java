package com.wugf.user.service.impl;


import com.wugf.user.dao.UserInfoDao;
import com.wugf.user.entity.UserInfo;
import com.wugf.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	private Logger log = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	public int create(UserInfo userInfo){
		return userInfoDao.create(userInfo);
	}
	
	public List<UserInfo> search(UserInfo userInfo){
		return userInfoDao.search(userInfo);
	}
	
	public int update(UserInfo userInfo){
		return userInfoDao.update(userInfo);
	}
	 
	public int deleteUserInfoById(Integer id){
		return userInfoDao.deleteUserInfoById(id);
	}
	
	public UserInfo searchUserInfoById(Integer id){
		return userInfoDao.searchUserInfoById(id);
	}
}