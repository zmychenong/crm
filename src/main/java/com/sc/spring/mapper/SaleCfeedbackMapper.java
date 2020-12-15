package com.sc.spring.mapper;

import com.sc.spring.entity.SaleCfeedback;
import com.sc.spring.entity.SaleCfeedbackExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleCfeedbackMapper {
    long countByExample(SaleCfeedbackExample example);

    int deleteByExample(SaleCfeedbackExample example);

    int deleteByPrimaryKey(BigDecimal backnum);

    int insert(SaleCfeedback record);

    int insertSelective(SaleCfeedback record);

    List<SaleCfeedback> selectByExample(SaleCfeedbackExample example);

    SaleCfeedback selectByPrimaryKey(BigDecimal backnum);

    int updateByExampleSelective(@Param("record") SaleCfeedback record, @Param("example") SaleCfeedbackExample example);

    int updateByExample(@Param("record") SaleCfeedback record, @Param("example") SaleCfeedbackExample example);

    int updateByPrimaryKeySelective(SaleCfeedback record);

    int updateByPrimaryKey(SaleCfeedback record);
}