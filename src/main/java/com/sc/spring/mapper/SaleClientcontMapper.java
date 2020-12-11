package com.sc.spring.mapper;

import com.sc.spring.entity.SaleClientcont;
import com.sc.spring.entity.SaleClientcontExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleClientcontMapper {
    long countByExample(SaleClientcontExample example);

    int deleteByExample(SaleClientcontExample example);

    int deleteByPrimaryKey(BigDecimal contnum);

    int insert(SaleClientcont record);

    int insertSelective(SaleClientcont record);

    List<SaleClientcont> selectByExample(SaleClientcontExample example);

    SaleClientcont selectByPrimaryKey(BigDecimal contnum);

    int updateByExampleSelective(@Param("record") SaleClientcont record, @Param("example") SaleClientcontExample example);

    int updateByExample(@Param("record") SaleClientcont record, @Param("example") SaleClientcontExample example);

    int updateByPrimaryKeySelective(SaleClientcont record);

    int updateByPrimaryKey(SaleClientcont record);
}