package cn.zzzzbw.feign.service.fallback;

import cn.zzzzbw.feign.service.HelloFeignService;
import org.springframework.stereotype.Component;

/**
 * @author zzzzbw
 * @since 2020-03-19
 */
@Component
public class HelloFeignServiceFallbackImpl implements HelloFeignService {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this is consumer simple, but request error";
    }
}
