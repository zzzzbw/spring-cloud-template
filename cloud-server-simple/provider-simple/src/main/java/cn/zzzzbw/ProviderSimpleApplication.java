package cn.zzzzbw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供方
 *
 * @author zzzzbw
 * @since 2020-03-19
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSimpleApplication.class, args);
    }
}
