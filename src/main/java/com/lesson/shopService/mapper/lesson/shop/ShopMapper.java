package com.lesson.shopService.mapper.lesson.shop;

import com.lesson.shopService.model.lesson.shop.Shop;
import com.lesson.shopService.model.lesson.shop.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    /**
     *
     * @mbggenerated 2018-08-07
     */
    int countByExample(ShopExample example);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    int deleteByExample(ShopExample example);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    int insert(Shop record);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    int insertSelective(Shop record);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    List<Shop> selectByExample(ShopExample example);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    Shop selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     *
     * @mbggenerated 2018-08-07
     */
    int updateByPrimaryKey(Shop record);
}