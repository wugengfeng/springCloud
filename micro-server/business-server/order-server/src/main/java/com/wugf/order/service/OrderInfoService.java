package com.wugf.order.service;

import java.util.List;

import com.wugf.order.entity.OrderInfo;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface OrderInfoService{
	
	/**
	 *  新增 OrderInfo
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	int create(OrderInfo orderInfo);
	
	/**
	 *  查询 OrderInfo
	 */
	@Transactional(readOnly = true)
	List<OrderInfo> search(OrderInfo orderInfo);
	
	/**
	 *  修改 OrderInfo
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	int update(OrderInfo orderInfo);
	 
	/**
	 *  根据id删除OrderInfo
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	int deleteOrderInfoById(Integer id);
	
	/**
	 *  根据id查询OrderInfo
	 */
	@Transactional(readOnly = true)
	OrderInfo searchOrderInfoById(Integer id);
}