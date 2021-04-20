package com.yzm.dynamic_datasource.service;

import com.yzm.dynamic_datasource.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Yzm
 * @since 2021-04-16
 */
public interface UserService extends IService<User> {

    boolean saveUser(User user);

    List<User> listUser();

}
