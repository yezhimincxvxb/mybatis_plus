package com.yzm.common_enum;

import com.yzm.common_enum.entity.User;
import com.yzm.common_enum.enu.GenderEnum;
import com.yzm.common_enum.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class CommonEnumApplicationTests {

    @Autowired
    private UserService userService;

    /**
     * 查询数据，gender=0 的转换成 gender=女
     */
    @Test
    void demo_01() {
        List<User> users = userService.lambdaQuery().list();
        users.forEach(System.out::println);
    }

    /**
     * 新增、更新gender字段时，GenderEnum.MAN
     */
    @Test
    void demo_02() {
        User user = new User()
                .setRealName("bbb")
                .setUsername("bbb")
                .setPassword("bbb")
                .setGender(GenderEnum.MAN)
                .setCreateDate(LocalDateTime.now())
                .setUpdateDate(LocalDateTime.now());
        userService.save(user);
    }

}
