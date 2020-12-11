package com.sc.spring.mapper;

import com.sc.spring.entity.SysJurmes;
import com.sc.spring.entity.SysJurmesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJurmesMapper {
    long countByExample(SysJurmesExample example);

    int deleteByExample(SysJurmesExample example);

    int deleteByPrimaryKey(Long powerId);

    int insert(SysJurmes record);

    int insertSelective(SysJurmes record);

    List<SysJurmes> selectByExample(SysJurmesExample example);

    SysJurmes selectByPrimaryKey(Long powerId);

    int updateByExampleSelective(@Param("record") SysJurmes record, @Param("example") SysJurmesExample example);

    int updateByExample(@Param("record") SysJurmes record, @Param("example") SysJurmesExample example);

    int updateByPrimaryKeySelective(SysJurmes record);

    int updateByPrimaryKey(SysJurmes record);
}