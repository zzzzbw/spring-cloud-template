package cn.zzzzbw.server.provider.bootstrap.service.impl;

import cn.zzzzbw.server.autoconfigure.starter.component.CacheComponent;
import cn.zzzzbw.server.provider.bootstrap.dao.UserMapper;
import cn.zzzzbw.server.provider.api.entity.HelloEntity;
import cn.zzzzbw.server.provider.bootstrap.pojo.User;
import cn.zzzzbw.server.provider.bootstrap.service.HelloService;
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
        User user = this.getUser(name);
        if (null == user) {
            helloEntity.setName(name + " is not in database, this is provider advance");
        } else {
            helloEntity.setName("hello " + user.toString() + ", this is provider advance");
        }

        return helloEntity;
    }

    private User getUser(String name) {
        User user = cacheComponent.getObj(name, User.class);
        log.info("get user from cache: {}", user);
        if (null == user) {
            user = userMapper.selectByName(name);
            cacheComponent.putObj(name, user, null);
        }
        return user;
    }
}
