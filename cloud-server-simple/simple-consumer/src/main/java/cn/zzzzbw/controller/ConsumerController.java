package cn.zzzzbw.controller;

import cn.zzzzbw.feign.service.ConsumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzzzbw
 * @since 2020-03-19
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerFeignService consumerFeignService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name + ", this is simple-consumer";
    }

    /**
     * 模拟Feign远程调用，这里暴露一个请求接口`/feignHello`
     *
     * @param name
     * @return
     */
    @GetMapping("/feignHello/{name}")
    public String feignHello(@PathVariable String name) {
        return consumerFeignService.hello(name);
    }

}
