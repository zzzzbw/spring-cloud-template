package cn.zzzzbw.feign.service.fallback;

import cn.zzzzbw.feign.service.ConsumerFeignService;
import org.springframework.stereotype.Component;

/**
 * @author zzzzbw
 * @since 2020-03-19
 */
@Component
public class ConsumerFeignServiceFallbackImpl implements ConsumerFeignService {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this is simple-consumer, but request error";
    }
}
