package com.yzm.sql_injector.injector;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

/**
 * SQL语句
 */
public class MyDeleteToday extends AbstractMethod {

    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        //删除今天创建的记录
        String sql = "delete from " + tableInfo.getTableName() + " where DATE(create_date) = CURDATE()";
        String methodName = "deleteToday";//方法名 -->这个就是在MyBaseMapper中需要添加的方法名
        // 进行预编译得到sqlSource对象
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);
        //添加到delete操作的Statement中也就是相当于将预编译sql和其它的delete相关的编译后的sql存在一起
        return addDeleteMappedStatement(mapperClass, methodName, sqlSource);
    }

}
