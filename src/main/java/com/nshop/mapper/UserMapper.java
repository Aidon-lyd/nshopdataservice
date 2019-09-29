package com.nshop.mapper;


import com.nshop.entry.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT age_range,SUM(pay_amounts) AS pay_amounts FROM ads_nshop_pay_stat_gsets WHERE age_range != '\\\\N' GROUP BY age_range")
    public List<AgeEcharts> getAgeData();

    @Select("SELECT COUNT(*) AS num FROM ads_nshop_pay_stat GROUP BY customer_gender;")
    public List<SexEcharts> getSexData();

    @Select("SELECT customer_area_code,SUM(pay_amounts) AS pay_amounts FROM ads_nshop_pay_stat_topn GROUP BY customer_area_code;")
    public List<AreaEcharts> getAreaData();

    @Select("\"SELECT pay_type, SUM(pay_amounts) AS pay_amounts FROM ads_nshop_pay_stat_topn GROUP BY pay_type;\"")
    List<WayEcharts> getWayData();



    //李鹤代码
    @Select("SELECT user_count,launch_count,bdp_day FROM nshop_actlog WHERE network_type='';")
    public List<UserLog> listStus();

    @Select("SELECT network_type,SUM(user_count) AS user_count FROM nshop_actlog WHERE network_type!=''AND area_code='' GROUP BY network_type;")
    public List<UserLog2> listStus2();
}
