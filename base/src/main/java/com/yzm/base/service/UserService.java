package com.yzm.base.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yzm.base.entity.User;
import com.yzm.base.entity.vo.UserVo;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Yzm
 * @since 2021-04-13
 */
public interface UserService extends IService<User> {

    IPage<UserVo> pageUser(Page page, boolean deleted);

    List<UserVo> pageUser2(IPage<UserVo> page, boolean deleted);

}
