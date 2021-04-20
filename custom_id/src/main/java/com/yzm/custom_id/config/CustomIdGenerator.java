package com.yzm.custom_id.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.stereotype.Component;

/**
 * 自定义ID生成器
 */
@Component
public class CustomIdGenerator implements IdentifierGenerator {

    /**
     * entity：实体对象
     * nextId：IdType.ASSIGN_ID
     */
    @Override
    public Number nextId(Object entity) {
        return System.currentTimeMillis();
    }

    /**
     * nextUUID：IdType.ASSIGN_UUID
     */
    @Override
    public String nextUUID(Object entity) {
        return null;
    }
}
