package com.yq.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    //1. 读取配置文件 获取SQLSession对象
    //2. 事务的处理
    //3. SqlSession 释放

    //会话工厂对象
    private static SqlSessionFactory factory;
    private static final ThreadLocal<SqlSession> SQL_SESSION_THREAD_LOCAL = new ThreadLocal<SqlSession>();
    //ThreadLocal  每一个线程中都有一个ThreadLocal类型的成员变量
    //每一个Thread中都有一个  ThreadLocal
    // get 获取当先线程中维护的内容
    // set 设置当前线程维护的内容
    //init 获取当线程中内容的初始值
    //remove 删除维护的内容
    static {
        try {

            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Connection 线程唯一 全局不唯一
    //我们之前在学习线程时候  我们解决过一些线程同步的问题
    //
    public static SqlSession getSqlSession(){
       SqlSession sqlSession =  SQL_SESSION_THREAD_LOCAL.get();
       if(sqlSession == null){
           sqlSession = factory.openSession();
           SQL_SESSION_THREAD_LOCAL.set(sqlSession);
       }
       return sqlSession;
    }


    //释放资源的方法
    public static void close(){
        getSqlSession().close();
        SQL_SESSION_THREAD_LOCAL.remove();
    }

    public static void commit(){
        getSqlSession().commit();
        close();
    }

    public static void rollback(){
        getSqlSession().rollback();
        close();
    }

    public static  <T>  T   getMapper(Class<T> t){
        return getSqlSession().getMapper(t);
    }

}
