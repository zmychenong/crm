package com.sc.spring.mapper;

import com.sc.spring.entity.PurOrderlist;
import com.sc.spring.entity.PurOrderlistExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurOrderlistMapper {
    long countByExample(PurOrderlistExample example);

    int deleteByExample(PurOrderlistExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(PurOrderlist record);

    int insertSelective(PurOrderlist record);

    List<PurOrderlist> selectByExample(PurOrderlistExample example);

    PurOrderlist selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") PurOrderlist record, @Param("example") PurOrderlistExample example);

    int updateByExample(@Param("record") PurOrderlist record, @Param("example") PurOrderlistExample example);

    int updateByPrimaryKeySelective(PurOrderlist record);

    int updateByPrimaryKey(PurOrderlist record);
}