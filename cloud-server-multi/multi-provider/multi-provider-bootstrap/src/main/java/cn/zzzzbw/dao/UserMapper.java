package cn.zzzzbw.dao;

import cn.zzzzbw.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import feign.Param;

/**
 * @author by zzzzbw
 * @since 2020/3/20 11:57
 */
public interface UserMapper extends BaseMapper<User> {

    User selectByName(@Param("name") String name);

}
