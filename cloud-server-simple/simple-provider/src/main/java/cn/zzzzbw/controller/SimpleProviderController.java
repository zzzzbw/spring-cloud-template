package cn.zzzzbw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzzzbw
 * @since 2020-03-19
 */
@RestController
public class SimpleProviderController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name + ", this is multi-provider";
    }
}
