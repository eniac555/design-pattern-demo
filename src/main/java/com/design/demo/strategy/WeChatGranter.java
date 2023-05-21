package com.design.demo.strategy;

import com.design.demo.entity.LoginReq;
import com.design.demo.entity.LoginResp;
import org.springframework.stereotype.Component;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 微信登录策略类
 */

@Component
public class WeChatGranter implements UserGranter{
    @Override
    public LoginResp login(LoginReq loginReq) {
        System.out.println("策略:登录方式为微信登录");
        // TODO
        // 执行业务操作

        return new LoginResp();
    }
}
