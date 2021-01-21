package cn.yl.spoonfeed.springboot.dao;

import cn.yl.spoonfeed.springboot.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {


    public User getUser(Integer id);
}
