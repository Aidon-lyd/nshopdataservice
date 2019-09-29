package com.nshop.mapper;


import com.nshop.entry.RiskAgeDTO;
import com.nshop.entry.ShopRisk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 风控接口
 */
@Mapper
public interface ShopRiskMapper {
    /**
     * 每个年龄段对某个商品的投诉数和撤销投诉数
     * @return
     */
    @Select("SELECT start_complaint_counts,cancel_complaint_counts\n" +
            "FROM(\n" +
            "SELECT \n" +
            "age_range,\n" +
            "SUM(start_complaint_counts) start_complaint_counts,\n" +
            "SUM(cancel_complaint_counts) cancel_complaint_counts \n" +
            "FROM ads_nshop.ads_nshop_risk_mgt WHERE age_range IS NOT NULL \n" +
            "GROUP BY age_range) t1")
    public List<RiskAgeDTO> riskAgeList();
}
