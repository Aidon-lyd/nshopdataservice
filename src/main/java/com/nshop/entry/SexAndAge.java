package com.nshop.entry;

import org.springframework.stereotype.Component;

@Component
public class SexAndAge {
    private String age_range;
    private int customer_gender;
    private float complaint_rate;

    public String getAge_range() {
        return age_range;
    }

    public void setAge_range(String age_range) {
        this.age_range = age_range;
    }

    public int getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(int customer_gender) {
        this.customer_gender = customer_gender;
    }

    public float getComplaint_rate() {
        return complaint_rate;
    }

    public void setComplaint_rate(float complaint_rate) {
        this.complaint_rate = complaint_rate;
    }
}
