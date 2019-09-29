package com.nshop.controller;

import com.nshop.entry.*;
import com.nshop.service.NshopService;
import com.nshop.service.UserService;
import com.nshop.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAgeData")
    public ResultBean getAgeData() {
        ResultBean<List<AgeEcharts>> resultBean=new ResultBean<>();
        try {
            List<AgeEcharts> list = this.userService.getAgeData();
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
    @RequestMapping("/getSexData")
    public ResultBean getSexData() {
        ResultBean<List<SexEcharts>> resultBean=new ResultBean<>();
        try {

            List<SexEcharts> list = this.userService.getSexData();
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
    @RequestMapping("/getAreaData")
    public ResultBean getAreaData() throws Exception{
        ResultBean<List<AreaEcharts>> resultBean=new ResultBean<>();

        try {
            List<AreaEcharts> list = this.userService.getAreaData();
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



    @RequestMapping("/getWayData")
    public ResultBean getWayData() throws Exception{
        ResultBean<List<WayEcharts>> resultBean=new ResultBean<>();
        try {
            List<WayEcharts> list = this.userService.getWayData();
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
