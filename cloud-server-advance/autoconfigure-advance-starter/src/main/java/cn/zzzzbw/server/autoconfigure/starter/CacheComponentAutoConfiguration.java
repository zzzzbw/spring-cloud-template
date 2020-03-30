package cn.zzzzbw.server.autoconfigure.starter;

import cn.zzzzbw.server.autoconfigure.starter.component.CacheComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * CacheComponent自动配置类
 *
 * @author by zzzzbw
 * @since 2020/3/21 2:02
 */
@Configuration
@ConditionalOnClass({CacheComponent.class})
public class CacheComponentAutoConfiguration {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Bean
    @ConditionalOnMissingBean(CacheComponent.class)
    public CacheComponent cacheComponent() {
        return new CacheComponent(stringRedisTemplate);
    }
}
