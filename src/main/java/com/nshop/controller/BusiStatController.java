package com.nshop.controller;

import com.nshop.util.ResultBean;
import com.nshop.entry.NshopBusiStat;
import com.nshop.mapper.BusiStatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date 2019-09-28 20:34
 */
@RestController
@RequestMapping("/busistat")
public class BusiStatController {

    @Autowired(required = false)
    private BusiStatMapper busiStatMapper;


    @RequestMapping("/ageRange")
    public ResultBean<List<Object>> queryByAge() {
        List<NshopBusiStat> busiStatList = busiStatMapper.queryByAge();

        List<Object> list5 = new ArrayList<>();
        //List<String> list = new ArrayList<>();

        Map<String,List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Map<String,List<Integer>> map1 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        Map<String,List<Integer>> map2 = new HashMap<>();
        List<Integer> list2 = new ArrayList<>();
        Map<String,List<Integer>> map3 = new HashMap<>();
        List<Integer> list3 = new ArrayList<>();
        Map<String,List<String>> map4= new HashMap<>();
        List<String> list4=new ArrayList<>();



        for (NshopBusiStat n : busiStatList) {
            //list.add(nshopBusiStat.queryByAge()
            list.add(n.getBusiSuccAmounts());
            list1.add(n.getBusiSuccOrders());
            list2.add(n.getBusiSuccProducts());
            list3.add(n.getBusiSuccUsers());
            list4.add(n.getAgeRange());
        }
        map4.put("年龄段",list4);
        map.put("交易成功金额",list);
        map1.put("交易成功订单数",list1);
        map2.put("交易成功商品数",list2);
        map3.put("交易成功买家数",list3);
        list5.add(map4);
        list5.add(map1);
        list5.add(map);
        list5.add(map3);
        list5.add(map2);
        return new ResultBean<>(list5);
    }
    @RequestMapping("/gender")
    public ResultBean<List<Object>> queryByGender() {
        List<NshopBusiStat> busiStatList = busiStatMapper.queryByGender();
        // 总返回List
        List<Object> list = new ArrayList<>();
        //customerGender
        Map<String,List<Object>> map1 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        //busiSuccOrders
        Map<String,List<Object>> map2 = new HashMap<>();
        List<Object> list2 = new ArrayList<>();
        list2.add("男同胞");
        //busiSuccAmounts
        Map<String,List<Integer>> map3 = new HashMap<>();
        List<Object> list3 = new ArrayList<>();
        list3.add("女同胞");

        for (NshopBusiStat n : busiStatList) {
            if(n.getCustomerGender()==1){
                list2.add(n.getBusiSuccOrders());
                list2.add(n.getBusiSuccAmounts());
                list2.add(n.getBusiSuccUsers());
                list2.add(n.getBusiSuccProducts());
            }else{
                list3.add(n.getBusiSuccOrders());
                list3.add(n.getBusiSuccAmounts());
                list3.add(n.getBusiSuccUsers());
                list3.add(n.getBusiSuccProducts());
            }



        }
        map1.put("男同胞",list2);
        map2.put("女同胞",list3);

        list.add(map1);
        list.add(map2);

        return new ResultBean<>(list);

    }
    @RequestMapping("/AreaCode")
    public ResultBean<List<Object>> queryByAreaCode() {
        List<NshopBusiStat> busiStatList = busiStatMapper.queryByAreaCode();
        // 总返回List
        List<Object> list5 = new ArrayList<>();
        //List<String> list = new ArrayList<>();

        Map<String,List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Map<String,List<Integer>> map1 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        Map<String,List<Integer>> map2 = new HashMap<>();
        List<Integer> list2 = new ArrayList<>();
        Map<String,List<Integer>> map3 = new HashMap<>();
        List<Integer> list3 = new ArrayList<>();
        Map<String,List<String>> map4= new HashMap<>();
        List<String> list4=new ArrayList<>();



        for (NshopBusiStat n : busiStatList) {
            //list.add(nshopBusiStat.queryByAge()
            list.add(n.getBusiSuccAmounts());
            list1.add(n.getBusiSuccOrders());
            list2.add(n.getBusiSuccProducts());
            list3.add(n.getBusiSuccUsers());
            list4.add(n.getCustomerAreaCode());
            System.out.println(list4);
        }
        map4.put("地区",list4);
        map.put("交易成功金额",list);
        map1.put("交易成功订单数",list1);
        map2.put("交易成功商品数",list2);
        map3.put("交易成功买家数",list3);
        list5.add(map4);
        list5.add(map1);
        list5.add(map);
        list5.add(map3);
        list5.add(map2);
        return new ResultBean<>(list5);
    }

}
