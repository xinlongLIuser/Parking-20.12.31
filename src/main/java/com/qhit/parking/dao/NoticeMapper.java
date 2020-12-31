package com.qhit.parking.dao;

import com.qhit.parking.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    Notice selectByPrimaryKey(Integer id);

    List<Notice> selectAll();

    List<Notice> getName(@Param("name") String name);

    int updateByPrimaryKey(Notice record);
}