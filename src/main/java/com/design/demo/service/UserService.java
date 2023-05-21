package com.design.demo.service;

import com.design.demo.strategy.UserGranter;
import com.design.demo.strategy.UserLoginFactory;
import com.design.demo.entity.LoginReq;
import com.design.demo.entity.LoginResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 服务类
 */
@Service
public class UserService {
    @Resource
    private UserLoginFactory factory;

    public LoginResp login(LoginReq loginReq) {

        // 使用策略模式替代了下面的条件判断
        UserGranter granter = factory.getGranter(loginReq.getType());
        if (granter == null) {
            LoginResp loginResp = new LoginResp();
            loginResp.setSuccess(false);
            return loginResp;
        }
        return granter.login(loginReq);


        /*

        if(loginReq.getType().equals("account")){
            System.out.println("用户名密码登录");

            //执行用户密码登录逻辑

            return new LoginResp();

        }else if(loginReq.getType().equals("sms")){
            System.out.println("手机号验证码登录");

            //执行手机号验证码登录逻辑

            return new LoginResp();
        }else if (loginReq.getType().equals("we_chat")){
            System.out.println("微信登录");

            //执行用户微信登录逻辑

            return new LoginResp();
        }
        LoginResp loginResp = new LoginResp();
        loginResp.setSuccess(false);
        System.out.println("登录失败");
        return loginResp;

        */
    }



}

