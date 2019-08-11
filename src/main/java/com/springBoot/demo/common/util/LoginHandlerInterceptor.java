package com.springBoot.demo.common.util;

import com.springBoot.common.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        System.out.println(httpServletRequest.getRequestURI());
//        String token=httpServletRequest.getParameter("token");
//        Claims claims=JwtUtil.checkJWT(token);
//        System.out.println(claims);
        if (!httpServletRequest.getParameter("token").isEmpty()){
            //输出token对象内容
            Claims claims=JwtUtil.checkJWT(httpServletRequest.getParameter("token"));
            System.out.println(claims);
            return true;
        }
        httpServletResponse.sendRedirect(httpServletRequest.getScheme()+"://"+httpServletRequest.getServerName()+":"+httpServletRequest.getServerPort()+httpServletRequest.getContextPath() + "/show");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
