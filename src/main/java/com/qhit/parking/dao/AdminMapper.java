package com.qhit.parking.dao;

import com.qhit.parking.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
    /*依据主键id删除-方法**/
    int deleteByPrimaryKey(Integer id);
    /*新增方法接口*/
    int insert(Admin record);
    /*依据主键查询方法接口*/
    Admin selectByPrimaryKey(Integer id);
    /*查询所有*/
    List<Admin> selectAll();
    /*依据主键id修改*/
    int updateByPrimaryKey(Admin record);
    /*登陆*/
    Admin Login(@Param("name") String name,@Param("password") String password);
    /*name集查询*/
    List<Admin> adminName(@Param("name") String name);
    /*修改状态，启用*/
    int updateStart(Integer id);
    /*修改状态，停用*/
    int updateStop(Integer id);
    /*修改密码*/
    int updatePwd(Admin record);


}