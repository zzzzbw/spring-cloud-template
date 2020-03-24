package cn.zzzzbw.server.provider.api.fallback;

import cn.zzzzbw.server.common.constants.Response;
import cn.zzzzbw.server.provider.api.HelloFeignService;
import cn.zzzzbw.server.provider.api.entity.HelloEntity;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author zzzzbw
 * @since 2020-03-19
 */
@Component
public class HelloFeignServiceFallbackImpl implements HelloFeignService {

    @Override
    public Response<HelloEntity> hello(String name) {
        HelloEntity helloEntity = new HelloEntity();
        helloEntity.setName("hello " + name + ", this is consumer advance, but request error");
        helloEntity.setTime(new Date());
        return Response.ok(helloEntity);
    }
}
