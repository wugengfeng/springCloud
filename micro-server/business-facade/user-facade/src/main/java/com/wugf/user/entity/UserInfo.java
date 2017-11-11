package com.wugf.user.entity;

public class UserInfo {
	
	private static final long serialVersionUID = 1L;
	
		
	/**
	 *	
	 */
	private Integer id;
		
	/**
	 *	用户名
	 */
	private String userName;
		
	/**
	 *	
	 */
	private String password;
		
	/**
	 *	
	 */
	private String nickName;
	
		
	/**
	 * 获取 
	 */
	public Integer getId(){
		return this.id;
	}
	
	/**
	 * 设置 
	 */
	public void setId(Integer id){
		this.id = id;
	}
		
	/**
	 * 获取 用户名
	 */
	public String getUserName(){
		return this.userName;
	}
	
	/**
	 * 设置 用户名
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
		
	/**
	 * 获取 
	 */
	public String getPassword(){
		return this.password;
	}
	
	/**
	 * 设置 
	 */
	public void setPassword(String password){
		this.password = password;
	}
		
	/**
	 * 获取 
	 */
	public String getNickName(){
		return this.nickName;
	}
	
	/**
	 * 设置 
	 */
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
}