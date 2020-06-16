package com.yq.dao;

import com.yq.entity.Course;

import java.util.List;

/**
 * @Outline:
 * @Author:Y
 * @CreateTime:2020-06-15 20:38:02
 */
public interface CourseDao {
    List<Course> getCourseAndStu();
}
