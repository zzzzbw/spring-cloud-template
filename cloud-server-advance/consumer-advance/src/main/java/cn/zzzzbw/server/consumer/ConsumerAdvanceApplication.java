package cn.zzzzbw.server.consumer;

import cn.zzzzbw.server.common.constants.Consts;
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
@EnableFeignClients(basePackages = Consts.BASE_PACKAGE)
@SpringBootApplication(scanBasePackages = Consts.BASE_PACKAGE)
public class ConsumerAdvanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerAdvanceApplication.class, args);
    }
}
