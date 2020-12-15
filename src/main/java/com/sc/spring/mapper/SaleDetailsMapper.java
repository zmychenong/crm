package com.sc.spring.mapper;

import com.sc.spring.entity.SaleDetails;
import com.sc.spring.entity.SaleDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleDetailsMapper {
    long countByExample(SaleDetailsExample example);

    int deleteByExample(SaleDetailsExample example);

    int deleteByPrimaryKey(String saleDid);

    int insert(SaleDetails record);

    int insertSelective(SaleDetails record);

    List<SaleDetails> selectByExample(SaleDetailsExample example);

    SaleDetails selectByPrimaryKey(String saleDid);

    int updateByExampleSelective(@Param("record") SaleDetails record, @Param("example") SaleDetailsExample example);

    int updateByExample(@Param("record") SaleDetails record, @Param("example") SaleDetailsExample example);

    int updateByPrimaryKeySelective(SaleDetails record);

    int updateByPrimaryKey(SaleDetails record);
}