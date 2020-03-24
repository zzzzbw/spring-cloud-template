package cn.zzzzbw.server.provider.bootstrap;

import cn.zzzzbw.server.common.constants.Consts;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供方
 *
 * @author zzzzbw
 * @since 2020-03-19
 */
@MapperScan(Consts.BASE_PACKAGE + ".provider.bootstrap.dao")
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = Consts.BASE_PACKAGE)
public class ProviderAdvanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAdvanceApplication.class, args);
    }
}
