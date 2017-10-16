package com.mybatis.controller;

import com.mybatis.model.Userinfo;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by mr on 2017/8/4.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/t", method = RequestMethod.GET)
    @ResponseBody
    public Userinfo test(long id) {
        System.out.println("----"+id);
        return userService.getUserInfoById(id);
    }

}
