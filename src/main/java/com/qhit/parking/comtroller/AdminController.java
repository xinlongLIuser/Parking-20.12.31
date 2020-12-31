package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Notice;
import com.qhit.parking.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2020/9/23.
 */
@Controller
@RequestMapping("")
class AdminController {
    @Autowired
    private NoticeService noticeService;
    @RequestMapping("/")
    public String selectAll( Model model){
        List<Notice> list=noticeService.selectAll();
        model.addAttribute("noticeList",list);
        return "front/index";

    }
}
