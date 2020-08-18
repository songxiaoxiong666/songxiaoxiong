package com.example.love.sxx.service;

import com.example.love.sxx.entity.UserEntity;

import java.util.List;

/**
 * 类名称：
 * 类描述：
 *
 * @author sxx
 * @Date 2020/6/28
 */
public interface UserService {
    List<UserEntity> userEntityList(UserEntity userEntity);

    int userAdd(UserEntity userEntity);

    int userDel(Integer id);

   UserEntity userXq(Integer id);
}
