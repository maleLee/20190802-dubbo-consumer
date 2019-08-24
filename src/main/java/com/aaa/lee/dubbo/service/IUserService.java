package com.aaa.lee.dubbo.service;

import com.aaa.lee.dubbo.model.DbUser;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/2 11:36
 * @Description
 **/
public interface IUserService {

    List<DbUser> selectAllUsers();

}
