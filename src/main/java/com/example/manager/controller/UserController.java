package com.example.manager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.example.manager.beans.ResObject;
import com.example.manager.beans.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(description = "用户接口")
@RestController
public class UserController {

    @ApiOperation(value = "新增用户" ,  notes="新增注册")
    @RequestMapping(value="/createUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResObject createUser(@RequestBody User user){
        System.out.println("createUser:::"+user.toString());
        return new ResObject("success", "新增成功.");
    }

    @ApiOperation(value = "修改用户" ,  notes="修改用户")
    @RequestMapping(value="/updateUser",method=RequestMethod.PUT,consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResObject updateUser(@RequestBody User user){
        System.out.println("updateUser:::"+user.toString());
        return new ResObject("success", "修改成功.");
    }

    @ApiOperation(value = "删除用户" ,  notes="删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
    public ResObject deleteUser(@RequestParam("userId") String userId){
        System.out.println("deleteUser:::"+userId);
        return new ResObject("success", "删除成功.");
    }

    @ApiOperation(value = "查询用户" ,  notes="查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/queryUser",method=RequestMethod.GET)
    public ResObject queryUser(@RequestParam("userId") String userId){
        System.out.println("queryUser:::"+userId);
        User user = new User(userId, "张三", "123", "a@b.com");
        return new ResObject("success", user);
    }
}