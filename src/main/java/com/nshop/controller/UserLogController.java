package com.nshop.controller;


import com.nshop.entry.AgeEcharts;
import com.nshop.entry.UserLog;
import com.nshop.entry.UserLog2;
import com.nshop.mapper.UserMapper;
import com.nshop.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserLogController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/test")
    public ResultBean getmtulist(){




        ResultBean<List<UserLog>> resultBean=new ResultBean<>();
        try {
            List<UserLog> list =  userMapper.listStus();
            resultBean = new ResultBean<>();
            resultBean.setData(list);
            return resultBean;
        } catch (Exception e) {
            e.printStackTrace();
            resultBean.setData(null);
            resultBean.setMsg("faild");
            resultBean.setCode(-1);
            return resultBean;
        }

    }
    @RequestMapping("/test2")
    public ResultBean getTest(){

        ResultBean<List<UserLog2>> resultBean=new ResultBean<>();
        try {
            List<UserLog2> list =  userMapper.listStus2();
            resultBean = new ResultBean<>();
            resultBean.setData(list);
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
