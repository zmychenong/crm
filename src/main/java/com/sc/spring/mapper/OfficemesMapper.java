package com.sc.spring.mapper;

import com.sc.spring.entity.Officemes;
import com.sc.spring.entity.OfficemesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficemesMapper {
    long countByExample(OfficemesExample example);

    int deleteByExample(OfficemesExample example);

    int deleteByPrimaryKey(Long officeId);

    int insert(Officemes record);

    int insertSelective(Officemes record);

    List<Officemes> selectByExample(OfficemesExample example);

    Officemes selectByPrimaryKey(Long officeId);

    int updateByExampleSelective(@Param("record") Officemes record, @Param("example") OfficemesExample example);

    int updateByExample(@Param("record") Officemes record, @Param("example") OfficemesExample example);

    int updateByPrimaryKeySelective(Officemes record);

    int updateByPrimaryKey(Officemes record);
}