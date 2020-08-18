package com.example.love.sxx.mapper;

import com.example.love.sxx.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 类名称：
 * 类描述：
 *
 * @author sxx
 * @Date 2020/6/28
 */
@Mapper
@Component
public interface UserDao {

    List<UserEntity> userEntityList(UserEntity userEntity);

   int userAdd(UserEntity userEntity);

    int userDel(Integer id);

    UserEntity userXq(Integer id);
}
