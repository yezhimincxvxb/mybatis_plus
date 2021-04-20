package com.yzm.sequence_key;

import com.yzm.sequence_key.entity.User;
import com.yzm.sequence_key.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SequenceKeyApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void demo() {
        User user = new User()
                .setRealName("bbb")
                .setUsername("bbb")
                .setPassword("bbb")
                .setCreateDate(LocalDateTime.now())
                .setUpdateDate(LocalDateTime.now());
        userService.save(user);
    }

}
