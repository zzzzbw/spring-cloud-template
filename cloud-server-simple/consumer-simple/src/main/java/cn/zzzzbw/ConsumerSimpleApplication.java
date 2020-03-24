package cn.zzzzbw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费方
 *
 * @author zzzzbw
 * @since 2020-03-19
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ConsumerSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSimpleApplication.class, args);
    }
}
