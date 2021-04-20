package com.yzm.type_handler;

import com.yzm.type_handler.entity.User;
import com.yzm.type_handler.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class TypeHandlerApplicationTests {

    @Autowired
    private UserService userService;

    /**
     * 新增记录，查看数据库存储createDateUnix字段
     */
    @Test
    void demo_01() {
        User user = new User()
                .setRealName("aaa")
                .setUsername("aaa")
                .setPassword("aaa")
                .setCreateDate(LocalDateTime.now())
                .setCreateDateUnix(LocalDateTime.now())
                .setUpdateDate(LocalDateTime.now());
        userService.save(user);
    }

    /**
     * 查询记录，查看createDateUnix字段
     */
    @Test
    void demo_02() {
        List<User> users = userService.lambdaQuery().list();
        users.forEach(System.out::println);
    }

}
