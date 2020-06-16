package com.yq.dao;

import com.yq.entity.Grade;
import com.yq.entity.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Outline:学生接口
 * @Author:Y
 * @CreateTime:2020-06-15 10:17:36
 */
public interface GradeDao {
    List<Grade> getGradeAndStu();
}