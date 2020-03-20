package cn.zzzzbw.provider.bootstrap.config;

import cn.zzzzbw.server.common.component.CacheComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author by zzzzbw
 * @since 2020/3/21 1:20
 */
@Configuration
public class CacheConfig {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Bean
    public CacheComponent cacheComponent() {
        return new CacheComponent(stringRedisTemplate);
    }

}
