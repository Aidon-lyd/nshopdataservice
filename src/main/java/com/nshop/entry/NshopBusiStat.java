package com.nshop.entry;

import lombok.Data;

/**
 * @author Neal Zhao
 * @date 2019-09-29 12:23
 */
@Data
public class NshopBusiStat {


    /**
     * customer_gender : 0
     * age_range :
     * customer_area_code :
     * category_name :
     * supplier_name :
     * busi_succ_orders : 1
     * busi_succ_amounts : 1
     * busi_succ_users : 1
     * busi_succ_products : 1
     * busi_fail_orders : 1
     * busi_fail_amounts : 1
     */

    private int customerGender;
    private String ageRange;
    private String customerAreaCode;
    private String categoryName;
    private String supplierName;
    private int busiSuccOrders;
    private int busiSuccAmounts;
    private int busiSuccUsers;
    private int busiSuccProducts;
    private int busiFailOrders;
    private int busiFailAmounts;

    public String queryByAge() {
        return "{"
                + "'年龄段':'" + ageRange + "',"
                + "'交易成功订单数':'" + busiSuccOrders + "',"
                + "'交易成功金额':'" + busiSuccAmounts + "',"
                + "'交易成功买家数':'" + busiSuccUsers + "',"
                + "'交易成功商品数':'" + busiSuccProducts + "',"
                + "}";
    }


}
