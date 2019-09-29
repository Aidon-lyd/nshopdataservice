package com.nshop.controller;


import com.nshop.entry.SexAndAge;
import com.nshop.mapper.SexAndAgeMapper;
import com.nshop.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SexAndAgeController {

    @Autowired
    SexAndAgeMapper sexAndAgeMapper;

    @RequestMapping("/sexAndAge1")
    public ResultBean<List<Object>> getSAList(){
        List<String> list1 = new ArrayList<>();
        list1.add("product");
        list1.add("0-20");
        list1.add("21-23");
        list1.add("24-26");
        list1.add("27-28");
        list1.add("29-30");
        list1.add("31-32");
        list1.add("33-35");
        list1.add("36-38");
        list1.add("39-42");
        list1.add("43-46");
        list1.add("47-56");
        list1.add("56-66");
        list1.add("66+");
        List<Object> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();
        list2.add("男");
        list3.add("女");

        List<SexAndAge> sexAndAgesMan = null;
        List<SexAndAge> sexAndAgesWoman = null;
        ResultBean<List<Object>> resultBean = null;

        try {
            resultBean = new ResultBean<>();
            sexAndAgesMan = sexAndAgeMapper.getSAManList();
            sexAndAgesWoman = sexAndAgeMapper.getSAWomenManList();
            if(sexAndAgesMan != null && sexAndAgesWoman != null){
                for (SexAndAge sexAndAge : sexAndAgesMan) {
                    list2.add(sexAndAge.getComplaint_rate());
                }
                for (SexAndAge sexAndAge : sexAndAgesWoman) {
                    list3.add(sexAndAge.getComplaint_rate());
                }
            }
            List<Object> list = new ArrayList<>();
            list.add(list1);
            list.add(list2);
            list.add(list3);
            resultBean.setCode(200);
            resultBean.setData(list);

        }catch (Exception e) {
            resultBean.setCode(-1);
        }
        return resultBean;
    }

}
