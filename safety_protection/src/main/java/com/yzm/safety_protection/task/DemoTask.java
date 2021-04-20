package com.yzm.safety_protection.task;

import com.yzm.safety_protection.entity.User;
import com.yzm.safety_protection.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@EnableScheduling
public class DemoTask {

    @Autowired
    private UserService userService;

    @Scheduled(cron = "0/10 * * * * ?")
    public void demo() {
        log.info("验证数据安全保护");
        List<User> users = userService.list();
        for (User user : users) {
            log.info("名字：" + user.getUsername());
        }
    }
}
