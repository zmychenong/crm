package com.sc.spring.mapper;

import com.sc.spring.entity.OfficePersonsche;
import com.sc.spring.entity.OfficePersonscheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficePersonscheMapper {
    long countByExample(OfficePersonscheExample example);

    int deleteByExample(OfficePersonscheExample example);

    int deleteByPrimaryKey(Long seId);

    int insert(OfficePersonsche record);

    int insertSelective(OfficePersonsche record);

    List<OfficePersonsche> selectByExample(OfficePersonscheExample example);

    OfficePersonsche selectByPrimaryKey(Long seId);

    int updateByExampleSelective(@Param("record") OfficePersonsche record, @Param("example") OfficePersonscheExample example);

    int updateByExample(@Param("record") OfficePersonsche record, @Param("example") OfficePersonscheExample example);

    int updateByPrimaryKeySelective(OfficePersonsche record);

    int updateByPrimaryKey(OfficePersonsche record);
}