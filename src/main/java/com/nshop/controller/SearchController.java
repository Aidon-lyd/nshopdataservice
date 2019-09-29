package com.nshop.controller;

import com.nshop.entry.AgeEcharts;
import com.nshop.entry.SearchInfo;
import com.nshop.mapper.SearchMapper;
import com.nshop.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {



    @Autowired
    private SearchMapper searchMapper;



  /*  @RequestMapping("/searchByAge")
    public List<StudentInfo> getmstulist(){
        return searchMapper.SearchByAge();
    }*/

    @RequestMapping("/SearchAndCount")
    public ResultBean SearchAndCount() {

        ResultBean<List<SearchInfo>> resultBean=new ResultBean<>();
        try {
            List<SearchInfo> ls = searchMapper.SearchAndCount();
            resultBean = new ResultBean<>();
            resultBean.setData(ls);
            return resultBean;
        } catch (Exception e) {
            e.printStackTrace();
            resultBean.setData(null);
            resultBean.setMsg("faild");
            resultBean.setCode(-1);
            return resultBean;
        }
    }




}