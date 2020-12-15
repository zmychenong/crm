package com.sc.spring.mapper;

import com.sc.spring.entity.PurOrder;
import com.sc.spring.entity.PurOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurOrderMapper {
    long countByExample(PurOrderExample example);

    int deleteByExample(PurOrderExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PurOrder record);

    int insertSelective(PurOrder record);

    List<PurOrder> selectByExample(PurOrderExample example);

    PurOrder selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("record") PurOrder record, @Param("example") PurOrderExample example);

    int updateByExample(@Param("record") PurOrder record, @Param("example") PurOrderExample example);

    int updateByPrimaryKeySelective(PurOrder record);

    int updateByPrimaryKey(PurOrder record);
}