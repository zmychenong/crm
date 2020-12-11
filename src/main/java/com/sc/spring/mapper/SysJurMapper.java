package com.sc.spring.mapper;

import com.sc.spring.entity.SysJur;
import com.sc.spring.entity.SysJurExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJurMapper {
    long countByExample(SysJurExample example);

    int deleteByExample(SysJurExample example);

    int deleteByPrimaryKey(Long columnId);

    int insert(SysJur record);

    int insertSelective(SysJur record);

    List<SysJur> selectByExample(SysJurExample example);

    SysJur selectByPrimaryKey(Long columnId);

    int updateByExampleSelective(@Param("record") SysJur record, @Param("example") SysJurExample example);

    int updateByExample(@Param("record") SysJur record, @Param("example") SysJurExample example);

    int updateByPrimaryKeySelective(SysJur record);

    int updateByPrimaryKey(SysJur record);
}