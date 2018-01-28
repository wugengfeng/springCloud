package com.wugf.user.service;

import com.wugf.user.model.User;

/**
 * Created by acer on 2018-1-28.
 */
public interface UserService {

    int insertSelective(User record);
}
