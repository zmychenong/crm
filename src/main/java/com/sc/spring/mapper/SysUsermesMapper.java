package com.sc.spring.mapper;

import com.sc.spring.entity.SysUsermes;
import com.sc.spring.entity.SysUsermesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsermesMapper {
    long countByExample(SysUsermesExample example);

    int deleteByExample(SysUsermesExample example);

    int deleteByPrimaryKey(Long workerId);

    int insert(SysUsermes record);

    int insertSelective(SysUsermes record);

    List<SysUsermes> selectByExample(SysUsermesExample example);

    SysUsermes selectByPrimaryKey(Long workerId);

    int updateByExampleSelective(@Param("record") SysUsermes record, @Param("example") SysUsermesExample example);

    int updateByExample(@Param("record") SysUsermes record, @Param("example") SysUsermesExample example);

    int updateByPrimaryKeySelective(SysUsermes record);

    int updateByPrimaryKey(SysUsermes record);
}