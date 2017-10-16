package com.mybatis.service.impl;

import com.mybatis.dao.UserinfoMapper;
import com.mybatis.model.Userinfo;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mr on 2017/8/4.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserinfoMapper userinfoDao;

    public Userinfo getUserInfoById(long id) {
        return userinfoDao.selectByPrimaryKey(id);
    }
}
