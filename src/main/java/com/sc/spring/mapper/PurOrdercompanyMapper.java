package com.sc.spring.mapper;

import com.sc.spring.entity.PurOrdercompany;
import com.sc.spring.entity.PurOrdercompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurOrdercompanyMapper {
    long countByExample(PurOrdercompanyExample example);

    int deleteByExample(PurOrdercompanyExample example);

    int deleteByPrimaryKey(Long gid);

    int insert(PurOrdercompany record);

    int insertSelective(PurOrdercompany record);

    List<PurOrdercompany> selectByExample(PurOrdercompanyExample example);

    PurOrdercompany selectByPrimaryKey(Long gid);

    int updateByExampleSelective(@Param("record") PurOrdercompany record, @Param("example") PurOrdercompanyExample example);

    int updateByExample(@Param("record") PurOrdercompany record, @Param("example") PurOrdercompanyExample example);

    int updateByPrimaryKeySelective(PurOrdercompany record);

    int updateByPrimaryKey(PurOrdercompany record);
}