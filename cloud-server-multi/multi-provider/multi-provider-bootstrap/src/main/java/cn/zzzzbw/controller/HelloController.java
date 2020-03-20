package cn.zzzzbw.controller;

import cn.zzzbw.dto.Response;
import cn.zzzzbw.entity.HelloEntity;
import cn.zzzzbw.service.HelloService;
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
    private HelloService helloService;

    @GetMapping("/hello/{name}")
    public Response<HelloEntity> hello(@PathVariable String name) {
        HelloEntity helloEntity = helloService.sayHello(name);
        return Response.ok(helloEntity);
    }
}
