package com.wugf.api;

import com.wugf.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户 远程rest api
 */
@FeignClient("user-server")
@RequestMapping("user")
public interface UserApi {
    User getUser(@RequestParam("id") Long id);
}
