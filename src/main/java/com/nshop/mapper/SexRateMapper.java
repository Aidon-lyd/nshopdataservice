package com.nshop.mapper;

import com.nshop.entry.Sex2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SexRateMapper {
    @Select("select \n" +
            "customer_gender,\n" +
            "complaint_rate\n" +
            "from \n" +
            "ads_nshop.ads_nshop_risk_mgt\n" +
            "where product_type='20104'\n" +
            "and age_range is null\n" +
            "and customer_gender is not null\n" +
            ";")
    public List<Sex2> getSex2();

}
