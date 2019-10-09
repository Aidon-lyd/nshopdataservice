package com.nshop.mapper;

import com.nshop.entry.SearchInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 订单分布接口
 */
@Mapper
public interface SearchMapper {

    /**
     * 订单分布
     * @return
     */

    @Select("select \n" +
            "search_keys, \n" +
            "sum(search_records) search_records \n" +
            "from ads_nshop.nshop_ads_searchkeys \n" +
            "where search_keys !='' \n" +
            "and gender is NULL \n" +
            "and age_range is NULL \n" +
            "and os is NULL \n" +
            "and manufacturer is NULL \n" +
            "and area_code is NULL \n" +
            "group by search_keys \n" +
            "order by sum(search_records) desc limit 10;")
    public List<SearchInfo> SearchAndCount();
}
