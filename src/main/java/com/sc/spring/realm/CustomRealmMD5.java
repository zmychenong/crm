package com.sc.spring.realm;

import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.service.SysUseraccountService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名：CustomRealm
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/21 16:06
 * 版本：V1.0
 */
public class CustomRealmMD5 extends AuthorizingRealm {

    @Autowired
    SysUseraccountService sysUseraccountService;
  /*  @Autowired
    SysPermissionService sysPermissionService;
*/
    //用户授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
       /* System.out.println("进入自定义realm+md5的授权方法了");
        SysUser sysUser=(SysUser)principalCollection.getPrimaryPrincipal();
        String userName=sysUser.getUsercode();
        System.out.println("需要授权的用户是："+userName);

        //暂时模拟该用户拥有如下权限，以后需要查询数据库
        List<String> list=new ArrayList<String>();
        *//*list.add("user:add");
        list.add("user:update");
        list.add("user:delete");
       *//*

        List<SysPermission> sysPermissions = sysPermissionService.selectPerms(userName);
        if(sysPermissions!=null&&sysPermissions.size()>0){
            for (SysPermission sysPermission : sysPermissions) {
                String percode = sysPermission.getPercode();
                if(percode!=null&&!percode.equals("")){
                    System.out.println("该用户拥有的权限资源名称："+percode);
                    list.add(percode);//向集合设置该用户拥有的权限资源名称
                }
            }
        }

        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(list);

        return info;*/

        return null;
    }

    //用户认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("进入自定义realm+md5的认证方法了");


        String userName=(String)authenticationToken.getPrincipal();//获取需要登录的用户名
        System.out.println("需要认证的用户是："+userName);

        //通过账号查询数据库，获取用户对象
        SysUseraccount sysUser = sysUseraccountService.login(userName);

        //用户对象为空，就没有此用户
        if(sysUser==null){
            return null;//认证失败
        }
        System.out.println("需要认证的用户存在");

        String userPassword=sysUser.getUserPassword();//取到用户注册的密码
        String salt=sysUser.getUserSalt();//取到用户注册的盐

        SimpleAuthenticationInfo info=
                new SimpleAuthenticationInfo(sysUser,userPassword,
                        ByteSource.Util.bytes(salt),this.getName());

        return info;
    }
}
