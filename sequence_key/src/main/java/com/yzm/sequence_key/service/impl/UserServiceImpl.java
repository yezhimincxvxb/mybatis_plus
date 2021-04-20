package com.yzm.sequence_key.service.impl;

import com.yzm.sequence_key.entity.User;
import com.yzm.sequence_key.mapper.UserMapper;
import com.yzm.sequence_key.service.UserService;
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
