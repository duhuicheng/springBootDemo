package com.springBoot.demo.controller;

import com.springBoot.demo.dao.PaperMapper;
import com.springBoot.demo.pojo.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    PaperMapper paperMapper;

    @RequestMapping("/test")
    public void test(){
        List<Paper> paperList=paperMapper.selectByMap();
        System.out.println(paperList.toString());
    }
}
