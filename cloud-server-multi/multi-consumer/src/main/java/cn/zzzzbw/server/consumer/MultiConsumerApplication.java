package cn.zzzzbw.server.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费方 - auth模块
 *
 * @author zzzzbw
 * @since 2020-03-19
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MultiConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiConsumerApplication.class, args);
    }
}