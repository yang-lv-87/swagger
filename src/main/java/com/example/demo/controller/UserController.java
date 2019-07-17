package com.example.demo.controller;

import com.example.demo.request.RequestUser;
import com.example.demo.response.ResponseUser;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    /**
     * 根据ID查询用户
     * @param requestUser
     * @return ResponseUser
     */
    @ApiOperation(value="获取用户详细信息", notes="获取用户详细信息")
    @ApiImplicitParam(name = "requestUser", value = "请求用户", required = true)
    @PostMapping("getUser")
    public ResponseUser getUser(@RequestBody RequestUser requestUser){
        ResponseUser responseUser = new ResponseUser();
        responseUser.setId(2);
        responseUser.setName("response");
        return responseUser;
    }
}
