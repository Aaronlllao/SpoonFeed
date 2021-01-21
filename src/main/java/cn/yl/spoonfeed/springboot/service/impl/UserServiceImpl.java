package cn.yl.spoonfeed.springboot.service.impl;

import cn.yl.spoonfeed.springboot.dao.UserMapper;
import cn.yl.spoonfeed.springboot.entity.User;
import cn.yl.spoonfeed.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }
}
