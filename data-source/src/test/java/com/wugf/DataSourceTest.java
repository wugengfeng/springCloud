package com.wugf;

import com.wugf.order.model.OrderInfo;
import com.wugf.order.service.OrderInfoService;
import com.wugf.user.model.User;
import com.wugf.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by acer on 2018-1-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DataSourceTest {

    @Autowired
    private OrderInfoService orderInfoService;

    @Autowired
    private UserService userService;

    @Test
    public void dataSource() {

        User user = new User();
        user.setMoney(100d);
        user.setName("wugf");
        userService.insertSelective(user);

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderNum("123-456");
        orderInfoService.insertSelective(orderInfo);
    }
}
