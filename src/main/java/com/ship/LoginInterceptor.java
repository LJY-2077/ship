/**  
* @Title: LoginInterceptor.java
* @Package com.ship
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月30日 上午10:59:38
* @version V1.0  
*/ 
package com.ship;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
* @ClassName: LoginInterceptor
* @Description: TODO(这里用一句话描述这个类的作用)
* @author li jingyang  
* @date 2018年5月30日 上午10:59:38
*
*/
public class LoginInterceptor implements HandlerInterceptor {
    Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // TODO Auto-generated method stub
        logger.info("------preHandle------");
        //获取session
        HttpSession session = request.getSession(true);
        //判断用户ID是否存在，不存在就跳转到登录界面
        if(session.getAttribute("admin") == null){
            logger.info("------:跳转到login页面！");
  response.sendRedirect(request.getContextPath()+"/admin/login");
            return false;
        }else{
            session.setAttribute("admin", session.getAttribute("admin"));
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub

    }

}