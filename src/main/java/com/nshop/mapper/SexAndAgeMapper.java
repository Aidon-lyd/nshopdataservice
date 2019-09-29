package com.nshop.mapper;


import com.nshop.entry.SexAndAge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SexAndAgeMapper {

    @Select("SELECT\n" +
            "age_range,\n" +
            "customer_gender,\n" +
            "complaint_rate\n" +
            "FROM ads_nshop.ads_nshop_risk_mgt\n" +
            "WHERE customer_gender IS NOT NULL AND age_range IS NOT NULL AND customer_gender = 1\n" +
            "ORDER BY age_range")
    public List<SexAndAge> getSAManList();

    @Select("SELECT\n" +
            "age_range,\n" +
            "customer_gender,\n" +
            "complaint_rate\n" +
            "FROM ads_nshop.ads_nshop_risk_mgt\n" +
            "WHERE customer_gender IS NOT NULL AND age_range IS NOT NULL AND customer_gender = 2\n" +
            "ORDER BY age_range")
    public List<SexAndAge> getSAWomenManList();
}
