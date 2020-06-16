package com.yq.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * @Outline:创建DruidDataSourceFactory并继承PooledDataSourceFactory，并替换数据源。
 * @Author:Y
 * @CreateTime:2020-06-16 09:05:32
 */
public class MyDruidDataSourceFactory extends PooledDataSourceFactory {
    public MyDruidDataSourceFactory() {
        this.dataSource = new DruidDataSource();//替换数据源
    }
}
