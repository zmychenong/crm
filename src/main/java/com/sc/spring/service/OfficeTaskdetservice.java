package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficeTaskdet;

/**
 * 类名：OfficeTaskdetservice
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:09
 * 版本：V1.0
 */
public interface OfficeTaskdetservice {

  public PageInfo<OfficeTaskdet> selectpage(int pageNum, int pageSize, OfficeTaskdet OfficeTaskdet, String datemin, String datemax, String search);//搜索

  PageInfo<OfficeTaskdet> selectpage(int pageNum, int pageSize, OfficeTaskdet officeTaskdet);//查询

    void add(OfficeTaskdet officeTaskdet);//t添加

    void del( Long officeId);//删除

    void update(OfficeTaskdet officeTaskdet);//修改


    OfficeTaskdet get(Long officeId);
}
