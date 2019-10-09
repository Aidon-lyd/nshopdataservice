package com.nshop.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.nshop.entry.JsonBean;
import com.nshop.entry.RiskAgeDTO;
import com.nshop.entry.ShopRisk;
import com.nshop.mapper.ShopRiskMapper;
import com.nshop.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 风控控制器
 */
@RestController
public class RiskController {

    @Autowired
    ShopRiskMapper shopRiskMapper;

    @RequestMapping("/risk1")
    public ResultBean<List<JsonBean>> getRisk1() {
        List<RiskAgeDTO> shopRiskDTO = null;
    //    String [] xdata ={"0-20","21-23","24-26","27-28","29-30","31-32","33-35","36-38","39-42","43-46","47-56","56-66","66+"};

        ResultBean<List<JsonBean>> resultBean = null;

        try {
            shopRiskDTO = shopRiskMapper.riskAgeList();
            resultBean = new ResultBean<>();
            if (shopRiskDTO != null) {
                List<Integer> data1 = new ArrayList<>();
                List<Integer> data2 = new ArrayList<>();
                for (RiskAgeDTO riskAgeDTO : shopRiskDTO) {
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
        } catch (Exception e) {
            resultBean.setCode(-1);
        }
        return resultBean;
    }
}
