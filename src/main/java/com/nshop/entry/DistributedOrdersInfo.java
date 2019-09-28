package com.nshop.entry;

import org.springframework.stereotype.Component;

/**
 * 订单分布实体
 */
@Component
public class DistributedOrdersInfo {
    public int school_orders;
    public int company_order;
    public int home_order;
    public int hour0_5_order;
    public int hour6_12_order;
    public int hour13_15_order;
    public int hour16_20_order;
    public int hour21_24_order;

    public int getSchool_orders() {
        return school_orders;
    }

    public void setSchool_orders(int school_orders) {
        this.school_orders = school_orders;
    }

    public int getCompany_order() {
        return company_order;
    }

    public void setCompany_order(int company_order) {
        this.company_order = company_order;
    }

    public int getHome_order() {
        return home_order;
    }

    public void setHome_order(int home_order) {
        this.home_order = home_order;
    }

    public int getHour0_5_order() {
        return hour0_5_order;
    }

    public void setHour0_5_order(int hour0_5_order) {
        this.hour0_5_order = hour0_5_order;
    }

    public int getHour6_12_order() {
        return hour6_12_order;
    }

    public void setHour6_12_order(int hour6_12_order) {
        this.hour6_12_order = hour6_12_order;
    }

    public int getHour13_15_order() {
        return hour13_15_order;
    }

    public void setHour13_15_order(int hour13_15_order) {
        this.hour13_15_order = hour13_15_order;
    }

    public int getHour16_20_order() {
        return hour16_20_order;
    }

    public void setHour16_20_order(int hour16_20_order) {
        this.hour16_20_order = hour16_20_order;
    }

    public int getHour21_24_order() {
        return hour21_24_order;
    }

    public void setHour21_24_order(int hour21_24_order) {
        this.hour21_24_order = hour21_24_order;
    }
}
