package com.nshop.mapper;

import com.nshop.entry.FlowStat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;
import java.util.Map;

@Mapper
public interface NshopMapper {

    @Select("select customer_genger customer_genger,age_ranger age_ranger,max(visit_avg_duration) visit_avg_duration ,max(visit_avg_counts) visit_avg_counts,bdp_day from platform_flow_stat_g1 GROUP BY customer_genger,age_ranger,bdp_day")
    List<FlowStat> findFlows();


    @Select("select * from flowpu_stat_g1")
    List<Map<String,String>> findFlowup();

}
