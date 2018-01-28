package com.wugf.order.service.impl;


import com.wugf.order.mapper.OrderInfoMapper;
import com.wugf.order.model.OrderInfo;
import com.wugf.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public int insertSelective(OrderInfo record) {
        return orderInfoMapper.insertSelective(record);
    }
}
