package com.wugf.user.api;

import com.wugf.user.entity.UserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户信息远程API接口
 */
@FeignClient("user-server")
@RequestMapping("/user/userInfoApi")
public interface UserInfoApi {

    /**
     * 根据用户id获取用户信息
     * @param userId
     * @return
     */
    @RequestMapping(value = "getUserInfo", method = RequestMethod.POST)
    UserInfo getUserInfoById(@RequestParam("userId") Integer userId);
}
