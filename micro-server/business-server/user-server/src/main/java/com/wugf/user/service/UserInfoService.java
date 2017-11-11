package com.wugf.user.service;

import com.wugf.user.entity.UserInfo;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserInfoService{
	
	/**
	 *  新增 UserInfo
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	int create(UserInfo userInfo);
	
	/**
	 *  查询 UserInfo
	 */
	@Transactional(readOnly = true)
	List<UserInfo> search(UserInfo userInfo);
	
	/**
	 *  修改 UserInfo
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	int update(UserInfo userInfo);
	 
	/**
	 *  根据id删除UserInfo
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	int deleteUserInfoById(Integer id);
	
	/**
	 *  根据id查询UserInfo
	 */
	@Transactional(readOnly = true)
	UserInfo searchUserInfoById(Integer id);
}