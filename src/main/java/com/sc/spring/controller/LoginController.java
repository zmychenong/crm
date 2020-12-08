package com.sc.spring.controller;

import com.sc.spring.entity.Message;
import com.sc.spring.entity.SysUseraccount;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 类名：LoginController
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/15 16:11
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("loginctrl")   /*控制器类的请求映射url*/
public class LoginController {



    @RequestMapping("/login.do")/*类中方法的请求映射url*/
    public ModelAndView login(ModelAndView mav, HttpServletRequest request){
        System.out.println("用户登录失败！");

        //request.setAttribute("shiroLoginFailure","UnknownAccountException")

       String s=(String) request.getAttribute
                (FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);

       System.out.println("失败消息:"+s);

        String isfail="";
        if(s!=null){
            if(s.equals(UnknownAccountException.class.getName())){
                //账号不存在
                isfail="unknown";
            }else if(s.equals(IncorrectCredentialsException.class.getName())){
                //用户名或密码错误
                isfail="error";
            }else if(s.equals("randomCodeError")){
                //验证码错误
                isfail="codeerror";
            }else{
                //未知错误
                isfail="other";
            }
        }

        //重定向
        mav.setViewName("redirect:../login.html?isfail="+isfail);
        return mav;
    }


    //登录成功的方法
    @RequestMapping("/main.do")
    public ModelAndView main(ModelAndView mav,HttpSession session){
        System.out.println("用户登录成功！");

        Subject subject = SecurityUtils.getSubject();
        SysUseraccount nowuser=(SysUseraccount)subject.getPrincipal();
        session.setAttribute("nowuser",nowuser);
        //重定向
        mav.setViewName("redirect:../index.html");
        return mav;
    }


}


