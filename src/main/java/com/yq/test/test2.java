package com.yq.test;

import com.yq.dao.GradeDao;
import com.yq.dao.StuDao;
import com.yq.entity.Grade;
import com.yq.entity.Stu;
import com.yq.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * @Outline:
 * @Author:Y
 * @CreateTime:2020-06-15 21:31:09
 */
public class test2 {
    @Test
    public void test1() {
    List<Stu> stu = MyBatisUtil.getMapper(StuDao.class).getStuAndGrade(6);
        System.out.println(stu.toString());
    }

    @Test
    public void test2() {
        List<Grade> grade = MyBatisUtil.getMapper(GradeDao.class).getGradeAndStu();
        System.out.println(grade.toString());
    }
}
