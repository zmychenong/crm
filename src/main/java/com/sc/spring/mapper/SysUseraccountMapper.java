package com.sc.spring.mapper;

import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.entity.SysUseraccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUseraccountMapper {
    long countByExample(SysUseraccountExample example);

    int deleteByExample(SysUseraccountExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(SysUseraccount record);

    int insertSelective(SysUseraccount record);

    List<SysUseraccount> selectByExample(SysUseraccountExample example);

    SysUseraccount selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") SysUseraccount record, @Param("example") SysUseraccountExample example);

    int updateByExample(@Param("record") SysUseraccount record, @Param("example") SysUseraccountExample example);

    int updateByPrimaryKeySelective(SysUseraccount record);

    int updateByPrimaryKey(SysUseraccount record);
}