package com.yzm.sql_injector.mapper.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface MyBaseMapper<T> extends BaseMapper<T> {
    int deleteToday();
}
