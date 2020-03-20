package cn.zzzzbw.autoconfigure.starter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author by zzzzbw
 * @since 2020/3/21 2:29
 */
@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    private boolean enabled = true;

    private String basePackage = "";

    private String title = "swagger document";

    private String description = "Auto create by cn.zzzzbw.autoconfigure.starter.SwaggerAutoConfiguration";

    private String version = "";

}
