package com.sc.spring.mapper;

import com.sc.spring.entity.SaleClientmes;
import com.sc.spring.entity.SaleClientmesExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleClientmesMapper {
    long countByExample(SaleClientmesExample example);

    int deleteByExample(SaleClientmesExample example);

    int deleteByPrimaryKey(BigDecimal clientnum);

    int insert(SaleClientmes record);

    int insertSelective(SaleClientmes record);

    List<SaleClientmes> selectByExample(SaleClientmesExample example);

    SaleClientmes selectByPrimaryKey(BigDecimal clientnum);

    int updateByExampleSelective(@Param("record") SaleClientmes record, @Param("example") SaleClientmesExample example);

    int updateByExample(@Param("record") SaleClientmes record, @Param("example") SaleClientmesExample example);

    int updateByPrimaryKeySelective(SaleClientmes record);

    int updateByPrimaryKey(SaleClientmes record);
}