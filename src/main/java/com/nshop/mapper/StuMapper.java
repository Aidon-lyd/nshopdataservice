package com.nshop.mapper;

import com.nshop.entry.StudentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StuMapper {

    @Select("SELECT\n" +
            "s.student_id id,\n" +
            "s.`name` uname,\n" +
            "s.age age,\n" +
            "s.sex sex\n" +
            "FROM student s\n" +
            "limit 1\n" +
            ";")
    public StudentInfo listStu();

    @Select("SELECT\n" +
            "s.student_id id,\n" +
            "s.`name` uname,\n" +
            "s.age age,\n" +
            "s.sex sex\n" +
            "FROM student s\n" +
            ";")
    public List<StudentInfo> listStus();
}
