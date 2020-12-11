package com.sc.spring.mapper;

import com.sc.spring.entity.PurNeedorder;
import com.sc.spring.entity.PurNeedorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurNeedorderMapper {
    long countByExample(PurNeedorderExample example);

    int deleteByExample(PurNeedorderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurNeedorder record);

    int insertSelective(PurNeedorder record);

    List<PurNeedorder> selectByExample(PurNeedorderExample example);

    PurNeedorder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurNeedorder record, @Param("example") PurNeedorderExample example);

    int updateByExample(@Param("record") PurNeedorder record, @Param("example") PurNeedorderExample example);

    int updateByPrimaryKeySelective(PurNeedorder record);

    int updateByPrimaryKey(PurNeedorder record);
}