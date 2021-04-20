package com.yzm.custom_id;

import com.yzm.custom_id.entity.User;
import com.yzm.custom_id.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class CustomIdApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void demo() {
        User user = new User()
                .setRealName("ccc")
                .setUsername("ccc")
                .setPassword("ccc")
                .setCreateDate(LocalDateTime.now())
                .setUpdateDate(LocalDateTime.now());
        userService.save(user);
    }

}
