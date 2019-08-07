package com.springBoot.demo.controller;

import com.springBoot.demo.dao.PaperMapper;
import com.springBoot.demo.pojo.Paper;
import com.springBoot.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController extends BaseController {

    @Autowired
    PaperMapper paperMapper;

    @RequestMapping("/test")
    public void test(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
//        List<Paper> paperList=paperMapper.selectByMap();
//        System.out.println(paperList.toString());
        Map<String,Object> map=new HashMap<>();
        getParameterMap(httpServletRequest,map);
        System.out.println(map.get("value3"));
    }
}
