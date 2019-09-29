package com.nshop.controller;

import com.nshop.util.ResultBean;
import com.nshop.entry.NshopBusiStat;
import com.nshop.mapper.BusiStatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @date 2019-09-28 20:34
 */
@RestController
@RequestMapping("/busistat")
public class BusiStatController {

    @Autowired(required = false)
    private BusiStatMapper busiStatMapper;


    @RequestMapping("/age")
    public ResultBean<List<NshopBusiStat>> queryByAge() {
        List<NshopBusiStat> busiStatList = busiStatMapper.queryByAge();
        return new ResultBean<>(busiStatList);
    }

}
