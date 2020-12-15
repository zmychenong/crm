package com.sc.spring.mapper;

import com.sc.spring.entity.OfficeTaskdet;
import com.sc.spring.entity.OfficeTaskdetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeTaskdetMapper {
    long countByExample(OfficeTaskdetExample example);

    int deleteByExample(OfficeTaskdetExample example);

    int deleteByPrimaryKey(Long officeId);

    int insert(OfficeTaskdet record);

    int insertSelective(OfficeTaskdet record);

    List<OfficeTaskdet> selectByExample(OfficeTaskdetExample example);

    OfficeTaskdet selectByPrimaryKey(Long officeId);

    int updateByExampleSelective(@Param("record") OfficeTaskdet record, @Param("example") OfficeTaskdetExample example);

    int updateByExample(@Param("record") OfficeTaskdet record, @Param("example") OfficeTaskdetExample example);

    int updateByPrimaryKeySelective(OfficeTaskdet record);

    int updateByPrimaryKey(OfficeTaskdet record);
}