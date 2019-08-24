package com.aaa.lee.dubbo.controller;

import com.aaa.lee.dubbo.model.DbUser;
import com.aaa.lee.dubbo.service.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/2 11:36
 * @Description
 **/
@RestController
public class UserController {

    @Reference
    private IUserService userService;

    @RequestMapping("/all")
    public List<DbUser> selectAllUsers() {
        return userService.selectAllUsers();
    }

}
