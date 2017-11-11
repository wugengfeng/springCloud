package com.wugf.order.vo;


import com.wugf.order.entity.OrderInfo;
import com.wugf.user.entity.UserInfo;

public class OrderVo {
    private OrderInfo orderInfo;
    private UserInfo userInfo;

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
