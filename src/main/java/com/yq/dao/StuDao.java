package com.yq.dao;

import com.yq.entity.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Outline:学生接口
 * @Author:Y
 * @CreateTime:2020-06-15 10:17:36
 */
public interface StuDao {
    List<Stu> getAllStu();

    Stu stuById(@Param("sid") Integer sid);
    Stu stuByName(@Param("sname") String sname);
    Stu stuByAge(@Param("sage") Integer sage);

    void updateStu(Stu stu);

    List<Stu> getStuById(List<Integer> list);

    List<Stu> getStuAndGrade(Integer sid);

}