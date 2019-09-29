package com.nshop.entry;

import org.springframework.stereotype.Component;

/**
 * 风控指标实体
 */
@Component
public class ShopRisk {
    private int customer_gender;
    private String age_range;
    private String customer_natives;
    private String product_type;
    private int start_complaint_counts;
    private int cancel_complaint_counts;
    private float complaint_rate;

    public int getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(int customer_gender) {
        this.customer_gender = customer_gender;
    }

    public String getAge_range() {
        return age_range;
    }

    public void setAge_range(String age_range) {
        this.age_range = age_range;
    }

    public String getCustomer_natives() {
        return customer_natives;
    }

    public void setCustomer_natives(String customer_natives) {
        this.customer_natives = customer_natives;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public int getStart_complaint_counts() {
        return start_complaint_counts;
    }

    public void setStart_complaint_counts(int start_complaint_counts) {
        this.start_complaint_counts = start_complaint_counts;
    }

    public int getCancel_complaint_counts() {
        return cancel_complaint_counts;
    }

    public void setCancel_complaint_counts(int cancel_complaint_counts) {
        this.cancel_complaint_counts = cancel_complaint_counts;
    }

    public float getComplaint_rate() {
        return complaint_rate;
    }

    public void setComplaint_rate(float complaint_rate) {
        this.complaint_rate = complaint_rate;
    }

    @Override
    public String toString() {
        return "ShopRisk{" +
                "customer_gender=" + customer_gender +
                ", age_range='" + age_range + '\'' +
                ", customer_natives='" + customer_natives + '\'' +
                ", product_type='" + product_type + '\'' +
                ", start_complaint_counts=" + start_complaint_counts +
                ", cancel_complaint_counts=" + cancel_complaint_counts +
                ", complaint_rate=" + complaint_rate +
                '}';
    }
}
