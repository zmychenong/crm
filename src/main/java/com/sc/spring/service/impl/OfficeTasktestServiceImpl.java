package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficeTaskdet;
import com.sc.spring.entity.OfficeTaskdetExample;
import com.sc.spring.entity.OfficeTasktest;
import com.sc.spring.entity.OfficeTasktestExample;
import com.sc.spring.mapper.OfficeTaskdetMapper;
import com.sc.spring.mapper.OfficeTasktestMapper;
import com.sc.spring.service.OfficeTaskdetservice;
import com.sc.spring.service.OfficeTasktestservice;
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
public class OfficeTasktestServiceImpl implements OfficeTasktestservice {
    @Autowired
    OfficeTasktestMapper officeTasktestMapper;


    @Override
    public PageInfo<OfficeTasktest> selectpage(int pageNum, int pageSize, OfficeTasktest OfficeTasktest, String datemin, String datemax, String search) {
        PageHelper.startPage(pageNum, pageSize);
        OfficeTasktestExample example = new OfficeTasktestExample();


        OfficeTasktestExample.Criteria criteria = example.createCriteria();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (datemin != null && !datemin.equals("")) {
            try {
                criteria.andLastModificationTimeEqualTo(sdf.parse(datemin));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (datemax != null && !datemax.equals("")) {
            try {
                criteria.andLastModificationTimeLessThanOrEqualTo(sdf.parse(datemax));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
            if (search != null && !search.equals("")) {
                criteria.andTaskTitleLike("%" + search + "%");
                //criteria.andHandlewayLike("%" + search + "%");
            }

            example.setOrderByClause("TASK_ID DESC");
            List<OfficeTasktest> list = officeTasktestMapper.selectByExample(example);
            PageInfo<OfficeTasktest> pageInfo = new PageInfo<OfficeTasktest>(list);
            return pageInfo;
        }

        @Override
        public PageInfo<OfficeTasktest> selectpage ( int pageNum, int pageSize, OfficeTasktest officeTasktest){

            return null;
        }

        @Override
        public void add (OfficeTasktest officeTasktest){
            this.officeTasktestMapper.insert(officeTasktest);
        }

        @Override
        public void del (String taskId){
            this.officeTasktestMapper.deleteByPrimaryKey(taskId);
        }

        @Override
        public void update (OfficeTasktest officeTasktest){
            this.officeTasktestMapper.updateByPrimaryKey(officeTasktest);
        }

    @Override
    public OfficeTasktest get(String indexId) {
        return this.officeTasktestMapper.selectByPrimaryKey(indexId);
    }

}
