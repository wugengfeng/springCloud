package com.wugf.user.dao;

import com.wugf.user.entity.UserInfo;

import java.util.List;

public interface UserInfoDao{
	
	/**
	 *  新增 UserInfo
	 */
	int create(UserInfo userInfo);
	
	/**
	 *  查询 UserInfo
	 */
	List<UserInfo> search(UserInfo userInfo);
	
	/**
	 *  修改 UserInfo
	 */
	int update(UserInfo userInfo);
	 
	/**
	 *  根据id删除UserInfo
	 */
	int deleteUserInfoById(Integer id);
	
	/**
	 *  根据id查询UserInfo
	 */
	UserInfo searchUserInfoById(Integer id);
}