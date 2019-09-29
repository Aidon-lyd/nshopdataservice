package com.nshop.controller;
import com.nshop.entry.FlowStat;
import com.nshop.service.NshopService;
import com.nshop.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class NshopController {

    @Autowired
    private NshopService nshopService;

    @RequestMapping("/findFlows")
    public ResultBean findFlows(){
        ResultBean result=null;
        try {
            List<FlowStat> data = nshopService.findFlows();
            if(data!=null ){
                 result = new ResultBean( data);

            }
        } catch (Exception e) {
            e.printStackTrace();
             result = new ResultBean(e);

        }
        return result;
    }

    @RequestMapping("/findFlowup")
    public ResultBean findFlowup(){
        ResultBean result=null;
        try {
            List<Map<String,String>> data = nshopService.findFlowup();
            if(data!=null ){
                result = new ResultBean(data);

            }
        } catch (Exception e) {
            e.printStackTrace();
            result = new ResultBean(e);

        }
        return result;
    }
}
