package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficeTaskdet;
import com.sc.spring.entity.OfficeTaskdetExample;
import com.sc.spring.mapper.OfficeTaskdetMapper;
import com.sc.spring.service.OfficeTaskdetservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 类名：OfficeTaskdetServiceImpl
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:15
 * 版本：V1.0
 */
@Service
public class OfficeTaskdetServiceImpl implements OfficeTaskdetservice {
    @Autowired
    OfficeTaskdetMapper officeTaskdetMapper;


    @Override
    public PageInfo<OfficeTaskdet> selectpage(int pageNum, int pageSize, OfficeTaskdet OfficeTaskdet, String datemin, String datemax, String search) {
        PageHelper.startPage(pageNum,pageSize);


        OfficeTaskdetExample example=new OfficeTaskdetExample();


        OfficeTaskdetExample.Criteria criteria = example.createCriteria();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if(datemin!=null&&!datemin.equals("")){
            try {

                criteria.andLastModificationTimeGreaterThanOrEqualTo(sdf.parse(datemin));//上次修改时间大于或等于
                //criteria.aszttimeGreaterThanOrEqualTo(sdf.parse(datemin));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(datemax!=null&&!datemax.equals("")){
            try {
                criteria.andLastModificationTimeLessThanOrEqualTo(sdf.parse(datemax));//上次修改时间超过或等于

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(search!=null&&!search.equals("")){
            criteria.andAcceptUserNumberLike("%"+search+"%");//通过接受用户编号来实现
            //criteria.andAssessmentIndexLike("%"+search+"%");//通过AssessmentIndex属性来搜索
        }

        example.setOrderByClause("OFFICE_ID DESC");//这个是表的主键来降序
        List<OfficeTaskdet> list = officeTaskdetMapper.selectByExample(example);
        PageInfo<OfficeTaskdet> pageInfo = new PageInfo<OfficeTaskdet>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<OfficeTaskdet> selectpage(int pageNum, int pageSize, OfficeTaskdet officeTaskdet) {

        return null;
    }

    @Override
    public void add(OfficeTaskdet officeTaskdet) {
        this.officeTaskdetMapper.insert(officeTaskdet);
    }

    @Override
    public void del(Long officeId) {
        this.officeTaskdetMapper.deleteByPrimaryKey(officeId);
    }

    @Override
    public void update(OfficeTaskdet officeTaskdet) {
        this.officeTaskdetMapper.updateByPrimaryKey(officeTaskdet);
    }

    @Override
    public OfficeTaskdet get(Long officeId) {
        return this.officeTaskdetMapper.selectByPrimaryKey(officeId);
    }
}
