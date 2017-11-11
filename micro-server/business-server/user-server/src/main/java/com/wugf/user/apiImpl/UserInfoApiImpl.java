package com.wugf.user.apiImpl;

import com.wugf.user.api.UserInfoApi;
import com.wugf.user.entity.UserInfo;
import com.wugf.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息远程API接口实现
 */
@RestController
public class UserInfoApiImpl implements UserInfoApi{

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public UserInfo getUserInfoById(@RequestParam("userId") Integer userId) {
        return userInfoService.searchUserInfoById(userId);
    }
}
