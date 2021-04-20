package com.yzm.field_fill;

import com.yzm.field_fill.entity.User;
import com.yzm.field_fill.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class FieldFillApplicationTests {

    @Autowired
    private UserService userService;

    /**
     * 新增时，不设置update_date、create_date属性
     */
    @Test
    void demo() {
        User user = new User()
                .setRealName("ccc")
                .setUsername("ccc")
                .setPassword("ccc");
        userService.save(user);
    }

}
