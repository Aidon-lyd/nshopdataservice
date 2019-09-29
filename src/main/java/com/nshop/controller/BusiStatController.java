package com.nshop.controller;

import com.nshop.bean.ResultBean;
import com.nshop.mapper.BusiStatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2019-09-28 20:34
 */
@RestController
@RequestMapping("/busistat")
public class BusiStatController {

    @Autowired(required = false)
    private BusiStatMapper busiStatMapper;

    @RequestMapping("/gender")
    public ResultBean<Object> getUsers() {
//        List<NshopCustStat> users=busiStatMapper.getAll();
        return new ResultBean<>();
    }

    @RequestMapping("/age")
    public ResultBean<Object> getUser(Long id) {
//        UserEntity user=busiStatMapper.getOne(id);
        return new ResultBean<>();
    }

}
