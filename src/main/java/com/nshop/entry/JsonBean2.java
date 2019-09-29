package com.nshop.entry;

import org.springframework.stereotype.Component;

@Component
public class JsonBean2 {
    String name;
    double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
