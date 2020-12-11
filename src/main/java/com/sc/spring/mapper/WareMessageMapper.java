package com.sc.spring.mapper;

import com.sc.spring.entity.WareMessage;
import com.sc.spring.entity.WareMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMessageMapper {
    long countByExample(WareMessageExample example);

    int deleteByExample(WareMessageExample example);

    int deleteByPrimaryKey(Long wareId);

    int insert(WareMessage record);

    int insertSelective(WareMessage record);

    List<WareMessage> selectByExample(WareMessageExample example);

    WareMessage selectByPrimaryKey(Long wareId);

    int updateByExampleSelective(@Param("record") WareMessage record, @Param("example") WareMessageExample example);

    int updateByExample(@Param("record") WareMessage record, @Param("example") WareMessageExample example);

    int updateByPrimaryKeySelective(WareMessage record);

    int updateByPrimaryKey(WareMessage record);
}