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
        "search_keys,\n" +
        "search_records\n" +
        "from nshop_ads_searchkeys20190902\n" +
        "where\n" +
        "gender is null \n" +
        "and age_range is null \n" +
        "and os is null \n" +
        "and search_category is null\n" +
        "and search_orders is null\n" +
        "and manufacturer is null \n" +
        "and area_code is null\n" +
        "order by search_records desc\n" +
        "limit 1,11;")
    public List<SearchInfo> SearchAndCount();
}
