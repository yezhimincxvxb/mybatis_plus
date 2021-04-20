package com.yzm.base.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzm.base.entity.User;
import com.yzm.base.entity.vo.UserVo;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author Yzm
 * @since 2021-04-13
 */
public interface UserMapper extends BaseMapper<User> {

    IPage<UserVo> pageUser(Page page, boolean deleted);

    List<UserVo> pageUser2(IPage<UserVo> page, boolean deleted);
}
