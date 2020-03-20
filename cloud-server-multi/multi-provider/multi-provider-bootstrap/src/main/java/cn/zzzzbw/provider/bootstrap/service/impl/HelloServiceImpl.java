package cn.zzzzbw.provider.bootstrap.service.impl;

import cn.zzzzbw.server.common.component.CacheComponent;
import cn.zzzzbw.provider.bootstrap.dao.UserMapper;
import cn.zzzzbw.provider.api.entity.HelloEntity;
import cn.zzzzbw.provider.bootstrap.pojo.User;
import cn.zzzzbw.provider.bootstrap.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author by zzzzbw
 * @since 2020/3/20 12:02
 */
@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CacheComponent cacheComponent;

    @Override
    public HelloEntity sayHello(String name) {
        HelloEntity helloEntity = new HelloEntity();
        helloEntity.setTime(new Date());

        User user = userMapper.selectByName(name);
        if (null == user) {
            helloEntity.setName(name + " is not in database, this is multi-provider");
        } else {
            helloEntity.setName("hello " + user.toString() + ", this is multi-provider");
        }

        User obj = cacheComponent.getObj(name, User.class);
        if (null == obj) {
            cacheComponent.putObj(name, user, null);
        }
        log.info("cache: {}", obj);

        return helloEntity;
    }
}