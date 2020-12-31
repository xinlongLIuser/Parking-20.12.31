package com.qhit.parking.comtroller;

import com.qhit.parking.entity.Notice;
import com.qhit.parking.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2020/9/23.
 */
@Controller
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/noticeList")
    public String selectAll(Model model) {
        List<Notice> list = noticeService.selectAll();
        model.addAttribute("noticeList", list);
        return "notice/notice-list";

    }

    @RequestMapping("/notice-edit")
    public void updateByPrimaryKey(Notice notice, HttpServletResponse response) throws IOException {
        String result = "";
        int i = noticeService.updateByPrimaryKey(notice);
        if (i > 0) {
            result = "Y";
        } else {
            result = "N";
        }
        response.getWriter().write(result);
    }

    @RequestMapping("/notice-load")
    public String selectByPrimaryKey(@RequestParam("noticeId") Integer id, Model model) throws IOException {
        Notice notice = noticeService.selectByPrimaryKey(id);
        model.addAttribute("notice", notice);
        return "notice/notice-edit";
    }

    @RequestMapping("/notice-add")
    public String Noticeadd() {
        return "/notice/notice-add";
    }

    @RequestMapping("/notice-save")
    public void insert(Notice notice, HttpServletResponse response) throws IOException {
        String result = "";
        Boolean falg = noticeService.insert(notice);
        response.getWriter().write(result = falg ? "Y" : "N");
    }
    @RequestMapping("/notice-detele")
    public void deleteByPrimaryKey(@RequestParam("noticeId")Integer id,HttpServletResponse response)throws IOException{
        String result="";
        Boolean falg=noticeService.deleteByPrimaryKey(id);
        response.getWriter().write(result= falg? "Y" : "N");
    }

    @RequestMapping("/findNoticeByTitle")
    public String adminName(@RequestParam("titleTmp")String titleTmp, Model model)throws IOException {
        List<Notice> list=noticeService.getName(titleTmp);
        if (list!=null){
            model.addAttribute("noticeList",list);
        }
        return "/notice/notice-list";
    }

}