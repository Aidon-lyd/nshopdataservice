package com.nshop.mapper;

import com.nshop.entry.NshopCustStat;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @date 2019-09-28 20:42
 */
public interface BusiStatMapper {

    @Select("SELECT * FROM ads_nshop_result where manufacturer is not null order by  ")
    @Results({
            @Result(property = "os",  column = "os"),
            @Result(property = "manufacturer", column = "manufacturer"),
            @Result(property = "carrier", column = "carrier"),
            @Result(property = "networkType", column = "network_type"),
            @Result(property = "customerGender", column = "customer_gender"),
            @Result(property = "ageRange", column = "age_range"),
            @Result(property = "customerNatives", column = "customer_natives"),
            @Result(property = "totalCounts", column = "total_counts"),
            @Result(property = "addCounts", column = "add_counts"),
            @Result(property = "activeCounts", column = "active_counts"),
            @Result(property = "repeatPurchase", column = "repeat_purchase"),
            @Result(property = "avgPurchaseCounts", column = "avg_purchase_counts"),
            @Result(property = "retentionRate", column = "retention_rate")

    })
    List<NshopCustStat> getManufacturer();


    @Select("SELECT * FROM ads_nshop_result where gender is not null ")
    @Results({
            @Result(property = "os",  column = "os"),
            @Result(property = "manufacturer", column = "manufacturer"),
            @Result(property = "carrier", column = "carrier"),
            @Result(property = "networkType", column = "network_type"),
            @Result(property = "customerGender", column = "customer_gender"),
            @Result(property = "ageRange", column = "age_range"),
            @Result(property = "customerNatives", column = "customer_natives"),
            @Result(property = "totalCounts", column = "total_counts"),
            @Result(property = "addCounts", column = "add_counts"),
            @Result(property = "activeCounts", column = "active_counts"),
            @Result(property = "repeatPurchase", column = "repeat_purchase"),
            @Result(property = "avgPurchaseCounts", column = "avg_purchase_counts"),
            @Result(property = "retentionRate", column = "retention_rate")

    })
    List<NshopCustStat> getgender();


}
