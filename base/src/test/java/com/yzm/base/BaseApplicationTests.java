package com.yzm.base;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzm.base.entity.User;
import com.yzm.base.entity.vo.UserVo;
import com.yzm.base.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@SpringBootTest
class BaseApplicationTests {

    @Autowired
    private UserService userService;

    /**
     * saveOrUpdate(T entity)：
     * 先判断实体类主键ID字段是否有值(不为null)，
     * 不为null，根据ID去查询记录，查到记录则更新操作，否则新增操作
     * 为null，直接进行新增操作
     * $$连接数据次数可能一次或两次
     * <p>
     * saveOrUpdate(T entity, Wrapper<T> updateWrapper)：
     * 先根据条件构造器直接进行更新操作
     * 更新条件不满足，返回更新数为0，则去判断主键ID字段是否有值
     * ID有值，根据ID去查询记录，查到记录则更新操作，否则新增操作
     * 无值，就直接进行新增操作
     * $$连接数据次数可能一次、两次或三次
     */
    @Test
    void demo_saveOrUpdate() {
        User user = new User()
                .setId(13L)
                .setRealName("ccc")
                .setUsername("ccc")
                .setPassword("ccc");
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, "ccc");
        userService.saveOrUpdate(user, wrapper);
    }

    @Test
    void demo_getMap() {
        Map<String, Object> map = userService.getMap(Wrappers.<User>lambdaQuery().eq(User::getId, 1));
        System.out.println("map = " + map);
    }

    @Test
    void demo_getObj() {
        String password = userService.getObj(Wrappers.<User>lambdaQuery()
                .select(User::getPassword)
                .eq(User::getId, 1), s -> String.valueOf(s).toUpperCase());
        System.out.println("大小的密码 = " + password);
    }

    //****************************条件构造器****************************************

    @Test
    void demo_func() {
        boolean b = false;
        List<User> users = userService.list(Wrappers.<User>lambdaQuery()
                .func(i -> {
                    if (b) {
                        i.eq(User::getId, 1);
                    } else {
                        i.eq(User::getId, 2);
                    }
                })
        );
        users.forEach(System.out::println);
    }

    @Test
    void demo_apply() {
        List<User> users = userService.list(Wrappers.<User>lambdaQuery()
                .apply("date(create_date) = {0}", LocalDate.now()));
        users.forEach(System.out::println);
    }

    @Test
    void demo_select() {
        List<User> users = userService.list(Wrappers.<User>lambdaQuery().select(User::getUsername, User::getPassword));
        users.forEach(System.out::println);

        List<User> user2s = userService.list(Wrappers.<User>lambdaQuery()
                .select(User.class, i -> i.getProperty().contains("ame")));
        user2s.forEach(System.out::println);
    }

    @Test
    void demo_setSql() {
        userService.update(Wrappers.<User>lambdaUpdate()
                .setSql("username='bbb',real_name='bbb'")
                .eq(User::getId, 8)
        );
    }

    @Test
    void demo_lambdaQuery() {
        List<User> users = userService.lambdaQuery().ne(User::getId, 3).list();
        users.forEach(System.out::println);

        userService.lambdaUpdate().eq(User::getId, 8).remove();
    }

    //*********************************分页*********************************

    @Test
    void demo_page() {
        Page<User> page = userService.page(new Page<>(1, 2));
        System.out.println("当前页：" + page.getCurrent());
        System.out.println("总页数页：" + page.getPages());
        System.out.println("每页显示数量：" + page.getSize());
        System.out.println("总数据：" + page.getTotal());
        System.out.println("数据：" + page.getRecords());
        System.out.println("========================================");


        IPage<UserVo> pageUser = userService.pageUser(new Page<>(2, 2), false);
        System.out.println("当前页：" + pageUser.getCurrent());
        System.out.println("总页数页：" + pageUser.getPages());
        System.out.println("每页显示数量：" + pageUser.getSize());
        System.out.println("总数据：" + pageUser.getTotal());
        System.out.println("数据：" + pageUser.getRecords());
        System.out.println("========================================");

        List<UserVo> user2 = userService.pageUser2(new Page<>(3, 2), false);
        System.out.println("数据：" + user2);
    }


}
