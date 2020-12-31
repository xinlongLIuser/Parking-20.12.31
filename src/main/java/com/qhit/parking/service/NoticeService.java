package com.qhit.parking.service;

import com.qhit.parking.entity.Notice;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
public interface NoticeService {
    List<Notice> selectAll();

    List<Notice> getName(String name);

    int updateByPrimaryKey(Notice record);

    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Notice record);

    Notice selectByPrimaryKey (Integer id);

}
