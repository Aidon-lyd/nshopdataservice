package com.nshop.entry;

import org.springframework.stereotype.Component;

@Component
public class Sex2 {
    private int customer_gender;
    private double complaint_rate;

    public int getCustomer_gender() {
        return customer_gender;
    }
    public void setCustomer_gender(int customer_gender) {
        this.customer_gender = customer_gender;
    }
    public double getComplaint_rate() {
        return complaint_rate;
    }
    public void setComplaint_rate(double complaint_rate) {
        this.complaint_rate = complaint_rate;
    }

}
