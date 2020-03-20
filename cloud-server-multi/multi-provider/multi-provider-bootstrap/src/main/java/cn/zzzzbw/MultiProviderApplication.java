package cn.zzzzbw;

import cn.zzzbw.BaseApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供方 - admin模块
 *
 * @author zzzzbw
 * @since 2020-03-19
 */
@MapperScan("cn.zzzzbw.dao")
@EnableEurekaClient
@SpringBootApplication
public class MultiProviderApplication extends BaseApplication {

    public static void main(String[] args) {
        start(MultiProviderApplication.class, args);
    }
}
