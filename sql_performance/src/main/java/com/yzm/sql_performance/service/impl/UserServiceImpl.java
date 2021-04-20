package com.yzm.sql_performance.service.impl;

import com.yzm.sql_performance.entity.User;
import com.yzm.sql_performance.mapper.UserMapper;
import com.yzm.sql_performance.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
