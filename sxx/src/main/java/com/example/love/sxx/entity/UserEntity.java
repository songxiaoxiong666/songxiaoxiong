package com.example.love.sxx.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * 类名称：用户实体类
 * 类描述：
 *
 * @author sxx
 * @Date 2020/6/28
 */
@Data
public class UserEntity implements Serializable {

    private Integer id;
    private String idcard;
    private String username;
    private String password;
    private String sex;

 /*   public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }*/

}
