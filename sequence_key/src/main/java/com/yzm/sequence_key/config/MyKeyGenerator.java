package com.yzm.sequence_key.config;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import org.springframework.stereotype.Component;

/**
 * Sequence主键生成策略
 */
@Component
public class MyKeyGenerator implements IKeyGenerator {

    /**
     * incrementerName：对应 @KeySequence("myKeyGenerator")
     * 即 incrementerName = myKeyGenerator
     */
    @Override
    public String executeSql(String incrementerName) {
        String uid = String.valueOf(System.currentTimeMillis());
        return "select " + uid;
    }

}
