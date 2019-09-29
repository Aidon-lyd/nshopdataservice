package com.nshop.service;

import com.nshop.entry.AgeEcharts;
import com.nshop.entry.AreaEcharts;
import com.nshop.entry.SexEcharts;
import com.nshop.entry.WayEcharts;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {

    List<AgeEcharts> getAgeData();

    List<SexEcharts> getSexData();

    List<AreaEcharts> getAreaData();

    List<WayEcharts> getWayData();
}
