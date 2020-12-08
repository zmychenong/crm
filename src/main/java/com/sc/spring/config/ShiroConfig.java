package com.sc.spring.config;

import com.sc.spring.realm.CustomRealmMD5;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 类名：ShiroConfig
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/31 14:59
 * 版本：V1.0
 */


@Configuration   //定义配置类
public class ShiroConfig {

    //@Autowired
    //SysPermissionService sysPermissionService;

    @Bean  //注册成bean对象   配置自定义realm
    public CustomRealmMD5 customRealmMD5(){
        //密码凭证匹配器
        HashedCredentialsMatcher credentialsMatcher=new HashedCredentialsMatcher();
        credentialsMatcher.setHashAlgorithmName("md5");
        credentialsMatcher.setHashIterations(3);

        CustomRealmMD5 customRealmMD5=new CustomRealmMD5();
        customRealmMD5.setCredentialsMatcher(credentialsMatcher);//密码凭证匹配器

        return customRealmMD5;
    }


    @Bean   //配置安全管理器
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(customRealmMD5());//注入realm
        return securityManager;
    }


    @Bean  //过滤器工厂
    public ShiroFilterFactoryBean shiroFilter(){

        ShiroFilterFactoryBean shiroFilter=new ShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(securityManager());//注入安全管理器
        shiroFilter.setLoginUrl("/login.html");//登录页面地址
        shiroFilter.setSuccessUrl("/loginctrl/main.do");//登录成功进入main方法，再重定向到main.jsp
        shiroFilter.setUnauthorizedUrl("/unauthorized.jsp");//无权限提示页面


        //定义表单认证过滤器
        FormAuthenticationFilter formAuthenticationFilter=new FormAuthenticationFilter();
        formAuthenticationFilter.setLoginUrl("/loginctrl/login.do");
        formAuthenticationFilter.setUsernameParam("userName");
        formAuthenticationFilter.setPasswordParam("userPassword");
        //定义退出登录的过滤器
        LogoutFilter logoutFilter=new LogoutFilter();
        logoutFilter.setRedirectUrl("/login.html");

        Map<String, Filter> filters=new HashMap<>();
        filters.put("authc",formAuthenticationFilter);//设置认证时使用该表单认证过滤器
        filters.put("logout",logoutFilter);//设置退出时使用该退出登录的过滤器
        shiroFilter.setFilters(filters);

        //过滤器链定义
        Map<String,String> filterChain=new LinkedHashMap<>();//注意：一定使用LinkedHashMap，顺序很重要
        filterChain.put("/images/**","anon");
        filterChain.put("/css/**","anon");
        filterChain.put("/js/**","anon");
        filterChain.put("/upload/**","anon");
        filterChain.put("/static/**","anon");
        filterChain.put("/lib/**","anon");
        /*filterChain.put("/main.html","anon");
        filterChain.put("/sysuserctrl/selectpage.do","anon");*/

        filterChain.put("/build/**","anon");
        filterChain.put("/components/**","anon");
        filterChain.put("/plugins/**","anon");
        filterChain.put("/src/**","anon");
        filterChain.put("/views/**","anon");
        filterChain.put("/datas/**","anon");


        //注册功能可以匿名访问
        filterChain.put("/register.jsp","anon");
        filterChain.put("/loginctrl/checkuname.do","anon");

        filterChain.put("/login.html","anon");
        /*filterChain.put("/main.jsp","anon");*/

        filterChain.put("/logout.do","logout");

        //设置权限
        /*List<SysPermission> sysPermissions = sysPermissionService.selectAllPerms();
        if(sysPermissions!=null&&sysPermissions.size()>0){
            for (SysPermission sysPermission : sysPermissions) {
                String url=sysPermission.getUrl();
                String percode = sysPermission.getPercode();
                if(percode!=null&&!percode.equals("")
                   &&url!=null&&!url.equals("")){
                    System.out.println("设置权限，url："+url+",资源名称："+percode);
                    filterChain.put(url,"perms["+percode+"]");
                    //<!--设置权限,格式：key:url,value:perms[权限资源名称]-->
                    // /userinfoctrl/selectpage.do   perms[user:selectpage]
                    // /userinfoctrl/upload.do       perms[user:upload]
                }
            }
        }*/


        filterChain.put("/**","authc");
        System.out.println(filterChain.toString());

        shiroFilter.setFilterChainDefinitionMap(filterChain);

        return shiroFilter;
    }


}
