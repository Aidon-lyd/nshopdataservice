package com.nshop.mapper;

import com.nshop.entry.Sex1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DistributedCategorySexMapper {

    @Select("select \n" +
            "start_complaint_counts,\n" +
            "cancel_complaint_counts\n" +
            "from \n" +
            "ads_nshop.ads_nshop_risk_mgt\n" +
            "where product_type='二级分类_20104'\n" +
            "and age_range is null\n" +
            "and customer_gender is not null\n" +
            ";")
    public List<Sex1> getSex1();
}
