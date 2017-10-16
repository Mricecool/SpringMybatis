package com.mybatis.service;

import com.mybatis.model.Userinfo;

/**
 * Created by mr on 2017/8/4.
 */
public interface UserService {

    Userinfo getUserInfoById(long id);

}
