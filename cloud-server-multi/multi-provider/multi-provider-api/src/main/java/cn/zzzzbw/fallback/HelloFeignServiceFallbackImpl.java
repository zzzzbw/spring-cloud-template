package cn.zzzzbw.fallback;

import cn.zzzbw.dto.Response;
import cn.zzzzbw.HelloFeignService;
import cn.zzzzbw.entity.HelloEntity;
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
        helloEntity.setName("hello " + name + ", this is multi-consumer, but request error");
        helloEntity.setTime(new Date());
        return Response.ok(helloEntity);
    }
}
