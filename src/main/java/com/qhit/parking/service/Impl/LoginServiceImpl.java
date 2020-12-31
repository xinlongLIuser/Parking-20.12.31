package com.qhit.parking.service.Impl;

import com.qhit.parking.dao.AdminMapper;
import com.qhit.parking.entity.Admin;
import com.qhit.parking.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2020/9/23.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AdminMapper adminMapper;

    /*
    * 登陆
    * */
    @Override
    public Admin Login(String name, String password) {
        return adminMapper.Login(name, password);
    }

    /*
    * 全查
    * */
    @Override
    public List <Admin> selectAll() {
        return adminMapper.selectAll();
    }

    /*
    * 模糊查-nema
    * */
    @Override
    public List <Admin> adminName(String name) {
        return adminMapper.adminName(name);
    }

    /*
    *新增
    * */
    @Override
    public boolean insert(Admin record) {
        int i = adminMapper.insert(record);
        if (i > 0) {
            return true;
        }
        return false;
    }

    /*
    * 删除
    * */
    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        int i = adminMapper.deleteByPrimaryKey(id);
        if (i > 0) {
            return true;
        }
        return false;
    }
    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateStart(Integer id) {
        return adminMapper.updateStart(id);
    }

    @Override
    public int updateStop(Integer id) {
        return adminMapper.updateStop(id);
    }

    @Override
    public boolean updatePwd(Admin record) {
        int i = adminMapper.updatePwd(record);
        if (i > 0) {
            return true;
        }
        return false;
    }
}
