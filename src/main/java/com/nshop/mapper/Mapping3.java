package com.nshop.mapper;
/*
@author Yuniko
2019/9/28
*/
import com.nshop.entry.Show1;
import com.nshop.entry.Show2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapping3 {
    @Select("select\n" +
            "customer_natives name,\n" +
            "order_counts value\n" +
            "from ads_nshop_oper_stat \n" +
            "where customer_gender is null\n" +
            "and customer_natives is not null\n" +
            "and age_range is null\n" +
            "and consignee_zipcode is null\n" +
            "and product_type is null\n" +
            "order by order_counts desc\n" +
            "limit 5")
    public List<Show1> listShow1();
    @Select("select\n" +
            "customer_gender name,\n" +
            "order_amounts y\n" +
            "from ads_nshop_oper_stat \n" +
            "where customer_gender is not null\n" +
            "and customer_natives is null\n" +
            "and age_range is null\n" +
            "and consignee_zipcode is null\n" +
            "and product_type is null\n")
    public  List<Show2> listShow2();
    @Select("select\n" +
            "customer_gender name,\n" +
            "per_customer_transaction y\n" +
            "from ads_nshop_oper_stat \n" +
            "where customer_gender is not null\n" +
            "and customer_natives is null\n" +
            "and age_range is null\n" +
            "and consignee_zipcode is null\n" +
            "and product_type is null\n")
    public  List<Show2> listShow2_1();
    @Select("select\n" +
            "age_range name,\n" +
            "order_amounts y\n" +
            "from ads_nshop_oper_stat \n" +
            "where customer_gender is null\n" +
            "and customer_natives is null\n" +
            "and age_range is not null\n" +
            "and consignee_zipcode is null\n" +
            "and product_type is null\n" +
            "order by age_range\n")
    public  List<Show2> listShow2_2();




}
