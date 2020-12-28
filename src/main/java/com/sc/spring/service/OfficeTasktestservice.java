package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficeTasktest;
import com.sc.spring.entity.OfficeTest;

/**
 * 类名：OfficeTaskdetservice
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:09
 * 版本：V1.0
 */
public interface OfficeTasktestservice {
    public PageInfo<OfficeTasktest> selectpage(int pageNum, int pageSize, OfficeTasktest OfficeTasktest, String datemin, String datemax, String search);//搜索

    PageInfo<OfficeTasktest> selectpage(int pageNum, int pageSize, OfficeTasktest officeTasktest);//查询

    void add(OfficeTasktest officeTasktest);//t添加

    void del(String taskId);//删除

    void update(OfficeTasktest officeTasktest);//修改


    OfficeTasktest get(String taskId);
}
