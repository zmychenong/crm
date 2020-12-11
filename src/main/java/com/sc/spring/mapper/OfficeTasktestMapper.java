package com.sc.spring.mapper;

import com.sc.spring.entity.OfficeTasktest;
import com.sc.spring.entity.OfficeTasktestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeTasktestMapper {
    long countByExample(OfficeTasktestExample example);

    int deleteByExample(OfficeTasktestExample example);

    int deleteByPrimaryKey(String taskId);

    int insert(OfficeTasktest record);

    int insertSelective(OfficeTasktest record);

    List<OfficeTasktest> selectByExample(OfficeTasktestExample example);

    OfficeTasktest selectByPrimaryKey(String taskId);

    int updateByExampleSelective(@Param("record") OfficeTasktest record, @Param("example") OfficeTasktestExample example);

    int updateByExample(@Param("record") OfficeTasktest record, @Param("example") OfficeTasktestExample example);

    int updateByPrimaryKeySelective(OfficeTasktest record);

    int updateByPrimaryKey(OfficeTasktest record);
}