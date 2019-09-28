package com.nshop.controller;

import com.nshop.entry.StudentInfo;
import com.nshop.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 第一个控制器
 */
@RestController
public class HelloController {

    @Autowired
    StudentInfo studentInfo;

    @Autowired
    StuMapper stuMapper;

    @RequestMapping("/hello")
    public static String hello(){
        return "this is my springboot!!!";
    }

    @RequestMapping("/stuinfo")
    public String getstu(){
        return studentInfo.getUid()+"\t"+studentInfo.getUname();
    }

    @RequestMapping("/stuobj")
    public StudentInfo getstuobj(){
        return studentInfo;
    }

    @RequestMapping("/mstuobj")
    public StudentInfo getmstuobj(){
        return stuMapper.listStu();
    }

    @RequestMapping("/mlstuobj")
    public List<StudentInfo> getmstulist(){
        return stuMapper.listStus();
    }
}
