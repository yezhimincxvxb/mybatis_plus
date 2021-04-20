package com.yzm.safety_protection.service.impl;

import com.yzm.safety_protection.entity.User;
import com.yzm.safety_protection.mapper.UserMapper;
import com.yzm.safety_protection.service.UserService;
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
