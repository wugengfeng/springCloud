package com.wugf.order.service.impl;


import com.wugf.order.dao.OrderInfoDao;
import com.wugf.order.entity.OrderInfo;
import com.wugf.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service("orderInfoService")
public class OrderInfoServiceImpl implements OrderInfoService {
	private Logger log = LoggerFactory.getLogger(OrderInfoServiceImpl.class);
	
	@Autowired
	private OrderInfoDao orderInfoDao;
	
	public int create(OrderInfo orderInfo){
		return orderInfoDao.create(orderInfo);
	}
	
	public List<OrderInfo> search(OrderInfo orderInfo){
		return orderInfoDao.search(orderInfo);
	}
	
	public int update(OrderInfo orderInfo){
		return orderInfoDao.update(orderInfo);
	}
	 
	public int deleteOrderInfoById(Integer id){
		return orderInfoDao.deleteOrderInfoById(id);
	}
	
	public OrderInfo searchOrderInfoById(Integer id){
		return orderInfoDao.searchOrderInfoById(id);
	}
}