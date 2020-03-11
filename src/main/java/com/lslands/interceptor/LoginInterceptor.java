package com.lslands.interceptor;

/**
 * Created by lslands on 2020/03/03.
 */

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by lslands on 20120/03/02.
 *  <version>2.2.5.RELEASE</version>
 */

public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Object user = request.getSession().getAttribute("user");
        System.out.println("afterCompletion----" + user + " ::: " + request.getRequestURL());
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Object user = request.getSession().getAttribute("user");
        System.out.println("postHandle----" + user + " ::: " + request.getRequestURL());
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        System.out.println("preHandle----" + user + " ::: " + request.getRequestURL());
        if (user == null) {
            //request.setAttribute("msg","无权限请先登录");
            // 获取request返回页面到登录页
            request.getRequestDispatcher("/admin").forward(request, response);
            return false;
        }
        return true;
    }

}


/**
 * Created by lslands on 20120/03/06.
 *  <version>1.5.7.RELEASE</version>
 */

/*
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/admin");
            return false;
        }
        return true;
    }
}*/
