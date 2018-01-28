package com.wugf.order.service;


import com.wugf.order.model.OrderInfo;

/**
 * Created by acer on 2018-1-28.
 */
public interface OrderInfoService {

    int insertSelective(OrderInfo record);
}
