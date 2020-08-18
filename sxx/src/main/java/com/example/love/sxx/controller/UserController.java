package com.example.love.sxx.controller;


import com.example.love.sxx.Utils.R;
import com.example.love.sxx.entity.UserEntity;
import com.example.love.sxx.enums.RespCode;
import com.example.love.sxx.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;




/**
 * 类名称：控制类
 * 类描述：
 *
 * @author sxx
 * @Date 2020/6/19
 */
@RestController
@Api(value = "用户管理", tags = {"用户管理模块"})
@RequestMapping("user")
public class UserController {

    @Autowired(required = true)
    private UserService userService;

    @ApiOperation(value = "查询用户信息")
    @GetMapping("/userList")
    public R select(UserEntity userEntity) {
        List<UserEntity> list = userService.userEntityList(userEntity);
        return R.ok().put("list",list);
    }
    @ApiOperation(value = "增加用户信息啊")
    @PostMapping("/userAdd")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键ID", required = false),
            @ApiImplicitParam(name = "idcard", value = "用户名ID", required = false),
            @ApiImplicitParam(name = "sex", value = "性别", required = false),
            @ApiImplicitParam(name = "username", value = "用户名", required = false),
            @ApiImplicitParam(name = "password", value = "密码", required = false)
    })
    public R userAdd(UserEntity userEntity) {
        return R.ok().put("userEntity","添加成功");
    }
    @ApiOperation(value = "删除用户信息")
    @PostMapping("/userDel")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键ID", required = true),
    })
    public R userDel(Integer id){
        userService.userDel(id);
        return R.ok();
    }

    @ApiOperation(value = "查看用户详情")
    @GetMapping("/userXq")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键ID", required = true),
    })
    public R userXq(Integer id){
        UserEntity userEntity = userService.userXq(id);
        return R.ok().put("userEntity",userEntity);
    }
}
