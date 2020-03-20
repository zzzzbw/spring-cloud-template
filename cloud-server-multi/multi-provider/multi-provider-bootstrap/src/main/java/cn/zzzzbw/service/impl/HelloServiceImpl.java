package cn.zzzzbw.service.impl;

import cn.zzzzbw.dao.UserMapper;
import cn.zzzzbw.entity.HelloEntity;
import cn.zzzzbw.pojo.User;
import cn.zzzzbw.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author by zzzzbw
 * @since 2020/3/20 12:02
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private UserMapper userMapper;

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
        return helloEntity;
    }
}
