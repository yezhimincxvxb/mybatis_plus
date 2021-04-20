package com.yzm.dynamic_datasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzm.dynamic_datasource.entity.User;
import com.yzm.dynamic_datasource.mapper.UserMapper;
import com.yzm.dynamic_datasource.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Yzm
 * @since 2021-04-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    @DS("master")
    public boolean saveUser(User user) {
        return save(user);
    }

    @Override
    @DS("slave")
    public List<User> listUser() {
        return list();
    }
}
