package com.sc.spring.mapper;

import com.sc.spring.entity.SysBotanymes;
import com.sc.spring.entity.SysBotanymesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBotanymesMapper {
    long countByExample(SysBotanymesExample example);

    int deleteByExample(SysBotanymesExample example);

    int deleteByPrimaryKey(Long postId);

    int insert(SysBotanymes record);

    int insertSelective(SysBotanymes record);

    List<SysBotanymes> selectByExample(SysBotanymesExample example);

    SysBotanymes selectByPrimaryKey(Long postId);

    int updateByExampleSelective(@Param("record") SysBotanymes record, @Param("example") SysBotanymesExample example);

    int updateByExample(@Param("record") SysBotanymes record, @Param("example") SysBotanymesExample example);

    int updateByPrimaryKeySelective(SysBotanymes record);

    int updateByPrimaryKey(SysBotanymes record);
}