package com.wugf.order.dao;


import com.wugf.order.entity.OrderInfo;
import java.util.List;

public interface OrderInfoDao{
	
	/**
	 *  新增 OrderInfo
	 */
	int create(OrderInfo orderInfo);
	
	/**
	 *  查询 OrderInfo
	 */
	List<OrderInfo> search(OrderInfo orderInfo);
	
	/**
	 *  修改 OrderInfo
	 */
	int update(OrderInfo orderInfo);
	 
	/**
	 *  根据id删除OrderInfo
	 */
	int deleteOrderInfoById(Integer id);
	
	/**
	 *  根据id查询OrderInfo
	 */
	OrderInfo searchOrderInfoById(Integer id);
}