package com.yzm.type_handler.service.impl;

import com.yzm.type_handler.entity.User;
import com.yzm.type_handler.mapper.UserMapper;
import com.yzm.type_handler.service.UserService;
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
