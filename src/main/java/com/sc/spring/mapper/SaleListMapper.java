package com.sc.spring.mapper;

import com.sc.spring.entity.SaleList;
import com.sc.spring.entity.SaleListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleListMapper {
    long countByExample(SaleListExample example);

    int deleteByExample(SaleListExample example);

    int deleteByPrimaryKey(String saleId);

    int insert(SaleList record);

    int insertSelective(SaleList record);

    List<SaleList> selectByExample(SaleListExample example);

    SaleList selectByPrimaryKey(String saleId);

    int updateByExampleSelective(@Param("record") SaleList record, @Param("example") SaleListExample example);

    int updateByExample(@Param("record") SaleList record, @Param("example") SaleListExample example);

    int updateByPrimaryKeySelective(SaleList record);

    int updateByPrimaryKey(SaleList record);
}