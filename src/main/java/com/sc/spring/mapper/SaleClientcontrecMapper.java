package com.sc.spring.mapper;

import com.sc.spring.entity.SaleClientcontrec;
import com.sc.spring.entity.SaleClientcontrecExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleClientcontrecMapper {
    long countByExample(SaleClientcontrecExample example);

    int deleteByExample(SaleClientcontrecExample example);

    int deleteByPrimaryKey(BigDecimal recnum);

    int insert(SaleClientcontrec record);

    int insertSelective(SaleClientcontrec record);

    List<SaleClientcontrec> selectByExample(SaleClientcontrecExample example);

    SaleClientcontrec selectByPrimaryKey(BigDecimal recnum);

    int updateByExampleSelective(@Param("record") SaleClientcontrec record, @Param("example") SaleClientcontrecExample example);

    int updateByExample(@Param("record") SaleClientcontrec record, @Param("example") SaleClientcontrecExample example);

    int updateByPrimaryKeySelective(SaleClientcontrec record);

    int updateByPrimaryKey(SaleClientcontrec record);
}