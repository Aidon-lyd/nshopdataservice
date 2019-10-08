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

    public int getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(int customerGender) {
        this.customerGender = customerGender;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getCustomerAreaCode() {
        return customerAreaCode;
    }

    public void setCustomerAreaCode(String customerAreaCode) {
        this.customerAreaCode = customerAreaCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getBusiSuccOrders() {
        return busiSuccOrders;
    }

    public void setBusiSuccOrders(int busiSuccOrders) {
        this.busiSuccOrders = busiSuccOrders;
    }

    public int getBusiSuccAmounts() {
        return busiSuccAmounts;
    }

    public void setBusiSuccAmounts(int busiSuccAmounts) {
        this.busiSuccAmounts = busiSuccAmounts;
    }

    public int getBusiSuccUsers() {
        return busiSuccUsers;
    }

    public void setBusiSuccUsers(int busiSuccUsers) {
        this.busiSuccUsers = busiSuccUsers;
    }

    public int getBusiSuccProducts() {
        return busiSuccProducts;
    }

    public void setBusiSuccProducts(int busiSuccProducts) {
        this.busiSuccProducts = busiSuccProducts;
    }

    public int getBusiFailOrders() {
        return busiFailOrders;
    }

    public void setBusiFailOrders(int busiFailOrders) {
        this.busiFailOrders = busiFailOrders;
    }

    public int getBusiFailAmounts() {
        return busiFailAmounts;
    }

    public void setBusiFailAmounts(int busiFailAmounts) {
        this.busiFailAmounts = busiFailAmounts;
    }

    public String queryByAge() {
        return "{" +
                "年龄段:'" + ageRange + '\'' +
                ", 交易成功订单数:" + busiSuccOrders +
                ", 交易成功金额:" + busiSuccAmounts +
                ", 交易成功买家数:" + busiSuccUsers +
                ", 交易成功商品数:" + busiSuccProducts +
                '}';
    }
    public String queryByGender(){
        return "{" +
                "性别:'" + customerGender + '\'' +
                ", 交易成功订单数:" + busiSuccOrders +
                ", 交易成功金额:" + busiSuccAmounts +
                ", 交易成功买家数:" + busiSuccUsers +
                ", 交易成功商品数:" + busiSuccProducts +
                '}';
    }
    public String queryByAreaCode(){
        return "{" +
                "地区编码:'" + customerAreaCode + '\'' +
                ", 交易成功订单数:" + busiSuccOrders +
                ", 交易成功金额:" + busiSuccAmounts +
                ", 交易成功买家数:" + busiSuccUsers +
                ", 交易成功商品数:" + busiSuccProducts +
                '}';
    }

}
