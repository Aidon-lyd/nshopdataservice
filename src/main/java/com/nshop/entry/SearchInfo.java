package com.nshop.entry;

import org.springframework.stereotype.Component;

/**
 * 订单分布实体
 */

public class SearchInfo {
    public String  search_keys;
    public  String  age_range;
    public  String  os;
    public  String  manufacturer;
    public String  area_code;
    public int  search_users;
    public  int search_records;
    public String   search_category;
    public String   search_orders;
    public int search_targets;

    public String getSearch_keys() {
        return search_keys;
    }

    public void setSearch_keys(String search_keys) {
        this.search_keys = search_keys;
    }

    public String getAge_range() {
        return age_range;
    }

    public void setAge_range(String age_range) {
        this.age_range = age_range;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public int getSearch_users() {
        return search_users;
    }

    public void setSearch_users(int search_users) {
        this.search_users = search_users;
    }

    public int getSearch_records() {
        return search_records;
    }

    public void setSearch_records(int search_records) {
        this.search_records = search_records;
    }

    public String getSearch_category() {
        return search_category;
    }

    public void setSearch_category(String search_category) {
        this.search_category = search_category;
    }

    public String getSearch_orders() {
        return search_orders;
    }

    public void setSearch_orders(String search_orders) {
        this.search_orders = search_orders;
    }

    public int getSearch_targets() {
        return search_targets;
    }

    public void setSearch_targets(int search_targets) {
        this.search_targets = search_targets;
    }
}
