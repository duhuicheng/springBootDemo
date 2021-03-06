package com.springBoot.demo.controller;

import com.alibaba.fastjson.JSON;
import com.springBoot.common.BaseController;
import com.springBoot.common.JwtUtil;
import com.springBoot.demo.dao.PaperMapper;
import com.springBoot.demo.dao.UserRoleMapper;
import com.springBoot.demo.pojo.UserRole;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController extends BaseController {

    @Autowired
    PaperMapper paperMapper;

    @Autowired
    UserRoleMapper userRoleMapper;

    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        List<UserRole> list=userRoleMapper.selectByMap();
        System.out.println(list);
        String json= JSON.toJSONString(list);
        return json;
    }

    @RequestMapping("/test1")
    public String test1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        Cookie []cookies=httpServletRequest.getCookies();
        String cookieName="token";
        if(cookies != null){
            for(Cookie cookie : cookies) {
                if(cookie.getName().equals(cookieName)) {
                    Claims claims=JwtUtil.checkJWT(cookie.getValue());
                    System.out.println(claims);
                    return cookie.getValue();
                }
            }
        }

        return cookieName;
    }



    @RequestMapping("/show")
    public String show(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        return "login";
    }


    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        Map<String,Object> map=new HashMap<>();
        getParameterMap(httpServletRequest,map);
        String token=JwtUtil.JwtCreate(map);
        Cookie cookie=new Cookie("token",token);
        cookie.setMaxAge(15*60*1000);
        httpServletResponse.addCookie(cookie);
        return token;
    }



}
