package com.design.demo.strategy;

import com.design.demo.config.LoginTypeConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 环境上下文类
 */

@Component
public class UserLoginFactory implements ApplicationContextAware {
    private static final Map<String, UserGranter> granterPool = new ConcurrentHashMap<>();

    @Resource
    private LoginTypeConfig loginTypeConfig;

    /**
     * 从配置文件中读取策略信息存储到 map 中
     * {
     * account:  accountGranter,
     * sms:      smsGranter,
     * we_chat:  weChatGranter
     * }
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        loginTypeConfig.getTypes().forEach((k, y) -> {
            granterPool.put(k, (UserGranter) applicationContext.getBean(y));
        });
    }

    /**
     * 对外提供获取具体策略
     *
     * @param grantType 用户的登录方式，需要跟配置文件中匹配
     * @return 具体策略
     */
    public UserGranter getGranter(String grantType) {
        return granterPool.get(grantType);
    }

}
