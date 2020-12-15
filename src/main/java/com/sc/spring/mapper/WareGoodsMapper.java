package com.sc.spring.mapper;

import com.sc.spring.entity.WareGoods;
import com.sc.spring.entity.WareGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareGoodsMapper {
    long countByExample(WareGoodsExample example);

    int deleteByExample(WareGoodsExample example);

    int deleteByPrimaryKey(Long goodsId);

    int insert(WareGoods record);

    int insertSelective(WareGoods record);

    List<WareGoods> selectByExample(WareGoodsExample example);

    WareGoods selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") WareGoods record, @Param("example") WareGoodsExample example);

    int updateByExample(@Param("record") WareGoods record, @Param("example") WareGoodsExample example);

    int updateByPrimaryKeySelective(WareGoods record);

    int updateByPrimaryKey(WareGoods record);
}