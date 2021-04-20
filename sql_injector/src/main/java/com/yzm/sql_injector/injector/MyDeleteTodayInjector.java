package com.yzm.sql_injector.injector;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 将自定义SQL注入器，注册到容器中
 */
@Component
public class MyDeleteTodayInjector extends DefaultSqlInjector {

    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass) {
        List<AbstractMethod> methodList = super.getMethodList(mapperClass);//将原来的保持
        methodList.add(new MyDeleteToday());//将自定义的方法传入，这里用的是上面创建对象
        return methodList;
    }
}
