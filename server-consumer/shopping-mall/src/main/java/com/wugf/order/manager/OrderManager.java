package com.wugf.order.manager;

import com.wugf.constant.ResultMsg;
import com.wugf.order.api.OrderInfoApi;
import com.wugf.order.entity.OrderInfo;
import com.wugf.order.vo.OrderVo;
import com.wugf.user.api.UserInfoApi;
import com.wugf.user.entity.UserInfo;
import com.wugf.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 订单管理器，跨服务实现层
 */
@Service
public class OrderManager {
    @Autowired
    private OrderInfoApi orderInfoApi;
    @Autowired
    private UserInfoApi userInfoApi;

    public ResultVo<OrderVo> getOrderDetailById(Integer orderId){
        ResultVo<OrderVo> resultVo = new ResultVo<>();
        try {
            OrderVo orderVo = new OrderVo();
            OrderInfo orderInfo = orderInfoApi.getOrderInfoById(orderId);
            UserInfo userInfo = userInfoApi.getUserInfoById(orderInfo.getOrderUserId());
            orderVo.setOrderInfo(orderInfo);
            orderVo.setUserInfo(userInfo);

            resultVo.setData(orderVo);
            resultVo.setResultMsg(ResultMsg.SUCCESS);
        } catch (Exception e) {
            resultVo.setResultMsg(ResultMsg.FAIL);
        }
        return resultVo;
    }
}
