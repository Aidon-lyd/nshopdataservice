package com.nshop.entry;

import lombok.Data;

/**
 * @date 2019-09-29 09:47
 */
@Data
public class NshopCustStat {

    /**
     * create table ads_nshop_result(
     *
     * os varchar(20) comment '手机系统' ,
     * manufacturer varchar(50) comment '手机制造商',
     * carrier varchar(30) comment '电信运营商' ,
     *
     * network_type varchar(30) comment '网络类型' ,
     *
     *
     * customer_gender varchar(2)  COMMENT '性别：1男 0女' ,
     * age_range varchar(10)  COMMENT '年龄段' ,
     * customer_natives varchar(10)  COMMENT '所在地区' ,
     *
     * total_counts int comment '总用户数' ,
     *
     * add_counts int comment '新增用户数' ,
     * active_counts int comment '活跃用户数' ,
     * repeat_purchase float comment '活跃复购率' ,
     * avg_purchase_counts int comment '用户平均购买次数' ,
     * retention_rate float comment '用户留存率'
     *
     *
     * )
     */

    private String os;
    private String manufacturer;
    private String carrier;
    private String networkType;
    private String customerGender;
    private String ageRange;
    private String customerNatives;
    private int totalCounts;
    private int addCounts;
    private int activeCounts;
    private double repeatPurchase;
    private int avgPurchaseCounts;
    private double retentionRate;




}
