package com.sc.spring.mapper;

import com.sc.spring.entity.SysJurRole;
import com.sc.spring.entity.SysJurRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJurRoleMapper {
    long countByExample(SysJurRoleExample example);

    int deleteByExample(SysJurRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysJurRole record);

    int insertSelective(SysJurRole record);

    List<SysJurRole> selectByExample(SysJurRoleExample example);

    SysJurRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysJurRole record, @Param("example") SysJurRoleExample example);

    int updateByExample(@Param("record") SysJurRole record, @Param("example") SysJurRoleExample example);

    int updateByPrimaryKeySelective(SysJurRole record);

    int updateByPrimaryKey(SysJurRole record);
}