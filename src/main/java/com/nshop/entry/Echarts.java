package com.nshop.entry;

import org.springframework.stereotype.Component;

@Component
public class Echarts {
    private String name;
    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Echarts(String name, Integer value) {
    this.name = name;
    this.value = value;
    }

    public Echarts() {
    }

    @Override
    public String toString() {
        return "Echarts{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
