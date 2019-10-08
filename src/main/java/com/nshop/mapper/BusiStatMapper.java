package com.nshop.mapper;

import com.nshop.entry.NshopBusiStat;
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
            @Result(property = "os", column = "os"),
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
            @Result(property = "os", column = "os"),
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



    @Select("SELECT * FROM ads_nshop_busi_stat_age_range where age_range is not null")
    @Results({
            @Result(property = "ageRange", column = "age_range"),
            @Result(property = "busiSuccOrders", column = "busi_succ_orders"),
            @Result(property = "busiSuccAmounts", column = "busi_succ_amounts"),
            @Result(property = "busiSuccUsers", column = "busi_succ_users"),
            @Result(property = "busiSuccProducts", column = "busi_succ_products")

    })
    List<NshopBusiStat> queryByAge();

    @Select("SELECT * FROM ads_nshop_busi_stat_gender;")
    @Results({
            @Result(property = "customerGender", column = "customer_gender"),
            @Result(property = "busiSuccOrders", column = "busi_succ_orders"),
            @Result(property = "busiSuccAmounts", column = "busi_succ_amounts"),
            @Result(property = "busiSuccUsers", column = "busi_succ_users"),
            @Result(property = "busiSuccProducts", column = "busi_succ_products")

    })
    List<NshopBusiStat> queryByGender();

    @Select("SELECT * FROM ads_nshop_busi_stat_area ORDER BY busi_succ_amounts LIMIT 7;")
    @Results({
            @Result(property = "customerAreaCode", column = "customer_area_code"),
            @Result(property = "busiSuccOrders", column = "busi_succ_orders"),
            @Result(property = "busiSuccAmounts", column = "busi_succ_amounts"),
            @Result(property = "busiSuccUsers", column = "busi_succ_users"),
            @Result(property = "busiSuccProducts", column = "busi_succ_products")
    })
    List<NshopBusiStat> queryByAreaCode();
}
