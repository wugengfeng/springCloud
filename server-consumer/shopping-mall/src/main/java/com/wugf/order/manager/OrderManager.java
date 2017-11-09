package com.wugf.order.manager;

import com.wugf.api.OrderApi;
import com.wugf.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单管理器，跨服务实现层
 */
@Service
public class OrderManager {
    @Autowired
    private OrderApi orderApi;

    public Order getOrder(Long id){
        return orderApi.getOrderInfo(id);
    }
}
