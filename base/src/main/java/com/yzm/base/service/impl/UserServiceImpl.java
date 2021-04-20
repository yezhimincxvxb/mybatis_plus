package com.yzm.base.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzm.base.entity.User;
import com.yzm.base.entity.vo.UserVo;
import com.yzm.base.mapper.UserMapper;
import com.yzm.base.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Yzm
 * @since 2021-04-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public IPage<UserVo> pageUser(Page page, boolean deleted) {
        return this.baseMapper.pageUser(page, deleted);
    }

    @Override
    public List<UserVo> pageUser2(IPage<UserVo> page, boolean deleted) {
        return baseMapper.pageUser2(page, deleted);
    }
}
