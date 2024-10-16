package com.example.template.config.redisson.condition;

import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Redisson单机模式自定义配置条件
 *
 * @author hzh
 */
public class RedissonSingleCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context,@NonNull AnnotatedTypeMetadata metadata) {
        String property = context.getEnvironment().getProperty("redisson.single-server-config.enable-single");
        return StringUtils.equals(Boolean.TRUE.toString(), property);
    }

}