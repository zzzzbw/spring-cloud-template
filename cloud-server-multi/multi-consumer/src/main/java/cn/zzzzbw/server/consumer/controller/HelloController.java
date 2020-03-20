package cn.zzzzbw.server.consumer.controller;

import cn.zzzzbw.server.common.dto.Response;
import cn.zzzzbw.provider.api.HelloFeignService;
import cn.zzzzbw.provider.api.entity.HelloEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzzzbw
 * @since 2020-03-19
 */
@RestController
public class HelloController {

    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name + ", this is multi-consumer";
    }

    /**
     * 模拟Feign远程调用，这里暴露一个请求接口`/feignHello`
     *
     * @param name
     * @return
     */
    @GetMapping("/feignHello/{name}")
    public Response<HelloEntity> feignHello(@PathVariable String name) {
        return helloFeignService.hello(name);
    }

}
