package com.yzm.dynamic_datasource;

import com.yzm.dynamic_datasource.entity.User;
import com.yzm.dynamic_datasource.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class DynamicDatasourceApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void demo_01() {
        List<User> users = userService.listUser();
        users.forEach(System.out::println);
    }

    @Test
    void demo_02() {
        User user = new User()
                .setUsername("aaa")
                .setRealName("aaa")
                .setPassword("aaa")
                .setCreateDate(LocalDateTime.now())
                .setUpdateDate(LocalDateTime.now());
        userService.saveUser(user);
    }

}
