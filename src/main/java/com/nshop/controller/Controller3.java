package com.nshop.controller;


import com.nshop.entry.Show2;
import com.nshop.mapper.Mapping3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Controller3 {

    @RequestMapping("/play")
    public String play() {
        System.out.println("-----------Controller-----------------");
        return "ok";

    }

   @Autowired
   Mapping3 studentMapping;
  /* @RequestMapping("/getStudentInfo")
    public List<Student> getStudentInfo(){


       return  studentMapping.listStudent();
   }*/



   @RequestMapping("/user1")
    public String getString()
   {
       return "{\n" +
               "\t\"data\": [\n" +
               "\t\t[\"Pyramid of Khufu\", 138.8],\n" +
               "\t\t[\"Pyramid of Khafre\", 136.4]\n" +
               "\t]\n" +
               "}";
   }


   /* @RequestMapping("/user3")
    public int[] getJSON1()
    {
       int a[] = new int[10];
       a[0]=studentMapping.listPerson().get(0).getValue();
       a[1]=studentMapping.listPerson().get(1).getValue();
        return  a;
    }*/
    @RequestMapping("/show1")
    public int[] getShow1()
    {
        int a[] = new int[5];
        a[0]=studentMapping.listShow1().get(0).getValue();
        a[1]=studentMapping.listShow1().get(1).getValue();
        a[2]=studentMapping.listShow1().get(2).getValue();
        a[3]=studentMapping.listShow1().get(3).getValue();
        a[4]=studentMapping.listShow1().get(4).getValue();
        return  a;

    }
    @RequestMapping("/show2")
    public List getShow2()
    {
        List<Show2> a = new ArrayList<>();
        Show2 show2_1 = studentMapping.listShow2().get(0);

        if(show2_1.getName().equals("1"))
            show2_1.setName("男");
        else
            show2_1.setName("女");
        Show2 show2_2 = studentMapping.listShow2().get(1);

        if(show2_2.getName().equals("1"))
            show2_2.setName("男");
        else
            show2_2.setName("女");

        a.add(show2_1);
        a.add(show2_2);
        return  a;

    }
    @RequestMapping("/show3")
    public List getShow3()
    {
        List<Show2> a = new ArrayList<>();
        Show2 show2_1 = studentMapping.listShow2_1().get(0);
        if(show2_1.getName().equals("1"))
            show2_1.setName("男");
        else
            show2_1.setName("女");
        Show2 show2_2 = studentMapping.listShow2_1().get(1);

        if(show2_2.getName().equals("1"))
            show2_2.setName("男");
        else
            show2_2.setName("女");
        a.add(show2_1);
        a.add(show2_2);
        return  a;
    }


    @RequestMapping("/show4")
    public List getShow4()
    {
        return  studentMapping.listShow2_2();
    }



}

