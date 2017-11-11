package com.wugf;

import com.wugf.user.UserServerApplication;
import com.wugf.user.entity.UserInfo;
import com.wugf.user.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserServerApplication.class, properties = "spring.profiles.active=local")
public class UserInfoTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void test(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        System.out.println(userInfoService.search(userInfo));
    }
}
