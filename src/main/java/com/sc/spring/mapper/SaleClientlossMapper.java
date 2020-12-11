package com.sc.spring.mapper;

import com.sc.spring.entity.SaleClientloss;
import com.sc.spring.entity.SaleClientlossExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleClientlossMapper {
    long countByExample(SaleClientlossExample example);

    int deleteByExample(SaleClientlossExample example);

    int deleteByPrimaryKey(BigDecimal lossnum);

    int insert(SaleClientloss record);

    int insertSelective(SaleClientloss record);

    List<SaleClientloss> selectByExample(SaleClientlossExample example);

    SaleClientloss selectByPrimaryKey(BigDecimal lossnum);

    int updateByExampleSelective(@Param("record") SaleClientloss record, @Param("example") SaleClientlossExample example);

    int updateByExample(@Param("record") SaleClientloss record, @Param("example") SaleClientlossExample example);

    int updateByPrimaryKeySelective(SaleClientloss record);

    int updateByPrimaryKey(SaleClientloss record);
}