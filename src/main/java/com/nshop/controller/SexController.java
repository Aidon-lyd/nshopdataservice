package com.nshop.controller;


import com.nshop.entry.JsonBean;
import com.nshop.entry.Sex1;
import com.nshop.mapper.DistributedCategorySexMapper;
import com.nshop.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SexController {
    @Autowired
    DistributedCategorySexMapper distributedCategorySexMapper;

    @RequestMapping("/sex1")
    public ResultBean<List<JsonBean>> getSex1(){
        List<Sex1> sex1=null;
        ResultBean<List<JsonBean>> resultBean = null;
        try {
            resultBean = new ResultBean<>();
            sex1 = distributedCategorySexMapper.getSex1();
            if (sex1 != null) {
                List<Integer> data1 = new ArrayList<>();
                List<Integer> data2 = new ArrayList<>();
                for (Sex1 riskAgeDTO : sex1) {
                    data1.add(riskAgeDTO.getStart_complaint_counts());
                    data2.add(riskAgeDTO.getCancel_complaint_counts());
                }
                JsonBean jsonBean1 = new JsonBean();
                jsonBean1.setName("投诉量");
                jsonBean1.setValue(data1);
                JsonBean jsonBean2 = new JsonBean();
                jsonBean2.setName("撤销投诉量");
                jsonBean2.setValue(data2);

                List<JsonBean> jsonBeans = new ArrayList<>();
                jsonBeans.add(jsonBean1);
                jsonBeans.add(jsonBean2);
                resultBean.setCode(200);
                resultBean.setData(jsonBeans);

            }
        }catch (Exception e){
            resultBean.setCode(-1);
        }
        return resultBean;
    }
}
