package com.nshop.entry;

import org.springframework.stereotype.Component;

@Component
public class Sex1 {
    private int start_complaint_counts;
    private int cancel_complaint_counts;

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
}
