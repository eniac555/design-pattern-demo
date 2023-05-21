package com.design.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description:
 */

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "login")//从这里去yml文件找对应前缀为login的配置
public class LoginTypeConfig {
    private Map<String,String> types;
}
