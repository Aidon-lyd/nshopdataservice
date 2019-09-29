package com.nshop.service;

import com.nshop.entry.FlowStat;

import java.util.List;
import java.util.Map;

public interface NshopService {
     List<FlowStat> findFlows() ;

    List<Map<String,String>> findFlowup();
}
