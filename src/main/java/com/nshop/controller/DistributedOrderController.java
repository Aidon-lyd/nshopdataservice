package com.nshop.controller;

import com.nshop.entry.DistributedOrdersInfo;
import com.nshop.entry.StudentInfo;
import com.nshop.mapper.DistributedOrdersMapper;
import com.nshop.util.ResMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单分布控制器
 *
 * {
 *     "code":200,
 *     "mess":"处理成功",
 *     "data":[
 *                 {value:335, name:'直接访问'},
 *                 {value:310, name:'邮件营销'},
 *                 {value:234, name:'联盟广告'},
 *                 {value:135, name:'视频广告'},
 *                 {value:1548, name:'搜索引擎'}
 *             ]
 *
 * }
 */

@RestController
public class DistributedOrderController {

    @Autowired
    DistributedOrdersMapper distributedOrdersMapper;

    @RequestMapping("/order")
    public ResMsg getOrder(){
        DistributedOrdersInfo distributedOrdersInfo = null;
        List<Map<String,String>> li = new ArrayList<Map<String,String>>();
        ResMsg resMsg = null;

        try {
            distributedOrdersInfo = distributedOrdersMapper.DistributedOrder();
            if (distributedOrdersInfo != null) {
                Map<String, String> sc = new HashMap<>();
                sc.put("name", "学校订单");
                sc.put("value", distributedOrdersInfo.getSchool_orders() + "");
                li.add(sc);
                Map<String, String> home = new HashMap<>();
                home.put("name", "家里订单");
                home.put("value", distributedOrdersInfo.getHome_order() + "");
                li.add(home);
                Map<String, String> com = new HashMap<>();
                com.put("name", "单位订单");
                com.put("value", distributedOrdersInfo.getCompany_order() + "");
                li.add(com);
                //信息处理
                resMsg = ResMsg.success();
                resMsg.setData(li);
            }
        } catch (Exception e){
            resMsg = ResMsg.fail();
        }
        return resMsg;

    }
}
