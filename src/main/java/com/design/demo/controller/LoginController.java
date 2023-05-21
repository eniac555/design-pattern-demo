package com.design.demo.controller;

import com.design.demo.service.UserService;
import com.design.demo.entity.LoginReq;
import com.design.demo.entity.LoginResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 接口
 */

@RestController
@RequestMapping("/api/user")
@Slf4j
public class LoginController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public LoginResp login(@RequestBody LoginReq loginReq) {

        if(loginReq.getType().equals("abc")){
            log.error("没有这种登录方式:{}",loginReq.getType());
        }
        if(loginReq.getType().equals("123")){
            throw new RuntimeException("错误的登录方式");
        }

        return userService.login(loginReq);
    }
}
