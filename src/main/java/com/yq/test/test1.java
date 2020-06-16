package com.yq.test;

import com.yq.dao.StuDao;
import com.yq.entity.Stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Outline:测试类
 * @Author:Y
 * @CreateTime:2020-06-15 10:49:19
 */
public class test1 {
    @Test
    public void test1() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = factory.openSession();
        StuDao mapper = sqlSession.getMapper(StuDao.class);
        List<Stu> allStu = mapper.getAllStu();
        System.out.println(allStu);
    }

    @Test
    public void test2() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = factory.openSession();
        StuDao mapper = sqlSession.getMapper(StuDao.class);
        Stu stu = mapper.stuById(1);
        System.out.println(stu);
    }

    @Test
    public void test3() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = factory.openSession();
        StuDao mapper = sqlSession.getMapper(StuDao.class);
        Stu stu = mapper.stuByName("李四");
        System.out.println(stu);
    }

    @Test
    public void test4() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = factory.openSession();
        StuDao mapper = sqlSession.getMapper(StuDao.class);
        Stu stu = mapper.stuByAge(100);
        System.out.println(stu);
    }

    @Test
    public void test5() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = factory.openSession();
        StuDao mapper = sqlSession.getMapper(StuDao.class);
        Stu stu = new Stu();
        stu.setSid(7);
        stu.setSname("陈七");
        stu.setSage(77);
        mapper.updateStu(stu);

        sqlSession.commit();
    }

    @Test
    public void test6() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = factory.openSession();
        StuDao mapper = sqlSession.getMapper(StuDao.class);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(10);
        List<Stu> stuById = mapper.getStuById(list);
        System.out.println(stuById);
    }

}
