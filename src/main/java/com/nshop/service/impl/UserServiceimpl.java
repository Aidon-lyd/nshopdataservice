package com.nshop.service.impl;

import com.nshop.entry.AgeEcharts;
import com.nshop.entry.AreaEcharts;
import com.nshop.entry.SexEcharts;
import com.nshop.entry.WayEcharts;
import com.nshop.mapper.UserMapper;
import com.nshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;


    public List<AgeEcharts> getAgeData() {

            List<AgeEcharts> query = this.userMapper.getAgeData();
            return  query;

    }

    public List<SexEcharts> getSexData(){

            List<SexEcharts> query = this.userMapper.getSexData();

            return query;

    }


    public List<AreaEcharts> getAreaData() {

            List<AreaEcharts> query = this.userMapper.getAreaData();

            return query;

    }

    public List<WayEcharts> getWayData() {

            List<WayEcharts> query = this.userMapper.getWayData();

            return query;

    }

}
