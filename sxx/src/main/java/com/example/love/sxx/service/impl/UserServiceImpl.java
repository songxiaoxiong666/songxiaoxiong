package com.example.love.sxx.service.impl;

import com.example.love.sxx.Utils.ErrorCode;
import com.example.love.sxx.entity.UserEntity;
import com.example.love.sxx.mapper.UserDao;
import com.example.love.sxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * 类名称：
 * 类描述：
 *
 * @author sxx
 * @Date 2020/6/28
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> userEntityList(UserEntity userEntity) {
        List<UserEntity> userEntities = userDao.userEntityList(userEntity);
        return userEntities;
    }

    @Override
    public int userAdd(UserEntity userEntity) {
        return userDao.userAdd(userEntity);
    }

    @Override
    public int userDel(Integer id) {
        return userDao.userDel(id);
    }

    @Override
    public UserEntity userXq(Integer id) {
        return userDao.userXq(id);
    }
}
