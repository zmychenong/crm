package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientloss;
import com.sc.spring.entity.SaleClientlossExample;
import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.mapper.SaleClientlossMapper;
import com.sc.spring.service.SaleClientlossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:04
 * 版本：V1.0
 */
@Service
public class SaleClientlossServiceImpl implements SaleClientlossService {
    @Autowired
    SaleClientlossMapper saleClientlossMapper;

    @Override
    public PageInfo<SaleClientloss> selectpage(int pageNum, int pageSize, SaleClientloss saleClientloss,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SaleClientlossExample example=new SaleClientlossExample();


        SaleClientlossExample.Criteria criteria = example.createCriteria();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if(datemin!=null&&!datemin.equals("")){
            try {
                criteria.andLasttimeGreaterThanOrEqualTo(sdf.parse(datemin));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(datemax!=null&&!datemax.equals("")){
            try {
                criteria.andLasttimeLessThanOrEqualTo(sdf.parse(datemax));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(search!=null&&!search.equals("")){
            SaleClientlossExample.Criteria criteria1 = example.createCriteria();
            criteria1.andHandlewayLike("%"+search+"%");
            example.or(criteria1);
        }
        if(search!=null&&!search.equals("")){
            SaleClientlossExample.Criteria criteria2 = example.createCriteria();
            criteria2.andMeasuresLike("%"+search+"%");
            example.or(criteria2);
        }
        if(search!=null&&!search.equals("")){
            SaleClientlossExample.Criteria criteria3 = example.createCriteria();
            criteria3.andWhetherlossLike("%"+search+"%");
            example.or(criteria3);
        }


        example.setOrderByClause("LOSSNUM DESC");
        List<SaleClientloss> list=saleClientlossMapper.selectByExample(example);
        PageInfo<SaleClientloss>   pageInfo=new PageInfo<SaleClientloss>(list);
        return pageInfo;
    }

    @Override
    public void add(SaleClientloss saleClientloss) {
        this.saleClientlossMapper.insert(saleClientloss);
    }

    @Override
    public void del(BigDecimal lossnum) {
        this.saleClientlossMapper.deleteByPrimaryKey(lossnum);
    }

    @Override
    public void update(SaleClientloss saleClientloss) {
        this.saleClientlossMapper.updateByPrimaryKey(saleClientloss);
    }

    @Override
    public SaleClientloss get(BigDecimal lossnum) {
        return this.saleClientlossMapper.selectByPrimaryKey(lossnum);
    }
}
