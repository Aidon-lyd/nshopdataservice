package com.nshop.controller;


import com.nshop.entry.JsonBean2;
import com.nshop.entry.Sex2;

import com.nshop.mapper.SexRateMapper;
import com.nshop.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Sex2Controller {
    @Autowired
    SexRateMapper sexRate;

    @RequestMapping("/sex2")
    public ResultBean<List<JsonBean2>> getSex2(){
        List<Sex2> sex2=null;
        ResultBean<List<JsonBean2>> resultBean = null;
        try {
            resultBean = new ResultBean<>();
            sex2 = sexRate.getSex2();
            if (sex2 != null) {
                List<JsonBean2> jsonBeans = new ArrayList<>();
                for (Sex2 sex21 : sex2) {
                    JsonBean2 jsonBean1 = new JsonBean2();
                    if(sex21.getCustomer_gender()==1){
                        jsonBean1.setName("男");
                                jsonBean1.setValue(sex21.getComplaint_rate());
                        jsonBeans.add(jsonBean1);
                    }else{
                        jsonBean1.setName("女");
                                jsonBean1.setValue(sex21.getComplaint_rate());
                        jsonBeans.add(jsonBean1);
                    }
                }

                resultBean.setCode(200);
                resultBean.setData(jsonBeans);

            }
        }catch (Exception e){
            resultBean.setCode(-1);
        }
        return resultBean;
    }
}
