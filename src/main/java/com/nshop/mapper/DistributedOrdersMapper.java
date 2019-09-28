package com.nshop.mapper;

import com.nshop.entry.DistributedOrdersInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 订单分布接口
 */
@Mapper
public interface DistributedOrdersMapper {

    /**
     * 订单分布
     * @return
     */
    @Select("SELECT\n" +
            "dod.school_orders,\n" +
            "dod.company_order,\n" +
            "dod.home_order\n" +
            "FROM dm_order_distribute dod\n" +
            "GROUP BY dod.dt\n" +
            ";")
    public DistributedOrdersInfo DistributedOrder();
}
