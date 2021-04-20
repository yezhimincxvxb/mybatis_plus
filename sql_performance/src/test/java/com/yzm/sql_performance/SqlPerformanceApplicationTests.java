package com.yzm.sql_performance;

import com.yzm.sql_performance.entity.User;
import com.yzm.sql_performance.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SqlPerformanceApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void demo() {
        List<User> users = userService.list();
        users.forEach(System.out::println);
    }

}
