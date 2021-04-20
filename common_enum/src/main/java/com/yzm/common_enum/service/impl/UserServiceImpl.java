package com.yzm.common_enum.service.impl;

import com.yzm.common_enum.entity.User;
import com.yzm.common_enum.mapper.UserMapper;
import com.yzm.common_enum.service.UserService;
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
