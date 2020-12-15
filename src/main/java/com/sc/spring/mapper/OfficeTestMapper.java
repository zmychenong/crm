package com.sc.spring.mapper;

import com.sc.spring.entity.OfficeTest;
import com.sc.spring.entity.OfficeTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeTestMapper {
    long countByExample(OfficeTestExample example);

    int deleteByExample(OfficeTestExample example);

    int deleteByPrimaryKey(String indexId);

    int insert(OfficeTest record);

    int insertSelective(OfficeTest record);

    List<OfficeTest> selectByExample(OfficeTestExample example);

    OfficeTest selectByPrimaryKey(String indexId);

    int updateByExampleSelective(@Param("record") OfficeTest record, @Param("example") OfficeTestExample example);

    int updateByExample(@Param("record") OfficeTest record, @Param("example") OfficeTestExample example);

    int updateByPrimaryKeySelective(OfficeTest record);

    int updateByPrimaryKey(OfficeTest record);
}