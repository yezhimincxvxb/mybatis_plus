package com.yzm.sql_injector.service;

import com.yzm.sql_injector.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Yzm
 * @since 2021-04-16
 */
public interface UserService extends IService<User> {
    int deleteToday();
}
