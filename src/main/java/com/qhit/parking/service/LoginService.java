package com.qhit.parking.service;

import com.qhit.parking.entity.Admin;

import java.util.List;

/**
 * Created by lenovo on 2019/5/25.
 */
public interface LoginService {
    /*登陆*/
    Admin Login( String name, String password);
    /*查询所有*/
    List<Admin> selectAll();
    /*name集查询*/
    List<Admin> adminName(String name);
    /*新增*/
    boolean insert(Admin record);

    boolean deleteByPrimaryKey(Integer id);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Admin record);

    int updateStart(Integer id);

    int updateStop(Integer id);

    boolean updatePwd(Admin record);
}
