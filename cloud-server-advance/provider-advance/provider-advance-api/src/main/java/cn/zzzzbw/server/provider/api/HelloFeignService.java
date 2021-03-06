package cn.zzzzbw.server.provider.api;


import cn.zzzzbw.server.common.constants.Response;
import cn.zzzzbw.server.provider.api.entity.HelloEntity;
import cn.zzzzbw.server.provider.api.fallback.HelloFeignServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign远程调用接口，@FeignClient配置了远程调用其他应用接口的应用名称
 *
 * @author zzzzbw
 * @since 2020-03-19
 */
@FeignClient(value = "provider-advance", fallback = HelloFeignServiceFallbackImpl.class)
public interface HelloFeignService {

    /**
     * 这里暴露一个Feign接口地址
     *
     * @param name
     * @return
     */
    @GetMapping("/hello/{name}")
    Response<HelloEntity> hello(@PathVariable(name = "name") String name);
}
