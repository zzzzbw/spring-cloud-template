package cn.zzzzbw.boot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 监控平台  Spring-Boot-Admin 服务端
 *
 * @author zzzzbw
 * @since 2020-03-19
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class BootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAdminApplication.class, args);
    }
}
