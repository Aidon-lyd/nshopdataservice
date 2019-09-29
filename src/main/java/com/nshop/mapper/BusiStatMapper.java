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


    /**
     * Mysql 数据库
     * customer_gender     tinyint(4) ,
     * age_range           varchar(50) ,
     * customer_area_code  varchar(100) ,
     * category_name       varchar(50) ,
     * supplier_name       varchar(50),
     * busi_succ_orders    int(11) ,
     * busi_succ_amounts   int(11) ,
     * busi_succ_users     int(11),
     * busi_succ_products  int(11) ,
     * busi_fail_orders    int(11) ,
     * busi_fail_amounts   int(11)
     * <p>
     * <p>
     * Bean 实体类
     * private int customerGender;
     * private String ageRange;
     * private String customerAreaCode;
     * private String categoryName;
     * private String supplierName;
     * private int busiSuccOrders;
     * private int busiSuccAmounts;
     * private int busiSuccUsers;
     * private int busiSuccProducts;
     * private int busiFailOrders;
     * private int busiFailAmounts
     *
     * @return
     */
    @Select("SELECT * FROM ads_nshop_busi_stat_gsets where age_range is not null")
    @Results({
            @Result(property = "ageRange", column = "age_range"),
            @Result(property = "busiSuccOrders", column = "busi_succ_orders"),
            @Result(property = "busiSuccAmounts", column = "busi_succ_amounts"),
            @Result(property = "busiSuccUsers", column = "busi_succ_users"),
            @Result(property = "busiSuccProducts", column = "busi_succ_products")

    })
    List<NshopBusiStat> queryByAge();
}
