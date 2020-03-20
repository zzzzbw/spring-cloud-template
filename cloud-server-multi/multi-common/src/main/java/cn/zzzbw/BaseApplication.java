package cn.zzzbw;

import cn.zzzbw.util.SystemHelp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ApplicationContext;

/**
 * @author by zzzzbw
 * @since 2020/3/20 23:43
 */
@Slf4j
@SpringBootApplication
public class BaseApplication {

    protected static ApplicationContext start(Class<?> primarySource, String... args) {
        SpringApplication springApplication = new SpringApplication(primarySource);

        if (SystemHelp.isDev()) {
            // TODO 开发环境的操作
            springApplication.addListeners(new ApplicationPidFileWriter("PID.txt"));
        } else {
            // TODO 正式环境的操作
        }

        ApplicationContext context = springApplication.run(args);
        log.info("start [{}] success! env: {}", primarySource.getSimpleName(), SystemHelp.env());

        return context;
    }
}
