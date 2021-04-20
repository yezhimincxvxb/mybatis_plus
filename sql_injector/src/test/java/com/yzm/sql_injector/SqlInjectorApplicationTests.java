package com.yzm.sql_injector;

import com.yzm.sql_injector.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SqlInjectorApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void demo_deleteToday() {
        int i = userService.deleteToday();
        System.out.println("i = " + i);
    }

}
